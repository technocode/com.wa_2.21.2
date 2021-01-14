package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;

/* renamed from: X.0wd  reason: invalid class name and case insensitive filesystem */
public class C20390wd {
    public final Paint A00;
    public final C32691fQ A01;
    public final AbstractC20370wb A02;

    public C20390wd(C32691fQ r4, AbstractC20370wb r5) {
        this.A01 = r4;
        this.A02 = r5;
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(0);
        this.A00.setStyle(Paint.Style.FILL);
        this.A00.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public void A00(int i, Bitmap bitmap) {
        EnumC20290wT r5 = EnumC20290wT.NO_BLEND;
        EnumC20300wU r7 = EnumC20300wU.DISPOSE_TO_PREVIOUS;
        EnumC20300wU r6 = EnumC20300wU.DISPOSE_TO_BACKGROUND;
        Canvas canvas = new Canvas(bitmap);
        int i2 = 0;
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!A02(i)) {
            int i3 = i - 1;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                EnumC20380wc r10 = EnumC20380wc.REQUIRED;
                C20310wV[] r3 = this.A01.A09;
                C20310wV r2 = r3[i3];
                EnumC20300wU r1 = r2.A05;
                if (r1 != EnumC20300wU.DISPOSE_DO_NOT) {
                    if (r1 != r6) {
                        r10 = r1 == r7 ? EnumC20380wc.SKIP : EnumC20380wc.ABORT;
                    } else if (A03(r2)) {
                        r10 = EnumC20380wc.NOT_REQUIRED;
                    }
                }
                int ordinal = r10.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 3) {
                            break;
                        }
                    } else {
                        i2 = i3 + 1;
                        break;
                    }
                } else {
                    C20310wV r102 = r3[i3];
                    AbstractC20030w0 A54 = this.A02.A54(i3);
                    if (A54 != null) {
                        try {
                            canvas.drawBitmap((Bitmap) A54.A04(), 0.0f, 0.0f, (Paint) null);
                            if (r102.A05 == r6) {
                                A01(canvas, r102);
                            }
                            i2 = i3 + 1;
                        } finally {
                            A54.close();
                        }
                    } else if (A02(i3)) {
                        break;
                    }
                }
                i3--;
            }
            i2 = i3;
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C32691fQ r32 = this.A01;
            C20310wV r22 = r32.A09[i2];
            EnumC20300wU r12 = r22.A05;
            if (r12 != r7) {
                if (r22.A04 == r5) {
                    A01(canvas, r22);
                }
                r32.A02(i2, canvas);
                if (r12 == r6) {
                    A01(canvas, r22);
                }
            }
            i2++;
        }
        C32691fQ r23 = this.A01;
        C20310wV r13 = r23.A09[i];
        if (r13.A04 == r5) {
            A01(canvas, r13);
        }
        r23.A02(i, canvas);
    }

    public final void A01(Canvas canvas, C20310wV r10) {
        int i = r10.A02;
        int i2 = r10.A03;
        canvas.drawRect((float) i, (float) i2, (float) (i + r10.A01), (float) (i2 + r10.A00), this.A00);
    }

    public final boolean A02(int i) {
        if (i == 0) {
            return true;
        }
        C20310wV[] r0 = this.A01.A09;
        C20310wV r3 = r0[i];
        C20310wV r2 = r0[i - 1];
        if (r3.A04 == EnumC20290wT.NO_BLEND && A03(r3)) {
            return true;
        }
        if (r2.A05 != EnumC20300wU.DISPOSE_TO_BACKGROUND || !A03(r2)) {
            return false;
        }
        return true;
    }

    public final boolean A03(C20310wV r4) {
        if (r4.A02 == 0 && r4.A03 == 0) {
            int i = r4.A01;
            Rect rect = this.A01.A03;
            return i == rect.width() && r4.A00 == rect.height();
        }
    }
}
