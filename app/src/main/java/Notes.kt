// A JSON string with the first few kanji
val testJSON = "{\"㐂\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㐂\",\"kun_readings\":[],\"meanings\":[],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":6,\"unicode\":\"3402\"},\n" +
        "\"㐆\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㐆\",\"kun_readings\":[],\"meanings\":[\"to depend on\",\"to follow\",\"to put confidence in\",\"to trust to\",\"to turn around\",\"to turn the body\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":6,\"unicode\":\"3406\"},\n" +
        "\"㐬\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㐬\",\"kun_readings\":[],\"meanings\":[\"a cup with pendants\",\"a pennant\",\"barren\",\"uncultivated\",\"wild\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":7,\"unicode\":\"342C\"},\n" +
        "\"㐮\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㐮\",\"kun_readings\":[],\"meanings\":[\"to achieve\",\"to assist\",\"to help\",\"to raise\",\"to rise\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":13,\"unicode\":\"342E\"},\n" +
        "\"㑨\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㑨\",\"kun_readings\":[],\"meanings\":[\"big\",\"great\",\"high in rank\",\"much\",\"noble\",\"tall\",\"vast\",\"very\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":10,\"unicode\":\"3468\"},\n" +
        "\"㑪\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㑪\",\"kun_readings\":[],\"meanings\":[\"a class\",\"a generation\",\"a kind\",\"a series\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":10,\"unicode\":\"346A\"},\n" +
        "\"㒒\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㒒\",\"kun_readings\":[],\"meanings\":[\"a charioteer\",\"a servant\",\"a slave\",\"used conventionally for oneself\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":15,\"unicode\":\"3492\"},\n" +
        "\"㒵\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㒵\",\"kun_readings\":[\"かお\"],\"meanings\":[\"appearance\",\"bearing\",\"face\",\"form\",\"manner\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":7,\"unicode\":\"34B5\"},\n" +
        "\"㒼\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㒼\",\"kun_readings\":[],\"meanings\":[\"average\",\"corresponding\",\"equivalent\",\"to cover something carefully and tightly without a break\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":11,\"unicode\":\"34BC\"},\n" +
        "\"㓁\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㓁\",\"kun_readings\":[],\"meanings\":[\"a net\",\"net-like\",\"radical 122\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":4,\"unicode\":\"34C1\"},\n" +
        "\"㓇\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㓇\",\"kun_readings\":[],\"meanings\":[],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":6,\"unicode\":\"34C7\"},\n" +
        "\"㓛\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㓛\",\"kun_readings\":[],\"meanings\":[\"achievement\",\"efficacy\",\"good results\",\"merit\",\"meritorious\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":5,\"unicode\":\"34DB\"},\n" +
        "\"㔟\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㔟\",\"kun_readings\":[],\"meanings\":[],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":10,\"unicode\":\"351F\"},\"㕝\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㕝\",\"kun_readings\":[],\"meanings\":[],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":8,\"unicode\":\"355D\"},\n" +
        "\"㕞\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㕞\",\"kun_readings\":[],\"meanings\":[\"a brush\",\"expecially from blocks\",\"to brush\",\"to clean\",\"to print\",\"to scrub\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":9,\"unicode\":\"355E\"},\n" +
        "\"㕣\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㕣\",\"kun_readings\":[],\"meanings\":[\"a marsh at the foot of the hills\",\"name of a river\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":5,\"unicode\":\"3563\"},\n" +
        "\"㕮\":{\"grade\":null,\"heisig_en\":null,\"jlpt\":null,\"kanji\":\"㕮\",\"kun_readings\":[],\"meanings\":[\"Chinese medicine term\",\"to chew\",\"to dwell on\",\"to masticate\"],\"name_readings\":[],\"notes\":[],\"on_readings\":[],\"stroke_count\":7,\"unicode\":\"356E\"}"

