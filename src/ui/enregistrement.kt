package ui

fun accueil_enregistrement() {
    println("\n                               Enregistrement                          ")
    println("===============================================================================\n")

    demande()
}

fun demande() {

    println("\t 1. Enregistrer")
    println("\t 0. Retour")
    print("\t > ")
    var choix = readLine()!!.toInt()

    while (choix != 0 && choix != 1) {
        print("\t\t Erreur ! tapez soit 1 pour enregistrer soit 2 pour retourner > ")
        choix = readLine()!!.toInt()
    }

    if (choix == 1) {
        enregistrement()
    } else {
        home()
    }
}

fun enregistrement(){

    print("\t Combient d'etudiants voulez-vous enregistrez ? > ")
    var nbrEnregistre = readLine()!!.toInt()
    println()

    while(nbrEnregistre < 1){
        print("\t Erreur ! le numero doit-etre un entier supeur non nul > ")
        nbrEnregistre = readLine()!!.toInt()
        println()
    }

    for (i in 1..nbrEnregistre)
    {
        //demandeDinfo()
    }
    demande()
}
