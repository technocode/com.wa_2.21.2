package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: X.0zu  reason: invalid class name and case insensitive filesystem */
public class C22120zu {
    public static C22120zu A05;
    public long A00;
    public long A01;
    public long A02;
    public Handler A03 = new Handler(Looper.getMainLooper(), new C22110zt(this));
    public final C21120yD A04 = new C21120yD();

    public static synchronized C22120zu A00() {
        C22120zu r0;
        synchronized (C22120zu.class) {
            r0 = A05;
            if (r0 == null) {
                r0 = new C22120zu();
                A05 = r0;
            }
        }
        return r0;
    }

    public void A01() {
        long j = this.A01;
        if (j == 0) {
            this.A01 = SystemClock.elapsedRealtime();
            A02(5, this.A00);
            return;
        }
        A02(3, j);
        this.A01 = SystemClock.elapsedRealtime();
    }

    public final void A02(int i, long j) {
        if (!this.A04.A00.isEmpty()) {
            Handler handler = this.A03;
            Message obtain = Message.obtain(handler, i);
            obtain.arg1 = (int) (SystemClock.elapsedRealtime() - j);
            handler.sendMessage(obtain);
        }
    }
}
