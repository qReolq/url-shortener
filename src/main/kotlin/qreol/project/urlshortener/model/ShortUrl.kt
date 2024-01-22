package qreol.project.urlshortener.model

data class ShortUrl(
    var id: String = "",
    var fullUrl: String = "",
    var numberOfVisits: Long = 0
)
