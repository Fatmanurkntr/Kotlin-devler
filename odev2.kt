package com.example.kotlindersleri.odevler

fun main() {
    println(convertCelsiusToFahrenheit(30.0))
    println(calculateRectanglePerimeter(5.0, 10.0))
    println(factorial(5))
    println(countLetterA("Merhaba Dünya"))

    println(sumOfInteriorAngles(5))
    println(calculateSalary(22))
    println(calculateInternetBill(60))
}

// 1. Sıcaklık dönüşümü
fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

// 2. Dikdörtgen çevresi
fun calculateRectanglePerimeter(shortSide: Double, longSide: Double): Double {
    return 2 * (shortSide + longSide)
}

// 3. Faktöriyel hesaplama
fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

// 4. 'a' harfi sayısı
fun countLetterA(word: String): Int {
    return word.count { it.lowercaseChar() == 'a' }
}

// --- ikinci görselden ödevler ---

// 5. İç açılar toplamı
fun sumOfInteriorAngles(edgeCount: Int): Int {
    return (edgeCount - 2) * 180
}

// 6. Maaş hesaplama
fun calculateSalary(dayCount: Int): Int {
    val totalHours = dayCount * 8
    return if (totalHours <= 160) {
        totalHours * 10
    } else {
        (160 * 10) + ((totalHours - 160) * 20)
    }
}

// 7. İnternet faturası hesaplama
fun calculateInternetBill(quota: Int): Double {
    return if (quota <= 50) {
        100.0
    } else {
        100 + (quota - 50) * 4.0
    }
}

