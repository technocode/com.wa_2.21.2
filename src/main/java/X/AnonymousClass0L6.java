package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0L6  reason: invalid class name */
public class AnonymousClass0L6 {
    public static volatile AnonymousClass0L6 A05;
    public int A00 = 1;
    public int A01 = -1;
    public long A02;
    public final AnonymousClass00Y A03;
    public final AnonymousClass00T A04;

    public AnonymousClass0L6(AnonymousClass00T r2, AnonymousClass00Y r3) {
        this.A04 = r2;
        this.A03 = r3;
    }

    public static AnonymousClass0L6 A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0L6.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0L6(C002101e.A00(), AnonymousClass00Y.A00());
                }
            }
        }
        return A05;
    }

    public void A01() {
        if (this.A01 == 1) {
            Log.d("cameraopentracker/abort");
            this.A01 = 0;
            this.A00 = 1;
        }
    }

    public void A02(String str) {
        if (this.A01 != 1) {
            this.A01 = -1;
            return;
        }
        Log.d("cameraopentracker/stop");
        C44091zU r2 = new C44091zU();
        r2.A01 = Long.valueOf(SystemClock.elapsedRealtime() - this.A02);
        r2.A02 = str;
        r2.A00 = Integer.valueOf(this.A00);
        this.A03.A08(r2, 5);
        this.A01 = -1;
        this.A00 = 1;
    }
}
