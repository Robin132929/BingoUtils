package com.robin.bingo.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robin.bingo.utils.Test

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Test().testa()
    }
}