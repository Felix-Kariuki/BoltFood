package com.flexcode.boltfood.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flexcode.boltfood.data.ProfileItem
import com.flexcode.boltfood.data.profileList
import com.flexcode.boltfood.screens.search.ShowCategoryItem

@Composable
fun ProfileScreen() {

    Column(modifier = Modifier.fillMaxWidth()) {

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Felix Kariuki",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Text(
            text = "+254795603871",
            fontWeight = FontWeight.Light,
            fontSize = 16.sp,
            color = Color.DarkGray,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(profileList){item->
                Row(modifier = Modifier.fillMaxWidth()) {
                    ShowProfileItem(item = item)
                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
        }

    }
}

@Composable
fun ShowProfileItem(item: ProfileItem) {
    Row(
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Image(
            imageVector = item.image,
            modifier = Modifier
                .width(30.dp)
                .height(30.dp)
                .clip(CircleShape),
            contentDescription = null,
        )
        Text(
            text = item.text,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(horizontal = 4.dp),
        )
    }
}
