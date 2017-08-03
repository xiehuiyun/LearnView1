package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/2.
 * 椭圆     或者    是扇形
 * drawArc() 是使用一个椭圆来描述弧形的。left, top, right, bottom 描述的是这个弧形所在的椭圆；
 * startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度），
 * sweepAngle 是弧形划过的角度；useCenter 表示是否连接到圆心，
 * 如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
 */

public class DrawArc extends View {
    public DrawArc(Context context) {
        super(context);
    }

    public DrawArc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawArc(50, 50, 350, 200, 180, 60, false, paint); // 绘制弧形

            canvas.drawArc(50, 50, 350, 200, -20, -90, true, paint);// 绘制扇形

            paint.setStyle(Paint.Style.FILL);
            canvas.drawArc(50, 50, 350, 200, 10, 160, false, paint); // 绘制不封口的弧形
        } else {
            paint.setTextSize(26);
            canvas.drawText("当前的版本太低无法显示椭圆 / 扇形，最低版本需要21.", 100, 100, paint);
        }
    }
}
