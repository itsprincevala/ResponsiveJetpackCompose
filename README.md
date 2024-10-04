<h1><b>Reponsive UI with Jetpack compose</b><br/></h1>
Responsive design is vital for ensuring optimal user experiences across devices, enhancing engagement and accessibility. As mobile usage rises, it becomes essential for businesses to effectively reach and retain diverse audiences.If you're struggling to achieve pixel-perfect designs in Jetpack Compose, don't worry we have something for you.
<br><br><br><br>
<table>
  <tr>
    <td>
      <img src="https://github.com/itsprincevala/ResponsiveJetpackCompose/blob/master/samples/small_device.png?raw=true" alt="Small Phone" width="150" />
    </td>
    <td>
      <img src="https://github.com/itsprincevala/ResponsiveJetpackCompose/blob/master/samples/ic_medium_device.png?raw=true" alt="Medium Phone" width="200" />
    </td>
    <td>
        <img src="https://github.com/itsprincevala/ResponsiveJetpackCompose/blob/master/samples/ic_tablet.png?raw=true" alt="Medium Phone" width="400" />
    </td>
  </tr>
</table>

<b>How to:</b> <br/>
<b>Step 1:</b> Copy <b>ScalableDimension.kt</b> to your project.
<br/><br/>
<b>Step 2:</b> Initialize with your design dimensions (use Figma screen widths or any other tools you prefer)
```kotlin
InitDesignDimensions(width = 375, height = 812)
```
<br/>
<b>Step 3:</b> Now, nothing! You're all set to start using .sdp and .ssp
<br/>

```kotlin
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
```

Well, if you have anything else to add, the repository is open for contributions.

Special thanks to @intuit for the inspiration!
