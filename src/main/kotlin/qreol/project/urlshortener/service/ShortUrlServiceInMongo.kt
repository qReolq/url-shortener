package qreol.project.urlshortener.service

import org.springframework.stereotype.Service
import qreol.project.urlshortener.model.ShortUrl
import qreol.project.urlshortener.model.exception.IdNotFoundException
import qreol.project.urlshortener.repository.mapper.ShortUrlRepositoryInMongo
import qreol.project.urlshortener.util.UrlShortener
import kotlin.jvm.optionals.getOrNull

@Service
class ShortUrlServiceInMongo (
    private val shortUrlRepositoryInMongo: ShortUrlRepositoryInMongo,
    private val urlShortener: UrlShortener
        ) : ShortUrlService {
    override fun getFullUrl(id: String): ShortUrl {
        return shortUrlRepositoryInMongo
            .findById(id).getOrNull()
            ?: throw IdNotFoundException("Url id not found")
    }

    override fun shortenUrl(fullUrl: String): ShortUrl {
        val shortUrl = urlShortener.shorten(fullUrl)
        return shortUrlRepositoryInMongo.insert(shortUrl)
    }
}