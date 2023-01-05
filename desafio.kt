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
    val lucas: Usuario = Usuario("Lucas")
    val wellington: Usuario = Usuario("Wellington")

    val listaConteudosAndroid = getListaConteudo("Android")
    //println(listaConteudosAndroid)
    val listaConteudosBackEnd = getListaConteudo("Backend")
    val listaConteudosFrontEnd = getListaConteudo("Frontend")

    val formacao: Formacao = Formacao("Android", listaConteudosAndroid) 
    println(formacao)
}

fun getListaConteudo(seguimento: String): List<ConteudoEducacional> {
    when(seguimento) {
        "Android" -> {
             return mutableListOf<ConteudoEducacional>(
             ConteudoEducacional("Fundamentos em Kotlin", 200),
             ConteudoEducacional("Android 1"),
             ConteudoEducacional("Android 2", 35),
             ConteudoEducacional("Android 3", 50)
    )}
        "Backend" -> {
            return mutableListOf<ConteudoEducacional>(
            ConteudoEducacional("Fundamentos em Java", 240),
            ConteudoEducacional("Backend 1"),
            ConteudoEducacional("Backend 2", 55),
            ConteudoEducacional("Backend 3", 50)
    )}
        "Frontend" -> {
            return mutableListOf<ConteudoEducacional>(
            ConteudoEducacional("Fundamentos em JavaScript", 180),
            ConteudoEducacional("Frontend 1"),
            ConteudoEducacional("Frontend 2", 25),
            ConteudoEducacional("Frontend 3", 40)
    )}
        else -> {
            return mutableListOf<ConteudoEducacional>(
            ConteudoEducacional("Curso padrão"),
            ConteudoEducacional("Padrão 1"),
            ConteudoEducacional("Padrão 2"),
            ConteudoEducacional("Padrão 3")
        )}
    }
}