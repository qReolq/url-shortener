package qreol.project.urlshortener.util

import org.springframework.stereotype.Component
import java.util.*

@Component
class RandomIdGenerator {

    fun generateUniqueId(): String {
        val sampleAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        val random = Random()
        val buf = CharArray(7)
        for (i in 0..6) buf[i] = sampleAlphabet[random.nextInt(sampleAlphabet.length)]
        return String(buf)
    }

}

