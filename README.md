<p align="center">
 <img src="https://raw.githubusercontent.com/Abedalkareem/AMTabView-Android/master/tabviewlogo.png"  >
</p>

## Screenshot
 <img src="https://raw.githubusercontent.com/Abedalkareem/AMTabView-Android/master/screenshot.gif" width="240" >

## Example

To run the example project, clone the repo, and run the project.

## Usage

1- Add the view to your xml file.
```
    <com.abedalkareem.tabview.AMTabView
        android:id="@+id/tabView"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
```

2-In the perant view group set the `clipChildren` to false.

```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimary"
    android:clipChildren="false"
    tools:context=".MainActivity">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:id="@+id/fragment_container"
        android:background="@color/colorPrimary"
        app:layout_constraintBottom_toTopOf="@id/tabView"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <com.abedalkareem.tabview.AMTabView
        android:id="@+id/tabView"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
3- In the activity set the `tabsImages` and the `onTabChangeListener` to berform actions when the tab changes.

```
 override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

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
```

## Customization

```
  app:tabColor="@android:color/holo_red_dark"
  app:selectedTabTintColor="@android:color/black"
  app:unSelectedTabTintColor="@android:color/background_light"
  app:ballColor="@android:color/holo_green_dark"
```

## Installation 

Add JitPack repository in your root build.gradle at the end of repositories:

```
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```

Add the dependency
```
dependencies {
  implementation 'com.github.Abedalkareem:AMTabView-Android:Tag'
}
```

## Author

Abedalkareem, abedalkareem.omreyh@yahoo.com

## License

AMTabView is available under the MIT license. See the LICENSE file for more info.
