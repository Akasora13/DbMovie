package id.farrel.dbmovie.utils

import id.farrel.dbmovie.R
import id.farrel.dbmovie.data.MovieEntity
import id.farrel.dbmovie.data.SeriesEntity

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {

        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "1",
                "How to Train Your Dragon",
                "2010",
                "Fantasy, Adventure, Animation, Family",
                "78% rating",
                R.drawable.poster_how_to_train,
                "As the son of a Viking leader on the cusp of manhood, shy Hiccup Horrendous Haddock III faces a rite of passage: he must kill a dragon to prove his warrior mettle. But after downing a feared dragon, he realizes that he no longer wants to destroy it, and instead befriends the beast – which he names Toothless – much to the chagrin of his warrior father."
            )
        )

        movie.add(
            MovieEntity(
                "2",
                "Spiderman Into The Universe",
                "2018",
                "Action, Adventure, Animation, Science Fiction, Comedy",
                "84% rating",
                R.drawable.poster_spiderman,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."
            )
        )

        movie.add(
            MovieEntity(
                "3",
                "Robin Hood",
                "2018",
                "Adventure, Action, Thriller",
                "59% rating",
                R.drawable.poster_robin_hood,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."
            )
        )

        movie.add(
            MovieEntity(
                "4",
                "Wreck-it Ralph",
                "2012",
                "Family, Animation, Comedy, Adventure",
                "73% rating",
                R.drawable.poster_ralph,
                "Wreck-It Ralph is the 9-foot-tall, 643-pound villain of an arcade video game named Fix-It Felix Jr., in which the game's titular hero fixes buildings that Ralph destroys. Wanting to prove he can be a good guy and not just a villain, Ralph escapes his game and lands in Hero's Duty, a first-person shooter where he helps the game's hero battle against alien invaders. He later enters Sugar Rush, a kart racing game set on tracks made of candies, cookies and other sweets. There, Ralph meets Vanellope von Schweetz who has learned that her game is faced with a dire threat that could affect the entire arcade, and one that Ralph may have inadvertently started."
            )
        )

        movie.add(
            MovieEntity(
                "5",
                "Mortal Engines",
                "2018",
                "Adventure, Science Fiction",
                "61% rating",
                R.drawable.poster_mortal_engines,
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever."
            )
        )

        movie.add(
            MovieEntity(
                "6",
                "Alita: Battle Angel",
                "2019",
                "Action, Science Fiction, Adventure",
                "72% rating",
                R.drawable.poster_alita,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past."
            )
        )

        movie.add(
            MovieEntity(
                "7",
                "Overlord",
                "2018",
                "Horror, War, Science Fiction",
                "67% rating",
                R.drawable.poster_overlord,
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else."
            )
        )

        movie.add(
            MovieEntity(
                "8",
                "Aquaman",
                "2018",
                "Action, Adventure, Fantasy",
                "69% rating",
                R.drawable.poster_aquaman,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne."
            )
        )

        movie.add(
            MovieEntity(
                "9",
                "Bohemian Rhapsody",
                "2018",
                "Music, Drama, History",
                "80% rating",
                R.drawable.poster_bohemian,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."
            )
        )

        movie.add(
            MovieEntity(
                "10",
                "T-34",
                "2018",
                "War, Action, Drama, History",
                "69% rating",
                R.drawable.poster_t34,
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles."
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
                "81% rating",
                R.drawable.poster_dragon_ball,
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish."

            )
        )

        series.add(
            SeriesEntity(
                "12",
                "Fairy Tail",
                "2009",
                "Animation, Action & Adventure, Comedy, Sci-fi & Fantasy, Mistery",
                "78% rating",
                R.drawable.poster_fairytail,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail."
            )
        )


        series.add(
            SeriesEntity(
                "13",
                "Naruto Shippuden",
                "2007",
                "Animation, Action & Adventure, Sci-Fi & Fantasy",
                "86% rating",
                R.drawable.poster_naruto_shipudden,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki."
            )
        )

        series.add(
            SeriesEntity(
                "14",
                "Family Guy",
                "1999",
                "Animation, Comedy",
                "70% rating",
                R.drawable.poster_family_guy,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."
            )
        )

        series.add(
            SeriesEntity(
                "15",
                "Supergirl",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "73% rating",
                R.drawable.poster_supergirl,
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism."
            )
        )

        series.add(
            SeriesEntity(
                "16",
                "The Flash",
                "2014",
                "Drama, Sci-Fi & Fantasy",
                "77% rating",
                R.drawable.poster_flash,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash."
            )
        )

        series.add(
            SeriesEntity(
                "17",
                "Doom Patrol",
                "2019",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "76% rating",
                R.drawable.poster_doom_patrol,
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."
            )
        )

        series.add(
            SeriesEntity(
                "18",
                "Supernatural",
                "2005",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "82% rating",
                R.drawable.poster_supernatural,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way."
            )
        )

        series.add(
            SeriesEntity(
                "19",
                "The Simpson",
                "1989",
                "Family, Animation, Comedy",
                "78% rating",
                R.drawable.poster_the_simpson,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general."
            )
        )

        series.add(
            SeriesEntity(
                "20",
                "The Walking Dead",
                "2010",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "81% rating",
                R.drawable.poster_the_walking_dead,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way."
            )
        )

        return series

    }
}