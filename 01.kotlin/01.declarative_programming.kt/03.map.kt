fun main() {
    // La funcion map permite transformar una estructura de datos en un solo registro o en una nueva estructura
    val personas = listOf(
        Personas("Martin", 29),
        Personas("Andrea", 30),
        Personas("Paola", 25)
    )

    val multiplicar = personas.map { it.age * 2 } // La edad de cada una de las personas se multiplicara por 2 y posteriormente el nombre y la nueva edad seran asignados a un nuevo arreglo
    println(multiplicar) // [58, 60, 50]
}

data class Personas(val name:String, val age:Int)