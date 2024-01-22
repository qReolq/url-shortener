package qreol.project.urlshortener.service

import qreol.project.urlshortener.model.ShortUrl

interface ShortUrlService {

    fun getFullUrl(id: String): ShortUrl
    fun shortenUrl(fullUrl: String): ShortUrl

}