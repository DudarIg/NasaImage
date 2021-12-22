package ru.dudar.nasaimage.ui.globus

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import ru.dudar.nasaimage.R

class GlobusFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_globus, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val view_pager = view.findViewById<ViewPager>(R.id.view_pager)
        view_pager.adapter = ViewPagerAdapter(childFragmentManager)
    }

    companion object {
        @JvmStatic
        fun newInstance() = GlobusFragment()
    }
}