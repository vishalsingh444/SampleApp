package com.vishalsingh444888.kekatestapp.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.vishalsingh444888.kekatestapp.R
import com.vishalsingh444888.kekatestapp.ui.theme.Amethyst
import com.vishalsingh444888.kekatestapp.ui.theme.Lavender

@Composable
fun FeatureButton(icon: Int, text: String) {
    Column(
        modifier = Modifier.fillMaxHeight().width(60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = text,
            modifier = Modifier.clip(CircleShape).background(color = Lavender).padding(8.dp),
            tint = Amethyst

        )
        Spacer(Modifier.height(8.dp))
        Text(text = text, textAlign = TextAlign.Center)
    }
}

@Composable
fun ListOfFeatures() {
    val features = listOf<Pair<String, Int>>(
        "Apply leave" to R.drawable.flight_takeoff_24px,
        "Raise Ticket" to R.drawable.confirmation_number_24px,
        "Raise Expense" to R.drawable.credit_card_24px,
        "Leave Balance" to R.drawable.event_note_24px
    )
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
    ) {
        items(features) { feature ->
            FeatureButton(icon = feature.second, text = feature.first)
            Spacer(Modifier.width(16.dp))
        }
    }
}