package com.example.updateko

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class TrainQuizFragment : Fragment() {

    lateinit var listOfTrainNames: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_train_quiz, container, false)
    }

    companion object {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listOfTrainNames = resources.getStringArray(R.array.TrainNames)

        val trainIndex = arguments?.getInt("PositionOfRightTrain")

        val textView = view.findViewById<TextView>(R.id.positionOfTrain)

        textView.text = listOfTrainNames[trainIndex!!]

        //textView?.text = strtext?.toInt().toString()

    }
}