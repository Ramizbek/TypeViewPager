package ramizbek.aliyev.hw19t2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ramizbek.aliyev.hw19t2.Fragments.Fourth.FourthSecondFragment
import ramizbek.aliyev.hw19t2.Models.User4

class Adapter4(var list: ArrayList<User4>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return FourthSecondFragment.newInstance(list[position])
    }
}