package com.example.fitstopwatch

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    private lateinit var text1: TextView
    private lateinit var text2: TextView
    private lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1=findViewById(R.id.text1)
        text2=findViewById(R.id.text2)
        btn=findViewById(R.id.getstart)

        //import font
        val Mlight = Typeface.createFromAsset(assets, "MLight.ttf")
        val MMedium = Typeface.createFromAsset(assets, "MMedium.ttf")
        val MRegular = Typeface.createFromAsset(assets, "MRegular.ttf")
        text1.typeface= Mlight
        text2.typeface=MMedium
        btn.typeface=MRegular
    }
}