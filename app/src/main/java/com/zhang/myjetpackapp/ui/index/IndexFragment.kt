package com.zhang.myjetpackapp.ui.index

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.zhang.myjetpackapp.R
import com.zhang.myjetpackapp.databinding.IndexFragmentBinding

class IndexFragment : Fragment() {

    companion object {
        fun newInstance() = IndexFragment()
    }

    private lateinit var binding: IndexFragmentBinding
    private lateinit var viewModel: IndexViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = IndexFragmentBinding.inflate(inflater,container,false)
            .apply {
                // TODO: 初始化viewpager adapter
            }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(IndexViewModel::class.java)
    }

}
