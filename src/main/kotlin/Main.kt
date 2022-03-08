import Animais.Cachorro
import Animais.Cavalo
import Animais.Preguiça

fun main() {
var cachorro = Cachorro(nome = "REX", tipo = "vira-lata", cor = "negro", pelo = "macio:3")
cachorro.som()
var cavalo = Cavalo(nome = "Pé de pano", tipo = "cavalo do pica pau", cor = "branco como a neve", velocidadeCavalo = "4000km")
cavalo.som()
var preguiça = Preguiça(nome = "Shaggy", tipo = "preguiçoso", cor = "cinza", velocidadePreguiça = "0k,1 km")
preguiça.som()
cavalo.correr()
}