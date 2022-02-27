package ru.gb.course2.gbkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testTest()
        testTest1()

        val btn = findViewById<Button>(R.id.button_push)
        btn.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
        }

        val d = Data()
        val textView: TextView = findViewById(R.id.text_one)
        textView.text = d.age.toString()

        val dataCopy = d.copy(age = 45)
        val textViewCopy: TextView = findViewById(R.id.text_two)
        textViewCopy.text = dataCopy.age.toString()

    }

    companion object {
        val ABC = "TEST"
    }

}

fun testTest() {
    for (i in 1..10) {
        println("Hello Kotlin!")
    }
}

fun testTest1() {
    for (i in 10 downTo 1 step 2) {
        println("Hello Kotlin!")
    }
}
