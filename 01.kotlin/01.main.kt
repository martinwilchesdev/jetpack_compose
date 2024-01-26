// La funcion main es el punto inicial de cualquier programa de Kotlin
fun main() {
    /* Variables

        Las variables en Kotlin deben ser de un tipo de dato en especifico

            - String :: Cadena de caracteres
            - Int :: Valores numericos enteros
            - Float :: Valores numericos decimales
            - Double :: Valores numericos decimales con mayor precision

        Las variables definidas con var pueden cambiar su valor durante la ejecucion
        El nuevo valor debe ser del mismo tipo que el valor con el cual fue definida
    */
    var name = "Martin" // String
    var radio = 3.24f // Float
    var pi = 3.1416 // Double
    var age = 29 // Int

    // Las variables son definidas mediante la palabra clave val
    // El valor de una constante no puede variar durante la ejecucion
    val pi = 3.1416

    /* Null safety

        El null safety es una utilidad que permite asignarle el valor null a una variable
        En Kotlin null no puede ser asignado como valor de una variable sin utilizar null safety
        var name = null // error
    */
    var country = String? : null // El valor null podra ser reasignado durante la ejecucion de la aplicacion
    country = "Colombia"
    println(country) // Colombia

    // Una variable de tipo String puede convertirse a tipo Int y viceversa
    var num1 = 1.toString() // De Int a String
    var num2 = "2".toInt() // De String a Int

    /**
     * Concatenacion

        El simbolo + permite concatener 2 o mas strings en uno solo
    */
    var greeting = "Hello, my name is "
    var name = "Martin"
    println(greeting + name) // Hello my name is Martin

    // La interpolacion permite introducir una variable dentro de un string
    println("Hello, my name is $name") // Hello my name is Martin
}