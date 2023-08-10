package com.example.dependencyinjection.using_hilt.inject

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun showLog() {
        Log.e("status", "Employee Saved")
    }
}