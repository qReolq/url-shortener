package qreol.project.urlshortener.repository.mapper

import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component
import qreol.project.urlshortener.model.ShortUrl
import qreol.project.urlshortener.web.dto.url.ShortUrlResponse

@Component
class UrlMapper(
    private val modelMapper: ModelMapper
) {

    fun toDto(entity: ShortUrl):
            ShortUrlResponse = modelMapper.map(entity, ShortUrlResponse::class.java)

}