package observable

abstract class Observable {
    private val observers : ArrayList<Observer> = arrayListOf()
    private var isChanged = false

    fun setChanged() {
        isChanged = true
    }

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun notifyObservers(args: Any) {
        if (hasChanged()) {
            observers.forEach { it.update(this, args) }
        }

        clearChanged()
    }

    fun hasChanged(): Boolean {
        return isChanged
    }

    fun clearChanged() {
        isChanged = false
    }
}