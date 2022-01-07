package com.example.sports_inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
//import com.example.sports_inventory.databinding.ActivityMainBinding
import android.os.Bundle
import android.widget.*
import android.widget.RadioGroup
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title="inventory"
        val but : Button =findViewById(R.id.b1);
        val rad : RadioGroup = findViewById(R.id.depp)

        but.setOnClickListener{
            val intent= when(rad.checkedRadioButtonId)
            {
                R.id.sports-> Intent(this, sports::class.java)
                R.id.mess-> Intent(this, mess::class.java)
                else-> Intent(this, canteen::class.java)
            }
            startActivity(intent)
        }
    }
}