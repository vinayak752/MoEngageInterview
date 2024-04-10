package com.example.interview

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.example.interview.ViewModels.ToDoListViewModel
import com.example.moengage.Article

@Preview
@Composable
fun ToDoScreen() {
        val toDoListViewModel : ToDoListViewModel = viewModel()
        val toDoList = toDoListViewModel.toDoList.collectAsState()

        Log.d("VINAY","check "+toDoList.value.size)
        LazyColumn(contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.SpaceAround){
                items(toDoList.value){

                                RowToDoItem(it.author,it.title,it.urlToImage)


                }

        }

}
@Composable
fun RowToDoItem( author: String?, title: String, urlToImage: String) {
        Card(modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
                border = BorderStroke(1.dp, Color(0xFFCCCCCC))
                ) {
            Column(modifier = Modifier.padding(5.dp),
                    ) {
                    if (author != null) {
                            Text(
                                    style = typography.titleLarge,
                                    modifier = Modifier.size(40.dp),
                                    text = author,
                                    fontWeight = FontWeight.Bold
                            )
                    }
                    Text(
                            text = title,
                            style =  typography.titleSmall
                    )
                    Image(
                            painter = rememberAsyncImagePainter(urlToImage),
                            contentDescription = null,
                            modifier = Modifier.size(128.dp)
                    )
            }
        }
}
