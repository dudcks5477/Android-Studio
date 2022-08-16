package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
            val intent = Intent(this@Intent1, Intent2::class.java)

            // Key, Value 방식 -> Key와 value를 쌍으로 만들어 저장한다. -> Dictionary
            intent.putExtra("number1", 1)
            intent.putExtra("number2", 2)
            startActivity(intent)

            val intent2 = Intent(this@Intent1, Intent2::class.java)
            // Apply
            intent2.apply {
                this.putExtra("number1", 1)
                this.putExtra("number2", 1)
            }
            startActivity(intent2)
        }
    }
}