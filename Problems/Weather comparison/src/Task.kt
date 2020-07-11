class City(val name: String) {
    private val default = when (name) {
        "Moscow" -> 5
        "Hanoi" -> 20
        "Dubai" -> 30
        else -> 0
    }

    var degrees: Int = 0
        set(value) {
            field = when {
                value < -92 -> default
                value > 57 -> default
                else -> value
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    val cities = arrayOf(firstCity, secondCity, thirdCity)
    cities.sortBy { x -> x.degrees }

    if (cities.first().degrees == cities[1].degrees) {
        println("neither")
    } else {
        println(cities.first().name)
    }
}