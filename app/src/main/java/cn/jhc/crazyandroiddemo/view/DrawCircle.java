package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 2017/7/27.
 * 该View是一个圆，跟随手指在屏幕上移动
 */

public class DrawCircle extends View {

    private float radius = 100.0f;

    private Paint paint = new Paint();

    public DrawCircle(Context context) {
        super(context);
    }

    public DrawCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);//设置锯齿边缘消失
        //黑色圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200,200,radius,paint);
        //黑色细环圆环
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(600,200,radius,paint);
        //蓝色点圆
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(200);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(200,600,paint);
        //黑色粗环圆环
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawCircle(600,600,radius-5,paint);
    }

}
