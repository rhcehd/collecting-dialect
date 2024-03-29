package com.mtdata.aidev.collectingdialect.ui.content.set

import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.findNavController
import com.mtdata.aidev.collectingdialect.R
import com.mtdata.aidev.collectingdialect.ui.BaseViewModel
import com.mtdata.aidev.collectingdialect.ui.SharedViewModel
import com.mtdata.aidev.collectingdialect.ui.content.ContentViewModel

class SetSelectionViewModel: BaseViewModel() {
    companion object {
        const val KEY_SELECTED_SET = "set"
        const val SELECTED_SET_1 = 1
        const val SELECTED_SET_2 = 2
        const val SELECTED_SET_3 = 3
    }
    var sharedViewModel: SharedViewModel? = null
    val navOptions = NavOptions.Builder().setPopUpTo(R.id.contentFragment, false).build()

    fun onClickSet1Button(view: View) {
        val navController = view.findNavController()
        when(sharedViewModel?.selectedContent) {
            ContentViewModel.SELECTED_CONTENT_ONE_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_1
                navController.navigate(R.id.repeatFragment)
            }
            ContentViewModel.SELECTED_CONTENT_TWO_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_1
                navController.navigate(R.id.conversationTwoPersonFragment)
            }
        }
    }

    fun onClickSet2Button(view: View) {
        val navController = view.findNavController()
        when(sharedViewModel?.selectedContent) {
            ContentViewModel.SELECTED_CONTENT_ONE_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_2
                navController.navigate(R.id.repeatFragment)
            }
            ContentViewModel.SELECTED_CONTENT_TWO_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_2
                navController.navigate(R.id.conversationTwoPersonFragment)
            }
        }
    }

    fun onClickSet3Button(view: View) {
        val navController = view.findNavController()
        when(sharedViewModel?.selectedContent) {
            ContentViewModel.SELECTED_CONTENT_ONE_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_3
                navController.navigate(R.id.repeatFragment)
            }
            ContentViewModel.SELECTED_CONTENT_TWO_PERSON -> {
                sharedViewModel?.selectedSet = SELECTED_SET_3
                navController.navigate(R.id.conversationTwoPersonFragment)
            }
        }
    }
}