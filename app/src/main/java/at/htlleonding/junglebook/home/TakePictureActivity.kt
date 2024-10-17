/*
package at.htlleonding.junglebook.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import at.htlleonding.junglebook.R

class TakePictureActivity : AppCompatActivity() {
    private lateinit var btnTakePicture: Button
    private lateinit var etPictureName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)

        btnTakePicture = findViewById(R.id.btnTakePicture)
        etPictureName = findViewById(R.id.etPictureName)

        btnTakePicture.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            // Handle the image capture and save the picture name
        }
    }

    companion object {
        const val REQUEST_IMAGE_CAPTURE = 1
    }
}*/
