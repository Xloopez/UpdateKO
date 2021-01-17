package com.example.updateko

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class TrainTypesListFragment : Fragment() {

    private var recyclerViewTrainName: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_train_types_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        trainTypesRecyclerView()

        super.onViewCreated(view, savedInstanceState)
    }

    fun trainTypesRecyclerView () {

        //Hittar vår recycler view i vår layout
        recyclerViewTrainName = view?.findViewById(R.id.trainNamesRecyclerView)
        recyclerViewTrainName?.layoutManager = LinearLayoutManager(context)

        //Kopplar recyclerView till adapter
        val adapter = context?.let { TrainTypeRecycleAdapter(it, 100) }
        recyclerViewTrainName?.adapter = adapter
    }

    override fun onResume() {
        super.onResume()

        recyclerViewTrainName?.adapter?.notifyDataSetChanged()
    }
}