package com.example.prateek.playlist.ui

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.prateek.playlist.MainFragment
import com.example.prateek.playlist.R
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount

/**
 * @author Prateek on 01/08/18.
 */

class SplashFragment : MainFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.fargment_splash, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val account :GoogleSignInAccount? = GoogleSignIn.getLastSignedInAccount(getMainActivity())
        Handler().postDelayed({
            if (account == null)
                getMainActivity().switchFragment(LoginFragment(), false, null, false)
            else{
                val bundle = Bundle()
                bundle.putParcelable("data",account)
                getMainActivity().switchFragment(YoutubeFragment(), false, bundle, false)
            }
        }, 1500)
    }
}