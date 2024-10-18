package at.htlleonding.junglebook.home

import android.content.Intent
import android.graphics.Bitmap
import android.util.Base64
import at.htlleonding.junglebook.RetrofitInstance
import okhttp3.MultipartBody
import java.io.ByteArrayOutputStream

class HomeRepository {
    suspend fun postJournal(data: Intent?, text: String) {
        val imageBitmap = data?.extras?.get("data") as Bitmap?
        if (imageBitmap != null) {
            val byteArrayOutputStream = ByteArrayOutputStream()
            imageBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)
            val byteArray = byteArrayOutputStream.toByteArray()
            val base64Data = Base64.encodeToString(byteArray, Base64.DEFAULT)

            val formData = MultipartBody.Builder().setType(MultipartBody.FORM).addFormDataPart("file", base64Data).addFormDataPart("filename", text).build()
            RetrofitInstance.api.postJournal(formData)

        }
    }
}