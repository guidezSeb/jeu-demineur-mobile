package com.example.projetdemineur.ui.jeu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projetdemineur.R

class JeuFragment : Fragment() {

    private lateinit var jeuViewModel: JeuViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        jeuViewModel =
                ViewModelProvider(this).get(JeuViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_jeu, container, false)
        val textView: TextView = root.findViewById(R.id.text_jeu)
        jeuViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}