package com.example.project2.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.project2.R
import com.example.project2.model.entity.Animal

class DetailFragment : Fragment() {

    private lateinit var detailViewModel: DetailViewModel
    private val args: DetailFragmentArgs by navArgs()
    private lateinit var animal: Animal

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailViewModel =
            ViewModelProvider(this).get(DetailViewModel::class.java)

        animal = args.animal

        val root = inflater.inflate(R.layout.fragment_detail, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animalName = view.findViewById<TextView>(R.id.tv_name)
        val animalCategory = view.findViewById<TextView>(R.id.tv_cat)
        val animalHabitat = view.findViewById<TextView>(R.id.tv_habitat)
        val animalAverage = view.findViewById<TextView>(R.id.tv_average)
        val animalImage: ImageView = view.findViewById<ImageView>(R.id.iv_profile)

        animalName.text = animal.Name
        animalAverage.text = "Average Longevity: " + animal.AverageLongevity.toString()
        animalCategory.text = "Category: " + animal.Category
        animalHabitat.text = "Habitat: " + animal.Habitat
        animalImage.setImageResource(animal.PhotoAddress)

    }
}