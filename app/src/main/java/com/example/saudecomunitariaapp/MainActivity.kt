package com.example.saudecomunitariaapp

import android.widget.Button
import android.widget.TextView
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val healthStatusTextView: TextView = findViewById(R.id.healthStatusTextView)
        val checkHealthButton: Button = findViewById(R.id.checkHealthButton)

        checkHealthButton.setOnClickListener {
            // Placeholder para verificar status de saúde
            healthStatusTextView.text = "Tudo certo com sua saúde!"
        }
    }
}