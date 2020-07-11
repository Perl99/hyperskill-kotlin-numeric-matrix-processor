import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val a1 = scanner.nextDouble()
    val a2 = scanner.nextDouble()
    val b1 = scanner.nextDouble()
    val b2 = scanner.nextDouble()

    val aLength = Math.hypot(a1, a2)
    val bLength = Math.hypot(b1, b2)

    val cosAngle = (a1 * b1 + a2 * b2) / (aLength * bLength)
    val angleRad = Math.acos(cosAngle)
    val angle = Math.toDegrees(angleRad)
    val angleRound = Math.round(angle)
    println(angleRound)
}