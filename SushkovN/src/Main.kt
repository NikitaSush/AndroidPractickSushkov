fun main() {

// 1. Информация о типах данных
    println("Типы данных в Kotlin:")
    println("Целое число ~Int~")
    println("Число с плавающей точкой ~Double~")
    println("Число с плавающей точкой ~Float~")
    println("Строка ~String~")
    println("Логическое значение (true/false) ~Boolean~")
    println("Символ ~Char~")
    println("Массив ~Array~")
    println("Список (неизменяемый) ~List~")
    println("Список (изменяемый) ~MutableList~")


// 2. Число с точностью до сотых
    val num2 = 5.7865645465
    println("\nЧисло с точностью до сотых: %.2f".format(num2))

// 3. Вывод числа e на экран

    val e = Math.E
    println("\n Число Е с точностью до десятых: %.1f".format(e))

// 4. Вывод числа сообщением перед ним

    print("Введите число: ")
    val num4 = readln()!!.toDouble()
    println("\nВами введено число: $num4")

// 5. Вывод числа с сообщением после него
    print("Введите число: ")
    val num5 = readln()!!.toDouble()
    println("$num5 — вот это число Вы ввели")

// 6. Три числа на одной строке с одним пробелом
    println("\n4 25 93")

// 7. Три числа на одной строке с двумя пробелами
    println("8  19  111")

// 8. Три любых числа на одной строке с двумя пробелами
    println("22  44  48")

// 9. Четыре любых числа на одной строке с одним пробелом
    println("11 33 44 55")

// 10. Два числа одно под другим
    println("\n60")
    println("20")

// 11. Три числа одно под другим
    println("\n7")
    println("90")
    println("143")

// 12. Четыре числа  выведены "столбиком"
    println("\n65")
    println("79")
    println("100")
    println("125")

}