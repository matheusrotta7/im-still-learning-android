package com.punchy.udemyempty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        println("I was clicked yo")
    }

    fun click2(view: View) {
        println("I was clicked 2")
    }

    fun drawRandom(view: View) {
        val drawResult = findViewById<TextView>(R.id.draw_result) //find interface item by id
        val randNumber = Random.nextInt(1, 10)
        if (randNumber == 3) {
            drawResult.text = "Amo a Alessandra"
        } else {
            drawResult.text = "Resultado: $randNumber"
        }
    }

    fun triggerKotlinJavaTest(view: View) {
        val user = User("Matheus", 27)
        user.logIn()
    }

}