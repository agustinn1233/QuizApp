package com.android.applepie.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private var tv_name: TextView? = null
private var tv_score: TextView? = null
private var btn_finish: Button? = null

class ResultActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        tv_name?.findViewById<TextView>(R.id.tv_name)
        tv_score?.findViewById<TextView>(R.id.tv_score)


        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name?.text = username

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score?.text = "You Score is $correctAnswer out of $totalQuestions"

        btn_finish?.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}