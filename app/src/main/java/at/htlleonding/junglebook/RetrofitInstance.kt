package at.htlleonding.junglebook

import at.htlleonding.junglebook.checkpoint.Checkpoint
import at.htlleonding.junglebook.journal.Journal
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiService {
    @GET("checkpoint/list")
    suspend fun getCheckpoints(): Response<List<Checkpoint>>
    @GET("journal/list")
    suspend fun getJournals(): Response<List<Journal>>
}

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://it200247.cloud.htl-leonding.ac.at/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}
