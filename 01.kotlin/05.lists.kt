fun main() {
    // Las listas son estructuras de datos similares a los arreglos

    /* Listas no mutables
        
        Los valores de la lista no pueden ser modificados ni se pueden agregar nuevos valores
    */ 
    var list1 = listOf(1, 2, 3, 4, 5)

    /* Listas mutables

        Las listas mutables son definidas mediante la funcion mutableListOf()
    */
    var list2 = mutableListOf(1, 2, 3, 4, 5)

    // Añadir elementos a una lista mutable
    list2.add(6)
    
    // Remover elementos de una lista mutable
    list2.remove(6) // Como parametro se indica el valor a eliminar no su indice

    // El contenido de una lista puede ser impresion sin la necesidad de usar funciones adicionales a println o print
    println(list1) // [1, 2, 3, 4, 5]
}