package X;

import android.content.Context;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.28Z  reason: invalid class name */
public class AnonymousClass28Z extends AbstractC32331ei {
    public static Thread A04;
    public static final BlockingQueue A05 = new ArrayBlockingQueue(10);
    public static final AtomicBoolean A06 = new AtomicBoolean();
    public static volatile C19380uv A07;
    public String A00;
    public final int A01;
    public final AtomicLong A02 = new AtomicLong(0);
    public final AtomicLong A03 = new AtomicLong(0);

    public AnonymousClass28Z(Context context, int i, int i2) {
        super(i, i2);
        if (A06.compareAndSet(false, true)) {
            C19440v1.A01(new C32101eL(context));
        }
        int i3 = context.getResources().getDisplayMetrics().densityDpi;
        if (i3 > 320) {
            this.A01 = 320;
        } else if (i3 > 250) {
            this.A01 = 250;
        } else {
            this.A01 = 72;
        }
    }
}
