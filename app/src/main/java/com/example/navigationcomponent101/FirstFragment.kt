package com.example.navigationcomponent101

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var secondButton = view.findViewById<Button>(R.id.secondBtn)
        var thirdButton = view.findViewById<Button>(R.id.thirdBtn)

        //go to second fragment
        secondButton.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_firstFragment_to_secondFragment)
        }

        //go to thrid fragment
        thirdButton.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_firstFragment_to_thirdFragment2)
        }
    }

}
