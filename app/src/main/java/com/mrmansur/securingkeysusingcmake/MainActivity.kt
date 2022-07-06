package com.mrmansur.securingkeysusingcmake

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /**
     * A native method that is implemented by the 'ndktest' native library,
     * which is packaged with this application.
     */
    external fun getPublicKey(): String
//    external fun getPrivateKey(): String

    companion object {
        // Used to load the 'ndktest' library on application startup.
        init {
            System.loadLibrary("ndktest")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val tv = findViewById<TextView>(R.id.tv)
        tv.text = getPublicKey()
    }
}