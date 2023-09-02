package com.feature.module2.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Screen2() {
    Log.d("TAG", "Screen2: safsddsafad")
    Text(
        text = "Hello This is Screen 2!",
        modifier = Modifier.fillMaxSize(),
        color = Color.Red
    )
}