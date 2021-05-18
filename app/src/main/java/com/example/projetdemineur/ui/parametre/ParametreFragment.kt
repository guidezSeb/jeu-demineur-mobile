package com.example.projetdemineur.ui.parametre

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.projetdemineur.R

class ParametreFragment : Fragment() {

    private lateinit var parametreViewModel: ParametreViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        parametreViewModel =
                ViewModelProvider(this).get(parametreViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_parametre, container, false)
        val textView: TextView = root.findViewById(R.id.text_parametre)
        parametreViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}