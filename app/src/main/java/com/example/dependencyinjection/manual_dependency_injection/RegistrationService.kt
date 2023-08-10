package com.example.dependencyinjection.manual_dependency_injection

class RegistrationService(
    private val emailService: EmailService,
    private val userRepository: UserRepository
) {

    fun registerUser() {
        userRepository.saveUser()
        emailService.sendEmail()
    }
}