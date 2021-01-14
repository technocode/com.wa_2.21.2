package X;

import android.content.Context;
import android.graphics.Canvas;
import java.util.Comparator;

/* renamed from: X.0uZ  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC19160uZ {
    public static int A0E;
    public static final Comparator A0F = new C19150uY();
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public boolean A05 = true;
    public final float A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final C32031eE A0A;
    public final C19250ui A0B;
    public final C19480v6 A0C = new C19480v6();
    public final float[] A0D = new float[2];

    public abstract void A02(Canvas canvas);

    public AbstractC19160uZ(C32031eE r3) {
        int i = A0E;
        A0E = i + 1;
        this.A07 = i;
        this.A0A = r3;
        this.A0B = r3.A0R;
        Context context = r3.A0E.getContext();
        this.A09 = context;
        this.A06 = context.getResources().getDisplayMetrics().density;
        this.A08 = r3.A0O;
    }

    public void A00() {
        this.A0A.A0E.invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (((float) r3.getHeight()) < r1) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19160uZ.A01():void");
    }
}
