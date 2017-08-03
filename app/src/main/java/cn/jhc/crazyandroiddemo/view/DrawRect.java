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
 */

public class DrawRect extends View {

    private Paint paint;
    public DrawRect(Context context) {
        super(context);
    }

    public DrawRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置锯齿边缘消失
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(100,100,300,300,paint);

        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(500,100,700,300,paint);
    }
}
