package com.vishalsingh444888.kekatestapp.ui

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.vishalsingh444888.kekatestapp.ui.navigation.BottomNavBar
import com.vishalsingh444888.kekatestapp.ui.navigation.BottomNavigation
import com.vishalsingh444888.kekatestapp.ui.navigation.TopAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun KekaApp() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavBar(navController =navController )
        },
        topBar = {
            TopAppBar()
        }
    ) {
        BottomNavigation(navController)
    }
}