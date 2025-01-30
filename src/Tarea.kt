import java.util.*

class Tarea(val idTarea: String, val descripcion: String, var estado: Estado) {


    init{
        require(idTarea.isNotEmpty()){"ERROR de id."}
        require(descripcion.isNotEmpty()){"ERROR de descripción."}
    }

    override fun toString(): String {
        return "Tarea $idTarea: $descripcion. Estado: $estado"
    }
}