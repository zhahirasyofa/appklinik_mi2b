package com.zhahira.appklinik_mi2b

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogIn : AppCompatActivity() {
    private lateinit var up : TextView
    private lateinit var btnSignIn : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_log_in)

        btnSignIn = findViewById(R.id.btnsignin)
        up = findViewById(R.id.tvsignup)

        up.setOnClickListener(){
            val intent = Intent(this, PageRegister::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener(){
            val intent = Intent(this,DoctorsPageActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}