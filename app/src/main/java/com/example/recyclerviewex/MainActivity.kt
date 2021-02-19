package com.example.recyclerviewex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var characterList: ArrayList<Character>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        characterList = ArrayList<Character>()
        createCharacter()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        val adapter = CustomAdapter(characterList)
        recyclerView.adapter = adapter

    }

    fun createCharacter(){
        characterList.add(Character("Aragorn", R.drawable.aragorn))
        characterList.add(Character("Boromir", R.drawable.boromir))
        characterList.add(Character("Sauron", R.drawable.eye_of_sauron))
        characterList.add(Character("Frodo", R.drawable.frodo))
        characterList.add(Character("Galadriel", R.drawable.galadriel))
        characterList.add(Character("Gandalf", R.drawable.gandalf))
        characterList.add(Character("Gimli", R.drawable.gimli))
        characterList.add(Character("Legolas", R.drawable.legolas))
        characterList.add(Character("Sam", R.drawable.sam))
        characterList.add(Character("Saruman", R.drawable.saruman))
    }

}