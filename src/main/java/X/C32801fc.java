package X;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1fc  reason: invalid class name and case insensitive filesystem */
public class C32801fc implements AbstractC19950vs {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    public C32801fc(ActivityManager activityManager) {
        this.A00 = activityManager;
    }

    @Override // X.AbstractC19950vs
    public Object get() {
        int min = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        int i = 4194304;
        if (min >= 33554432) {
            i = 6291456;
            if (min >= 67108864) {
                i = min >> 2;
            }
        }
        return new C20460wk(i, A01);
    }
}
