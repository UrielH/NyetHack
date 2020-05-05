fun main () {
    //Using safe call operator
 /*   var beverage = readLine()?.capitalize()
    beverage = null
     print(beverage)*/

    // Using let operator + safe call operator
  /*  var beverage = readLine()?.let {
        if(it.isNotBlank()){
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }*/
   // beverage = null

    // Using non-null assertion operator
/*    var beverage = readLine()!!.capitalize()

    print(beverage)*/

    var beverage = readLine()
    //beverage = null

    if(beverage != null) {
        beverage = beverage.capitalize()
    } else {
        print("I can't do that without crashing - beverage was null!")
    }

    val beverageServed: String = beverage ?: "Buttered Ale"
    print(beverageServed)
}