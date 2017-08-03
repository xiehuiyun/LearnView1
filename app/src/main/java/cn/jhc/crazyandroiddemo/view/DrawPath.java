package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/8/2.
 */

public class DrawPath extends View {
    public DrawPath(Context context) {
        super(context);
    }

    public DrawPath(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            path.addArc(300, 200, 500, 400, 135, 225);
            //最后一个参数指是否抬笔，如果这里为true则下面的lineTo就是以arcTo里的参数里的起始位置为lineTo的终点位置，以arcTo的终点为起始位置
            //如果是false，则以画笔的第一次下笔就是addArc里的起点为终点，以arcTo最后的地方为起点经过lineTo设置的位置，连成一个密闭空间
            path.arcTo(500, 200, 700, 400, 180, 225, false);
            path.lineTo(500, 550);//lineTo这次画笔的起始位置为lineTo的终点，以画笔上一次画的终点为起始点经过设置参数的点连成一个密闭空间。
            paint.setColor(Color.YELLOW);
            path.close();
            canvas.drawPath(path, paint);

            Path path1 = new Path();
            path1.moveTo(200, 700);
            path1.lineTo(400, 900);
            path1.arcTo(700, 900, 900, 1100, -90, 180, false);
            paint.setColor(Color.BLACK);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path1, paint);
        } else {
            paint.setTextSize(26);
            canvas.drawText("当前的版本太低无法显示爱心形状，最低版本需要21.", 100, 100, paint);
        }

    }
}
