package ramizbek.aliyev.hw19t2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ramizbek.aliyev.hw19t2.R
import ramizbek.aliyev.hw19t2.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        binding.apply {
            home12.setOnClickListener {
                findNavController().navigate(R.id.firstFirstFragment)
            }
            home3.setOnClickListener {
                findNavController().navigate(R.id.thirdFirstFragment)
            }
            home4.setOnClickListener {
                findNavController().navigate(R.id.fourthFirstFragment)
            }
        }
        return binding.root
    }
}