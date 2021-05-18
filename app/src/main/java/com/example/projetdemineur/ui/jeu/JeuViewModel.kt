package com.example.projetdemineur.ui.jeu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JeuViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is jeu Fragment"
    }
    val text: LiveData<String> = _text
}