package Animais

import Heranca.Animal

class Cachorro(nome: String, tipo: String, cor: String, var pelo: String) : Animal(nome, tipo, cor,) {
    override fun som() {
      println("AUAUAU")
    }
}