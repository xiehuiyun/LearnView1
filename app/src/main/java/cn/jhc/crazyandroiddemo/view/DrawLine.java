package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/2.
 */

public class DrawLine extends View {
    private Paint paint;
    public DrawLine(Context context) {
        super(context);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //图为：   /
        canvas.drawLine(100,300,300,700,paint);
        //drawLines(float[] pts, int offset, int count, Paint paint) / drawLines(float[] pts, Paint paint) 画线（批量）图为：I 口
        float[] linePoints = {20,120,100,120,  60,120,60,270,   20,270,100,270,   200,120,350,120,   350,120,350,270,   350,270,200,270,   200,270,200,120};
        canvas.drawLines(linePoints,paint);
    }
}
