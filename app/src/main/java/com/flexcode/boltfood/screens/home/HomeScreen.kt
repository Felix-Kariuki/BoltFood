package com.flexcode.boltfood.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.flexcode.boltfood.R
import com.flexcode.boltfood.data.FoodItem
import com.flexcode.boltfood.data.foodList

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
    ) {


        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(painterResource(id =R.drawable.ic_location ), contentDescription = null)
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Kilimani",
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Discount on the entire menu",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ShowFoodItem(foodItem = item)
                }

            }

        }


        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Get it fast",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ShowFoodItem(foodItem = item)
                }

            }

        }


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Top rated",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ShowFoodItem(foodItem = item)
                }

            }

        }


        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "New on Bolt Food",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ShowFoodItem(foodItem = item)
                }

            }

        }


        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Pick up yourself",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ShowFoodItem(foodItem = item)
                }

            }

        }

        LazyColumn(
            Modifier.height(500.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ){
            items(foodList){ item->
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    ShowFoodItem(foodItem = item)
                }

            }

        }


    }
}

@Composable
fun ShowFoodItem(
    foodItem: FoodItem
) {
    Column() {

        Card(
            modifier =Modifier
                .clip(RoundedCornerShape(8.dp)),
            elevation = 4.dp

        ) {
            Image(
                painter = painterResource(id = foodItem.foodImage),
                modifier = Modifier
                    .width(180.dp)
                    .height(150.dp),
                contentDescription = null
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = foodItem.name,
                fontSize = 16.sp,
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = foodItem.rating,
                fontSize = 16.sp,
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = foodItem.canceledPrice,
                fontSize = 16.sp,
                style = TextStyle(textDecoration = TextDecoration.LineThrough)
            )

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = foodItem.price,
                fontSize = 16.sp,
                textAlign = TextAlign.End,
                modifier = Modifier.padding(horizontal = 8.dp)

            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(
) {
    HomeScreen()
}