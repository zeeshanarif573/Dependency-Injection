package com.example.dependencyinjection.using_hilt.modules

import android.util.Log
import javax.inject.Inject

interface DriverRepository {
    fun saveDriver()
}

class VanDriver @Inject constructor() : DriverRepository {
    override fun saveDriver() {
        Log.e("status", "Van Driver Saved")
    }
}

class PrivateDriver : DriverRepository {
    override fun saveDriver() {
        Log.e("status", "Private Driver Saved")
    }
}