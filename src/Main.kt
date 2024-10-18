fun main() {

    //Задача 1
    println("Пример ответа к задаче 1: ${getFactorial(5)}")

    //Задача 2
    println("Пример ответа к задаче 2: ${getDegree(2, 4)}")

    //Задача 3
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7)
    val task3Result = increaseBy1EachEvenIndexAtArray(array)
    print("Ответ к задаче 3: [")
    for (i in task3Result.indices) {
        if (i == task3Result.size - 1) {
            print("${task3Result[i]}]")
            break
        }
        print("${task3Result[i]},")
    }
}

fun getFactorial(number: Int): Int {
    var result = 1
    fun recursiveMultiplication(n: Int) {
        result *= n
        if (n == number) {
            return
        }
        recursiveMultiplication(n + 1)
    }
    recursiveMultiplication(1)
    return result
}

fun getDegree(number: Int, degree: Int): Int {
    var result = number
    fun recursiveMultiplication(n: Int) {
        result *= number
        if (n == degree) {
            return
        }
        recursiveMultiplication(n + 1)
    }
    recursiveMultiplication(2)
    return result
}

fun increaseBy1EachEvenIndexAtArray(array: Array<Int>): Array<Int> {
    val newArray = array.copyOf()
    newArray.forEachIndexed { index, i -> if (index % 2 == 0) newArray[index] = i + 1 }
    return newArray
}