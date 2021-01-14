package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.ArrayList;

/* renamed from: X.28Y  reason: invalid class name */
public class AnonymousClass28Y extends AnonymousClass24r implements AbstractC19210ue {
    public static Bitmap A04;
    public static C19500v8 A05;
    public static final ArrayList A06 = new ArrayList(5);
    public int A00;
    public boolean A01;
    public final C32141eP A02;
    public final AnonymousClass28Z A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass28Y(X.C32031eE r19, X.AnonymousClass28Z r20) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass28Y.<init>(X.1eE, X.28Z):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A06;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (((double) size) * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((AbstractC32091eK) arrayList.get(i2)).A01;
        }
        int i3 = ((int) (((double) i) * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    @Override // X.AbstractC19160uZ, X.AbstractC32091eK
    public void A02(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A02(canvas);
        C19550vD.A0L.A03(System.nanoTime() - nanoTime);
    }

    @Override // X.AnonymousClass24r, X.AbstractC32091eK
    public C19650vN A03(int i, int i2, int i3) {
        C19650vN A032 = super.A03(i, i2, i3);
        if (A032 != null) {
            A032.A02 = i;
            A032.A03 = i2;
            A032.A04 = i3;
        }
        return A032;
    }
}
