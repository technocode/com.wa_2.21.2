package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.2z2  reason: invalid class name and case insensitive filesystem */
public class C64932z2 {
    public static volatile C64932z2 A02;
    public final AnonymousClass00D A00;
    public final AtomicLong A01 = new AtomicLong(-1);

    public C64932z2(AnonymousClass00D r4) {
        this.A00 = r4;
    }

    public static C64932z2 A00() {
        if (A02 == null) {
            synchronized (C64932z2.class) {
                if (A02 == null) {
                    A02 = new C64932z2(AnonymousClass00D.A00());
                }
            }
        }
        return A02;
    }

    public long A01() {
        AtomicLong atomicLong = this.A01;
        long j = atomicLong.get();
        if (j != -1) {
            return j;
        }
        SharedPreferences sharedPreferences = this.A00.A00;
        long j2 = sharedPreferences.getLong("qpl_id", -1);
        if (j2 != -1) {
            atomicLong.set(j2);
            return j2;
        }
        synchronized (C64932z2.class) {
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            long mostSignificantBits = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
            Log.d("QplRuntimeImpl/getQplId created a new qpl-id");
            atomicLong.set(mostSignificantBits);
            sharedPreferences.edit().putLong("qpl_id", mostSignificantBits).apply();
            return mostSignificantBits;
        }
    }
}
