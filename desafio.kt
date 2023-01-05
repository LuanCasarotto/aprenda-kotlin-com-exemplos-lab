// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println(inscritos)

        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val luan: Usuario = Usuario("Luan")
    val listaConteudos = mutableListOf<ConteudoEducacional>(
    ConteudoEducacional("kotlin Experience"),
    ConteudoEducacional("Android 1", 30),
    ConteudoEducacional("Android 2", 30)
    )
    val formacaco: Formacao = Formacao("Android", listaConteudos) 
    println(formacaco)
}
