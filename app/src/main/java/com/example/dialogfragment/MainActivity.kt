package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rate = findViewById<TextView>(R.id.rateMeTextView)
        rate.setOnClickListener {
            var dialog = CustomDialogFragment()
            dialog.show(supportFragmentManager,"customDialog")
        }
    }
}