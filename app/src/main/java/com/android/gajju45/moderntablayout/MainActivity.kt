package com.android.gajju45.moderntablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.android.gajju45.moderntablayout.Adapter.PagerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager
    private lateinit var homeBtn:ImageButton
    private lateinit var searchBtn:ImageButton
    private lateinit var addBtn:ImageButton
    private lateinit var notificationBtn:ImageButton
    private lateinit var profileBtn:ImageButton
    private lateinit var mPagerAdapter:PagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPager=findViewById(R.id.mViewPager)

        homeBtn=findViewById(R.id.homeBtn)
        searchBtn=findViewById(R.id.searchBtn)
        addBtn=findViewById(R.id.addBtn)
        notificationBtn=findViewById(R.id.notiBtn)
        profileBtn=findViewById(R.id.profileBtn)

        mPagerAdapter=PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter=mPagerAdapter
        mViewPager.offscreenPageLimit=5

        //add Pages
        mViewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                changingTabs(position)
            }
        })
        //default
        mViewPager.currentItem=0
        homeBtn.setImageResource(R.drawable.ic_home_blue)
    }

    private fun changingTabs(position: Int) {
        if (position==0){
            homeBtn.setImageResource(R.drawable.ic_home_blue)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_baseline_add_black)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_black)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_black)


        }
        if (position==1){
            homeBtn.setImageResource(R.drawable.ic_home)
            searchBtn.setImageResource(R.drawable.ic_search_blue)
            addBtn.setImageResource(R.drawable.ic_baseline_add_black)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_black)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_black)
        }
        if (position==2){
            homeBtn.setImageResource(R.drawable.ic_home)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_baseline_add_pink)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_black)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_black)
        }
        if (position==3){
            homeBtn.setImageResource(R.drawable.ic_home)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_baseline_add_black)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_blue)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_black)
        }
        if (position==4){
            homeBtn.setImageResource(R.drawable.ic_home)
            searchBtn.setImageResource(R.drawable.ic_search_black)
            addBtn.setImageResource(R.drawable.ic_baseline_add_black)
            notificationBtn.setImageResource(R.drawable.ic_baseline_notifications_black)
            profileBtn.setImageResource(R.drawable.ic_baseline_person_blue)
        }

    }
}


/*
1.Build.gradle
2.color.xml
3.drawable-->bottom_shape.xml
4.-->mainXML
5-->create Adapter Class
6-->Crate All Fragment(Blank Fragment)

7-->MainActivity

 */