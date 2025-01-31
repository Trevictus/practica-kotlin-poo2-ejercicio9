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

    do {
        try {
            println("Ingresa opción:\n1-> Agregar tarea.\n2-> Eliminar tarea.\n3-> Mostrar tareas pendientes.\n4-> Mostrar tareas realizadas.\n5-> Mostrar todas las tareas\n6-> Cambiar estado a REALIZADA.\n7-> SALIR.")
            val opcion = readln().toInt()
            when (opcion) {
                1 -> listaTareas.agregarTarea()
                2 -> listaTareas.eliminarTarea()
                3 -> listaTareas.mostrarPendientes()
                4 -> listaTareas.mostrarRealizadas()
                5 -> listaTareas.mostrarTareas()
                6 -> listaTareas.cambiarEstado()
                7 -> {
                    println("Hasta la próxima!")
                    finalizar = true
                }
                else -> println("ERROR")
            }
        } catch (e: IllegalArgumentException){
            println(e.message)
        }
    } while (!finalizar)
}
