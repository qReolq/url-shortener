package qreol.project.urlshortener.web.dto.url

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Short URL response")
data class ShortUrlResponse(
    @Schema(description = "Id which consists of 7 characters", example = "")
    var id: String = "",

    @Schema(description = "Full URL", example = "https://www.youtube.com/watch?v=dwx4us_hHS8&t=11134s")
    var fullUrl: String = "",
)