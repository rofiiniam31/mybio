package com.niam.mybiografi

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        First(), Second(), Third(), Fourth ()
    )
    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }
    override fun getCount(): Int {
        return pages.size
    }
    // judul untuk tabs
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "First Tab"
            1 -> "Second Tab"
            2 -> "Third Tab"
            else -> "Fourth Tab"
        }
    }
}