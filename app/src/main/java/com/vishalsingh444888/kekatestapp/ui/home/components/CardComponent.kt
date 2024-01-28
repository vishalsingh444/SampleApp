package com.vishalsingh444888.kekatestapp.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vishalsingh444888.kekatestapp.R
import com.vishalsingh444888.kekatestapp.ui.theme.Amethyst
import com.vishalsingh444888.kekatestapp.ui.theme.Asparagus

@Preview
@Composable
fun CardComponent() {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
//        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "SHIFT TODAY: GENERAL(9:00 AM - 6:00 PM)", fontSize = 12.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.badge_24px),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(
                            CircleShape
                        )
                        .background(color = Asparagus)
                        .padding(8.dp),
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = "28 Jan Sunday", fontSize = 12.sp)
                    Text(text = "0h / 8h", fontSize = 12.sp)
                }
                Icon(
                    painter = painterResource(id = R.drawable.keyboard_arrow_right_24px),
                    contentDescription = null,
                    tint = Amethyst,
                )
            }
        }
    }
}