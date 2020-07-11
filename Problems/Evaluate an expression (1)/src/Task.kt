import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x = scanner.nextDouble()

    val r = x * x * x + x * x + x + 1.0
    println(r)
}