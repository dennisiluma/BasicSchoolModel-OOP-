package com.school

class Principal(name:String, staffType: StaffType = StaffType.PRINCIPAL): Staff(name) {
//    declear and store the variable
    val staffType = staffType
    //initialize a block of code
    init {
        val name=name
        println(" my name is $name." +
                //create a statement to check if the user is a principal
                "${if (staffType == StaffType.PRINCIPAL){
                    print("I am the principal of the school")
                }else{
                    print("You are not the principal")
                }}"
                )
    }
    override fun teachCourse() {
        TODO("Not yet implemented")
    }

    //Activities that a principal can carry out
    override fun expelStudent(){
        print("A principal can expel student")
    }
    override fun admitApplicant(){
        print("A principal can admit applicant whose age is greater than 11 and less that 18")
    }
}
  //inline test function for principal
//fun main(args: Array<String>) {
//    val principal = Principal("mama G")
//    println(principal.admitApplicant())
//}