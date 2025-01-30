class Tarea(val idTarea: String, val descripcion: String, var estado: Estado) {
    enum class Estado{
        PENDIENTE,
        REALIZADA
        }

    override fun toString(): String {
        return "Tarea $idTarea: $descripcion. Estado: $estado"
    }
}