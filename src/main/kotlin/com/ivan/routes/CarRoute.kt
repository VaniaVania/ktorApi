package com.ivan.routes

import com.ivan.data.model.Car
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

private const val BASE_URL = "http://192.168.1.111:8100"
private val cars = listOf(
    Car("Mazda RX-7", "The Mazda RX-7 is a front-engine, rear-wheel-drive, rotary engine-powered sports car that was manufactured and marketed by Mazda from 1978 until 2002 across three generations, all of which made use of a compact, lightweight Wankel rotary engine.\n" +
            "\n" +
            "The first generation of the RX-7, SA (early) and FB (late), was a two-seater 2 door hatchback coupé. It featured a 12A carbureted rotary engine as well as the option for a 13B with electronic fuel injection in later years.\n"
            , "$BASE_URL/cars/mazda1.jpg"),
    Car("Mazda Miata", "The Mazda MX-5 is a lightweight two-passenger roadster sports car manufactured and marketed by Mazda with a front mid-engine, rear-wheel-drive layout. The convertible is marketed as the Mazda Roadster (マツダ・ロードスター, Matsuda Rōdosutā) or Eunos Roadster (ユーノス・ロードスター, Yūnosu Rōdosutā) in Japan, and as the Mazda Miata (/miˈɑːtə/) in the United States, and formerly in Canada, where it is now known as the MX-5 but sometimes still referred to as Miata.", "$BASE_URL/cars/mazda2.jpg"),
    Car("Nissan 240SX", "The Nissan 240SX is a sports compact car that was introduced to the North American market by Nissan in 1989 for the 1990 model year. It replaced the outgoing 200SX (S12) model. Most of the 240SXs were equipped with the 2.4-liter inline 4 engine (KA24E from 1989 to 1990 and KA24DE from 1990 to 1998). The KA24E had single overhead cams and the KA24DE had dual overhead cams. Two distinct generations of the 240SX, the S13 (1989–1994) the S14 (1994-1998) were produced, based on the Nissan S platform.", "$BASE_URL/cars/nissan1.jpg"),
    Car("Nissan Skyline R-34", "The Nissan Skyline (Japanese: 日産・スカイライン, Hepburn: Nissan Sukairain) is a brand of automobile originally produced by the Prince Motor Company starting in 1957, and then by Nissan after the two companies merged in 1967. After the merger, the Skyline and its larger counterpart, the Nissan Gloria, were sold in Japan at dealership sales channels called Nissan Prince Shop.", "$BASE_URL/cars/nissan2.jpg"),
    Car("Nissan 350Z", "The Nissan 350Z (known as Nissan Fairlady Z (Z33) in Japan) is a two-door, two-seater sports car that was manufactured by Nissan Motor Corporation from 2002 until 2009 and marks the fifth generation of Nissan's Z-car line. The 350Z entered production in 2002 and was sold and marketed as a 2003 model from August 2002.", "$BASE_URL/cars/nissan3.jpg"),
    Car("Toyota Supra", "The Toyota Supra (Japanese: トヨタ・スープラ, Hepburn: Toyota Sūpura) is a sports car and grand tourer manufactured by the Toyota Motor Corporation beginning in 1978. The name \"supra\" is derived from the Latin prefix, meaning \"above\", \"to surpass\" or \"go beyond\".", "$BASE_URL/cars/toyota1.jpg"),
    Car("Toyota Chaser", "The Toyota Chaser is a mid-size car produced by Toyota in Japan. Most Chasers are four-door sedans and hardtop sedans; a two-door hardtop coupé was available on the first generation only. It was introduced on the 1976 Toyota Corona Mark II platform, and was sold new by Toyota at Toyota Vista Store dealerships only in Japan, together with the Toyota Cresta.", "$BASE_URL/cars/toyota2.jpeg"),
)

fun Route.randomCar() {
    get("/randomcar") {
        call.respond(
            HttpStatusCode.OK,
            cars.random()
        )
    }
}