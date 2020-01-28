fun main () {
    //Using safe call operator
    var beverage = readLine()?.capitalize()
    beverage = null
    print(beverage)

}