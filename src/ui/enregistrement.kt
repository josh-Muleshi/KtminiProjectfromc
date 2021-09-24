package ui

import model.Etudiant
import model.Tuteur

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
        demandeDinfo()
    }
    demande()
}

fun demandeDinfo() {

    val etudiant = Etudiant()
    val tuteur = Tuteur()

    print("\t\t * Nom > ")
    etudiant.NomEtu = readLine().toString()
    print("\t\t * Postnom > ")
    etudiant.PostnomEtu = readLine().toString()
    print("\t\t * Age > ")
    etudiant.ageEtu = readLine()!!.toInt()
    print("\t\t * Adresse > ")
    etudiant.AdresseEtu = readLine().toString()
    print("\t\t * Tel > ")
    etudiant.Tel = readLine().toString()

    print("\n\t\t Tuteur ");
    print("\n\t\t--------\n");
    print("\t\t * Numero du Tuteur > ");
    tuteur.numTuteur = readLine()!!.toInt()
    print("\t\t * Nom du Tuteur > ");
    tuteur.nomTuteur = readLine().toString()
    print("\t\t * Profession du Tuteur > ");
    tuteur.profession = readLine().toString()
    print("\t\t * Tel du Tuteur > ")
    tuteur.telTuteur = readLine().toString()
    print("\n");

    etudiant.numTuteur = tuteur.numTuteur
    println(codeEtudiantCreation(etudiant))

    val etudiantEnregistree = "${etudiant.CodeEtu} ${etudiant.NomEtu} ${etudiant.PostnomEtu} ${etudiant.ageEtu} ${etudiant.AdresseEtu} ${etudiant.Tel} ${etudiant.numTuteur}"
    val tuteurEnregistree = "${tuteur.numTuteur} ${tuteur.nomTuteur} ${tuteur.profession} ${tuteur.telTuteur}"


}

fun codeEtudiantCreation(etudiant: Etudiant):String {
    val twoFisrt = etudiant.NomEtu.take(2)
    val twoLast = etudiant.PostnomEtu.takeLast(2)
    etudiant.CodeEtu = twoFisrt + twoLast + etudiant.ageEtu
    return etudiant.CodeEtu
}


