package Animais

import Heranca.Animal

class Preguiça (nome: String, tipo: String, cor: String, var velocidadePreguiça: String) : Animal(nome, tipo, cor) {
    override fun som() {
            println("RATATATATATATATATATA")
    }
}
