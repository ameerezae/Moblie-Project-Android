package com.example.project2.ui.summary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.example.project2.model.entity.Animal
import org.w3c.dom.Text

class AnimalAdapter(
        private val animals: List<Animal>
) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_animal, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val animal = animals[position]
        holder.bind(animal)
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(animal: Animal) {
            itemView.findViewById<TextView>(R.id.tvName).text = animal.Name
            itemView.findViewById<TextView>(R.id.tvCategory).text = animal.Category
            itemView.findViewById<ImageView>(R.id.ivPicture).setImageResource(animal.PhotoAddress)
        }
    }
}

