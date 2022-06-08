package ramizbek.aliyev.hw19t2.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ramizbek.aliyev.hw19t2.Fragments.First.FirstSecondFragment
import ramizbek.aliyev.hw19t2.Models.User1

class Adapter1(var list: ArrayList<User1>, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager) {
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Fragment {
        return FirstSecondFragment.newInstance(list[position])
    }

//    override fun getPageTitle(position: Int): CharSequence {
//        return list[position].name
//    }
}