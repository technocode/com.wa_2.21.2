package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* renamed from: X.2MY  reason: invalid class name */
public class AnonymousClass2MY extends View {
    public final /* synthetic */ AnonymousClass2MZ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MY(AnonymousClass2MZ r1, Context context) {
        super(context);
        this.A00 = r1;
    }

    public void onDraw(Canvas canvas) {
        Path path;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        super.onDraw(canvas);
        AnonymousClass2MZ r5 = this.A00;
        if (!(r5 instanceof AnonymousClass2c9)) {
            path = ((AnonymousClass2c8) r5).A01;
        } else {
            AnonymousClass2c9 r3 = (AnonymousClass2c9) r5;
            PointF pointF = r3.A02;
            path = null;
            if (!(pointF == null || (i = r3.A01) == -1)) {
                if (i == 0) {
                    RectF rectF = ((AnonymousClass2MZ) r3).A03;
                    f = rectF.left;
                    f2 = pointF.y;
                    f3 = rectF.right;
                    f4 = f2;
                } else if (i == 1) {
                    float f5 = pointF.y - pointF.x;
                    RectF rectF2 = ((AnonymousClass2MZ) r3).A03;
                    f = rectF2.left;
                    float f6 = f5 + f;
                    f2 = rectF2.top;
                    if (f6 >= f2) {
                        f2 = f6;
                    } else {
                        f = f2 - f5;
                    }
                    f3 = rectF2.right;
                    float f7 = f5 + f3;
                    f4 = rectF2.bottom;
                    if (f7 <= f4) {
                        f4 = f7;
                    } else {
                        f3 = f4 - f5;
                    }
                } else if (i == 2) {
                    f = pointF.x;
                    RectF rectF3 = ((AnonymousClass2MZ) r3).A03;
                    f2 = rectF3.top;
                    f4 = rectF3.bottom;
                    f3 = f;
                } else if (i == 3) {
                    float f8 = pointF.y + pointF.x;
                    RectF rectF4 = ((AnonymousClass2MZ) r3).A03;
                    f = rectF4.left;
                    float f9 = f8 - f;
                    f2 = rectF4.bottom;
                    if (f9 <= f2) {
                        f2 = f9;
                    } else {
                        f = f8 - f2;
                    }
                    f3 = rectF4.right;
                    float f10 = f8 - f3;
                    f4 = rectF4.top;
                    if (f10 >= f4) {
                        f4 = f10;
                    } else {
                        f3 = f8 - f4;
                    }
                }
                path = new Path();
                path.rewind();
                path.moveTo(f, f2);
                path.lineTo(f3, f4);
            }
        }
        if (path != null) {
            canvas.drawPath(path, r5.A02);
        }
    }
}
