import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextDouble()

    val aFloor = Math.floor(a)
    val diff10 = (a - aFloor) * 10
    val floor = Math.floor(diff10)
    val result = Math.round(floor)

    println(result)
}