data class Student(
    val name: String,
    val age: Int,
    val rollNumber: String,
    val grade: Char
)

fun main() {
    println("Enter student's data :")
    print("Name: ")
    val name = readLine() ?: ""

    print("Age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    print("Roll Number: ")
    val rollNumber = readLine() ?: ""

    print("Grade: ")
    val grade = readLine()?.get(0)?.toUpperCase() ?: ' '

    val student = Student(name, age, rollNumber, grade)

    println("\nStudent's data :")
    println("Name: ${student.name}")
    println("Age: ${student.age}")
    println("Roll Number: ${student.rollNumber}")
    println("Grade: ${student.grade}")
}
