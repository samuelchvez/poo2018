package animals

import behaviors.Walker

class Dog: Walker {
    var name: String
    var race: String
    override var steps = 0

    constructor (_name: String, _race: String) {
        name = _name
        race = _race
    }

    fun bark() {
        // TODO: esto no es correcto
        println("woof!")
    }

    override fun walk() {
        steps += 2
        bark()
    }
}
