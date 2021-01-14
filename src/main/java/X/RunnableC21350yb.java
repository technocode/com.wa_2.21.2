package X;

import android.graphics.Rect;

/* renamed from: X.0yb  reason: invalid class name and case insensitive filesystem */
public class RunnableC21350yb extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ Rect A01;
    public final /* synthetic */ C32421ev A02;
    public final /* synthetic */ C33081gA A03;
    public final /* synthetic */ byte[] A04;

    public RunnableC21350yb(C33081gA r1, byte[] bArr, C32421ev r3, Rect rect, Rect rect2) {
        this.A03 = r1;
        this.A04 = bArr;
        this.A02 = r3;
        this.A00 = rect;
        this.A01 = rect2;
    }

    public void run() {
        byte[] bArr = this.A04;
        if (bArr == null || bArr.length == 0) {
            this.A02.A00(new RuntimeException("Photo taking returned no jpeg data!"));
            return;
        }
        C22130zv r5 = new C22130zv(this.A00, this.A01, this.A03.A06, null, null, null, null, null, null);
        C32421ev r1 = this.A02;
        r1.A01.A0J.A00(6, new Object[]{r1.A00, bArr, r5});
        C22120zu A002 = C22120zu.A00();
        A002.A02(0, A002.A02);
    }
}
