package Animais

import Heranca.Animal

class Cavalo(nome: String, tipo: String, cor: String, var velocidadeCavalo: String) : Animal(nome, tipo, cor)  {
 override fun som() {
     println("pocotó")
 }
}