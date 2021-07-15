package com.vaca.a15puzzel.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.MotionEvent.*
import android.view.View
import androidx.core.content.ContextCompat
import com.vaca.a15puzzel.R

class PuzzleView : View {

    private val boarderPaint = Paint()
    private val canvasW = getPixel(R.dimen.w)
    private val canvasH = getPixel(R.dimen.h)



    var seeTime: Long = System.currentTimeMillis()
    var maxH = 150f
    var minH = 50f

    constructor(context: Context?) : super(context) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    ) {
        init()
    }

    private fun init() {
        boarderPaint.apply {
            color = getColor(R.color.black)
            style = Paint.Style.STROKE
        }

    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawColor(getColor(R.color.black))



    }

    private fun getColor(resource_id: Int): Int {
        return ContextCompat.getColor(context, resource_id)
    }

    private fun getPixel(resource_id: Int): Int {
        return resources.getDimensionPixelSize(resource_id)
    }


//    override fun onMeasure(width: Int, height: Int) {
//        setMeasuredDimension(canvasW, canvasH)
//    }



    var x1 = 0f
    var y1 = 0f
    var cr = ""
    var cr2 = ""
    var gi: Long = 0
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            ACTION_DOWN -> {
//                x1 = event.x
//                y1 = event.y
//                gi = seeTime
            }

            ACTION_UP -> {

            }

            ACTION_MOVE -> {
                x1 = event.x
                y1 = event.y
                Log.e("fuck","sdkljf        $x1          $y1         $width      $height")
            }
        }
        return super.onTouchEvent(event)
    }


}