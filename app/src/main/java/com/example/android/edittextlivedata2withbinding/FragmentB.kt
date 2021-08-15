package com.example.android.edittextlivedata2withbinding

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.android.edittextlivedata2withbinding.databinding.FragmentBBinding
import timber.log.Timber


class FragmentB : Fragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false)
        Log.i("FragmentB", "Called ViewModelProvider.get")
        //viewModel = ViewModelProvider(this).get(GameViewModel::class.java)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // Set the viewmodel for databinding - this allows the bound layout access
        // to all the data in the ViewModel
        binding.viewmodel = viewModel
        // Specify the fragment view as the lifecycle owner of the binding.
        // This is used so that the binding can observe LiveData updates
        binding.lifecycleOwner = viewLifecycleOwner
        //val binding: FragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        //binding.btnFragmentA.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentA_to_fragmentB))
        // Inflate the layout for this fragment
        return binding.root
    }
}