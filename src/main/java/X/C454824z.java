package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* renamed from: X.24z  reason: invalid class name and case insensitive filesystem */
public class C454824z implements AbstractC32551fB {
    public int A00;
    public int A01;
    public Bitmap.Config A02 = Bitmap.Config.ARGB_8888;
    public Rect A03;
    public final Paint A04;
    public final AbstractC20210wK A05;
    public final AbstractC20220wL A06;
    public final C32601fG A07;
    public final C32611fH A08;
    public final C32641fK A09;
    public final AbstractC20420wg A0A;

    public C454824z(AbstractC20420wg r3, AbstractC20220wL r4, AbstractC20210wK r5, C32641fK r6, C32611fH r7, C32601fG r8) {
        this.A0A = r3;
        this.A06 = r4;
        this.A05 = r5;
        this.A09 = r6;
        this.A08 = r7;
        this.A07 = r8;
        this.A04 = new Paint(6);
        A00();
    }

    public final void A00() {
        int width;
        C32641fK r2 = this.A09;
        int width2 = r2.A00.A04.getWidth();
        this.A01 = width2;
        int i = -1;
        if (width2 == -1) {
            Rect rect = this.A03;
            if (rect == null) {
                width = -1;
            } else {
                width = rect.width();
            }
            this.A01 = width;
        }
        int height = r2.A00.A04.getHeight();
        this.A00 = height;
        if (height == -1) {
            Rect rect2 = this.A03;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.A00 = i;
        }
    }

    public final boolean A01(int i, AbstractC20030w0 r6, Canvas canvas, int i2) {
        if (!AbstractC20030w0.A02(r6)) {
            return false;
        }
        if (this.A03 == null) {
            canvas.drawBitmap((Bitmap) r6.A04(), 0.0f, 0.0f, this.A04);
        } else {
            canvas.drawBitmap((Bitmap) r6.A04(), (Rect) null, this.A03, this.A04);
        }
        if (i2 == 3) {
            return true;
        }
        this.A06.AGO(i, r6, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (A01(r11, r3, r10, 2) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        if (A01(r11, r3, r10, 1) != false) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.graphics.Canvas r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 175
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454824z.A02(android.graphics.Canvas, int, int):boolean");
    }

    @Override // X.AbstractC32551fB
    public boolean A3v(Drawable drawable, Canvas canvas, int i) {
        C32601fG r6;
        boolean A022 = A02(canvas, i, 0);
        C32611fH r3 = this.A08;
        if (!(r3 == null || (r6 = this.A07) == null)) {
            AbstractC20220wL r8 = this.A06;
            for (int i2 = 1; i2 <= r3.A00; i2++) {
                int frameCount = (i + i2) % getFrameCount();
                int hashCode = (hashCode() * 31) + frameCount;
                SparseArray sparseArray = r6.A01;
                synchronized (sparseArray) {
                    if (sparseArray.get(hashCode) == null) {
                        if (!r8.A30(frameCount)) {
                            RunnableC20230wM r5 = new RunnableC20230wM(r6, this, r8, frameCount, hashCode);
                            sparseArray.put(hashCode, r5);
                            r6.A04.execute(r5);
                        }
                    }
                }
            }
        }
        return A022;
    }

    @Override // X.AbstractC20210wK
    public int A6V(int i) {
        return this.A05.A6V(i);
    }

    @Override // X.AbstractC32551fB
    public int A6s() {
        return this.A00;
    }

    @Override // X.AbstractC32551fB
    public int A6t() {
        return this.A01;
    }

    @Override // X.AbstractC32551fB
    public void ANu(int i) {
        this.A04.setAlpha(i);
    }

    @Override // X.AbstractC32551fB
    public void AO0(Rect rect) {
        this.A03 = rect;
        C32641fK r4 = this.A09;
        C32691fQ r0 = r4.A00;
        if (!C32691fQ.A00(r0.A04, rect).equals(r0.A03)) {
            r0 = new C32691fQ(r0.A06, r0.A05, rect, r0.A07);
        }
        if (r0 != r4.A00) {
            r4.A00 = r0;
            r4.A01 = new C20390wd(r0, r4.A03);
        }
        A00();
    }

    @Override // X.AbstractC32551fB
    public void AO3(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    @Override // X.AbstractC20210wK
    public int getFrameCount() {
        return this.A05.getFrameCount();
    }

    @Override // X.AbstractC20210wK
    public int getLoopCount() {
        return this.A05.getLoopCount();
    }
}
