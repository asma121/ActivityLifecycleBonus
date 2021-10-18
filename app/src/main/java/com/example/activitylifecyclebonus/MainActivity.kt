package com.example.activitylifecyclebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    var str=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView=findViewById(R.id.textView)
    }

    override fun onStart() {
        super.onStart()
       str+="I am online"
        textView.text=str
    }

    override fun onPause() {
        super.onPause()
        val time=SimpleDateFormat("dd-MM-yyyy HH:MM:SS")
        str+="\nlast seen ${time.format(Date())}\n"
        textView.text=str
    }

    //Calendar.getInstance().time
}