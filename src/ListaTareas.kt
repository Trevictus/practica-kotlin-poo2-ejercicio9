import java.util.*

class ListaTareas(val lista: MutableList<Tarea>) {

    fun agregarTarea(): Boolean {
        val agregar = Scanner(System.`in`)

        println("Introduce el id de la tarea: ")
        val idTarea = agregar.nextLine()

        println("Introduce la descripción: ")
        val descripcion = agregar.nextLine()

        val estado = Estado.PENDIENTE

        try {
            lista.add(Tarea(idTarea.toString(), descripcion, estado))
        }catch (e: IllegalArgumentException) {
            println(e.message)
            return false
        }
        println("Tarea añadida.")

        return true


    }

    fun eliminarTarea(idTarea: String){

            for (tarea in lista ){
                if (tarea.idTarea == idTarea){
                    lista.remove(tarea)
                    println("Tarea $idTarea eliminada.")
                    return
                }
            }
            println("No se encontró esa tarea.")
        }


    fun cambiarEstado(){

    }

    fun mostrarTareas(){
        for(t in lista){
            println(t)
        }
    }

    fun mostrarPendientes(){
        lista.filter {it.estado == Estado.PENDIENTE}.forEach {println(it)}
    }

    fun mostrarRealizadas(){
        lista.filter {it.estado == Estado.REALIZADA}.forEach {println(it)}
    }
}