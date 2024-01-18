import kotlin.random.Random

fun main() {

    val chiffreAleatoire = Random.nextInt(1, 6)
    var victoire = false
    var essais = 0


    while (!victoire) {
        print("Choisissez un chiffre entre 1 et 6 : ")
        val chiffreUtilisateur = readLine()?.toIntOrNull()

        if (chiffreUtilisateur != null && (chiffreUtilisateur > 6 || chiffreUtilisateur < 1)) {
            println("Votre chiffre est plus grand ou plus petit que le chiffre aléatoire. Veuillez réessayer.") }



        else {
            victoire = verif(chiffreUtilisateur, chiffreAleatoire, essais)
            essais++
        }
    }
}

fun gagner(essais: Int) {
    println("Gagné ! Vous avez trouvé le bon chiffre en $essais essais.")
    print("Voulez-vous rejouer ? O/N ")
    val rejouer = readLine()?.toIntOrNull()
}

fun perdre() {
    println("Perdu ! Réessayez.")
}

fun verif(chiffreUtilisateur: Int?, chiffreAleatoire: Int, essais : Int): Boolean {

    return if (chiffreUtilisateur == chiffreAleatoire) {

        gagner(essais)
        true

    } else {

        perdre()
        false
    }
}