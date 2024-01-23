package qreol.project.urlshortener.repository

import org.springframework.stereotype.Repository
import qreol.project.urlshortener.model.ShortUrl

@Repository
interface ShortUrlRepository {

    fun findFullUrl(id: String): ShortUrl
    fun save(shortUrl: ShortUrl)

}