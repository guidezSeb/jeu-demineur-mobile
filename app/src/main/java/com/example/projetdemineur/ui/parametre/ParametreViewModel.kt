package com.example.projetdemineur.ui.parametre

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParametreViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is parametre Fragment"
    }
    val text: LiveData<String> = _text
}