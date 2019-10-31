package com.example.navegao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.activity_pager.*

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pager)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val tabsPagerAdapter = TabsPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = tabsPagerAdapter
    }
}
