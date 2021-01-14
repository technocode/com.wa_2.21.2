package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.2HW  reason: invalid class name */
public class AnonymousClass2HW extends BitmapDrawable {
    public final float A00;
    public final Paint A01;

    public AnonymousClass2HW(C002301g r4, Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.A00 = resources.getDimension(R.dimen.small_avatar_radius);
        Paint paint = new Paint();
        this.A01 = paint;
        paint.setAntiAlias(true);
        this.A01.setStrokeJoin(Paint.Join.ROUND);
        this.A01.setStrokeCap(Paint.Cap.ROUND);
        this.A01.setStrokeWidth(r4.A00 * 1.0f);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        RectF rectF = new RectF(getBounds());
        Paint paint = this.A01;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(1493172224);
        float f = this.A00;
        if (f > 0.0f) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
    }
}
