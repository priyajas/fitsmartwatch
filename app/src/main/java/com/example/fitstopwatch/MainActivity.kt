package com.example.fitstopwatch

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var text1: TextView
    private lateinit var text2: TextView
    private lateinit var btn: Button
    private lateinit var atg :Animation
    private lateinit var txt :Animation
    private lateinit var abtn :Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1=findViewById(R.id.text1)
        text2=findViewById(R.id.text2)
        btn=findViewById(R.id.getstart)
        //loading animation
        atg=AnimationUtils.loadAnimation(this,R.anim.atg)
        txt=AnimationUtils.loadAnimation(this,R.anim.txt)
        abtn=AnimationUtils.loadAnimation(this,R.anim.btn)


        //passing animation
        ivSplash.startAnimation(atg)
        text1.startAnimation(txt)
        text2.startAnimation(txt)
        btn.startAnimation(abtn)

        //import font
        val Mlight = Typeface.createFromAsset(assets, "MLight.ttf")
        val MMedium = Typeface.createFromAsset(assets, "MMedium.ttf")
        val MRegular = Typeface.createFromAsset(assets, "MRegular.ttf")
        text1.typeface= Mlight
        text2.typeface=MMedium
        btn.typeface=MRegular
    }
}