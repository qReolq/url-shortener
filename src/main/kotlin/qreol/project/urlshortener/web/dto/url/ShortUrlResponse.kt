package qreol.project.urlshortener.web.dto.url

data class ShortUrlResponse(
    var id: String = "",
    var fullUrl: String = "",
    var numberOfVisits: Long = 0
)