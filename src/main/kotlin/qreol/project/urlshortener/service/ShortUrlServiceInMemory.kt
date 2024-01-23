package qreol.project.urlshortener.service

import org.springframework.stereotype.Service
import qreol.project.urlshortener.model.ShortUrl
import qreol.project.urlshortener.repository.ShortUrlRepository
import qreol.project.urlshortener.util.RandomIdGenerator
import qreol.project.urlshortener.util.UrlShortener

@Service
class ShortUrlServiceInMemory(
    private val shortUrlRepository: ShortUrlRepository,
    private val urlShortener: UrlShortener
) : ShortUrlService {

    override fun getFullUrl(id: String): ShortUrl {
        return shortUrlRepository.findFullUrl(id)
    }

    override fun shortenUrl(fullUrl: String): ShortUrl {
        val shortUrl = urlShortener.shorten(fullUrl)
        shortUrlRepository.save(shortUrl)

        return shortUrl
    }

}