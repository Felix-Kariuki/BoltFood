package com.flexcode.boltfood.screens.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.flexcode.boltfood.data.CategoryItem
import com.flexcode.boltfood.data.categoryList
import com.flexcode.boltfood.ui.theme.LightBlue
import kotlin.math.roundToInt

@Composable
fun SearchScreen() {
    val toolbarHeightInDp = 68.dp
    val toolbarHeightOffset by remember {
        mutableStateOf(0f)
    }

    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBar(
            elevation = 0.dp,
            backgroundColor = Color.White,
            contentColor = Color.Black,

            modifier = Modifier
                .height(toolbarHeightInDp)
                .fillMaxWidth()
                .offset { IntOffset(x = 0, y = toolbarHeightOffset.roundToInt()) }
        ) {
            Spacer(modifier = Modifier
                .width(8.dp)
                .height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                TextField(

                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .weight(0.8f)
                        .padding(4.dp),
                    placeholder = { Text(text = "Restaurants or cuisines") },

                    leadingIcon = {
                        IconButton(onClick = { /**Todo*/ }) {
                            Icon(imageVector = Icons.Default.Search, contentDescription = null)
                        }
                    },

                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = LightBlue,
                        textColor = Color.Black,
                        cursorColor = Color.Black,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    ),

                    shape = RoundedCornerShape(percent = 10)
                )
                
                Image(
                    imageVector = Icons.Default.Category, 
                    contentDescription = null,
                    modifier = Modifier.weight(0.2f)
                )
                
            }
            
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(categoryList){ categoryItem ->
                Row(modifier = Modifier.fillMaxWidth()) {
                    ShowCategoryItem(categoryItem = categoryItem)
                }
            }
        }

    }
}


@Composable
fun ShowCategoryItem(
    categoryItem: CategoryItem
) {
    Row(
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Image(
            painter = painterResource(id = categoryItem.image),
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .clip(CircleShape)
                .background(LightBlue),
            contentDescription = null
        )
        Text(
            text = categoryItem.category,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(horizontal = 4.dp),
        )
    }
}