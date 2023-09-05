package com.example.lab1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button1_onClick(view: View?)
    {
        val tv1: TextView = findViewById(R.id.textView1)
        tv1.text = "some text)"
    }
    fun button2_onClick(view: View?)
    {
        val tv1: TextView = findViewById(R.id.textView1)
        tv1.setTextColor(Color.BLUE)
    }
}