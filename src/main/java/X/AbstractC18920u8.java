package X;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.0u8  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC18920u8 {
    public void A00(String str) {
        if (this instanceof C32001eA) {
            C32001eA r2 = (C32001eA) this;
            r2.A00 = r2.A01.A03.A00.measureText(str) + r2.A00;
        } else if (this instanceof C31991e9) {
            C31991e9 r4 = (C31991e9) this;
            C18930u9 r5 = r4.A03;
            if (r5.A0k()) {
                Rect rect = new Rect();
                r5.A03.A00.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(r4.A00, r4.A01);
                r4.A02.union(rectF);
            }
            r4.A00 = r5.A03.A00.measureText(str) + r4.A00;
        } else if (!(this instanceof C31981e8)) {
            C31971e7 r1 = (C31971e7) this;
            if (!(r1 instanceof C454124q)) {
                C18930u9 r6 = r1.A02;
                if (r6.A0k()) {
                    C18910u7 r52 = r6.A03;
                    if (r52.A05) {
                        r6.A01.drawText(str, r1.A00, r1.A01, r52.A00);
                    }
                    C18910u7 r53 = r6.A03;
                    if (r53.A06) {
                        r6.A01.drawText(str, r1.A00, r1.A01, r53.A01);
                    }
                }
                r1.A00 = r6.A03.A00.measureText(str) + r1.A00;
                return;
            }
            C454124q r12 = (C454124q) r1;
            C18930u9 r3 = r12.A01;
            if (r3.A0k()) {
                C18910u7 r22 = r3.A03;
                if (r22.A05) {
                    r3.A01.drawTextOnPath(str, r12.A00, ((C31971e7) r12).A00, ((C31971e7) r12).A01, r22.A00);
                }
                C18910u7 r23 = r3.A03;
                if (r23.A06) {
                    r3.A01.drawTextOnPath(str, r12.A00, ((C31971e7) r12).A00, ((C31971e7) r12).A01, r23.A01);
                }
            }
            ((C31971e7) r12).A00 = r3.A03.A00.measureText(str) + ((C31971e7) r12).A00;
        } else {
            C31981e8 r24 = (C31981e8) this;
            C18930u9 r32 = r24.A03;
            if (r32.A0k()) {
                Path path = new Path();
                r32.A03.A00.getTextPath(str, 0, str.length(), r24.A00, r24.A01, path);
                r24.A02.addPath(path);
            }
            r24.A00 = r32.A03.A00.measureText(str) + r24.A00;
        }
    }
}
