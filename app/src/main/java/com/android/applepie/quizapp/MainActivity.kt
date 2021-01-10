package com.android.applepie.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val editTextNombre: EditText = findViewById(R.id.editText_Nombre);
        val btnStart : Button = findViewById(R.id.btn_iniciar);
        btnStart.setOnClickListener {
            if (editTextNombre.text.toString().isEmpty()) {
                Toast.makeText(this, "Porfavor ingresa tu nombre", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editTextNombre.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}