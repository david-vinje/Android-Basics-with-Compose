package com.example.androidtutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtutorial.ui.theme.AndroidTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidTutorialTheme {
        // GreetingImage()
        // ComposeArticle()
        // TaskManager()
        // ComposeSquare()
        BusinessCard()
    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 150.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Surface(
                    color = Color(0xFF073042),
                    modifier = Modifier
                        .size(100.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.android_logo),
                        contentDescription = null
                    )
                }
                Text(
                    text = "Jennifer Doe",
                    fontSize = 36.sp
                )
                Text(
                    text = "Android Developer Extraordinaire",
                    color = Color(0xFF006A36)
                )
            }
            Column {
                Row {
                    Icon(
                        Icons.Rounded.Phone,
                        contentDescription = null,
                        Modifier.padding(end = 16.dp)
                    )
                    Text(text = "+11 (123) 444 555 666")
                }
                Row (
                    Modifier.padding(top = 8.dp, bottom = 8.dp)
                ) {
                    Icon(
                        Icons.Rounded.Share,
                        contentDescription = null,
                        Modifier.padding(end = 16.dp)
                    )
                    Text(text = "@AndroidDev")
                }
                Row {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        Modifier.padding(end = 16.dp)
                    )
                    Text(text = "jen.doe@android.com")
                }
            }
        }
    }
}

@Composable
fun RowScope.ComposeQuadrant(
    header: String,
    subHeader: String,
    color: Color
) {
    Column(
        modifier = Modifier
            .background(color)
            .weight(1F)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = subHeader,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ColumnScope.ComposeRow(
    header1: String,
    subHeader1: String,
    header2: String,
    subHeader2: String,
    color1: Color,
    color2: Color
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .weight(1F),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ComposeQuadrant(
            header1,
            subHeader1,
            color1,
        )
        ComposeQuadrant(
            header2,
            subHeader2,
            color2,
        )
    }
}

@Composable
fun ComposeSquare() {
    Column {
        ComposeRow(
            stringResource(R.string.text_composable_title),
            stringResource(R.string.text_composable_description),
            stringResource(R.string.image_composable_title),
            stringResource(R.string.image_composable_description),
            Color(0xFFEADDFF),
            Color(0xFFD0BCFF)
        )
        ComposeRow(
            header1 = stringResource(R.string.row_composable_title),
            subHeader1 = stringResource(R.string.row_composable_description),
            header2 = stringResource(R.string.column_composable_title),
            subHeader2 = stringResource(R.string.column_composable_description),
            color1 = Color(0xFFB69DF8),
            color2 = Color(0xFFF6EDFF)
        )
    }
}

@Composable
fun TaskManager() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_task_completed),
            contentDescription = null
        )
        Text(
            text = stringResource(R.string.all_tasks_completed),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.subtitle),
            fontSize = 16.sp
        )
    }
}

@Composable
fun ComposeArticle() {
    Column(verticalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.first_paragraph),
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.second_paragraph),
            fontSize = 16.sp,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun GreetingImage(to: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            to = stringResource(R.string.to),
            from = stringResource(R.string.from),
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun GreetingText(to: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "Happy Birthday $to!",
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = "From $from",
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}