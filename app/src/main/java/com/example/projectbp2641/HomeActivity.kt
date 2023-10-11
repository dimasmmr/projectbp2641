package com.example.projectbp2641

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnmore: Button = findViewById(R.id.menu4   )
        val btnBook : Button = findViewById(R.id.menu2)
        val rvBuku: RecyclerView = findViewById(R.id.recyclerViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<BukuModel>()
        data.add(BukuModel(R.drawable.book1,"Emis beach","blablablablablabla"))
        data.add(BukuModel(R.drawable.book2,"Emis beach","blablablablablabla"))
        data.add(BukuModel(R.drawable.book1,"Emis beach","blablablablablabla"))
        data.add(BukuModel(R.drawable.book2,"Emis beach","blablablablablabla"))
        data.add(BukuModel(R.drawable.book1,"Emis beach","blablablablablabla"))
        data.add(BukuModel(R.drawable.book2,"Emis beach","blablablablablabla"))

        val adapter = AdapterHome(data)

        rvBuku.adapter= adapter


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