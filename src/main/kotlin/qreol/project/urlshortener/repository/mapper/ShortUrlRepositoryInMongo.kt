package qreol.project.urlshortener.repository.mapper

import org.springframework.data.mongodb.repository.MongoRepository
import qreol.project.urlshortener.model.ShortUrl

interface ShortUrlRepositoryInMongo : MongoRepository<ShortUrl, String> {
}