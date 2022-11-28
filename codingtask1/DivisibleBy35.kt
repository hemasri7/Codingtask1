package codingtask1

fun main() {
    var count=0
    for(i in 1..100)
    {
        if(i%3==0 && i%5==0)
        {
            count++
            println("the count is $count and number is $i")
        }
    }
}