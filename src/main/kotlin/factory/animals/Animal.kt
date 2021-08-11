package factory.animals

interface Animal {
    val voice: String
    fun voice() {
        println(voice)
    }
}