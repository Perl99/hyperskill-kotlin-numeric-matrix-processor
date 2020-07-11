import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        return 31 * name.hashCode() + age
    }
}

fun main() {
    val input = Scanner(System.`in`)
    val name1 = input.next()
    val age1 = input.nextInt()
    val balance1 = input.nextInt()
    val client1 = Client(name1, age1, balance1)

    val name2 = input.next()
    val age2 = input.nextInt()
    val balance2 = input.nextInt()
    val client2 = Client(name2, age2, balance2)

    println(client1 == client2)
}