package com.example.updateko

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        trainTypesListFragment()

    }

    fun trainTypesListFragment(){
        //hittar vår fragment
        val trainTypesListFragment = TrainTypesListFragment()
        val transaction = supportFragmentManager.beginTransaction()

        if (trainTypesListFragment != null) {
            transaction.add(R.id.container, trainTypesListFragment!!, "trainTypesListFragment")
            transaction.commit()
        }

    }





}