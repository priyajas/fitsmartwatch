package com.example.fitstopwatch

import android.graphics.Typeface
import android.os.Bundle
import android.os.SystemClock
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Chronometer
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Stopwatch : AppCompatActivity() {
    private lateinit var btnstart: Button
    private lateinit var btnstop: Button
    private lateinit var roundingalone: Animation
    private lateinit var imganchor: ImageView
    private lateinit var timer:Chronometer
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)
        btnstart = findViewById(R.id.btnstart)
                btnstop=findViewById(R.id.btnstop)
        imganchor = findViewById(R.id.icanchor)
                timer=findViewById(R.id.timerHere)
        //loading animations
        roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone)
        //import font
        val MMedium = Typeface.createFromAsset(assets, "MMedium.ttf")
        //customize font
        btnstart.typeface = MMedium

        //StartNow onclick
        btnstart.setOnClickListener(View.OnClickListener {
           // Toast.makeText(this, "Smileys = " + ("\ud83d\ude01"),Toast.LENGTH_SHORT).show();
            imganchor.startAnimation(roundingalone)
            btnstop.animate().alpha(1F).translationY((-80).toFloat()).setDuration(300).start();
            btnstart.animate().alpha(0F).setDuration(300).start()
            timer.setBase(SystemClock.elapsedRealtime())
            timer.start()
        })
                //Finish WorkOut onclick
                btnstop.setOnClickListener(View.OnClickListener {
                    val elapsedMillis: Long = SystemClock.elapsedRealtime() - timer.getBase()
                    println("Duration $elapsedMillis")
                    Toast.makeText(this,"Workout Duration: " + elapsedMillis, Toast.LENGTH_SHORT).show();
                    imganchor.clearAnimation()
                    btnstart.animate().alpha(1F).start()
                    btnstop.animate().alpha(0F).start()
                    timer.stop()



                }

                )
    }
}