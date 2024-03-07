import kotlin.random.Random

fun main() {
    val array = DoubleArray(15)

    for (i in array.indices) {
        array[i] = Random.nextDouble(-100.0, 100.0)
    }

    println("Массив дробных чисел:")
    println(array.joinToString(", "))

    var sum = 0.0
    var count = 0

    var foundNegative = false

    for (number in array) {
        if (number < 0) {
            foundNegative = true
        } else if (foundNegative) {
            sum += number
            count++
        }
    }

    if (count > 0) {
        val average = sum / count
        println("Среднее арифметическое положительных чисел после первого отрицательного: $average")
    } else {
        println("После первого отрицательного числа не было найдено положительных чисел.")
    }
}

