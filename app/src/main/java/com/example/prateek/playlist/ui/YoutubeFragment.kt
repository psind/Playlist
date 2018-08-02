package com.example.prateek.playlist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prateek.playlist.MainFragment
import com.example.prateek.playlist.R
import kotlinx.android.synthetic.main.fragment_youtube.*

/**
 * @author Prateek on 01/08/18.
 */

class YoutubeFragment : MainFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.fragment_youtube, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainActivity?.setSupportActionBar(toolbar)
        mainActivity?.title = getString(R.string.app_name)

    }
}