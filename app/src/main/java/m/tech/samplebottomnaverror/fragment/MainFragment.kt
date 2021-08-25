package m.tech.samplebottomnaverror.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import m.tech.samplebottomnaverror.nav_host.MainNavHostFragment
import m.tech.samplebottomnaverror.R

@AndroidEntryPoint
class MainFragment: Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.nav_host) as MainNavHostFragment
        val navController = navHostFragment.navController

        val bottomNav = view.findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setupWithNavController(navController)
    }

}