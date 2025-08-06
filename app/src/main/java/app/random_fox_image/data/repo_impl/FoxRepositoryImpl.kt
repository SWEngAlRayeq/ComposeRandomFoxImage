package app.random_fox_image.data.repo_impl

import app.random_fox_image.data.api.ApiService
import app.random_fox_image.domain.model.Fox
import app.random_fox_image.domain.repo.FoxRepository
import javax.inject.Inject

class FoxRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : FoxRepository {
    override suspend fun getRandomFox(): Fox {
        return apiService.getRandomFox().toFox()
    }
}