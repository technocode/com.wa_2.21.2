package X;

import com.whatsapp.util.Log;

/* renamed from: X.0GV  reason: invalid class name */
public class AnonymousClass0GV {
    public static volatile AnonymousClass0GV A02;
    public boolean A00;
    public final StringBuilder A01 = new StringBuilder();

    public static AnonymousClass0GV A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0GV.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0GV();
                }
            }
        }
        return A02;
    }

    public void A01(String str, int i) {
        boolean z;
        if (i == 1) {
            Log.d(str);
        } else if (i == 2) {
            Log.i(str);
        } else if (i == 3) {
            Log.w(str);
        } else if (i == 4) {
            Log.e(str);
        }
        synchronized (this) {
            z = this.A00;
        }
        if (z) {
            synchronized (this) {
                StringBuilder sb = this.A01;
                sb.append("\n");
                sb.append(str);
            }
        }
    }
}
