package qreol.project.urlshortener.web.dto.url

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "URL Request")
data class UrlRequest(

    @Schema(description = "Full URL", example = "https://www.youtube.com/watch?v=dwx4us_hHS8&t=11134s")
    var fullUrl: String
)