package example.level.maintoplevel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import base.BaseAdapterPager
import example.containertab.ContainerTabExampleFragment

class MainExampleContainerAdapter(fm: FragmentManager, level: Int) :
    BaseAdapterPager(fm, level) {
    override fun getItem(position: Int): Fragment {
        return ContainerTabExampleFragment.newInstance(position)
    }

    override fun getCount(): Int = 4

}

enum class EPageContainer(val value: Int) {
    PAGE1(0),
    PAGE2(1),
    PAGE3(2),
    PAGE4(3),
}