fun main() {
    /*
        Las funciones son bloques de codigo que se pueden ejecutar multiples veces.

        Las funciones deben ser definidas fuera de la funcion main().

        Al invocar una funcion, el valor de los parametros que esta recibe son pasados como argumentos.  
    */
    suma(20, 30) // 50

    val sum = sum(12,12)
    println(sum) // 24
    val div = division(20.0, 10.0)
    println(div) // 2.0 
}

/*
    Una funcion puede recibir parametros.

    Los parametros de la funcion son definidos utilizando la siguiente notacion
        nombre_parametro:tipo_dato
*/
fun suma(v1:Int, v2:Int) {
    val result = v1 + v2

    println(result)
}

/* Funciones lambda

    Las funciones lambda pueden ser anonimas, con lo cual se define el cuerpo de la funcion y posteriormente se asigna a una variable
*/
val sum = {x:Int, y:Int -> x + y}

/* Funciones con retorno

    Este tipo de funciones retornan un valor el cual podra ser reutilizado y manejado en el codigo.

    A las funciones con retorno es necesario especificarles el tipo de dato que retornara dicha funcion 
        fun <fun_name>(): tipo_dato {...}
*/
fun division(v1:Double, v2:Double): Double {
    val result = v1 / v2
    return result
}