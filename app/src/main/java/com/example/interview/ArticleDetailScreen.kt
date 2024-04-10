package com.example.interview

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.interview.ViewModels.ToDoListDetailViewModel
import com.example.interview.ViewModels.ToDoListViewModel

@Preview
@Composable
fun DetilScreen(){

    Card(modifier = Modifier
        .padding(5.dp)
        .fillMaxWidth(),
        border = BorderStroke(1.dp, Color(0xFFCCCCCC))
    ) {
        Text(
            text = "detail",
            style =  MaterialTheme.typography.titleLarge
        )
    }

}