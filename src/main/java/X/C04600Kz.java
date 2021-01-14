package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0Kz  reason: invalid class name and case insensitive filesystem */
public class C04600Kz {
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public final boolean A04 = false;

    public C04600Kz() {
    }

    public C04600Kz(String str) {
        this.A02 = str;
        this.A03 = true;
        A03();
    }

    public C04600Kz(boolean z) {
    }

    public long A00() {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/timer/elapsed: ");
                sb.append(j4);
                Log.i(sb.toString());
            } else {
                AnonymousClass008.A10("timer/elapsed: ", j4);
                return j4;
            }
        }
        return j4;
    }

    public long A01() {
        long uptimeMillis;
        long j = this.A01;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = this.A00;
        if (i == 0) {
            return j2;
        }
        if (this.A04) {
            uptimeMillis = SystemClock.elapsedRealtime();
        } else {
            uptimeMillis = SystemClock.uptimeMillis();
        }
        long j3 = (uptimeMillis - j) + j2;
        this.A00 = j3;
        if (this.A03) {
            String str = this.A02;
            if (str != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/timer/stop: ");
                AnonymousClass008.A1P(sb, j3);
            } else {
                AnonymousClass008.A1P(AnonymousClass008.A0S("timer/stop: "), j3);
            }
        }
        this.A01 = 0;
        return this.A00;
    }

    public long A02(String str) {
        long uptimeMillis;
        long j = this.A00;
        long j2 = this.A01;
        long j3 = 0;
        if (j2 != 0) {
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            j3 = uptimeMillis - j2;
        }
        long j4 = j + j3;
        if (this.A03) {
            StringBuilder sb = new StringBuilder("timer/mark/");
            sb.append(str);
            sb.append(": ");
            sb.append(j4);
            String obj = sb.toString();
            String str2 = this.A02;
            if (str2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("/");
                sb2.append(obj);
                Log.i(sb2.toString());
            } else {
                Log.i(obj);
                return j4;
            }
        }
        return j4;
    }

    public void A03() {
        long uptimeMillis;
        if (this.A01 == 0) {
            if (this.A03) {
                String str = this.A02;
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/timer/start");
                    Log.d(sb.toString());
                } else {
                    Log.d("timer/start");
                }
            }
            if (this.A04) {
                uptimeMillis = SystemClock.elapsedRealtime();
            } else {
                uptimeMillis = SystemClock.uptimeMillis();
            }
            this.A01 = uptimeMillis;
        }
    }
}
