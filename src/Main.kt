import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import ListaTareas.*

fun main() {
    val listaTareas = ListaTareas(mutableListOf())
//    val tarea1 = Tarea("11w", "hacer comida", Tarea.Estado.PENDIENTE)
//
//    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
//    // Formatear la fecha y hora para imprimir
//    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
//    val fechaFormateada: String = fechaHoraActual.format(formatter)
//    println("Fecha y Hora Actual: $fechaFormateada")

    var finalizar = false
    while (finalizar == false){
        println("Ingresa opción: ")
        val opcion = readln().toInt()
        if (opcion == 1){
            listaTareas.agregarTarea()
            finalizar = true
        }else{
            println("ERROR")
        }

    }
  listaTareas.mostrarTareas()
}


