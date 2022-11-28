package codingtask1

fun main() {
    var mylamda1:(Int)->String={age->
        if (age<18) "Non - adult"

        else if(age>=18 && age<=55) "Adult"
        else if(age>55) "Senior Citizen"
        else "wrong input"
    }
    print(" ${mylamda1(19)}")
}