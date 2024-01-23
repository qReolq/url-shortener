package qreol.project.urlshortener.util

import org.springframework.stereotype.Component
import qreol.project.urlshortener.model.ShortUrl

@Component
class UrlShortener(
    private val randomIdGenerator: RandomIdGenerator
) {

    fun shorten(fullUrl: String): ShortUrl {
        val randomId = randomIdGenerator.generateUniqueId()
        return  ShortUrl(randomId, fullUrl)
    }

}