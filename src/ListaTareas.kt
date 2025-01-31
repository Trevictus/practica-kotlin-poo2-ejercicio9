import java.util.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import ListaTareas.*

    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
    // Formatear la fecha y hora para imprimir
    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
    val fechaFormateada: String = fechaHoraActual.format(formatter)
//    println("Fecha y Hora Actual: $fechaFormateada")

class ListaTareas(val lista: MutableList<Tarea>) {

    fun agregarTarea(): Boolean {
        val agregar = Scanner(System.`in`)

        println("Introduce el id de la tarea: ")
        val idTarea = agregar.nextLine()

        println("Introduce la descripción: ")
        val descripcion = agregar.nextLine()

        val estado = Estado.PENDIENTE

        val fecha = ""

        try {
            lista.add(Tarea(idTarea.toString(), descripcion, estado, fecha))
        }catch (e: IllegalArgumentException) {
            println(e.message)
            return false
        }
        println("Tarea añadida.")

        return true


    }

    fun eliminarTarea(): Boolean {
        val eliminar = Scanner(System.`in`)

        println("Introduce el id de la tarea a eliminar: ")
        val idTarea = eliminar.nextLine()

    try {

        val tarea = lista.find { it.idTarea == idTarea }

        if (tarea != null){
            lista.remove(tarea)
            println("Tarea eliminada.")
        }else{
            println("No se encontró tarea con id $idTarea")
            return false
        }
    }catch (e: IllegalArgumentException){
        println(e.message)
        return false
    }
        return true
    }


    fun cambiarEstado(){
        //

        try {
            println("Introduce el id de la tarea para marcar como realizada.")
            val id = readln()
            for (tarea in lista){
                if (id == tarea.idTarea){
                    tarea.estado = Estado.REALIZADA
                    val fechaHoraActual: LocalDateTime = LocalDateTime.now()
                    // Formatear la fecha y hora para imprimir
                    val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
                    val fechaFormateada: String = fechaHoraActual.format(formatter)
                    tarea.fechaRealizacion = fechaFormateada
                    println("Tarea con id $id realizada a fecha y Hora Actual: $fechaFormateada")
                }else{
                    println("No existe tarea con id $id")
                }
            }
        }catch (e: IllegalArgumentException){
            println(e.message)
        }
    }

    fun mostrarTareas() {
        try {
            for (t in lista) {

                println(t)
            }
            if (lista.size == 0){
                println("No existen tareas actualmente.")
            }
        }catch (e: Exception){
            println(e.message)
        }
    }
    fun mostrarPendientes() {
        val tareasPendientes = lista.filter { it.estado == Estado.PENDIENTE }
        if (tareasPendientes.isEmpty()) {
            println("No existen tareas pendientes actualmente.")
        }else{
            for (tarea in tareasPendientes){
                println(tarea)
            }
        }
    }

    fun mostrarRealizadas(){
        val tareasRealizadas = lista.filter {it.estado == Estado.REALIZADA}

        if (tareasRealizadas.isEmpty()) {
            println("No existen tareas realizadas actualmente.")
        }else{
            for (tarea in tareasRealizadas){
                println("$tarea ${tarea.fechaRealizacion}")
            }
        }
    }
}