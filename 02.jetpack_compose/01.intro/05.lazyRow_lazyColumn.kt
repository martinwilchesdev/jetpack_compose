// lazyRow y lazyColumn se utilizan para cuando la cantidad de elementos que contienen no se visualizan en su totalidad en la interfaz de la aplicacion

class MainActivity: ComponentActivity() {
    /* ... */
}

val items = listOf(
    Color.Red,
    Color.Yellow,
    Color.Black,
    Color.Cyan,
    Color.Magenta,
    Color.Green,
    Color.DarkGray
)

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
            .padding(5.dp)
    ) {
        // lazyRow se utiiza generalmente cuando se trabajan con bases de datos, ya que no es necesario cargar todos los datos a la vez en la interfaz sino que estos son cargados a medida que se realiza scroll
        lazyRow() {
            item(items) { item ->
                Circulo(item)
            }
        }
    }
}

@Composable
fun Circulo(color: Color) {
    Box(
        modifier = Modifier
            .size(70.dp)
            .background(color, CicleShape)
    )
}