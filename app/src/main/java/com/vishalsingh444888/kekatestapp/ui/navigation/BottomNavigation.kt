package com.vishalsingh444888.kekatestapp.ui.navigation

import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.vishalsingh444888.kekatestapp.ui.home.HomeScreen
import com.vishalsingh444888.kekatestapp.ui.inbox.InboxScreen
import com.vishalsingh444888.kekatestapp.ui.me.MeScreen
import com.vishalsingh444888.kekatestapp.ui.my_team.MyTeamScreen
import com.vishalsingh444888.kekatestapp.ui.theme.Amethyst


@Composable
fun BottomNavigation(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = BottomNavItem.Home.route
    ) {
        composable(route = BottomNavItem.Home.route){
            HomeScreen()
        }
        composable(route = BottomNavItem.Inbox.route){
            InboxScreen()
        }
        composable(route = BottomNavItem.Me.route){
            MeScreen()
        }
        composable(route = BottomNavItem.MyTeam.route){
            MyTeamScreen()
        }
    }
}

@Composable
fun BottomNavBar(navController: NavController) {
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Inbox,
        BottomNavItem.Me,
        BottomNavItem.MyTeam
    )

    androidx.compose.material.BottomNavigation(
        backgroundColor = Color.White
    ) {
        val navStack by navController.currentBackStackEntryAsState()
        val currentRoute = navStack?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                selected = item.route == currentRoute,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.label,

                    )
                },
                label = {
                    Text(text = item.label, fontSize = 12.sp, fontWeight = if(item.route == currentRoute) FontWeight.Bold else FontWeight.Normal  )
                },
                selectedContentColor = Amethyst

            )
        }
    }
}