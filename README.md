# Url-shortener
Url-shortener is a tool for shortening URLs and creating short links.

## Technologies
Spring(Boot, JPA), Swagger, Docker, Gradle, MongoDB, Kotlin

## Endpoints

* POST <code>/api/v1/shorten</code>

Request JSON
```JSON
{
 "fullUrl": "https://www.youtube.com/watch?v=RpIC7z8V5tI"
}
```

Response JSON
```JSON
{
    "id": "KQi69xn",
    "fullUrl": "https://www.youtube.com/watch?v=RpIC7z8V5tI"
}
```

* GET <code>/api/v1/short-url/KQi69xn</code>

Response JSON

```JSON
{
    "id": "TCGoCYS",
    "fullUrl": "https://www.youtube.com/watch?v=RpIC7z8V5tI"
}
```

## Environments
To run this application you need to create `.env` file in root directory with next environments:

- `MONGO_AUTHENTICATION_DATABASE` - mongoDB Authentication Database
- `MONGO_DATABASE` - name of MongoDB
- `MONGO_PORT` - port of MongoDB
- `MONGO_HOST` - host of MongoDB

## Quick start
1. Clone this repo into folder.

```Bash
git clone https://github.com/qReolq/url-shortener.git
cd url-shortener
```
2. Start docker compose

```Bash
docker compose up
```
3. Go to localhost:8080/swagger-ui/index.html#/

## Description
At the core of this URL shortener is an algorithm that compresses the original link into a 7-character representation.
The algorithm employs a character set of 62 symbols
