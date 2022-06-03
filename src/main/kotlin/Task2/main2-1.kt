fun main() {

    val quantity = 61

    val people = if (quantity % 10 == 1 && quantity % 100 != 11) "человеку" else "людям"

    println("Понравилось $quantity $people")
}