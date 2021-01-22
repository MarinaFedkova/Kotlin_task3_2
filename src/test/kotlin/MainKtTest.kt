import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

//    @Test
//    fun countComissionMastercardMaestroBefore_75000() {
//        val amount = 1_000
//        val totalAmountOfMonth = 0
//        val totalAmountOfDay = 0
//        val expected = "Комиссия за перевод отсутствует"
//
//        val result = countComissionMastercardMaestro(
//            amount = amount,
//            totalAmountOfMonth = totalAmountOfMonth,
//            totalAmountOfDay = totalAmountOfDay,
//        )
//
//        assertEquals(expected, result)
//    }

    @Test
    fun countComissionMastercardMaestro75000_150000() {
        val amount = 1_000
        val totalAmountOfMonth = 80_000
        val totalAmountOfDay = 0
        val expected = 26.0

        val result = countComissionMastercardMaestro(
            amount = amount,
            totalAmountOfMonth = totalAmountOfMonth,
            totalAmountOfDay = totalAmountOfDay,
        )

        assertEquals(expected, result)
    }
}