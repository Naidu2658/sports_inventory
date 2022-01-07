package com.example.sports_inventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import com.example.sports_inventory.sports
class MainActivity3 : AppCompatActivity() {
    companion object{
        const val option = ""
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val so = intent.getStringExtra(option)
        if(so=="1")
        {

             baddy()
        }
        else if(so=="2")
        {
            chess()
        }
        else if(so=="3")
        {
            tt()
        }
        else if(so=="4")
        {
            vb()
        }
        else
        {
            bb()
        }

    }
    fun baddy(){
        supportActionBar!!.title= "Badminton"
        val bt : TextView =findViewById(R.id.tot_val)
        bt.text=100.toString()

        val ba : TextView =findViewById(R.id.avail_val)
        ba.text=89.toString()
    }
    fun chess()
    {
        supportActionBar!!.title= "Chess"
    }
    fun tt()
    {
        supportActionBar!!.title= "Table Tennis"
    }
    fun vb()
    {
        supportActionBar!!.title= "Volley Ball"
    }
    fun bb()
    {
        supportActionBar!!.title= "Basket Ball"
    }

}