package com.example.on_resume_bug

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class RootFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        postponeEnterTransition()

        return TextView(requireContext()).apply {
            text = "Root"
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startPostponedEnterTransition()
    }

    override fun onStart() {
        super.onStart()

        Log.e("Fragments", "RootFragment onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e("Fragments", "RootFragment onResume")
    }

    override fun onStop() {
        Log.e("Fragments", "RootFragment onStop")

        super.onStop()
    }

    override fun onPause() {
        Log.e("Fragments", "RootFragment onPause")

        super.onPause()
    }
}
