package ui

fun home(){
    println("\n*******************************************************")
    println("|                Gestion des etudiants                |")
    println("*******************************************************\n")

    println("Bienvenu dans l'app de gestion des etudiants")
    println("Entrez le numero d'item pour effectuer l'action correspondente\n")

    println("\t 1. Enregistrement")
    println("\t 2. Afficher les donnees")
    println("\t 0. Quitter")

    item_choix()
}

fun item_choix() {

    print("\nTapez le numero ici > ")
    var choix = readLine()!!.toInt()

    while (choix < 0 || choix > 2)
    {
        print("\nErreur ! le numero doit-etre entre 1 et 3 compris > ");
        choix = readLine()!!.toInt()
    }

    when(choix){
        1 -> accueil_enregistrement()
        2 -> println("afficher")
        else -> println("quitter")
    }
}
