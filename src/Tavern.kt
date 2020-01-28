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
    var beverage = readLine()!!.capitalize()

    print(beverage)
}