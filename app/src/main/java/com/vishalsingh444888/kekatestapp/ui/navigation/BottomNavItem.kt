package com.vishalsingh444888.kekatestapp.ui.navigation

import androidx.annotation.DrawableRes
import com.vishalsingh444888.kekatestapp.R

enum class Routes{
    Home,
    Inbox,
    Me,
    MyTeam
}
sealed class BottomNavItem(@DrawableRes val icon: Int,val label: String, val route: String) {
    object Home: BottomNavItem(icon = R.drawable.home_24px,label = "HOME", route =Routes.Home.name )
    object Inbox: BottomNavItem(icon = R.drawable.inbox_24px,label = "INBOX", route = Routes.Inbox.name)
    object Me: BottomNavItem(icon = R.drawable.person_24px,label = "ME", route = Routes.Me.name)
    object MyTeam: BottomNavItem(icon = R.drawable.group_24px, label = "MY TEAM",route = Routes.MyTeam.name)
}