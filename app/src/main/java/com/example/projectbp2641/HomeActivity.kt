package com.example.projectbp2641

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnmore: Button = findViewById(R.id.menu4   )
        val btnBook : Button = findViewById(R.id.menu2)

        btnBook.setOnClickListener{
            val intent = Intent(this,BookKidActivity::class.java)
            startActivity(intent)
        }

        btnmore.setOnClickListener{
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }
    }
}