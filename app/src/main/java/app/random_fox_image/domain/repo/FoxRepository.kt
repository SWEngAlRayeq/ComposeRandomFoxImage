package app.random_fox_image.domain.repo

import app.random_fox_image.domain.model.Fox

interface FoxRepository {
    suspend fun getRandomFox(): Fox
}