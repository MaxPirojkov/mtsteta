package com.mtsteta.android.pirozhkovteta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_view_bottom);

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val fragment = ListMovieFragment.newInstance()
                    openFragment(fragment)
                }
                R.id.navigation_profile -> {
                    val fragment = ProfileFragment.newInstance()
                    openFragment(fragment)
                }

            }
            true
        }





        if (savedInstanceState == null) {
            openFragment(ListMovieFragment.newInstance())
        }

    }

    fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.content, fragment)
            .commit()
    }


}


