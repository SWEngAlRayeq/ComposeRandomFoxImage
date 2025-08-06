package app.random_fox_image.data.api

import app.random_fox_image.data.model.FoxDto
import retrofit2.http.GET

interface ApiService {

    @GET("floof/")
    suspend fun getRandomFox(): FoxDto

}