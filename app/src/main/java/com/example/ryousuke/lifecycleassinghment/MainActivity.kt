package com.example.ryousuke.lifecycleassinghment

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ryousuke.lifecycleassinghment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG ="MainActivity"

    override fun onRestart() {
        Log.v(TAG,"onRestart is called!!")
        super.onRestart()
    }

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate is called!!")
    }

    override fun onStart() {
        Log.d(TAG, "onStart is called!!")
        super.onStart()
    }

    // You can only see your screen at this time ,so I wrote text code displaying on screen.
    @SuppressLint("SetTextI18n")
    override fun onResume() {
        Log.d(TAG,"onResume is called!!")

        binding.LifecycleTv.text = "onResume is called!!"
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"onPause is called!!")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"onStop is called!!")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy is called!!")
        super.onDestroy()
    }
}