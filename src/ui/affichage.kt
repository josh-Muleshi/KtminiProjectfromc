package ui

fun accueilAffichage(){

    println("\n                           Affichage de donnees                           ")
    println("===============================================================================\n")

    println("\t\t 1. Afficher les etudiants")
    print("\t\t 2. Afficher les tuteur\n")
    //print("\t\t 3. Afficher les etudiants par tuteur\n")
    print("\t\t 0. Retour\n")
    print("\t\t > ")
    var choix = readLine()!!.toInt()

    while (choix != 1 && choix != 2 && choix != 0)
    {
        print("\t\t Erreur ! tapez un chiffre selon les items ci-haut > ")
        choix = readLine()!!.toInt()
    }

    when (choix)
    {
        1 -> lireFichier(choix)
        2 -> lireFichier(choix)
        else -> home()
    }

    retour()
}

fun retour(){

    print("\n")
    print("\t\t 1. Afficher\n")
    print("\t\t 0. Retour\n")
    print("\t\t > ")
    var choix = readLine()!!.toInt()

    while (choix != 0 && choix != 1)
    {
        print("\t\t Erreur ! tapez soit 1 pour Afficher soit 2 pour retourner > ")
        choix = readLine()!!.toInt()
    }

    if (choix == 1)
    {
        accueilAffichage()
    }else{
        home()
    }
}