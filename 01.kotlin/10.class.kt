/*
    Las clases son estructuras que permiten crear multiples objetos con propiedades y metodos en comun

    Por convencion los nombres de las clases inician en mayuscula y se definen en plural
*/
class Personas {
    // Atributos :: Variables
    var name = ""
    var age = 0

    // Constructor secundario
    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }

    // Metodos :: Funciones
    fun hello() {
        println("Hello, my name is $name, I am $age years old")
    }
}

// Definicion de clase con constructor primario
class Usuarios(private var name:String, private var email:String) {
    fun login() {
        println("Login with user: $name, email: $email")
    }
}

fun main() {
    // Instancia de la clase
    val p1 = Personas("Martin", 30)
    println(p1.hello())

    val u1 = Usuarios("Andrea", "andrea@gmail.com")
    println(u1.login())
}