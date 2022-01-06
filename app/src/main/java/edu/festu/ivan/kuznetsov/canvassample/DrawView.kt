package edu.festu.ivan.kuznetsov.canvassample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class DrawView(context: Context) : View(context) {
    val p = Paint()
    val p1 = Paint()
    val p2 = Paint()
    var xx : Float = 0f
    var yy : Float = 0f
    val rr : Float = 15f

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        super.onTouchEvent(event)

        xx = event!!.x
        yy = event.y
        invalidate()
        return true
    }
    override fun draw(canvas: Canvas){
        super.draw(canvas)

        canvas.drawCircle(xx,yy,rr,p2)
    }
    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.GREEN)
        p.color = Color.RED
        p1.color = Color.BLUE
        p2.color = Color.YELLOW
        canvas.drawCircle(width/2f,height/2f,30f,p)
        canvas.drawCircle(600f,350f,30f,p)
        canvas.drawCircle(0f,0f,10f,p)
        p1.strokeWidth=5f
        val coords = arrayOf(500f,500f,
                             500f,300f,
                             500f,300f,
                             600f,150f,
                             600f,150f,
                             700f,300f,
                             700f,300f,
                             700f,500f,
                             700f,500f,
                             500f,500f,
                             500f,500f,
                             700f,500f
                             ).toFloatArray()
        canvas.rotate(57f,30f,370f)
        canvas.drawLines(coords, p1)
        canvas.rotate(-57f,30f,370f)
    }
}