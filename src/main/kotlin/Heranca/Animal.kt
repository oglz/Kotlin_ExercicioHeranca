package Heranca

abstract class Animal (val nome: String, val cor: String, val tipo: String) {
    var sexo = ""
    fun correr(){
        println("*correndo pra krl*")
    }
abstract fun som()
}