package ramizbek.aliyev.hw19t2.Fragments.Fourth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ramizbek.aliyev.hw19t2.Models.User4
import ramizbek.aliyev.hw19t2.databinding.FragmentFourthSecondBinding

class FourthSecondFragment : Fragment() {
    private lateinit var binding: FragmentFourthSecondBinding
    private lateinit var user4: User4
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFourthSecondBinding.inflate(layoutInflater)

        binding.apply {
            name4.text = user4.name
            info4.text = user4.info
            image4.setImageResource(user4.image)
        }

        return binding.root
    }

    companion object {
        fun newInstance(user4: User4): Fragment {
            val u = FourthSecondFragment()
            u.user4 = user4
            return u
        }
    }
}