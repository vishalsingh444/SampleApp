package com.vishalsingh444888.kekatestapp.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vishalsingh444888.kekatestapp.ui.home.components.Announcements
import com.vishalsingh444888.kekatestapp.ui.home.components.CardComponent
import com.vishalsingh444888.kekatestapp.ui.home.components.ListOfFeatures
import com.vishalsingh444888.kekatestapp.ui.home.components.EmployeeList
import com.vishalsingh444888.kekatestapp.ui.home.components.UpcomingHoliday
import com.vishalsingh444888.kekatestapp.ui.theme.Amethyst

@Composable
fun HomeScreen() {
    Column(modifier = Modifier
        .padding(top = 100.dp, start = 16.dp, end = 16.dp, bottom = 60.dp)
        .verticalScroll(
            rememberScrollState()
        )) {
        ListOfFeatures()
        Spacer(Modifier.height(16.dp))
        CardComponent()
        Spacer(Modifier.height(16.dp))
        EmployeeList(heading = "Off this week")
        Spacer(modifier = Modifier.height(16.dp))
        EmployeeList(heading = "Wish them")
        Spacer(modifier = Modifier.height(16.dp))
        Announcements()
        Spacer(modifier = Modifier.height(18.dp))
        Text(
            text = "See all announcements",
            fontSize = 12.sp,
            color = Amethyst
        )
        Spacer(modifier = Modifier.height(16.dp))
        UpcomingHoliday()
    }
}