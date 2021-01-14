package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: X.0JL  reason: invalid class name */
public class AnonymousClass0JL implements AnonymousClass0CU, AbstractC02140Au {
    public static volatile AnonymousClass0JL A07;
    public long A00;
    public long A01;
    public long A02;
    public final AnonymousClass03B A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass0ET A05;
    public final AnonymousClass0JM A06;

    public AnonymousClass0JL(AnonymousClass00S r1, AnonymousClass03B r2, AnonymousClass0ET r3, AnonymousClass0JM r4) {
        this.A04 = r1;
        this.A03 = r2;
        this.A05 = r3;
        this.A06 = r4;
    }

    public static AnonymousClass0JL A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0JL.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0JL(AnonymousClass00S.A00(), AnonymousClass03B.A00(), AnonymousClass0ET.A00(), AnonymousClass0JM.A00());
                }
            }
        }
        return A07;
    }

    public void A01() {
        long A052 = this.A04.A05() / 1000;
        long j = this.A00;
        if (A052 != j) {
            boolean z = false;
            if (A052 < j) {
                z = true;
            }
            long max = Math.max(j, A052);
            if (A052 - j > 30 || z) {
                A03();
                if (A06(A052) || z) {
                    this.A06.A00.edit().putLong("timespent_end_time", max).apply();
                    A05(z);
                    A04(A052);
                }
                this.A02 = A052;
            }
            this.A00 = A052;
        }
    }

    public void A02() {
        long j;
        SharedPreferences sharedPreferences = this.A06.A00;
        if (sharedPreferences.getLong("timespent_saved_start_time", 0) > 0) {
            long j2 = sharedPreferences.getLong("timespent_summary_sequence", 0);
            AnonymousClass0ET r12 = this.A05;
            long j3 = sharedPreferences.getLong("timespent_saved_start_time", 0);
            long j4 = sharedPreferences.getLong("timespent_saved_duration", 0);
            long j5 = sharedPreferences.getLong("timespent_saved_session_total", 0);
            long j6 = sharedPreferences.getLong("timespent_saved_foreground_count", 0);
            boolean z = sharedPreferences.getBoolean("timespent_saved_time_altered", false);
            if (r12 != null) {
                AnonymousClass21L r5 = new AnonymousClass21L();
                r5.A03 = Long.valueOf(j3);
                r5.A00 = Long.valueOf(j4);
                r5.A02 = Long.valueOf(j5);
                r5.A05 = Long.valueOf(j2);
                r5.A01 = Long.valueOf(j6);
                if (z) {
                    j = 1;
                } else {
                    j = 0;
                }
                r5.A04 = Long.valueOf(j);
                r12.A09.A09(r5, 1);
                AnonymousClass00Y.A01(r5, "");
                sharedPreferences.edit().putLong("timespent_saved_start_time", 0).putLong("timespent_saved_duration", 0).putLong("timespent_saved_session_total", 0).putLong("timespent_saved_foreground_count", 0).putBoolean("timespent_saved_time_altered", false).putLong("timespent_summary_sequence", (j2 % 9999) + 1).apply();
                return;
            }
            throw null;
        }
    }

    public final void A03() {
        long j = this.A02;
        if (j > 0) {
            long j2 = this.A00;
            long j3 = ((j2 - j) + 1) - this.A01;
            SharedPreferences sharedPreferences = this.A06.A00;
            sharedPreferences.edit().putLong("timespent_last_activity_time", j2).putLong("timespent_session_total", sharedPreferences.getLong("timespent_session_total", 0) + j3).apply();
            this.A02 = 0;
            this.A00 = 0;
            this.A01 = 0;
        }
    }

    public final void A04(long j) {
        long time = this.A03.A02().getTime() / 1000;
        if (1610555627 <= j && time >= j) {
            SharedPreferences sharedPreferences = this.A06.A00;
            if (sharedPreferences.getLong("timespent_start_time", 0) == 0) {
                sharedPreferences.edit().putLong("timespent_start_time", j).apply();
            }
        }
    }

    public final void A05(boolean z) {
        StringBuilder sb = new StringBuilder("updating time spent saved session; timeAltered=");
        sb.append(z);
        Log.d(sb.toString());
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("PST8PDT"));
        instance.add(6, 1);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        SharedPreferences sharedPreferences = this.A06.A00;
        sharedPreferences.edit().putLong("timespent_rollover_time", instance.getTimeInMillis() / 1000).apply();
        A02();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long j = sharedPreferences.getLong("timespent_start_time", 0);
        if (j > 0) {
            edit.putLong("timespent_saved_start_time", j).putLong("timespent_saved_duration", (sharedPreferences.getLong("timespent_end_time", 0) - j) + 1).putLong("timespent_saved_session_total", sharedPreferences.getLong("timespent_session_total", 0)).putLong("timespent_saved_foreground_count", sharedPreferences.getLong("timespent_foreground_count", 0)).putBoolean("timespent_saved_time_altered", z);
        }
        edit.putLong("timespent_start_time", 0).putLong("timespent_session_total", 0).putLong("timespent_end_time", 0).putLong("timespent_foreground_count", 0).apply();
    }

    public final boolean A06(long j) {
        return this.A06.A00.getLong("timespent_rollover_time", 0) < j || j < this.A00;
    }

    @Override // X.AnonymousClass0CU
    public void ACs() {
        long A052 = this.A04.A05() / 1000;
        long j = this.A00;
        boolean z = false;
        if (A052 < j) {
            z = true;
        }
        long max = Math.max(j, A052);
        A03();
        this.A06.A00.edit().putLong("timespent_end_time", max).apply();
        if (A06(A052) || z) {
            A05(z);
        }
    }

    @Override // X.AnonymousClass0CU
    public void ACt() {
        long j;
        long A052 = this.A04.A05() / 1000;
        SharedPreferences sharedPreferences = this.A06.A00;
        long j2 = sharedPreferences.getLong("timespent_last_activity_time", 0);
        this.A00 = j2;
        boolean z = false;
        if (A052 < j2) {
            z = true;
        }
        if (A06(A052) || z) {
            A05(z);
        }
        A04(A052);
        if (A052 == this.A00) {
            j = 1;
        } else {
            j = 0;
        }
        this.A01 = j;
        this.A02 = A052;
        this.A00 = A052;
        sharedPreferences.edit().putLong("timespent_foreground_count", sharedPreferences.getLong("timespent_foreground_count", 0) + 1).apply();
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        A02();
    }
}
