package com.example.work_manager.deferred

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class BackgroundWorker(context: Context, workerParams: WorkerParameters) :
    Worker(context, workerParams) {

    override fun doWork(): Result {
        //Do background work here (network request, image parsing, etc)
        intensiveBackgroundWork()
        return Result.success()
    }

    private fun intensiveBackgroundWork() {}
}