package ui

import java.io.FileReader
import java.io.FileWriter

fun etuFileWrite(chaine:String){
    try {
        val etuFile = FileWriter("etudiant_data.txt", true)
        etuFile.write(chaine + "\n")
        etuFile.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun tutFileWrite(chaine:String){
    try {
        val tutFile = FileWriter("tuteur_data.txt", true)
        tutFile.write(chaine + "\n")
        tutFile.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun lireFichier(choix:Int) {
    try {
        var lireFile: FileReader? = null
        var nomfichier: String? = null

        if (choix == 1) {
            lireFile = FileReader("etudiant_data.txt")
            nomfichier = "Etudiant"
        } else if (choix == 2) {
            lireFile = FileReader("tuteur_data.txt")
            nomfichier = "Tuteur"
        }

        show(lireFile, nomfichier)
    }catch (e:Exception){
        println(e.message)
    }


}

fun show(lireFile: FileReader?, nomfichier: String?) {
    try {
        var c:Int?
        println("\t\t                 liste $nomfichier")
        println("\t\t**********************************************\n")
        do {
            c = lireFile?.read()
            print(c?.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}
