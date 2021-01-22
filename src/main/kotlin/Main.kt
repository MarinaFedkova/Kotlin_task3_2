fun main() {
    countComission("Maestro", 80_000, 5_000, 1_000)
}

fun countComission(
    cardType: String = "Vk Pay",
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
    amount: Int
) {
    when (cardType) {
        "Mastercard", "Maestro" -> countComissionMastercardMaestro(amount, totalAmountOfMonth, totalAmountOfDay)
        "Visa", "Мир" -> countComissionVisaMir(amount, totalAmountOfMonth, totalAmountOfDay)
        "Vk Pay" -> countComissionVkPay(totalAmountOfMonth, totalAmountOfDay)
    }
}

fun countComissionMastercardMaestro(
    amount: Int,
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
) {
    when {
        totalAmountOfDay > 150_000 -> println("В операции отказано. Превышен лимит суммы за день")
        totalAmountOfMonth > 600_000 -> println("В операции отказано. Превышен лимит суммы за месяц")
        totalAmountOfMonth > 75_000 -> println("Комиссия за перевод составит ${amount * 0.006 + 20.00} руб.")
        else -> println("Комиссия за перевод отсутствует")
    }
}

fun countComissionVisaMir(
    amount: Int,
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
) {
    when {
        totalAmountOfDay > 150_000 -> println("В операции отказано. Превышен лимит суммы за день")
        totalAmountOfMonth > 600_000 -> println("В операции отказано. Превышен лимит суммы за месяц")
        amount * 0.0075 < 35 -> println("Комиссия за перевод составит 35 руб.")
        else -> println("Комиссия за перевод составит ${amount * 0.0075} руб.")
    }
}

fun countComissionVkPay(
    totalAmountOfMonth: Int = 0,
    totalAmountOfDay: Int = 0,
) {
    when {
        totalAmountOfDay > 15_000 -> println("В операции отказано. Превышен лимит суммы за день")
        totalAmountOfMonth > 40_000 -> println("В операции отказано. Превышен лимит суммы за месяц")
        else -> println("Комиссия за перевод отсутствует")
    }
}