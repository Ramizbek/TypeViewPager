package ramizbek.aliyev.hw19t2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ramizbek.aliyev.hw19t2.Fragments.Third.ThirdSecondFragment
import ramizbek.aliyev.hw19t2.Models.User3

class Adapter3(var list: ArrayList<User3>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return ThirdSecondFragment.newInstance(list[position])
    }
}

//    override fun getPageTitle(position: Int): CharSequence {
//        return list[position].name
//    }