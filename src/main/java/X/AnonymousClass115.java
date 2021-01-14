package X;

import android.content.Context;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.115  reason: invalid class name */
public class AnonymousClass115 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass113 A03;
    public final AnonymousClass116 A04;
    public final FutureTask A05;
    public final AtomicInteger A06 = new AtomicInteger(-1);

    public AnonymousClass115(Context context, AnonymousClass116 r4, Object obj, AnonymousClass113 r6, int i, int i2, int i3) {
        this.A04 = r4;
        this.A03 = r6;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A05 = new FutureTask(new AnonymousClass114(this, context, obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r2 == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass113 A00() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass115.A00():X.113");
    }
}
