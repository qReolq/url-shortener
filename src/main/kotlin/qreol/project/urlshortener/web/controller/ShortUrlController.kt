package qreol.project.urlshortener.web.controller

import org.springframework.web.bind.annotation.*
import qreol.project.urlshortener.repository.mapper.UrlMapper
import qreol.project.urlshortener.service.ShortUrlService
import qreol.project.urlshortener.web.dto.url.ShortUrlResponse
import qreol.project.urlshortener.web.dto.url.UrlRequest

@RestController
@RequestMapping("/api/v1")
class ShortUrlController(
    private val shortUrlService: ShortUrlService,
    private val urlMapper: UrlMapper
) {

    @PostMapping("/shorten")
    fun shortenUrl(@RequestBody urlResponse: UrlRequest): ShortUrlResponse {
        return urlMapper.toDto(shortUrlService.shortenUrl(urlResponse.fullUrl))
    }

    @GetMapping("/short-url/{id}")
    fun getShortUrl(@PathVariable("id") id: String): ShortUrlResponse {
        return urlMapper.toDto(shortUrlService.getFullUrl(id))
    }

}