package com.jetpack.compose.pixelperfect

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack.compose.pixelperfect.ui.theme.BackgroundGrey
import com.jetpack.compose.pixelperfect.ui.theme.PrimaryColor
import com.jetpack.compose.pixelperfect.ui.theme.ScalableDimensions.sdp
import com.jetpack.compose.pixelperfect.ui.theme.ScalableDimensions.ssp
import com.jetpack.compose.pixelperfect.ui.theme.TextBlack
import com.jetpack.compose.pixelperfect.ui.theme.TextGrey
import com.jetpack.compose.pixelperfect.ui.theme.TextLight

@Composable
fun AddCardScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 28.sdp)
    ) {
        Header()
        Spacer(modifier = Modifier.height(12.sdp))
        UserProfile()
        Spacer(modifier = Modifier.height(32.sdp))
        UserDetails()
    }
}

@Composable
fun Header() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 12.sdp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
            contentDescription = "back",
            modifier = Modifier.size(45.sdp)
        )
        Spacer(modifier = Modifier.width(16.sdp))
        Text(
            text = "Add Wallet",
            style = TextStyle(
                fontSize = 17.ssp,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            ),
            modifier = Modifier.weight(1f)
        )
        Spacer(modifier = Modifier.width(16.sdp))
        Text(
            text = "EDIT",
            style = TextStyle(
                fontSize = 17.ssp,
                color = PrimaryColor,
                fontWeight = FontWeight.Normal,
                textDecoration = TextDecoration.Underline
            ),
            modifier = Modifier
        )
    }
}

@Composable
fun UserProfile() {
    Row(
        Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = "user",
            modifier = Modifier
                .size(100.sdp)
                .clip(CircleShape)
                .background(Color.White, CircleShape)
                .shadow(22.sdp, CircleShape)
        )
        Spacer(modifier = Modifier.width(32.sdp))
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = "Deadpool",
                style = TextStyle(
                    fontSize = 20.ssp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                ),
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = "I love fast food",
                style = TextStyle(
                    fontSize = 14.ssp,
                    fontWeight = FontWeight.Normal,
                    color = TextGrey
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun UserDetails() {
    Column(
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.sdp))
            .background(BackgroundGrey)
            .padding(20.sdp)
    ) {
        UserDetailsItem(
            icon = R.drawable.ic_user_details,
            title = "FULL NAME",
            subtitle = "Ryan Reynold"
        )
        Spacer(modifier = Modifier.height(16.sdp))
        UserDetailsItem(
            icon = R.drawable.ic_mail,
            title = "EMAIL",
            subtitle = "hello@hellolab.com"
        )
        Spacer(modifier = Modifier.height(16.sdp))
        UserDetailsItem(
            icon = R.drawable.ic_phone,
            title = "PHONE NUMBER",
            subtitle = "123-567-1234"
        )
    }
}

@Composable
fun UserDetailsItem(
    @DrawableRes icon: Int,
    title: String,
    subtitle: String
) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            imageVector = ImageVector.vectorResource(id = icon),
            contentDescription = "icon",
            modifier = Modifier.size(40.sdp)
        )
        Spacer(modifier = Modifier.width(14.sdp))
        Column(Modifier.weight(1f)) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 14.ssp,
                    color = TextBlack
                )
            )
            Text(
                text = subtitle,
                style = TextStyle(
                    fontSize = 14.ssp,
                    color = TextLight
                )
            )
        }
    }
}

@Preview
@Composable
private fun previewAddCardScreen() {
    AddCardScreen()
}