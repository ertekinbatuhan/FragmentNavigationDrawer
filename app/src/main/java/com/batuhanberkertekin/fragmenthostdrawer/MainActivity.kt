package com.batuhanberkertekin.fragmenthostdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.baslik.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navhost =supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
NavigationUI.setupWithNavController(NavigationView,navhost.navController)

        toolbar.title = "başlık"

        val toogle =ActionBarDrawerToggle(this,DrawerLayout,toolbar,0,0)

        DrawerLayout.addDrawerListener(toogle)
toogle.syncState()

        val baslik = NavigationView.inflateHeaderView(R.layout.baslik)
        baslik.baslikText.text = "Hello "




    }

    override fun onBackPressed() {

        if(DrawerLayout.isDrawerOpen(GravityCompat.START)){
           DrawerLayout.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }


    }
}