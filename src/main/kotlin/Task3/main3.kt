

fun main() {

    val purchases: Double = 2000000.0
    val musicLover: Boolean = true

    val price = if (purchases < 100000) {
        purchases
    } else if (purchases < 1000000) {
        purchases - 10000
    } else if (purchases > 1000100) {
        purchases * 0.95
    } else {
        purchases
    }

    val totalPrice: Double = if (musicLover) price * 0.99 else price

    println("Финальная цена: ${totalPrice.toInt()} копеек")

}