package com.example.updateko

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView

class TrainTypeRecycleAdapter (
        val context: Context,
        val listOfTrains: Int,
        val fragmentManager: FragmentManager) : RecyclerView.Adapter<TrainTypeRecycleAdapter.ViewHolder>()
{
    val TAG = "!!!"

    val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Inflatear den list viewn som ska visas i recycler viewn
        val itemView = layoutInflater.inflate(R.layout.train_type_list_view, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //val train = listOfTrains[]

        holder.trainName.text = "Tåg namn"
    }

    override fun getItemCount() = listOfTrains

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //Visar rätt sak på rätt plats

        val trainName = itemView.findViewById<TextView>(R.id.trainNameTextView)
        val checkBox = itemView.findViewById<CheckBox>(R.id.checkBox)


        init {
            itemView.setOnClickListener {
                trainQuizFragment()
                //Log.d(TAG, "IM HERE")
            }
        }
    }

    fun trainQuizFragment() {
        val container = (context as Activity).findViewById<FrameLayout>(R.id.container)

        val fragmentTrainQuiz = TrainQuizFragment()
        val transaction = fragmentManager.beginTransaction()


        transaction.add(container.id, fragmentTrainQuiz, "fragmentTrainQuiz")
        transaction.addToBackStack(null)
        transaction.commit()
    }

}