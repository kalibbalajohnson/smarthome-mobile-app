package com.example.mysmarthome

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.mysmarthome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_favorites,
                R.id.navigation_things,
                R.id.navigation_routines,
                R.id.navigation_ideas,
                R.id.navigation_settings
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Navigate to the R.id.navigation_favorites fragment by default
        navController.navigate(R.id.navigation_favorites)

        // Handle extra for fragment ID and navigate to the appropriate fragment
        val fragmentId = intent.getIntExtra("fragment_id", -1)
        if (fragmentId != -1) {
            navController.navigate(fragmentId)
        }


    }
    fun next(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}