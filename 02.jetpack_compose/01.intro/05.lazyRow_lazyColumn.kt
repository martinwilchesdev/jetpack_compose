// lazyRow y lazyColumn se utilizan en la maquetacion de la aplicacion, cuando la cantidad de elementos que contienen no se alcanzan a visualizar en su totalidad en la interfaz debido al espacio que dichos elementos ocupan
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
        // lazyRow y lazyColumn se utiiza generalmente cuando se trabajan con bases de datos, ya que no es necesario cargar todos los datos a la vez en la interfaz sino que estos van apareciendo a medida que se va realizando scroll en la pantalla.
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