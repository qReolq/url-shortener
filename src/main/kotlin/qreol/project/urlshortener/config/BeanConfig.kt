package qreol.project.urlshortener.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class BeanConfig {

    @Bean
    fun getModelMapper() = ModelMapper()

    @Bean
    fun openAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info()
                    .title("Url-shortener API")
                    .description("Url-shortener app")
                    .version("1.0")
            )
    }
}