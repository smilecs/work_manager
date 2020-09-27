package com.example.work_manager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.WorkManager
import com.example.work_manager.deferred.BackgroundWorkRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WorkManager.getInstance(this)
            .enqueue(BackgroundWorkRequest.backgroundRequest)
    }
}