package com.school

class NonAcademic(name:String, staffType: StaffType = StaffType.NON_ACADEMIC) {

    val activities = listOf<String>("Sweep the School", "Guard the gate", "Set Time Table")
    //declear a function that printout what he/she can do

    internal fun whatCanIDo(){
        for(i in activities) print("$i , ")
    }
}

    //inbuild function for test
//fun main(){
//    val nonAcademic = NonAcademic("ada")
//    print(nonAcademic.whatCanIDo())
//}