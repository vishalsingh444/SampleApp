package com.vishalsingh444888.kekatestapp.ui.navigation

import android.provider.MediaStore.Images
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vishalsingh444888.kekatestapp.R
import com.vishalsingh444888.kekatestapp.ui.theme.AntiFlashWhite

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(onClick: () -> Unit = {}) {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
        var searchValue by remember{ mutableStateOf("") }
        Image(
            painter = painterResource(id = R.drawable.person_image),
            contentDescription = null,
            modifier = Modifier.clip(CircleShape).size(40.dp).clickable { onClick() },
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.width(16.dp))
        OutlinedTextField(
            value = searchValue,
            onValueChange = {searchValue = it},
            placeholder = {
                Text(text = "Search your colleagues", fontSize = 12.sp)
            },
            trailingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search"
                )
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                focusedContainerColor = AntiFlashWhite,
                unfocusedContainerColor = AntiFlashWhite
            ),
            modifier = Modifier.weight(1f),
            shape = RoundedCornerShape(16.dp)

        )
    }
}