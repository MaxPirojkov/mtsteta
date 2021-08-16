package com.mtsteta.android.pirozhkovteta

class MoviesDataSourceImpl : MoviesDataSource {

    override fun getMovies(): List<PreviewMovie>{
        Thread.sleep(4000)
        return listOf(
            PreviewMovie(
                title = "Гнев человеческий",
                description = "Эйч — загадочный и холодный на вид джентльмен, но внутри него пылает жажда мести. Преследуя свои мотивы, он внедряется в инкассаторскую компанию, чтобы выйти на соучастников серии многомиллионных ограблений, потрясших Лос-Анджелес. В этой запутанной игре у каждого своя роль, но под подозрением оказываются все. Виновных же обязательно постигнет гнев человеческий.",
                rateScore = 3,
                ageRestriction = "18+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5JP9X5tCZ6qz7DYMabLmrQirlWh.jpg",
                actorOne = "https://www.themoviedb.org/t/p/w1280/lldeQ91GwIVff43JBrpdbAAeYWj.jpg",
                actorTwo = "https://www.themoviedb.org/t/p/w1280/8NvOcP35qv5UHWEdpqAvQrKnQQz.jpg",
                actorThree = "https://www.themoviedb.org/t/p/w1280/dCfu2EN7FjISACcjilaJu7evwEc.jpg",
                actorOneName = "Джейсон Стэйтем",
                actorTwoName = "Холт Маккэллани",
                actorThreeName = "Джош Хартнетт",
                genre = "боевик"
            ),
            PreviewMovie(
                title = "Мортал Комбат",
                description = "Боец смешанных единоборств Коул Янг не раз соглашался проиграть за деньги. Он не знает о своем наследии и почему император Внешнего мира Шан Цзун посылает могущественного криомансера Саб-Зиро на охоту за Коулом. Янг боится за безопасность своей семьи, и майор спецназа Джакс, обладатель такой же отметки в виде дракона, как и у Коула, советует ему отправиться на поиски Сони Блейд. Вскоре Коул, Соня и наёмник Кано оказываются в храме Лорда Рейдена, Старшего Бога и защитника Земного царства, который дает убежище тем, кто носит метку.",
                rateScore = 5,
                ageRestriction = "18+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pMIixvHwsD5RZxbvgsDSNkpKy0R.jpg",
                actorOne = "https://www.themoviedb.org/t/p/w1280/lkW8gh20BuwzHecXqYH1eRVuWpb.jpg",
                actorTwo = "https://www.themoviedb.org/t/p/w1280/aAfaMEEqD8syHv5bLi5B3sccrM2.jpg",
                actorThree = "https://www.themoviedb.org/t/p/w1280/Am9vM77uZd9bGODugwmWtOfzx6E.jpg",
                actorOneName = "Льис Тан",
                actorTwoName = "Джессика Макнэим",
                actorThreeName = "Джош Лойсон",
                genre = "боевик"
            ),
            PreviewMovie(
                title = "Упс... Приплыли!",
                description = "От Великого потопа зверей спас ковчег. Но спустя полгода скитаний они готовы сбежать с него куда угодно. Нервы на пределе. Хищники готовы забыть про запреты и заглядываются на травоядных. Единственное спасение — найти райский остров. Там простор и полно еды. Но даже если он совсем близко, будут ли рады местные такому количеству гостей?",
                rateScore = 5,
                ageRestriction = "6+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/546RNYy9Wi5wgboQ7EtD6i0DY5D.jpg",
                actorOne = "https://www.themoviedb.org/t/p/w1280/17gBs4aux2NcnMvf3DK5UKUFttn.jpg",
                actorTwo = "https://www.themoviedb.org/t/p/w1280/o8uE77C4wQHYHJW6En192kjxJGd.jpg",
                actorThree = "https://www.themoviedb.org/t/p/w1280/1ZRP9IfehCSx5OeBQQDcVPvKYD0.jpg",
                actorOneName = "Тара Флинн",
                actorTwoName = "Ава Конноли",
                actorThreeName = "Мэри Муарри",
                genre = "мульт"

            ),
            PreviewMovie(
                title = "The Box",
                description = "Уличный музыкант знакомится с музыкальным продюсером, и они вдвоём отправляются в путешествие, которое перевернёт их жизни.",
                rateScore = 4,
                ageRestriction = "12+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fq3DSw74fAodrbLiSv0BW1Ya4Ae.jpg",
                actorOne = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/3e3139c9-a404-4e80-86e4-a7767f27b5dd/600x900",
                actorTwo = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/bc65f999-b4f6-4469-9602-ead998d6cb46/600x900",
                actorThree = "https://avatars.mds.yandex.net/get-kinopoisk-image/1946459/69a20613-fc51-4129-935d-29a35eb671a5/600x900",
                actorOneName = "Пак Чхан-ёль",
                actorTwoName = "Чо Даль-хван",
                actorThreeName = "Ким Джи-хён",
                genre = "драма"
            ),
            PreviewMovie(
                title = "Сага о Дэнни Эрнандесе",
                description = "Tekashi69, или Сикснайн — знаменитый бруклинский рэпер с радужными волосами — прогремел синглом «Gummo», коллабом с Ники Минаж, а также многочисленными преступлениями. В документальном расследовании о жизни и творчестве рэпера разворачивается настоящая гангстерская история, в которой количество обвинений растет пропорционально интернет-популярности, а репутация секс-наркомана получает подтверждение не только в скандальных видео музыканта. ",
                rateScore = 2,
                ageRestriction = "18+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/5xXGQLVtTAExHY92DHD9ewGmKxf.jpg",
                actorOne = "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/54167000-7218-4d11-b70a-8988f243af5f/600x900",
                actorTwo = "",
                actorThree = "",
                actorOneName = "6ix9ine",
                actorTwoName = "",
                actorThreeName = "",
                genre = "боевик"
            ),
            PreviewMovie(
                title = "Пчелка Майя",
                description = "Когда упрямая пчелка Майя и ее лучший друг Вилли спасают принцессу-муравьишку, начинается сказочное и опасное приключение, которое приведет их в необычные новые миры и проверит их дружбу на прочность.",
                rateScore = 4,
                ageRestriction = "0+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/xltjMeLlxywym14NEizl0metO10.jpg",
                actorOne = "https://avatars.mds.yandex.net/get-kinopoisk-image/1777765/a3f3ad44-69a4-4ee9-99ed-f207638a1b8d/600x900",
                actorTwo = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/9fd32e27-0815-4d77-b8ee-a2ea02971ca0/600x900",
                actorThree = "https://avatars.mds.yandex.net/get-kinopoisk-image/1599028/48777755-c0c8-467f-a0ab-d72d646f1a28/600x900",
                actorOneName = "Коко Джек Гиллис",
                actorTwoName = "Бенсон Джек Энтони",
                actorThreeName = "Кристофер Карисиу",
                genre = "мульт"
            ),
            PreviewMovie(
                title = "Круэлла",
                description = "Великобритания, 1960-е годы. Эстелла была необычным ребёнком, и особенно трудно ей было мириться со всякого рода несправедливостью. Вылетев из очередной школы, она с мамой отправляется в Лондон. По дороге они заезжают в особняк известной модельерши по имени Баронесса, где в результате ужасного несчастного случая мама погибает. Добравшись до Лондона, Эстелла знакомится с двумя мальчишками — уличными мошенниками Джаспером и Хорасом.",
                rateScore = 4,
                ageRestriction = "12+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/hUfyYGP9Xf6cHF9y44JXJV3NxZM.jpg",
                actorOne = "https://avatars.mds.yandex.net/get-kinopoisk-image/1900788/1c629b89-4d69-4ec0-a050-c3aa5721477b/600x900",
                actorTwo = "https://avatars.mds.yandex.net/get-kinopoisk-image/1773646/1db012e7-4e46-4885-b7c0-b6920275dca4/600x900",
                actorThree = "https://avatars.mds.yandex.net/get-kinopoisk-image/1704946/becab811-6925-4806-81c0-cc7686985ed1/600x900",
                actorOneName = "Эмма Стоун",
                actorTwoName = "Эмма Томпсон",
                actorThreeName = "Джоэль Фрай",
                genre = "драма"
            ),
            PreviewMovie(
                title = "Чёрная вдова",
                description = "Наташе Романофф предстоит лицом к лицу встретиться со своим прошлым. Чёрной Вдове придется вспомнить о том, что было в её жизни задолго до присоединения к команде Мстителей, и узнать об опасном заговоре, в который оказываются втянуты её старые знакомые — Елена, Алексей (известный как Красный Страж) и Мелина.",
                rateScore = 3,
                ageRestriction = "16+",
                imageUrl = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/mbtN6V6y5kdawvAkzqN4ohi576a.jpg",
                actorOne = "https://avatars.mds.yandex.net/get-kinopoisk-image/4303601/a2d7d36f-2be8-4c5d-9892-0adc2437da5d/600x900",
                actorTwo = "https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/aed40aa0-fac3-41a0-acc0-35344a7b6059/600x900",
                actorThree = "https://avatars.mds.yandex.net/get-kinopoisk-image/1629390/a66f9ce1-5b06-443c-8670-74bbb45f1185/600x900",
                actorOneName = "Скарлетт Йоханссон",
                actorTwoName = "Флоренс Пью",
                actorThreeName = "Дэвид Харбор",
                genre = "боевик"

            ),
        )
    }
}