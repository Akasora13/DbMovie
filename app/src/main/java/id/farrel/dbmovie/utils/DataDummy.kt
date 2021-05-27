package id.farrel.dbmovie.utils

import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.SeriesEntity
import id.farrel.dbmovie.data.response.DataFilm
import id.farrel.dbmovie.data.response.DataTv

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "1",
                "How to Train Your Dragon",
                "2010",
                "Fantasy, Adventure, Animation, Family",
                7.8,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ygGmAO60t8GyqUo9xYeYxSZAR3b.jpg",
                "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father."
            )
        )

        movie.add(
            MovieEntity(
                "2",
                "Spiderman Into The Spider-Verse",
                "2018",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                8.4,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
            )
        )

        movie.add(
            MovieEntity(
                "3",
                "Robin Hood",
                "2018",
                "Adventure, Action, Thriller",
                5.9,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg",
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
            )
        )

        movie.add(
            MovieEntity(
                "4",
                "Wreck-it Ralph",
                "2012",
                "Family, Animation, Comedy, Adventure",
                7.3,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zWoIgZ7mgmPkaZjG0102BSKFIqQ.jpg",
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started."
            )
        )

        movie.add(
            MovieEntity(
                "5",
                "Mortal Engines",
                "2018",
                "Adventure, Science Fiction",
                6.1,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."
            )
        )

        return movie

    }

    fun generateDummySeries(): List<SeriesEntity> {

        val series = ArrayList<SeriesEntity>()

        series.add(
            SeriesEntity(
                "11",
                "Dragon Ball",
                "1986",
                "Animation, Action & Adventure, Sci-fi & Fantasy",
                8.1,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tZ0jXOeYBWPZ0OWzUhTlYvMF7YR.jpg",
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish."

            )
        )

        series.add(
            SeriesEntity(
                "12",
                "Fairy Tail",
                "2009",
                "Animation, Action & Adventure, Comedy, Sci-fi & Fantasy, Mistery",
                7.8,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jsYTctFnK8ewomnUgcwhmsTkOum.jpg",
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."
            )
        )


        series.add(
            SeriesEntity(
                "13",
                "Naruto Shippuden",
                "2007",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                8.6,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg",
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."
            )
        )

        series.add(
            SeriesEntity(
                "14",
                "Family Guy",
                "1999",
                "Animation, Comedy",
                7.0,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eWWCRjBfLyePh2tfZdvNcIvKSJe.jpg",
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."
            )
        )

        series.add(
            SeriesEntity(
                "15",
                "Supergirl",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                7.3,
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zsaiq8ZclPuneuN7loLEbsh1ANJ.jpg",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."
            )
        )

        return series

    }

    fun generateRemoteMovie(): List<DataFilm> {
        val movie = ArrayList<DataFilm>()

        movie.add(
            DataFilm(
                id = 1,
                title = "How to Train Your Dragon",
                year = "2010",
                rating = 7.8,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ygGmAO60t8GyqUo9xYeYxSZAR3b.jpg",
                desc = "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father."
            )
        )

        movie.add(
            DataFilm(
                id = 2,
                title = "Spiderman Into The Spider-Verse",
                year = "2018",
                rating = 8.4,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg",
                desc = "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
            )
        )

        movie.add(
            DataFilm(
                3,
                "Robin Hood",
                year = "2018",
                rating = 5.9,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg",
                desc = "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
            )
        )

        movie.add(
            DataFilm(
                4,
                "Wreck-it Ralph",
                year = "2012",
                rating = 7.3,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zWoIgZ7mgmPkaZjG0102BSKFIqQ.jpg",
                desc = "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started."
            )
        )

        movie.add(
            DataFilm(
                5,
                "Mortal Engines",
                year = "2018",
                rating = 6.1,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg",
                desc = "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."
            )
        )

        return movie
    }

    fun generateMovieSpecific(): DataFilm = DataFilm(
        id = 1,
        title = "How to Train Your Dragon",
        year = "2010",
        rating = 7.8,
        img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/ygGmAO60t8GyqUo9xYeYxSZAR3b.jpg",
        desc = "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father."
    )

    fun generateRemoteSeries(): List<DataTv> {
        val series = ArrayList<DataTv>()

        series.add(
            DataTv(
                11,
                "Dragon Ball",
                year = "1986",
                rating = 8.1,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tZ0jXOeYBWPZ0OWzUhTlYvMF7YR.jpg",
                desc = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish."

            )
        )

        series.add(
            DataTv(
                12,
                "Fairy Tail",
                year = "2009",
                rating = 7.8,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/jsYTctFnK8ewomnUgcwhmsTkOum.jpg",
                desc = "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."
            )
        )


        series.add(
            DataTv(
                13,
                "Naruto Shippuden",
                year = "2007",
                rating = 8.6,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg",
                desc = "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."
            )
        )

        series.add(
            DataTv(
                14,
                "Family Guy",
                year = "1999",
                rating = 7.0,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/eWWCRjBfLyePh2tfZdvNcIvKSJe.jpg",
                desc = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."
            )
        )

        series.add(
            DataTv(
                15,
                "Supergirl",
                year = "2015",
                rating = 7.3,
                img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zsaiq8ZclPuneuN7loLEbsh1ANJ.jpg",
                desc = "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."
            )
        )

        return series
    }

    fun generateSeriesSpecific(): DataTv = DataTv(
        11,
        "Dragon Ball",
        year = "1986",
        rating = 8.1,
        img = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/tZ0jXOeYBWPZ0OWzUhTlYvMF7YR.jpg",
        desc = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish."

    )
}