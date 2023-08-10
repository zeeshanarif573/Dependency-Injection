package com.example.dependencyinjection.using_hilt.qualifiers

import android.util.Log

interface SubjectRepository {
    fun saveSubjectMarks()
}

class MathRepository : SubjectRepository {
    override fun saveSubjectMarks() {
        Log.e("status", "save maths marks")
    }
}

class PhysicsRepository : SubjectRepository {
    override fun saveSubjectMarks() {
        Log.e("status", "save physics marks")
    }
}