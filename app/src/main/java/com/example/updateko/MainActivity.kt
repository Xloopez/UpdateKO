package com.example.updateko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewTrainName: RecyclerView

    lateinit var trainNameArray: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trainNameArray = resources.getStringArray(R.array.TrainNames)

        trainNameRecyclerView()

    }

    fun trainNameRecyclerView(){
        //Hittar vår recycler view i vår layout
        recyclerViewTrainName = findViewById(R.id.trainNamesRecyclerView)

        recyclerViewTrainName.layoutManager = LinearLayoutManager(this)

        //Kopplar recyclerView till adapter
        val adapter = TrainTypeRecycleAdapter(this, trainNameArray, supportFragmentManager)
        recyclerViewTrainName.adapter = adapter
    }







}