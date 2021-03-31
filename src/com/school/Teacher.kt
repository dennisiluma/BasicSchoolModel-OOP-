package com.school

class Teacher(name:String, staffType: StaffType = StaffType.TEACHER): Staff(name) {
    val name = name
    val staffType = staffType

    //create if a teacher can teach
    override fun teachCourse(){
        if(staffType == StaffType.TEACHER){
        print(" I can Teach")
        }else {
            print(" $name , You cannot teach, because you are not a teacher")
        }
    }

    override fun expelStudent() {
        TODO("Not yet implemented")
    }

    override fun admitApplicant() {
        TODO("Not yet implemented")
    }
}

// test for teacher
//fun main(){
//    val teacher = Teacher("issac")
//    print(teacher.teachCourse())
//}