package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.27B  reason: invalid class name */
public class AnonymousClass27B extends C33451gn {
    public C25401Gv A00 = new C25401Gv(this);

    public AnonymousClass27B(Context context) {
        super(context);
    }

    @Override // X.C33451gn
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C25401Gv r3 = this.A00;
        if (r3.A04) {
            canvas.drawPath(r3.A08, r3.A06);
            if (C008805h.A1M(r3.A03)) {
                RectF rectF = r3.A09;
                float f = r3.A00;
                canvas.drawRoundRect(rectF, f, f, r3.A05);
                return;
            }
            canvas.drawPath(r3.A07, r3.A05);
        }
    }

    public C25401Gv getDecorationHelper() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C25401Gv r4 = this.A00;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (r4.A04) {
            RectF rectF = r4.A0A;
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = r4.A01 / 2.0f;
            RectF rectF2 = r4.A09;
            rectF2.set(f3, f3, f - f3, f2 - f3);
            r4.A00 = r4.A02 - f3;
            Path path = r4.A08;
            path.reset();
            path.addRect(rectF, Path.Direction.CW);
            int i3 = r4.A03;
            if (C008805h.A1M(i3)) {
                float f4 = r4.A02;
                path.addRoundRect(rectF, f4, f4, Path.Direction.CCW);
                return;
            }
            r4.A01(path, rectF, Float.valueOf(r4.A02), i3);
            Path path2 = r4.A07;
            path2.reset();
            r4.A01(path2, rectF2, Float.valueOf(r4.A00), r4.A03);
        }
    }
}
