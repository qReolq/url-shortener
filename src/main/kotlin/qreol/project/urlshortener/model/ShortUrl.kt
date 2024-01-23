package qreol.project.urlshortener.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ShortUrl(
    @Id
    var id: String = "",
    var fullUrl: String = "",
)
