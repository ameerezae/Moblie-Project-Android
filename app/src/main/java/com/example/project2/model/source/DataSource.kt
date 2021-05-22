package com.example.project2.model.source

import com.example.project2.R
import com.example.project2.model.entity.Animal

object DataSource {
    fun selectAnimals(): List<Animal> {
        val iranianCheetah = Animal("Iranian Cheetah", "Mammal",
                R.drawable.iraniancheetah, 15, "Central Iran")
        val rattlesnake = Animal("Rattlesnake", "Reptile",
                R.drawable.rattlesnake, 18, "Southern USA")
        val whiteWolf = Animal("White Wolf", "Mammal",
                R.drawable.whitewolf, 14, "Arctic Tundra")
        val redTailedHawk = Animal("Red-Tailed Hawk", "Bird",
                R.drawable.red_tailedhawk, 15, "Northern USA")
        val emperorPenguin = Animal("Emperor Penguin", "Bird",
                R.drawable.emperorpenguin, 20, "Antarctica")

        return listOf(iranianCheetah, rattlesnake, whiteWolf, redTailedHawk, emperorPenguin)
    }
}