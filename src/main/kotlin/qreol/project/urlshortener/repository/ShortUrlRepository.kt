package qreol.project.urlshortener.repository

import qreol.project.urlshortener.model.ShortUrl

interface ShortUrlRepository {

    fun findFullUrl(id: String): ShortUrl
    fun save(shortUrl: ShortUrl)

}