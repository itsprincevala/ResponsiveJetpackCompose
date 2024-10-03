package com.jetpack.compose.pixelperfect.ui.theme

import android.content.Context
import android.util.DisplayMetrics
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object ScalableDimensions {

    private var differencePercent = 0f

    fun calculateDimensionDifference(context: Context, designWidth: Int, designHeight: Int) {
        if (differencePercent != 0f) return

        val metrics: DisplayMetrics = context.resources.displayMetrics
        val currentWidthInDp = metrics.widthPixels / metrics.density
        val currentHeightInDp = metrics.heightPixels / metrics.density

        val isPortrait = currentHeightInDp > currentWidthInDp

        val designDimension = if (isPortrait) designHeight else designWidth
        val currentDimension = if (isPortrait) currentHeightInDp else currentWidthInDp

        differencePercent = ((currentDimension / designDimension) * 100) - 100
    }

    val Int.sdp get() = (this + (this * (differencePercent / 100))).dp

    val Int.ssp get() = (this + (this * (differencePercent / 100))).sp

}

@Composable
fun InitDesignDimensions(width: Int, height: Int) {
    val context = LocalContext.current
    ScalableDimensions.calculateDimensionDifference(context, width, height)
}