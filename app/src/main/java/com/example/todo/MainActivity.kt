package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.btnAdd

import kotlinx.android.synthetic.main.activity_main.recyclerview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener {
            var intent=Intent(this,CreateCard::class.java)
            startActivity(intent)
        }

        recyclerview.adapter=Adapter(DataObject.getdata())
        recyclerview.layoutManager=LinearLayoutManager(this)
    }
}