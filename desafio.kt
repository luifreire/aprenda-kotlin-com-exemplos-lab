// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

data class User(val name: String)

fun mainn () {
    val user1 = User("Mariana")
    val user2 = User("Fernanda")
    val user3 = User("Lua")
    
    println("user1, user2, user3")

}

data class Fundamento(val conteudo: String) {
     var duracao: Int = 0
}                             
fun main() {

    val fundamento1 = Fundamento("herança")
    val fundamento2 = Fundamento("polimorfismo")
    fundamento1.duracao = 15
    fundamento2.duracao = 10
    
    
    println("fundamento1 == fundamento2: ${fundamento1 == fundamento2}")
    println("fundamento1 with duration ${fundamento1.duracao}: ${fundamento1}")
    println("fundamento2 with duration ${fundamento2.duracao}: ${fundamento2}")
	
    
data class formacaoBasic(val nome: String, var conteudos: List<Fundamento>) {
   

    val inscrito = mutableListOf<User>()
    
    fun matricular(vararg User: String) {
        
        println("all students have been assigned to their classes")
       
	}
    
}
