class ListaTareas(var lista: MutableList<Tarea>) {

    fun agregarTarea(tarea: Tarea){
        lista.add(tarea)
        println("Tarea añadida.")
    }

    fun eliminarTarea(idTarea: String){
        val tarea = lista.find { it.idTarea == idTarea }
        if (tarea != null){
            lista.remove(tarea)
            println("Tarea $idTarea eliminada.")
        }else{
            println("No se encontró tarea con ese ID.")
        }
    }

    fun cambiarEstado(){

    }

    fun mostrarTareas(){
        for(tarea in lista){
            println(tarea)
        }
    }

    fun mostrarPendientes(){
        lista.filter {it.estado == Tarea.Estado.PENDIENTE}.forEach {println(it)}
    }

    fun mostrarRealizadas(){

    }
}