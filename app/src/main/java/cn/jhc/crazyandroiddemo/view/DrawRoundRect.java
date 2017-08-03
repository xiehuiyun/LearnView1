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
 * 圆角矩形
 */

public class DrawRoundRect extends View {
    public DrawRoundRect(Context context) {
        super(context);
    }

    public DrawRoundRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(100,100,400,300,20,20,paint);
        }else {
            paint.setTextSize(26);
            canvas.drawText("当前的版本太低无法显示圆角矩形，最低版本需要21.", 100, 100, paint);
        }
    }
}
