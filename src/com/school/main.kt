package com.school

fun main(args: Array<String>) {

    //display activities and behaviours of Applicant
    val applicant1 = Applicants("Dennis", 43)
    println(applicant1.eligibilityStatus())
    println()

    //for Noncademic Staff
    println("FOR NON-ACADEMIC STAFF")
    val nonAcademic1 = NonAcademic("ada")
    print(nonAcademic1.whatCanIDo())
    println();println()

    //for principal
    println("FOR PRINCIPAL")
    val principal = Principal("Mrs Aramide")
    println(principal.admitApplicant());println()

    val principal2 = Principal("Slay Mama", StaffType.NON_ACADEMIC)
    println(principal2.admitApplicant())
    println()

    //for Teacher
    println("FOR TEACHER")
    val teacher = Teacher("Fumi")
    print(teacher.teachCourse())
    println();println()

    //for Student
    println("FOR STUDENT")
    val student = Student("Josh")
    print(student.takeCourse())
}
