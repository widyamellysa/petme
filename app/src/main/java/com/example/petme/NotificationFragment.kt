package com.example.petme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class NotificationFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notification,container,false)
    }

    companion object{
        fun newInstance(): NotificationFragment{
            val fragment = NotificationFragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}