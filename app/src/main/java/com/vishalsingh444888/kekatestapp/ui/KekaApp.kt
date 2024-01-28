package com.vishalsingh444888.kekatestapp.ui

import android.annotation.SuppressLint
import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.vishalsingh444888.kekatestapp.R
import com.vishalsingh444888.kekatestapp.ui.navigation.BottomNavBar
import com.vishalsingh444888.kekatestapp.ui.navigation.BottomNavigation
import com.vishalsingh444888.kekatestapp.ui.navigation.TopAppBar
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun KekaApp() {
    val items = listOf(
        NavigationItem(
            title = "Keka Technologies",
            icon = R.drawable.corporate_fare_24px
        ),
        NavigationItem(
            title = "Language",
            icon = R.drawable.language_24px
        ),
        NavigationItem(
            title = "Secure Your Keka App",
            icon = R.drawable.key_24px
        ),
        NavigationItem(
            title = "Theme",
            icon = R.drawable.palette_24px
        ),
        NavigationItem(
            title = "Logout",
            icon = R.drawable.logout_24px
        )
    )
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    var selectedItemIndex by rememberSaveable {
        mutableStateOf(0)
    }
    ModalNavigationDrawer(
        drawerContent = {
            ModalDrawerSheet {
                Spacer(modifier = Modifier.height(16.dp))
                items.forEachIndexed{index,item->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = index == selectedItemIndex,
                        onClick = {
                            selectedItemIndex = index
                        },
                        icon = {
                            Icon(painter = painterResource(id = item.icon), contentDescription = item.title)
                        },
                        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding)
                    )

                }
            }
        },
        drawerState = drawerState
    ) {
        Scaffold(
            bottomBar = {
                BottomNavBar(navController =navController )
            },
            topBar = {
                TopAppBar(onClick = {scope.launch { drawerState.open() }})
            }
        ) {
            BottomNavigation(navController)
        }
    }
}

data class NavigationItem(
    val title: String,
    @DrawableRes val icon: Int
)