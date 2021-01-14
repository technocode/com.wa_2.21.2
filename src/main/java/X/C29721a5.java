package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.1a5  reason: invalid class name and case insensitive filesystem */
public class C29721a5 implements AbstractC13800l2 {
    public final /* synthetic */ C29731a6 A00;

    public C29721a5(C29731a6 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC13800l2
    public void A3w(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = 2.0f * f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            RectF rectF2 = this.A00.A00;
            float f4 = -f3;
            rectF2.set(f4, f4, f3, f3);
            int save = canvas.save();
            canvas.translate(rectF.left + f3, rectF.top + f3);
            canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
            canvas.translate(height, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(rectF2, 180.0f, 90.0f, true, paint);
            canvas.restoreToCount(save);
            float f5 = rectF.top;
            canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
            float f6 = rectF.bottom;
            canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
        }
        canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
    }
}
