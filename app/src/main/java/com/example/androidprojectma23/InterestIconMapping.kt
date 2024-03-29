package com.example.androidprojectma23

object IconMapping {

    val userInterests = listOf(
        R.id.icon_music, R.id.icon_sports, R.id.icon_movies, R.id.icon_art,
        R.id.icon_books, R.id.icon_wine, R.id.icon_cooking, R.id.icon_travel,
        R.id.icon_festival, R.id.icon_fashion, R.id.icon_dance, R.id.icon_games,
        R.id.icon_yoga, R.id.icon_camping, R.id.icon_fika, R.id.icon_training,
        R.id.icon_animals, R.id.icon_garden, R.id.icon_photography, R.id.icon_technology
    )
    val iconIdToDocIdMap = mapOf(
        R.id.icon_music to "qWAkLQAUlXIuJCn45ChZ",
        R.id.icon_sports to "9NPO76LYaq9hl5KOCtC4",
        R.id.icon_movies to "AYpDbrWtQOUOt7rBDXDH",
        R.id.icon_art to "iglkcuMPG8egGg4scETR",
        R.id.icon_books to "YmMikFDeggctuiqSYrmw",
        R.id.icon_wine to "YvVGXixVaQSsMhAZaCy2",
        R.id.icon_cooking to "HPQHhJeFC7wQaHyAFSnU",
        R.id.icon_travel to "M9RqxG3Caa0JNT9h6ZTX",
        R.id.icon_festival to "EymGn10U227Gf5xmducS",
        R.id.icon_fashion to "vs5sifFqzkrCyVILxya6",
        R.id.icon_dance to "zcz594bv81UYIWjhWgTy",
        R.id.icon_games to "SM8Oh6Hnba6Gzjpn77RJ",
        R.id.icon_yoga to "6O7GXIC0DWKz6T8wXCJa",
        R.id.icon_camping to "HvJnJ1QKuS2l9IAzYkGa",
        R.id.icon_fika to "0YB3cpO2ducwVQeuCmHC",
        R.id.icon_training to "xZ4sv4Th1Rx3xmUWPr7C",
        R.id.icon_animals to "YeByZ6w5see5N6GfBPYI",
        R.id.icon_garden to "zBgJksLJY1Fa0s3oUSvg",
        R.id.icon_photography to "ftWLcl8ag7pabyuSSJih",
        R.id.icon_technology to "GTPROJYniNOrFBivL7wE"
    )

    val docIdToIconResMap = mapOf(
        "qWAkLQAUlXIuJCn45ChZ" to R.drawable.icon_music,
        "9NPO76LYaq9hl5KOCtC4" to R.drawable.icon_sports,
        "AYpDbrWtQOUOt7rBDXDH" to R.drawable.icon_movies,
        "iglkcuMPG8egGg4scETR" to R.drawable.icon_art,
        "YmMikFDeggctuiqSYrmw" to R.drawable.icon_books,
        "YvVGXixVaQSsMhAZaCy2" to R.drawable.icon_wine,
        "HPQHhJeFC7wQaHyAFSnU" to R.drawable.icon_cooking,
        "M9RqxG3Caa0JNT9h6ZTX" to R.drawable.icon_travel,
        "EymGn10U227Gf5xmducS" to R.drawable.icon_festival,
        "vs5sifFqzkrCyVILxya6" to R.drawable.icon_fashion,
        "zcz594bv81UYIWjhWgTy" to R.drawable.icon_dance,
        "SM8Oh6Hnba6Gzjpn77RJ" to R.drawable.icon_games,
        "6O7GXIC0DWKz6T8wXCJa" to R.drawable.icon_yoga,
        "HvJnJ1QKuS2l9IAzYkGa" to R.drawable.icon_camping,
        "0YB3cpO2ducwVQeuCmHC" to R.drawable.icon_fika,
        "xZ4sv4Th1Rx3xmUWPr7C" to R.drawable.icon_training,
        "YeByZ6w5see5N6GfBPYI" to R.drawable.icon_animals,
        "zBgJksLJY1Fa0s3oUSvg" to R.drawable.icon_garden,
        "ftWLcl8ag7pabyuSSJih" to R.drawable.icon_photography,
        "GTPROJYniNOrFBivL7wE" to R.drawable.icon_technology
    )

    val docIdToInterestNameMap = mapOf(
        "qWAkLQAUlXIuJCn45ChZ" to R.string.music,
        "9NPO76LYaq9hl5KOCtC4" to R.string.sports,
        "AYpDbrWtQOUOt7rBDXDH" to R.string.movies,
        "iglkcuMPG8egGg4scETR" to R.string.art,
        "YmMikFDeggctuiqSYrmw" to R.string.books,
        "YvVGXixVaQSsMhAZaCy2" to R.string.wine,
        "HPQHhJeFC7wQaHyAFSnU" to R.string.cooking,
        "M9RqxG3Caa0JNT9h6ZTX" to R.string.travel,
        "EymGn10U227Gf5xmducS" to R.string.festival,
        "vs5sifFqzkrCyVILxya6" to R.string.fashion,
        "zcz594bv81UYIWjhWgTy" to R.string.dance,
        "SM8Oh6Hnba6Gzjpn77RJ" to R.string.games,
        "6O7GXIC0DWKz6T8wXCJa" to R.string.yoga,
        "HvJnJ1QKuS2l9IAzYkGa" to R.string.camping,
        "0YB3cpO2ducwVQeuCmHC" to R.string.fika,
        "xZ4sv4Th1Rx3xmUWPr7C" to R.string.training,
        "YeByZ6w5see5N6GfBPYI" to R.string.animals,
        "zBgJksLJY1Fa0s3oUSvg" to R.string.garden,
        "ftWLcl8ag7pabyuSSJih" to R.string.photography,
        "GTPROJYniNOrFBivL7wE" to R.string.technology

    )

    val imageViewIdProfileCard = listOf(
        R.id.interestImageView, R.id.interestImageView2,
        R.id.interestImageView3, R.id.interestImageView4,
        R.id.interestImageView5
    )

    val textViewIdProfileCard = listOf(
        R.id.interestIcon1TextView, R.id.interestIcon2TextView,
        R.id.interestIcon3TextView, R.id.interestIcon4TextView,
        R.id.interestIcon5TextView
    )

    val imageViewIdProfileCardBack = listOf(
        R.id.interestImageViewBack, R.id.interestImageView2Back,
        R.id.interestImageView3Back, R.id.interestImageView4Back,
        R.id.interestImageView5Back
    )

    val textViewIdProfileCardBack = listOf(
        R.id.interestIcon1TextViewBack, R.id.interestIcon2TextViewBack,
        R.id.interestIcon3TextViewBack, R.id.interestIcon4TextViewBack,
        R.id.interestIcon5TextViewBack
    )

    val fragmentInterestIconImage = listOf(
        R.id.interestIconImage1, R.id.interestIconImage2,
        R.id.interestIconImage3, R.id.interestIconImage4,
        R.id.interestIconImage5
    )

    val fragmentInterestIconText = listOf(
        R.id.interestIconText1, R.id.interestIconText2,
        R.id.interestIconText3, R.id.interestIconText4,
        R.id.interestIconText5
    )


}