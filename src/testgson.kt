import com.google.gson.Gson
import model.tweet
import model.entities
import model.retweeted_status
import model.user
import java.io.File
import kotlin.text.Charsets.UTF_8

//class testgson {

    fun main(args: Array<String>) {

        val testJsonstr: String = File("./src/test.json").readText(charset=UTF_8)

        //println("jsonstr:")
        //println(testJsonstr)

        val gson: Gson = Gson()

        val tweet_model: tweet = gson.fromJson(testJsonstr,model.tweet::class.java)    //.fromJson(testJsonstr)

    }

//}