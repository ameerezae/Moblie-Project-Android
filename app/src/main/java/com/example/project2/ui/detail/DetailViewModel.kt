package com.example.project2.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.project2.model.entity.Animal
import com.example.project2.model.repository.DataRepository

class DetailViewModel : ViewModel() {

    val text = MutableLiveData<String>().apply {
        value = "This is detail Fragment"
    }

    val animals: MutableLiveData<Array<Animal>> = MutableLiveData<Array<Animal>>().apply {
        value = DataRepository.getAnimals()
    }
}