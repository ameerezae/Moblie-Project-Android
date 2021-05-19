package com.example.project2.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "The Psychos \n Mohammad Amin Taheri : 96521335 \n Amir Rezaei : 96521227"
    }
}