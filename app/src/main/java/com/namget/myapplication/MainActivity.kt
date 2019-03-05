package com.namget.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveFAB.setOnClickListener {
            moveAnimation()
        }
    }

    //fab animation from center to end
    fun moveAnimation() {
        if (bar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_CENTER) {
            bar.fabAlignmentMode = BottomAppBar.FAB_ALIGNMENT_MODE_END
        }else if(bar.fabAlignmentMode == BottomAppBar.FAB_ALIGNMENT_MODE_END){
            bar.fabAlignmentMode = BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
        }

    }

}
