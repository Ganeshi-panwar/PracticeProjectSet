package com.ganeshi.practiceprojectset.FragmentLifeCycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ganeshi.practiceprojectset.R
import java.time.LocalDate

class FragmentLifeCycle : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FragmentLifeCycle" ,"on Create invoked")
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("FragmentLifeCycle" , "onCreateView invoked")
        return inflater.inflate(R.layout.fragment_life_cycle, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("FragmentLifeCycle" , "onAttach invoked")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FragmentLifeCycle "," onViewStateRestore invoked")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("FragmentLifeCycle "," onActivityCreated invoked")
    }
    override fun onStart() {
        super.onStart()
        Log.d("FragmentLifeCycle "," onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FragmentLifeCycle "," onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FragmentLifeCycle "," onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FragmentLifeCycle "," onStop invoked")
    }

    override fun onDestroyView() {
        super.onDestroyView()

        Log.d("FragmentLifeCycle "," onDestroyView invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FragmentLifeCycle "," onDestroy invoked")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FragmentLifeCycle "," onDetach invoked")
    }

}