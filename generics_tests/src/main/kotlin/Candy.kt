abstract class Candy (val name: String, val sugarContent : Int) {
    var isOpen : Boolean = false
    fun open() {
        isOpen = true
    }
}
