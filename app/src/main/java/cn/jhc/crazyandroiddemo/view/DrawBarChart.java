package cn.jhc.crazyandroiddemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import cn.jhc.crazyandroiddemo.R;

/**
 * Created by Administrator on 2017/8/2.
 */

public class DrawBarChart extends View {
    public DrawBarChart(Context context) {
        super(context);
    }

    public DrawBarChart(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(getResources().getColor(R.color.bar_chart_bg));
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        float[] lines = {50,100,50,600, 50,600,1020,600};
        canvas.drawLines(lines,paint);
        paint.setTextSize(18);
        canvas.drawText(" Froyo ",130,620,paint);
        canvas.drawText("  GB   ",260,620,paint);
        canvas.drawText("  ICS  ",390,620,paint);
        canvas.drawText("  JB   ",520,620,paint);
        canvas.drawText("KitKat ",650,620,paint);
        canvas.drawText("   L   ",780,620,paint);
        canvas.drawText("   M   ",910,620,paint);

        Path path = new Path();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        path.addRect(100,595,200,600, Path.Direction.CW);
        path.addRect(230,500,330,600, Path.Direction.CW);
        path.addRect(360,500,460,600, Path.Direction.CW);
        path.addRect(490,350,590,600, Path.Direction.CW);
        path.addRect(620,200,720,600, Path.Direction.CW);
        path.addRect(750,120,850,600, Path.Direction.CW);
        path.addRect(880,320,980,600, Path.Direction.CW);
        canvas.drawPath(path,paint);
    }
}
