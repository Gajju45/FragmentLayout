package com.android.gajju45.moderntablayout.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.android.gajju45.Fragment.*

internal class PagerViewAdapter (fm:FragmentManager?):
        FragmentPagerAdapter(fm!!) {

    override fun getItem(position: Int): Fragment {

        return when (position){
            0 ->{
                HomeFragment()
            }

            1 ->{
                SearchFragment()
            }
            2 ->{
                AddFragment()
            }
            3 ->{
                NotificationFragment()
            }
            4 ->
            {
                ProfileFragment()
            }
            else ->  HomeFragment()

        }
    }
    override fun getCount(): Int {

       return 5
    }


}
