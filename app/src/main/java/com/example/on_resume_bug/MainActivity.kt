package com.example.on_resume_bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        findViewById<View>(R.id.button_reproduce_bug).setOnClickListener {
            IS_CONTENT_FRAGMENT_TRANSITIONS_ENABLED = true

            performTransitionToContent2()
        }

        findViewById<View>(R.id.button_dont_reproduce_bug).setOnClickListener {
            IS_CONTENT_FRAGMENT_TRANSITIONS_ENABLED = false

            performTransitionToContent2()
        }

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_host, RootFragment())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_host, ContentFragment())
            .addToBackStack(null)
            .commit()
    }

    private fun performTransitionToContent2() {
        supportFragmentManager.popBackStack()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_host, ContentFragment())
            .addToBackStack(null)
            .commit()
    }
}
