package com.example.scrollingviewpager2.ui.main

import java.util.*


object NameGenerator {
    var parents = arrayOf(
        "Keneth Vandeusen",
        "Dodie Corea",
        "Dagmar Pines",
        "Tula Horwitz",
        "Lorinda Salzer",
        "Madge Brumett",
        "Brain Urquhart",
        "Ema Sciacca",
        "Tiffiny Pipkins",
        "Ellyn Cross",
        "Era Camillo",
        "Davida Younts",
        "Taneka Araya",
        "Irwin Davison",
        "Johnie Wellman",
        "Guadalupe Crothers",
        "Quiana Grahm",
        "Melina Schepis",
        "Bruce Restivo",
        "Rebecca Loach"
    )
    var children = arrayOf(
        "Melvin Schrader",
        "Hoa Walden",
        "Rene Bolin",
        "Jay Lande",
        "Kala Ottesen",
        "Shawnda Mogensen",
        "Mauricio Pough",
        "Lyndsey Santistevan",
        "Audria Baskerville",
        "Louanne Anding",
        "Gail Vosburg",
        "Mira Haug",
        "Patience Lloyd",
        "Eddy Giberson",
        "Fawn Hild",
        "Jacque Claypool",
        "Dorene Maple",
        "Refugio Worth",
        "Hortense Darst",
        "Gustavo Lininger"
    )

    val dummyParentChildrenPair: Pair<String, List<String>>
        get() {
            val randomParent = Random().nextInt(parents.size)
            val childrenList = children.toList()
            Collections.shuffle(childrenList)
            return Pair(parents[randomParent], childrenList.subList(0, 5))
        }

    val dummyParentList: List<String>
        get() = parents.toList()

    val dummyChildrenList: List<String>
        get() = children.toList()
}