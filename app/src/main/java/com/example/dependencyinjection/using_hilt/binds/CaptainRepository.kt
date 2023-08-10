package com.example.dependencyinjection.using_hilt.binds

import android.util.Log
import javax.inject.Inject

interface CaptainRepository {
    fun saveCaptain()
}

class CareemCaptain @Inject constructor() : CaptainRepository {
    override fun saveCaptain() {
        Log.e("status", "Careem Captain Saved")
    }
}

class PlaneCaptain : CaptainRepository {
    override fun saveCaptain() {
        Log.e("status", "Plane Captain Saved")
    }
}