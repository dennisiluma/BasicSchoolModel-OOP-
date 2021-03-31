package com.school

class Applicants(name:String, age:Int) {
    val name = name
    val age = age
    init {
        println("Hello ${name}, welcome to our school")
    }

    //condition to check applicant eligibility
    fun eligibilityStatus() {
        if (age in 12..17) {
            print("""You are eligible for admission""")
        } else {
            print("We are sorry, You are not eligible for admission")
        }
    }
}
        //inbuilt fuction for test
//fun main() {
//    val applicants = Applicants("dennis", 43)
//    print(applicants.eligibilityStatus())
//}