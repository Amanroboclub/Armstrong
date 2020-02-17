fun main(){
    println("Lets Calculate your Age")
    print("Enter day date and year to check age")
    print("Enter Day")
    var Day = readLine().toString().toInt()
    print("month")
    var Month = readLine().toString().toInt()
    print("year")
    var year = readLine().toString().toInt()
    var newDay:Int
    var newMonth:Int
    var newYear:Int
    newDay = 30 - Day
    newMonth = 12 - Month
    newYear = 2020 - year
    println("Days$newDay,months$newMonth,year$newYear")

}