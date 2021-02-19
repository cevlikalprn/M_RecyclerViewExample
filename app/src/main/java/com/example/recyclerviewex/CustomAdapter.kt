package com.example.recyclerviewex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val characterList: ArrayList<Character>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        val viewHolder = ViewHolder(layoutInflater)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return characterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val characterName = holder.itemView.findViewById<TextView>(R.id.txtCharacterName)
        val characterImage = holder.itemView.findViewById<ImageView>(R.id.characterImage)

        val character = characterList.get(position)

        characterName.text = character.characterName
        characterImage.setImageResource(character.characterImg)

    }


}