object UserManager {
    val users = mutableListOf<User>()

    data class User(val id: Int, val name: String)

    fun addUser(name: String) {
        val id = users.size + 1
        users.add(User(id, name))
    }

    fun listUsers() {
        users.forEach { user ->
            println("ID: ${user.id}, Nome: ${user.name}")
        }
    }
}

fun main() {
    val quantity = readLine()?.toIntOrNull() ?: 0

    for (i in 1..quantity) {
        val name = readLine() ?: ""
        if (name.isNotEmpty()) {
            UserManager.addUser(name)
        }
    }

    UserManager.listUsers()
}