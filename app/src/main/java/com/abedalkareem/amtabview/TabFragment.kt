package com.abedalkareem.amtabview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tab.view.*

private const val ARG_TAB_IMAGE = "image"

class TabFragment : Fragment() {
  private var image: Int? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    arguments?.let {
      image = it.getInt(ARG_TAB_IMAGE)
    }
  }

  override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val view = inflater.inflate(R.layout.fragment_tab, container, false)

    view.imageView.setImageResource(image!!)

    return view
  }

  companion object {
    @JvmStatic
    fun newInstance(image: Int) =
      TabFragment().apply {
        arguments = Bundle().apply {
          putInt(ARG_TAB_IMAGE, image)
        }
      }
  }
}
