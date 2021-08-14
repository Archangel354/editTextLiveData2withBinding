package com.example.android.edittextlivedata2withbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.edittextlivedata2withbinding.databinding.FragmentABinding

class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)

        binding.btnFragmentA.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentA_to_fragmentB))
        // Inflate the layout for this fragment
        return binding.root
    }


}