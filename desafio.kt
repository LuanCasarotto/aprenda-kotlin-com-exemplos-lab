// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

enum class StackDesenvolvimento { ANDROID, BACKEND, FRONTEND }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val luan: Usuario = Usuario("Luan")
    val lucas: Usuario = Usuario("Lucas")
    val wellington: Usuario = Usuario("Wellington")

    val listaConteudosAndroid: List<ConteudoEducacional> = getListaConteudoBasico(StackDesenvolvimento.ANDROID)
    val listaConteudosFrontEnd: List<ConteudoEducacional> = getListaConteudoIntermediario(StackDesenvolvimento.FRONTEND)
    val listaConteudosBackEnd: List<ConteudoEducacional> = getListaConteudoAvançado(StackDesenvolvimento.BACKEND)

    val formacaoAndroid: Formacao = Formacao("Android", listaConteudosAndroid, Nivel.BASICO)
    val formacaoFrontEnd: Formacao = Formacao("Frontend", listaConteudosFrontEnd, Nivel.INTERMEDIARIO)
    val formacaoBackEnd: Formacao = Formacao("Backend", listaConteudosBackEnd, Nivel.AVANÇADO)

    formacaoAndroid.matricular(luan)
    formacaoAndroid.matricular(wellington)
    formacaoAndroid.matricular(lucas)

    formacaoFrontEnd.matricular(lucas)

    formacaoBackEnd.matricular(luan)
    formacaoBackEnd.matricular(wellington)

    println("$formacaoAndroid \n Inscritos: ${formacaoAndroid.inscritos}")
    println("$formacaoFrontEnd \n Inscritos: ${formacaoFrontEnd.inscritos}")
    println("$formacaoBackEnd \n Inscritos: ${formacaoBackEnd.inscritos}")
}

fun getListaConteudoBasico(stackDeDesenvolvimento: StackDesenvolvimento): List<ConteudoEducacional> {
    when (stackDeDesenvolvimento) {
        StackDesenvolvimento.ANDROID -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Kotlin e seus fundamentos"),
                ConteudoEducacional("Android Básico")
            )
        }

        StackDesenvolvimento.BACKEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Java e seus fundamentos", 240),
                ConteudoEducacional("Backend Básico", 65)
            )
        }

        StackDesenvolvimento.FRONTEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("JavaScript e seus fundamentos", 180),
                ConteudoEducacional("Frontend Básico")
            )
        }

        else -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Curso padrão e fundamentos"),
                ConteudoEducacional("Lógica Básico", 90)
            )
        }
    }
}

fun getListaConteudoIntermediario(stackDeDesenvolvimento: StackDesenvolvimento): List<ConteudoEducacional> {
    when (stackDeDesenvolvimento) {
        StackDesenvolvimento.ANDROID -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Kotlin Intermediário", 200),
                ConteudoEducacional("Android Intermediário", 35)
            )
        }

        StackDesenvolvimento.BACKEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Java Intermediário", 240),
                ConteudoEducacional("Backend Intermediário", 55)
            )
        }

        StackDesenvolvimento.FRONTEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("JavaScript Intermediário", 180),
                ConteudoEducacional("Frontend Intermediário", 25)

            )
        }

        else -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Curso padrão Intermediário", 130),
                ConteudoEducacional("Lógica Intermediário", 90)
            )
        }
    }
}

fun getListaConteudoAvançado(stackDeDesenvolvimento: StackDesenvolvimento): List<ConteudoEducacional> {
    when (stackDeDesenvolvimento) {
        StackDesenvolvimento.ANDROID -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Kotlin Avançado", 45),
                ConteudoEducacional("Android Avançado", 50)
            )
        }

        StackDesenvolvimento.BACKEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Java Avançado", 240),
                ConteudoEducacional("Backend Avançado", 50)
            )
        }

        StackDesenvolvimento.FRONTEND -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("JavaScript Avançado", 180),
                ConteudoEducacional("Frontend Avançado", 40)
            )
        }

        else -> {
            return mutableListOf<ConteudoEducacional>(
                ConteudoEducacional("Curso padrão Avançado", 90),
                ConteudoEducacional("Lógica Avançado", 90)
            )
        }
    }
}

// Teste na IDE