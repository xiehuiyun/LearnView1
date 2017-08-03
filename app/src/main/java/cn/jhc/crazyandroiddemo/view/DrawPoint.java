package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/2.
 * drawPoint(float x, float y, Paint paint) 画点

 x 和 y 是点的坐标。点的大小可以通过 paint.setStrokeWidth(width) 来设置；
 点的形状可以通过 paint.setStrokeCap(cap) 来设置：
 ROUND 画出来是圆形的点，
 SQUARE 或 BUTT 画出来是方形的点。
 （点还有形状？是的，反正 Google 是这么说的，你要问问 Google 去，我也很懵逼。）
 */

public class DrawPoint extends View {
    public DrawPoint(Context context) {
        super(context);
    }

    public DrawPoint(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(100);
        //蓝色点圆
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(200,200,paint);
        //蓝色方形
        paint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(200,400,paint);
        //蓝色方形
        paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(200,600,paint);
    }
}
