package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card.*

class card : AppCompatActivity() {

    companion object{
        const val Name_Extra = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val namee = intent.getStringExtra(Name_Extra)
        Birthday.text = "Happy Birthday\n $namee!"

    }
}