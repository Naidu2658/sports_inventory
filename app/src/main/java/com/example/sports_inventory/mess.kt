package com.example.sports_inventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class mess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mess)
        supportActionBar!!.title= "mess"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}