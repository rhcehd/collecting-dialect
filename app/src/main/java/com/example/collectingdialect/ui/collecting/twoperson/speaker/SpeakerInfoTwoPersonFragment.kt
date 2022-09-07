package com.example.collectingdialect.ui.collecting.twoperson.speaker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.collectingdialect.R
import com.example.collectingdialect.databinding.FragmentSpeakerInfoTwoPersonBinding
import com.example.collectingdialect.ui.SharedViewModel
import com.example.collectingdialect.ui.content.ContentViewModel

class SpeakerInfoTwoPersonFragment: Fragment(R.layout.fragment_speaker_info_two_person) {
    val viewModel: SpeakerInfoTwoPersonViewModel by viewModels()
    val sharedViewModel: SharedViewModel by activityViewModels()
    var binding: FragmentSpeakerInfoTwoPersonBinding? = null

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
            viewModel.sharedViewModel = sharedViewModel
        }
    }

    override fun onResume() {
        super.onResume()
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
    }

    override fun onPause() {
        super.onPause()
        activity?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING)
    }
}