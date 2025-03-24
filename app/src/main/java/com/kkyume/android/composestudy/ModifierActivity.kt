package com.kkyume.android.composestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kkyume.android.composestudy.ui.theme.ModifierTheme

class ModifierActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifierTheme {
                    ModifierExample()
            }
        }
    }
}

@Composable
fun ModifierExample() {
    // step 1: Modifier 에 Modifier.fillMaxSize()를 사용
//    Button(
//        onClick = {},
//        modifier = Modifier.fillMaxSize()
//    ){
//       Icon(
//           imageVector = Icons.Filled.Search, contentDescription = null
//       )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 2: fillMaxSize에서 Modifier.height를 설정
//    Button(
//        onClick = {},
//        modifier = Modifier.height(100.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 3: modifier에 height와 width를 같이 설정
//    Button(
//        onClick = {},
//        modifier = Modifier.width(200.dp)
//            .height(100.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 4: size에 width와 height를 인자로 넣을 수 있음
//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp, 300.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 5: background를 설정(버튼에는 되지 않음)
//    Button(
//        onClick = {},
//        modifier = Modifier.size(200.dp)
//            .background(Color.Red)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 6: colors 파라미터에 ButtonDefaults.buttonColors를 넣어보자.
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        modifier = Modifier
//            .size(200.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 7: Button의 modifier에 padding 추가
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        modifier = Modifier
//            .padding(10.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search")
//    }
    // step 8: Button에 enabled를 false로 설정하고 Text의 modifier에 clickable 넣어보자
//    Button(
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Magenta,
//            contentColor = Color.Cyan
//        ),
//        onClick = {},
//        enabled = false,
//        modifier = Modifier
//            .size(200.dp)
//            .padding(10.dp)
//    ){
//        Icon(
//            imageVector = Icons.Filled.Search, contentDescription = null
//        )
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Search", modifier = Modifier.clickable{})
//    }

    // step 9 : Text와 modifier에 offset 설정하고 x 파라미터 설정
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Cyan
        ),
        onClick = {},
        enabled = false,
        modifier = Modifier
            .size(200.dp)
            .padding(10.dp)
    ){
        Icon(
            imageVector = Icons.Filled.Search, contentDescription = null,
            modifier = Modifier.size(200.dp).padding(10.dp)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing).background(Color.Blue))
        Text(text = "Search",
            modifier = Modifier.offset(x= 10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ModifierPreview() {
    ModifierTheme {
        ModifierExample()
    }
}