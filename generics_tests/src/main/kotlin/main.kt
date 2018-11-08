fun main(args: Array<String>) {
    val myCandy = Paletas("Cerecita", 100000, "Frijol con pepita")
    val boxOfChocolate = RandomBox<Chocolate>(arrayListOf<Chocolate>(
        Chocolate("Chocolate 1", 100, "Cereza"),
        Chocolate("Chocolate 2", 100, "Licor"),
        Chocolate("Chocolate 3", 100, "Nuez")
    ));

    val forrest = ForrestGump<Chocolate>(boxOfChocolate);
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())
    println(forrest.sayTheLineForrest())


    println("Paletas!!")

    val boxOfPaletas = RandomBox<Paletas>(arrayListOf<Paletas>(
            Paletas("Chocolate 1", 100, "Cereza"),
            Paletas("Chocolate 2", 100, "Licor"),
            Paletas("Chocolate 3", 100, "Nuez")
    ));

    val forrest2 = ForrestGump<Paletas>(boxOfPaletas);
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())
    println(forrest2.sayTheLineForrest())


    // FALLA!!
//    println("Cervezas!!")

//    val boxOfCervezas = RandomBox<Cerveza>(arrayListOf<Cerveza>(
//            Cerveza("Gallo", 100, 0.07),
//            Cerveza("Modelo", 110, 0.14),
//            Cerveza("Heineken", 200, 0.2)
//    ));

//    val forrest3 = ForrestGump<Cerveza>(boxOfCervezas);
//    println(forrest3.sayTheLineForrest())
//    println(forrest3.sayTheLineForrest())
//    println(forrest3.sayTheLineForrest())
//    println(forrest3.sayTheLineForrest())
//    println(forrest3.sayTheLineForrest())
}