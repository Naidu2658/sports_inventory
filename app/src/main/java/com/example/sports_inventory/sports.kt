package com.example.sports_inventory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup

public class sports : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        supportActionBar!!.title= "sports inventory"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        val but : Button =findViewById(R.id.bt2);
        but.setOnClickListener{
            val intent= Intent(this@sports, MainActivity3::class.java)
            val sop=sportsoption ()
            intent.putExtra(MainActivity3.option,sop.toString())
            startActivity(intent)
        }

    }
    fun  sportsoption (): Int {
        val rad : RadioGroup = findViewById(R.id.sports)
        val ind_sp= when(rad.checkedRadioButtonId)
        {
            R.id.badminton-> 1
            R.id.chess-> 2
            R.id.Table_Tennis-> 3
            R.id.vb-> 4
            else-> 5
        }
        return ind_sp;
    }

}

