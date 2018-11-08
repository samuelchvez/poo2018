package observable

interface Observer {
    public fun update(
            o: Observable?,
            arg: Any
    )
}