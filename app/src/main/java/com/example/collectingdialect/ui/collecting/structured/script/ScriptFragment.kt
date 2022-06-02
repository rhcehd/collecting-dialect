package com.example.collectingdialect.ui.collecting.structured.script

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.collectingdialect.R
import com.example.collectingdialect.databinding.FragmentScriptBinding
import com.example.collectingdialect.ui.collecting.SubjectViewModel

class ScriptFragment: Fragment(R.layout.fragment_script) {
    private var binding: FragmentScriptBinding? = null
    private val viewModel: ScriptViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding?.root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(binding == null) {
            binding = DataBindingUtil.bind(view)
            binding?.viewModel = viewModel
            val subject = arguments?.getString(SubjectViewModel.KEY_SUBJECT) ?: ""
            viewModel.setSubject(subject)
        }
    }
}