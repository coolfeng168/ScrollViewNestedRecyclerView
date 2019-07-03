# ScrollViewNestedRecyclerView
利用NestedScrolling机制，把RecyclerView嵌套在NestedScrollView中，实现嵌套滚动，RecyclerView复用回收机制不受影响

效果图：

![image](https://github.com/coolfeng168/ScrollViewNestedRecyclerView/blob/master/demo.gif)


使用方法：

```
<?xml version="1.0" encoding="utf-8"?>
<com.yunfeng.scrollviewnestedrecyclerviewdemo.ScrollViewNestedRecyclerView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:focusable="true"
        android:focusableInTouchMode="true"
        android:orientation="vertical">
        <TextView
            android:id="@+id/snr_top_view"
            android:layout_width="match_parent"
            android:layout_height="400dp"
            android:background="@color/colorPrimary"
            android:textColor="#fff"
            android:textSize="20sp"
            android:gravity="center"
            android:text="这是scrollview部分"/>

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/snr_recycler_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>

    </LinearLayout>


</com.yunfeng.scrollviewnestedrecyclerviewdemo.ScrollViewNestedRecyclerView>
```
