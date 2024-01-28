package com.vishalsingh444888.kekatestapp.ui.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UpcomingHoliday() {
    Text(text = "Upcoming holidays", fontSize = 16.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.height(16.dp))
    val holidays = listOf<Pair<String, String>>("Maha Shivaratri" to "Fri, 08 March 2024","Holi" to "Mon, 25 March 2024","Ugadi" to "Tue, 09 April 2024",)
    LazyRow{
        items(holidays){holiday ->
            HolidayCard(holidayName = holiday.first, date = holiday.second)
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}

@Composable
fun HolidayCard(holidayName: String, date: String) {
    Card {
        Column(modifier = Modifier.width(290.dp).padding(16.dp)) {
            Text(text = "HOLIDAY", fontSize = 12.sp)
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = holidayName, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text = date, fontSize = 12.sp, color = Color.Gray)
        }
    }
}