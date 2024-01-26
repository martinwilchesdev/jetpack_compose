fun main() {
    /* while
        
        El bucle while permite ejecutar un bloque de codigo mientras la condicion definida retorne true
    */
    var x = 1
    while (x <= 10) {
        println(x) // 1 2 3 4 5 6 7 8 9 10 
        x++
    }

    /* for

        El ciclo for se utiliza principalmente para iterar los valores contenidos en un arreglo
    */
    val users = arrayOf("Martin", "Andrea", "Paola")
    for (user in users) {
        println(user) // Martin Andrea Paola
    }

    /* foreach

        La funcionalidad del ciclo foreach es similar al cilo for, con una sintaxis mas simple
    */
    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        println(it) // 1 2 3 4 5
    }

    // Imprimir cada valor de la lista junto a su indice
    list.forEachIndexed { index, element -> println("Posicion $index del valor $element")}
}