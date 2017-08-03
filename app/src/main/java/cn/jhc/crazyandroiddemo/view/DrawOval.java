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
 * 椭圆
 */

public class DrawOval extends View {
    private Paint paint;

    public DrawOval(Context context) {
        super(context);
    }

    public DrawOval(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawOval(50, 50, 350, 200, paint);

            paint.setStyle(Paint.Style.STROKE);
            canvas.drawOval(400, 50, 700, 200, paint);
        } else {
            paint.setTextSize(26);
            canvas.drawText("当前的版本太低无法显示椭圆，最低版本需要21.", 100, 100, paint);
        }
    }
}
