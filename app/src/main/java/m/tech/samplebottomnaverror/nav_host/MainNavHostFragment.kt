package m.tech.samplebottomnaverror.nav_host

import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainNavHostFragment : NavHostFragment() {
    /**
     * I'm using custom fragment factory
     * so that I can provide dependencies to fragment constructor
     */
    //    @Inject
//    lateinit var fragmentFactory: MainFragmentFactory

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        childFragmentManager.fragmentFactory = fragmentFactory
//    }
}