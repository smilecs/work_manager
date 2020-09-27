package com.example.work_manager.deferred

import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkRequest

object BackgroundWorkRequest {

    val backgroundRequest: WorkRequest =
        OneTimeWorkRequestBuilder<BackgroundWorker>()
            .build()
}