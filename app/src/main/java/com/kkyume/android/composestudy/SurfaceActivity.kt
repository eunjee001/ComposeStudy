package com.kkyume.android.composestudy

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyume.android.composestudy.ui.theme.ButtonTheme
import com.kkyume.android.composestudy.ui.theme.SurfaceTheme

class SurfaceActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SurfaceTheme {
                    SurfaceExample("android")
            }
        }
    }
}

@Composable
fun SurfaceExample(name:String) {
    // step 1: Surface 에 elevation 을 설정
//    Surface(
//        modifier = Modifier.padding(5.dp),
//        tonalElevation = 10.dp
//    ){
//        Text(text = "hello $name", modifier = Modifier.padding(8.dp))
//    }
    // step 2: border의 값 설정
//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 5.dp
//    ){
//        Text(text = "hello $name", modifier = Modifier.padding(8.dp))
//    }

    // step 3: Surface의 shape도 설정
//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 10.dp,
//        shape = CircleShape
//    ){
//        Text(text = "hello $name", modifier = Modifier.padding(8.dp))
//    }
    // step 4: color를 지정
    Surface(
        border = BorderStroke(width = 2.dp, color = Color.Magenta),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp,
        shape = CircleShape,
        color = MaterialTheme.colorScheme.error
    ){
        Text(text = "hello $name", modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun SurfacePreview() {
    SurfaceTheme {
        SurfaceExample("android")
    }
}