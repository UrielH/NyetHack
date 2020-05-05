import java.lang.Exception
import java.lang.IllegalStateException

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) {
        swordsJuggling = 2
    }

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)

    } catch (e: Exception) {
        println(e)

    }

    println("You juggle $swordsJuggling swords!")
}

fun proficiencyCheck(swordsJuggling: Int?) {

    if (swordsJuggling != null) {
        require(swordsJuggling >= 3, {"Juggle at least 3 swords to be exciting"})
    }

    //checkNotNull(swordsJuggling, { "Player cannot juggle swords" })
//    swordsJuggling ?: throw UnskilledSwordJuggleException()
}

class UnskilledSwordJuggleException() : IllegalStateException("Player cannot juggle swords")
