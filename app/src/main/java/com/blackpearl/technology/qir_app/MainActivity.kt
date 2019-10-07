package com.blackpearl.technology.qir_app

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cameraFab.setOnClickListener(this)
        formFab.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.cameraFab -> openCameraIntent()
            R.id.formFab -> openFormIntent()
        }
    }

    private fun openFormIntent() {
        val formIntent = Intent(this, FormActivity::class.java)
        formIntent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(formIntent)
    }

    private fun openCameraIntent() {
        Log.d(TAG, "Clicked!")
    }
}
