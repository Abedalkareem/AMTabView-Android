package com.abedalkareem.amtabview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // set the first fragment.
    replaceFragmentWith(R.drawable.ic_action_tab1)

    val icons = mutableListOf(
      R.drawable.ic_action_tab1,
      R.drawable.ic_action_tab2,
      R.drawable.ic_action_tab3,
      R.drawable.ic_action_tab4
    )

    // set the tab images.
    tabView.tabsImages = icons

    // listen for tab changes.
    tabView.onTabChangeListener = {
      replaceFragmentWith(icons[it])
    }

  }

  private fun replaceFragmentWith(image: Int) {
    val newFragment = TabFragment.newInstance(image)
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.fragment_container, newFragment)
    transaction.addToBackStack(null)
    transaction.commit()
  }

}
