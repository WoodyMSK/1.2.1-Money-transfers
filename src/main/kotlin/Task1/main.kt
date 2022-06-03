fun main() {
    val amount: Int = 700000
    val commissionPercent: Double = 0.0075

    val commission = if (amount > (3500 / commissionPercent)) amount * commissionPercent else 3500

    println("commission: $commission копеек")
}