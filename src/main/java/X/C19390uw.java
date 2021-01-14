package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.0uw  reason: invalid class name and case insensitive filesystem */
public class C19390uw {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Paint A04 = new Paint(3);
    public C19650vN A05 = null;
    public C19650vN A06 = null;
    public C19650vN[] A07 = new C19650vN[4];
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r16 == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r22.A04.setAlpha(255);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r22.A07 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        r3 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        r5 = r22.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r5[r3] == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r5[r3].A04 != (r22.A02 + 1)) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r5[r3].A02() == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        if (r3 >= 4) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r4 == 255) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r0 = r22.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r0 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        r5 = r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r12 == 4) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r5 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        if (r5 == r11) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        r3 = r22.A02;
        r1 = r22.A05;
        r3 = r3 - r1.A04;
        r2 = r1.A00 >> r3;
        r13 = (1 << r3) - 1;
        r1 = (r22.A00 & r13) * r2;
        r13 = (r13 & r22.A01) * r2;
        r3 = r22.A08;
        r3.set(r1, r13, r1 + r2, r2 + r13);
        r2 = r22.A09;
        r13 = r22.A05;
        r2.set(r24, r25, ((float) r13.A01) + r24, ((float) r13.A00) + r25);
        r23.drawBitmap(r5, r3, r2, r22.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r12 <= 0) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r0 = r22.A07[(r12 << 1) + r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r0 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if (r0.A04 != (r22.A02 + r14)) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00be, code lost:
        r13 = r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        if (r13 == null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r13 == r11) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r1 = r0.A00;
        r15 = r1 >> 1;
        r14 = ((float) (r15 * r12)) + r24;
        r3 = ((float) (r15 * r5)) + r25;
        r2 = r22.A08;
        r2.set(0, 0, r0.A01, r1);
        r1 = r22.A09;
        r15 = (float) r15;
        r1.set(r14, r3, r14 + r15, r15 + r3);
        r23.drawBitmap(r13, r2, r1, r22.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r5 = r5 + 1;
        r14 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f8, code lost:
        if (r5 < 2) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fc, code lost:
        if (r12 >= 2) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ff, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0102, code lost:
        if (r16 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        r22.A04.setAlpha(r4);
        r23.drawBitmap(r6, r24, r25, r22.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.graphics.Canvas r23, float r24, float r25) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19390uw.A00(android.graphics.Canvas, float, float):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{tile=");
        Object obj = this.A06;
        Object obj2 = "{x}";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(", mParentTile=");
        C19650vN r0 = this.A05;
        if (r0 != null) {
            obj2 = r0;
        }
        sb.append(obj2);
        sb.append(", status=");
        return AnonymousClass008.A0N(sb, this.A03, "}");
    }
}
