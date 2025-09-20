package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private val contents: List<String>        // <- konten string dikirim dari fragment
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int = contents.size

    override fun createFragment(position: Int): Fragment {
        return CafeDetailFragment.newInstance(contents[position])
    }
}