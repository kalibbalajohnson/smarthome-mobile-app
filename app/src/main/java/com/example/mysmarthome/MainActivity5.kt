package com.example.mysmarthome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


import com.example.mysmarthome.databinding.ActivityMain5Binding
import com.google.android.material.tabs.TabLayout

class MainActivity5 : AppCompatActivity() {

    private lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)


        var viewPager = findViewById(R.id.viewPager)as ViewPager
        var tablayout = findViewById(R.id.tabLayout) as TabLayout

        val fragmentAdapter = fragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(THINGSFragment(),"THINGS")
        fragmentAdapter.addFragment(SCENESFragment(),"SCENES")
        fragmentAdapter.addFragment(ROUTINESFragment(),"ROUTINES")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }


}
