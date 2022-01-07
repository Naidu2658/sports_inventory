package com.example.sports_inventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class canteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canteen)
        supportActionBar!!.title= "canteen"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}