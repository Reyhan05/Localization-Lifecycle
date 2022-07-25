package com.project.localization_lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, "Ini onCreate", Toast.LENGTH_SHORT).show()
        binding.btn1.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        Log.e("Activity", R.string.onCreateInvoke.toString())

    }

    override fun onStart() {
        super.onStart()
        Log.e("Activity", "onStart invoke")
        Toast.makeText(this, "Ini onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onResume() {
        super.onResume()
        Log.e("Activity", "onResume invoke")
        Toast.makeText(this, "Ini onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.e("Activity", "onPause invoke")
        Toast.makeText(this, "Ini onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.e("Activity", "onStop invoke")
        Toast.makeText(this, "Ini onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Activity", "onDestroy invoke")
        Toast.makeText(this, "Ini onDestroy", Toast.LENGTH_SHORT).show()
    }
}