package com.school

class Student(name:String) {

    //declear the bahaviour status of the student
    private var wellBehaved:Boolean = true

    //SetOf of avialable courses
    private val courses = setOf<String>("maths", "English", "BasicStudies", "Civic")

    //create a behaviour for Student
    fun takeCourse(){
        //check weather student can take course or not
        if(this.wellBehaved){
            print("I am qualified to take ${courses.toSet()} course")
        }else{
            print("I can't take course")
        }
    }
}
//test (tdd) for student
//fun main(args: Array<String>) {
//    val student = Student("josh")
//    print(student.takeCourse())
//}



