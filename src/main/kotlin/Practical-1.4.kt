fun main(args: Array<String>) {
    println("Enter a number:")
    val input = readLine()
    val number = input?.toIntOrNull()

    if (number != null) {
        if (number % 2 == 0) {
            println("$number is an even number.")
        } else {
            println("$number is an odd number.")
        }
    } else {
        println("input a valid number")
    }
}
