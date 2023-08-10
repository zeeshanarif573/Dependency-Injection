package com.example.dependencyinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.dependencyinjection.manual_dependency_injection.EmailService
import com.example.dependencyinjection.manual_dependency_injection.RegistrationService
import com.example.dependencyinjection.manual_dependency_injection.UserRepository
import com.example.dependencyinjection.using_hilt.binds.CaptainRepository
import com.example.dependencyinjection.using_hilt.inject.EmployeeRepository
import com.example.dependencyinjection.using_hilt.modules.DriverRepository
import com.example.dependencyinjection.using_hilt.qualifiers.MathQualifier
import com.example.dependencyinjection.using_hilt.qualifiers.SubjectRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    //This is called field injection......
    @Inject
    lateinit var employeeRepository: EmployeeRepository

    @Inject
    lateinit var driverRepository: DriverRepository

    @Inject
    lateinit var captainRepository: CaptainRepository

    @Inject
    @MathQualifier
    lateinit var subjectRepository: SubjectRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manually creating objects of these 2 classes...........
        val userRepository = UserRepository()
        val emailService = EmailService()

        //After creating objects manually accessing register User function here...........
        val registrationService = RegistrationService(emailService, userRepository)
        registrationService.registerUser()

        //No need to create object manually here bcz hilt already creating object here using inject annotation.......
        employeeRepository.saveEmployee()

        driverRepository.saveDriver()

        captainRepository.saveCaptain()

        subjectRepository.saveSubjectMarks()
    }
}