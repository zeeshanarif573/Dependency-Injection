package com.example.dependencyinjection.using_hilt.inject

import javax.inject.Inject

class EmployeeRepository @Inject constructor(private val loggerService: LoggerService) {

    //Calling show log from logger service passing in constructor, This is called constructor injection.............
    fun saveEmployee() {
        loggerService.showLog()
    }
}