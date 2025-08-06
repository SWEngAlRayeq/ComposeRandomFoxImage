package app.random_fox_image.domain.usecase

import app.random_fox_image.domain.model.Fox
import app.random_fox_image.domain.repo.FoxRepository
import javax.inject.Inject

class GetRandomFoxUseCase @Inject constructor(
    private val foxRepository: FoxRepository
) {
    suspend operator fun invoke(): Fox {
        return foxRepository.getRandomFox()
    }
}