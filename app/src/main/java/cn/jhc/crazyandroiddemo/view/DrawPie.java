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

import cn.jhc.crazyandroiddemo.R;

/**
 * Created by Administrator on 2017/8/2.
 */

public class DrawPie extends View {
    public DrawPie(Context context) {
        super(context);
    }

    public DrawPie(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(getResources().getColor(R.color.bar_chart_bg));
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        float[] lines = {130, 190, 230, 190,   230, 190, 250, 200,
                635, 250, 675, 210, 675, 210, 790, 210,
                710, 390, 790, 390,
                720, 430, 742, 430, 742, 430, 758, 450, 758, 450, 790, 450,
                720, 490, 742, 490, 742, 490, 758, 510, 758, 510, 790, 510,
                670, 640, 710, 670,   710, 670, 790, 670,
                135, 770, 260, 770,   260, 770, 280, 740};

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setColor(Color.RED);
            path.addArc(100, 150, 720, 770, -185, 115);
            path.lineTo(410, 455);
            path.close();
            canvas.drawPath(path, paint);
            paint.setColor(Color.WHITE);
            paint.setTextSize(25);
            canvas.drawText("Lollipop", 30, 190, paint);
            canvas.drawLines(lines, 0, 8, paint);


            Path path1 = new Path();
            path1.addArc(115, 160, 725, 775, -68, 50);
            paint.setColor(Color.YELLOW);
            path1.lineTo(420, 465);
            path1.close();
            canvas.drawPath(path1, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("Marshmallow", 815, 220, paint);
            canvas.drawLines(lines, 8, 8, paint);

            paint.setColor(Color.WHITE);
            canvas.drawText("Froyo", 815, 400, paint);
            canvas.drawLines(lines, 16, 4, paint);

            Path path2 = new Path();
            path2.addArc(115, 160, 725, 775, -13, 10);
            paint.setColor(getResources().getColor(R.color.colorAccent));
            path2.lineTo(420, 465);
            path2.close();
            canvas.drawPath(path2, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("GingerBread", 815, 455, paint);
            canvas.drawLines(lines, 20, 12, paint);

            Path path3 = new Path();
            path3.addArc(115, 160, 725, 775, -1, 10);
            paint.setColor(Color.GRAY);
            path3.lineTo(420, 465);
            path3.close();
            canvas.drawPath(path3, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("Ice Cream Sandwich", 815, 510, paint);
            canvas.drawLines(lines, 32, 12, paint);

            Path path4 = new Path();
            path4.addArc(115, 160, 725, 775, 11, 50);
            paint.setColor(Color.GREEN);
            path4.lineTo(420, 465);
            path4.close();
            canvas.drawPath(path4, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("Jelly Bean", 815, 730, paint);
            canvas.drawLines(lines, 44, 8, paint);

            Path path5 = new Path();
            path5.addArc(115, 160, 725, 775, 63, 110);
            paint.setColor(Color.BLUE);
            path5.lineTo(420, 465);
            path5.close();
            canvas.drawPath(path5, paint);
            paint.setColor(Color.WHITE);
            canvas.drawText("KitKat", 50, 770, paint);
            canvas.drawLines(lines, 52, 8, paint);
        }
    }
}
