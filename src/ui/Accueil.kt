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

    itemChoix()
}

fun itemChoix() {

    print("\nTapez le numero ici > ")
    var choix = readLine()!!.toInt()

    while (choix < 0 || choix > 2)
    {
        print("\nErreur ! le numero doit-etre entre 1 et 3 compris > ")
        choix = readLine()!!.toInt()
    }

    when(choix){
        1 -> accueilEnregistrement()
        2 -> accueilAffichage()
        else -> quitter()
    }
}

fun quitter(){

    println("=> Voulez-vous vraiment quitter ? [n/y] > ")
    when(readLine().toString())
    {
        "n" -> home()
        else -> return
    }
}
