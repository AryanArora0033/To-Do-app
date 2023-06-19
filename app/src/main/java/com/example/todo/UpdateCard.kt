package com.example.todo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_card.create_priority
import kotlinx.android.synthetic.main.activity_create_card.create_title
import kotlinx.android.synthetic.main.update_card.delete_button
import kotlinx.android.synthetic.main.update_card.update_button

class UpdateCard:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_card)
        val pos=intent.getIntExtra("id",-1)
        if(pos!=-1){
            val title=DataObject.getsingledata(pos).title
            val priority=DataObject.getsingledata(pos).priority
            create_title.setText(title)
            create_priority.setText(priority)
            delete_button.setOnClickListener {
                DataObject.deletesingledata(pos)
                myintent()
            }
            update_button.setOnClickListener {
                DataObject.updatedata(pos,create_title.text.toString(),create_priority.text.toString())
                Toast.makeText(this, title+""+priority, Toast.LENGTH_SHORT).show()
                myintent()

            }
        }

    }
    fun myintent(){
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}