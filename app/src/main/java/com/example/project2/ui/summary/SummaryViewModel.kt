package com.example.project2.ui.summary

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project2.model.entity.Animal
import com.example.project2.model.repository.DataRepository

class SummaryViewModel : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "This is summary Fragment"
    }

    val animals: MutableLiveData<List<Animal>> = MutableLiveData<List<Animal>>().apply {
        value = DataRepository.getAnimals()
    }
}