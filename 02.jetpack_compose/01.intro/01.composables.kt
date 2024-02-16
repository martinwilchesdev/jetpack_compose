// MainActivity.kt

// El package hace referencia al nombre de la aplicacion y a su identificador principal
package com.example.appname

// Toda aplicacion debe tener la siguiente clase en su archivo principal
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dentro del setContent se define todo lo que se visualiza en la aplicacion
        setContent {
            Greeting("Android")
        }
    }
}

/*
    Toda funcion que lleve la palabra Composable, convierte lo que tenga dentro de esta en un componente.
    Todas las funciones que sean Composable deberian iniciar con mayuscula.
*/
@Composable
fun Greeting(name: String) {
    Button(onClick = {
        println("Hello World")
    }) {
        Text(text = "Hello $name")
    }
}

/*
    Las funciones que no san Composable pueden ejecutar cualquier tipo de logica dentro de la aplicacion, por ejemplo:

        - Una consulta a una base de datos.
        - Una peticion a un servicio externo.
*/
fun hello() {
    println("Hello Jetpack Compose")
}

// La previsaulizacion se utiliza para visualizar el diseño de la aplicacion sin necesidad de ejecutar el emulador o la aplicacion desde un dispositivo
@Preview(showBackground=true)
@Composable
fun GreetingPreview() {
    Greeting("Android Preview")
}