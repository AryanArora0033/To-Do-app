package com.example.todo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_card.create_priority
import kotlinx.android.synthetic.main.activity_create_card.create_title
import kotlinx.android.synthetic.main.activity_create_card.savebutton

class CreateCard :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_card)
        savebutton.setOnClickListener {
            if(create_title.text.toString().trim{it<=' '}.isNotEmpty()
                && create_priority.text.toString().trim{it<=' '}.isNotEmpty()){
                var title=create_title.text.toString()
                var priority=create_priority.text.toString()
                DataObject.setdata(title,priority)
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}