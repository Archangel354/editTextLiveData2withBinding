package com.example.android.edittextlivedata2withbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.example.android.edittextlivedata2withbinding.databinding.ActivityMainBinding
import timber.log.Timber
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        val topLevelDestinations = mutableSetOf<Int>()
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
        Timber.plant(Timber.DebugTree())
        topLevelDestinations.add(R.id.fragmentA)
        topLevelDestinations.add(R.id.fragmentB)




        Timber.i("actionbar is null")
        val actionBar: ActionBar? = this.supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setTitle("Main Activity")
        }
        else{
            Timber.i("actionbar is null")
        }
    }
}