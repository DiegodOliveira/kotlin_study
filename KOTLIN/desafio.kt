// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")

        inscritos.add(usuario)
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val joao = Usuario("João")
    val matematica = ConteudoEducacional("Matemática",50)
    val engenharia = Formacao("Engenharia", listOf(matematica))
    val intermediario = Nivel.INTERMEDIARIO

    engenharia.matricular(joao)

    val maria = Usuario("Maria")
    val fisica = ConteudoEducacional("Física",40)
    val astronomia = Formacao("Astronomia", listOf(fisica))
    val dificil = Nivel.DIFICIL

    astronomia.matricular(maria)

    val cleiton = Usuario("Cleiton")
    val programacao = ConteudoEducacional("Programação",20)
    val cienciaComp = Formacao("Ciência da Computação", listOf(programacao))
    val basico = Nivel.BASICO

    cienciaComp.matricular(cleiton)

    println("Usuarios matriculados: ${engenharia.inscritos}")
    println("Usuarios matriculados: ${astronomia.inscritos}")
    println("Usuarios matriculados: ${cienciaComp.inscritos}")
}