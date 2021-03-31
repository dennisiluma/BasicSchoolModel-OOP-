package com.school

abstract class Staff(name: String) {
    init {
        println("My name is $name")
    }
    abstract fun teachCourse()
    abstract fun expelStudent()
    abstract fun admitApplicant()
}