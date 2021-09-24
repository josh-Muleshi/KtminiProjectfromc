package model

data class Tuteur(
    var numTuteur:Int = 0,
    var nomTuteur:String = "",
    var profession:String = "",
    var telTuteur:String = ""
)

data class Etudiant(
    var CodeEtu:String = "",
    var NomEtu:String = "",
    var PostnomEtu:String = "",
    var ageEtu:Int = 0,
    var AdresseEtu:String = "",
    var Tel:String = "",
    var numTuteur:Int = 0
)
