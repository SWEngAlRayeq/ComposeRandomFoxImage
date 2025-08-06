package app.random_fox_image.data.model

import app.random_fox_image.domain.model.Fox

data class FoxDto(
    val image: String,
    val link: String
) {
    fun toFox() = Fox(image)
}