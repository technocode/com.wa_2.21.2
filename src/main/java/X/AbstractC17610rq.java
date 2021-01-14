package X;

import android.util.Log;

/* renamed from: X.0rq  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17610rq {
    public static AbstractC17610rq A00;

    public static synchronized AbstractC17610rq A00() {
        AbstractC17610rq r1;
        synchronized (AbstractC17610rq.class) {
            r1 = A00;
            if (r1 == null) {
                r1 = new C30991cL(3);
                A00 = r1;
            }
        }
        return r1;
    }

    public static String A01(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void A02(String str, String str2, Throwable... thArr) {
        if (((C30991cL) this).A00 > 3) {
            return;
        }
        if (thArr.length >= 1) {
            Log.d(str, str2, thArr[0]);
        } else {
            Log.d(str, str2);
        }
    }

    public void A03(String str, String str2, Throwable... thArr) {
        if (((C30991cL) this).A00 > 6) {
            return;
        }
        if (thArr.length >= 1) {
            Log.e(str, str2, thArr[0]);
        } else {
            Log.e(str, str2);
        }
    }

    public void A04(String str, String str2, Throwable... thArr) {
        if (((C30991cL) this).A00 > 4) {
            return;
        }
        if (thArr.length >= 1) {
            Log.i(str, str2, thArr[0]);
        } else {
            Log.i(str, str2);
        }
    }

    public void A05(String str, String str2, Throwable... thArr) {
        if (((C30991cL) this).A00 > 5) {
            return;
        }
        if (thArr.length >= 1) {
            Log.w(str, str2, thArr[0]);
        } else {
            Log.w(str, str2);
        }
    }
}
