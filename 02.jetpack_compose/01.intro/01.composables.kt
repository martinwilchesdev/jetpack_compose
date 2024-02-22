// MainActivity.kt -> Archivo principal de la aplicacion

// El package hace referencia al nombre de la aplicacion y a su identificador principal
package com.example.appname

// Toda aplicacion debe tener la siguiente clase en su archivo principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dentro del metodo setContent se define todo aquello que podra ser visualizado en la interfaz de la aplicacion
        setContent {
            Greeting("Android")
        }
    }
}

/*
    Toda funcion que lleve la palabra Composable, convierte lo que tenga dentro de esta en un componente.
    Todas las funciones que sean Composable deberian iniciar con mayuscula.
*/

// El siguiente Composable define un boton, el cual contiene el texto Hello <valor_parametro_name> y ejecutara una funcion cada vez que se de click sobre el mismo
@Composable
fun Greeting(name: String) {
    Button(onClick = {
        println("Hello World")
    }) {
        Text(text = "Hello $name")
    }
}

/*
    Las funciones que no son Composable pueden ejecutar cualquier tipo de logica dentro de la aplicacion, por ejemplo:
        - Realizar una consulta a una base de datos.
        - Realizar una peticion a un servicio externo (API).
*/
fun hello() {
    println("Hello Jetpack Compose")
}

// La previsualizacion @Preview se utiliza para visualizar el diseño de la aplicacion en el IDE sin necesidad de ejecutar el emulador o instalar la aplicacion en un dispositivo movil
@Preview(showBackground=true)
@Composable
fun GreetingPreview() {
    Greeting("Android Preview") // Si la funcion tiene algun tipo de funcionalidad, esta no podra ser visualizada, unicamente su diseño.
}