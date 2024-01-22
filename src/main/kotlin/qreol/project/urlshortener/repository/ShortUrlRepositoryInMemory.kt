package qreol.project.urlshortener.repository

import org.springframework.stereotype.Repository
import qreol.project.urlshortener.model.ShortUrl
import qreol.project.urlshortener.model.exception.IdNotFoundException


@Repository
class ShortUrlRepositoryInMemory : ShortUrlRepository {
    private val storage = mutableMapOf<String, ShortUrl>()

    override fun findFullUrl(id: String): ShortUrl {
        return storage[id] ?: throw IdNotFoundException("Url id not found")
    }

    override fun save(shortUrl: ShortUrl) {
        storage[shortUrl.id] = shortUrl
    }

}