package com.example.on_resume_bug

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


class ContentFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return TextView(requireContext()).apply {
            text = "Content"
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (IS_CONTENT_FRAGMENT_TRANSITIONS_ENABLED) {
            enterTransition = DEFAULT_TRANSITION
            exitTransition = DEFAULT_TRANSITION
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("Fragments", "ContentFragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Fragments", "ContentFragment onResume")
        Toast
            .makeText(requireContext(), "ContentFragment onResume", Toast.LENGTH_SHORT)
            .show()
    }
}
