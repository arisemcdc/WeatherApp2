package com.example.weatherapp2

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    //private lateinit var appBarConfigurationDrawerLayout: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val toolbar: Toolbar = findViewById(R.id.toolbar)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        //val navDrawerView: NavigationView = findViewById(R.id.nav_drawer_view)
        //setSupportActionBar(toolbar)
        //drawerLayout = findViewById(R.id.nav_drawer_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.todayWeatherFragment, R.id.forecastFragment, R.id.settingsFragment))
        //val appBarConfigurationDrawerLayout = AppBarConfiguration(setOf(
               // R.id.todayWeatherFragment, R.id.forecastFragment, R.id.settingsFragment), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
       // setupActionBarWithNavController(navController, appBarConfigurationDrawerLayout)
        navView.setupWithNavController(navController)

    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.top_menu, menu)
        return true
    }

   /* override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }*/
   override fun onOptionsItemSelected(item: MenuItem): Boolean {

       //Почему не работает переход?????
       return when (item.itemId) {
           R.id.todayWeatherFragment -> true
           R.id.forecastFragment -> true
           R.id.settingsFragment -> true
           else -> super.onOptionsItemSelected(item)
       }
      /* val navController = findNavController(R.id.nav_host_fragment)
       return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)*/
       /*// Handle item selection
       return when (item.itemId) {
           R.id.todayWeatherFragment -> {
               true
           }
           R.id.forecastFragment -> {
               true
           }
           R.id.settingsFragment -> {
               true
           }
           else -> super.onOptionsItemSelected(item)
       }*/
   }
}