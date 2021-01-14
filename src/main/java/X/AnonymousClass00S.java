package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.00S  reason: invalid class name */
public class AnonymousClass00S {
    public static volatile AnonymousClass00S A05;
    public final AnonymousClass021 A00 = new AnonymousClass021();
    public final AnonymousClass00D A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;

    public AnonymousClass00S(AnonymousClass00D r10) {
        this.A01 = r10;
        SharedPreferences sharedPreferences = r10.A00;
        this.A03 = sharedPreferences.getLong("client_server_time_diff", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("last_ntp_client_time", 0);
        if (sharedPreferences.contains("client_ntp_time_diff") && j > 0 && Math.abs(currentTimeMillis - j) < 86400000) {
            A07(sharedPreferences.getLong("client_ntp_time_diff", 0));
        }
    }

    public static AnonymousClass00S A00() {
        if (A05 == null) {
            synchronized (AnonymousClass00S.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass00S(AnonymousClass00D.A00());
                }
            }
        }
        return A05;
    }

    public long A01() {
        if (this.A00 != null) {
            return System.currentTimeMillis();
        }
        throw null;
    }

    public long A02() {
        if (this.A04 != 0) {
            long j = this.A04;
            if (this.A00 != null) {
                return j + SystemClock.elapsedRealtime();
            }
            throw null;
        } else if (this.A00 != null) {
            return System.currentTimeMillis() - this.A03;
        } else {
            throw null;
        }
    }

    public long A03() {
        if (this.A00 != null) {
            return SystemClock.elapsedRealtime();
        }
        throw null;
    }

    public long A04() {
        if (this.A00 != null) {
            return SystemClock.uptimeMillis();
        }
        throw null;
    }

    public final long A05() {
        AnonymousClass021 r8 = this.A00;
        if (r8 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.A02 != 0) {
                return this.A02 + elapsedRealtime;
            }
            if (this.A04 != 0) {
                return this.A04 + elapsedRealtime;
            }
            if (r8 != null) {
                return System.currentTimeMillis() - this.A03;
            }
            throw null;
        }
        throw null;
    }

    public long A06(long j) {
        if (this.A00 != null) {
            return (j + System.currentTimeMillis()) - A05();
        }
        throw null;
    }

    public final void A07(long j) {
        System.currentTimeMillis();
        A05();
        AnonymousClass021 r1 = this.A00;
        if (r1 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = currentTimeMillis + j;
            if (r1 != null) {
                this.A02 = j2 - SystemClock.elapsedRealtime();
                StringBuilder A0V = AnonymousClass008.A0V("app/time ntp update processed; diffClientNtp:", j, " device time: ");
                A0V.append(currentTimeMillis);
                A0V.append(" ntp time: ");
                A0V.append(j2);
                Log.i(A0V.toString());
                System.currentTimeMillis();
                A05();
                return;
            }
            throw null;
        }
        throw null;
    }

    public void A08(long j, long j2) {
        System.currentTimeMillis();
        A05();
        if (j > 0) {
            if (this.A00 != null) {
                this.A04 = j - SystemClock.elapsedRealtime();
                this.A03 = j2 - j;
                StringBuilder A0S = AnonymousClass008.A0S("app/time server update processed; diffClientWaServer:");
                A0S.append(this.A03);
                A0S.append(" device time: ");
                A0S.append(j2);
                A0S.append(" server time: ");
                AnonymousClass008.A1P(A0S, j);
                AnonymousClass008.A0l(this.A01, "client_server_time_diff", this.A03);
            } else {
                throw null;
            }
        }
        System.currentTimeMillis();
        A05();
    }
}
