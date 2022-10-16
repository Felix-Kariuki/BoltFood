package com.flexcode.boltfood.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextItem(
    text: String,
    fontSize: TextUnit,
    fontWeight: FontWeight
) {

    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight
    )
}