// A dictionary of the first few kanji
val kanjiDictionary =
    mapOf("㐂" to mapOf("kanji" to "㐂","meanings" to listOf("")),
        "㐆" to mapOf("kanji" to "㐆","meanings" to listOf("to depend on","to follow","to put confidence in","to trust to","to turn around","to turn the body")),
        "㐬" to mapOf("kanji" to "㐬","meanings" to listOf("a cup with pendants","a pennant","barren","uncultivated","wild")),
        "㐮" to mapOf("kanji" to "㐮","meanings" to listOf("to achieve","to assist","to help","to raise","to rise")),
        "㑨" to mapOf("kanji" to "㑨","meanings" to listOf("big","great","high in rank","much","noble","tall","vast","very")),
        "㑪" to mapOf("kanji" to "㑪","meanings" to listOf("a class","a generation","a kind","a series")),
        "㒒" to mapOf("kanji" to "㒒","meanings" to listOf("a charioteer","a servant","a slave","used conventionally for oneself")),
        "㒵" to mapOf("kanji" to "㒵","meanings" to listOf("appearance","bearing","face","form","manner")),
    )

/*
// Called when the user reopens the application
override fun onResume() {
    super.onResume()
    updateFlashcard()
}*/

// Flashcard class with all variables from json
data class SuperFlashcard (val grade: Int?, val heisig_en: String?, val jlpt: Int?,val kanji: String, val kun_readings: List<String>,val meanings: List<String>, val name_readings: List<String>, val notes: List<String>, val on_readings: List<String>, val stroke_count: Int, val unicode: String)

// TODO: Get kanji information from Kanji API
/*
//val html =
    //Uri.parse("https://kanjiapi.dev/v1/kanji/$testKanji").getQueryParameter("heisig_en") ?: "none"
    //Uri.parse("https://kanjiapi.dev/v1/kanji/$testKanji").get?: "none"

//URL url = new URL("https://kanjiapi.dev/v1/kanji/$testKanji")
//URLConnection uc = url.openConnnection()

//val test = Uri.parse("https://kanjiapi.dev/v1/kanji/$testKanji")
//val test2 = URL("https://kanjiapi.dev/v1/kanji/$testKanji").readText()
//val html = kanji
    //test2

// External library
//val doc = Jsoup.connect("https://kanjiapi.dev/v1/kanji/%E8%9B%8D").get()
//val html = doc.outerHTML()

val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()*/


// Create class for Decks
//  Create a deck
//  Save deck to local storage
//  Select deck to go through

// Create class for Flashcard
/*class Flashcard(kanji: String, english:String, startSide: Int = 0) {

 // cardSides = listOf("Kanji", "English") // Can add more (on-yomi/kun-yomi, stroke order, etc

    // A map of the different sides of the Flashcard (Cards)
    private var sides = mapOf("Kanji" to Card(kanji), "English" to Card(english))

    // Starts on the Kanji side by default
    private var currentSide = startSide

    fun flipCard() {
        currentSide = if (currentSide == "Kanji") "English" else "Kanji"
    }

    fun displayCard() {
        sides[currentSide]
    }
}*/



// Requires network tasks to be done in another thread, AsyncTask depreciated?
/*
    var client = OkHttpClient()

    @Throws(IOException::class)
    fun getUrl(url: String?): String {
        if(url == null) {
            return "ERROR"
        }
        val request: Request = Request.Builder()
            .url(url)
            .build()
        client.newCall(request).execute().use { response -> return response.body!!.string() }
    }

    fun getFlashcardInfo(): String {
        val testKanji = /*kanji */"蛍"
        //val html = Uri.parse("https://kanjiapi.dev/v1/kanji/%E8%9B%8D")
        val url = "https://kanjiapi.dev/v1/kanji/$testKanji"

        // Get url content?
        val html = getUrl(url)
        return html
    }*/

// TODO: Make kanji, english, etc versions of cards (Card filled with different content)