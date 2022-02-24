package com.tyearlin.demo

import android.support.v7.app.AppCompatActivity
import android.widget.VideoView
import android.os.Bundle
import com.tyearlin.demo.R
import android.media.MediaPlayer.OnPreparedListener
import android.media.MediaPlayer
import android.media.MediaPlayer.OnCompletionListener
import android.net.Uri
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}