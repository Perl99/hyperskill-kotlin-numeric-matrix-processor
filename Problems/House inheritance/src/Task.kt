import java.lang.RuntimeException

fun main() {
    val rooms = readLine()!!.toInt().coerceIn(1, 10)
    val price = readLine()!!.toInt().coerceIn(0, 1_000_000)
    val house = when (rooms) {
        1 -> Cabin(rooms, price)
        in 2..3 -> Bungalow(rooms, price)
        4 -> Cottage(rooms, price)
        in 5..7 -> Mansion(rooms, price)
        in 8..10 -> Palace(rooms, price)
        else -> throw RuntimeException("Unexpected room count: $rooms")
    }

    println(totalPrice(house))
}

open class House(val rooms: Int, val price: Int, val coefficient: Double)
class Cabin(rooms: Int, price: Int) : House(rooms, price, 1.0)
class Bungalow(rooms: Int, price: Int) : House(rooms, price, 1.2)
class Cottage(rooms: Int, price: Int) : House(rooms, price, 1.25)
class Mansion(rooms: Int, price: Int) : House(rooms, price, 1.4)
class Palace(rooms: Int, price: Int) : House(rooms, price, 1.6)

fun totalPrice(house: House): Int = (house.price * house.coefficient).toInt()
