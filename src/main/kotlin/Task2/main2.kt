package Task2

fun main() {
    val likes = 4567
    var wordEnd: String = ""

    if (likes == 11) {
        wordEnd = "лайков"
        println("Поздравляем! Вы собрали " + likes + " " + wordEnd)
        return
    }

    if (likes == 12) {
        wordEnd = "лайков"
        println("Поздравляем! Вы собрали " + likes + " " + wordEnd)
        return
    }

    if (likes == 13) {
        wordEnd = "лайков"
        println("Поздравляем! Вы собрали " + likes + " " + wordEnd)
        return
    }

    if (likes == 14) {
        wordEnd = "лайков"
        println("Поздравляем! Вы собрали " + likes + " " + wordEnd)
        return
    }

    when (likes%10) {
        1 -> wordEnd = "лайк"
        2, 3, 4 -> wordEnd = "лайка"
        0, 5, 6, 7, 8, 9 -> wordEnd = "лайков"

    }

    println("Поздравляем! Вы собрали " + likes + " " + wordEnd)
}