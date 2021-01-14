package X;

import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.0JQ  reason: invalid class name */
public class AnonymousClass0JQ {
    public static volatile AnonymousClass0JQ A08;
    public final Handler A00;
    public final AnonymousClass0JT A01;
    public final AnonymousClass0Fk A02;
    public final AnonymousClass0JR A03;
    public final AnonymousClass09K A04;
    public final AnonymousClass03P A05;
    public final AnonymousClass00G A06;
    public final AnonymousClass00T A07;

    public AnonymousClass0JQ(AnonymousClass00G r8, AnonymousClass00T r9, AnonymousClass03P r10, AnonymousClass0Fk r11, AnonymousClass09K r12, AnonymousClass0JR r13, AnonymousClass0IY r14, AnonymousClass0JS r15) {
        this.A06 = r8;
        this.A07 = r9;
        this.A05 = r10;
        this.A02 = r11;
        this.A04 = r12;
        this.A03 = r13;
        this.A01 = new AnonymousClass0JT(r8, r10, r11, this, r13, r15);
        this.A00 = new Handler(Looper.getMainLooper(), new C25791Ii(this, r14));
    }

    public static AnonymousClass0JQ A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0JQ.class) {
                if (A08 == null) {
                    A08 = new AnonymousClass0JQ(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass03P.A00(), AnonymousClass0Fk.A01, AnonymousClass09K.A07, AnonymousClass0JR.A00(), AnonymousClass0IY.A00(), AnonymousClass0JS.A00());
                }
            }
        }
        return A08;
    }

    public void A01() {
        AnonymousClass0Fk r6 = this.A02;
        if (r6.A00 == 1) {
            r6.A00 = 2;
            AnonymousClass0JT r8 = this.A01;
            if (r8 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() + 15000;
                PendingIntent broadcast = PendingIntent.getBroadcast(r8.A05.A00, 0, new Intent("com.whatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.whatsapp"), 134217728);
                AlarmManager A022 = r8.A04.A02();
                if (A022 != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        A022.setExactAndAllowWhileIdle(2, elapsedRealtime, broadcast);
                    } else if (i >= 19) {
                        A022.setExact(2, elapsedRealtime, broadcast);
                    } else {
                        A022.set(2, elapsedRealtime, broadcast);
                    }
                } else {
                    Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/startAvailableTimeoutAlarm AlarmManager is null");
                }
            } else {
                throw null;
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("presencestatemanager/startTransitionToUnavailable/new-state ");
        A0S.append(r6);
        Log.i(A0S.toString());
    }

    public final void A02(boolean z) {
        Application application = this.A06.A00;
        AnonymousClass03P r1 = this.A05;
        AnonymousClass00E.A01();
        if (AnonymousClass0JU.A01) {
            boolean z2 = !AnonymousClass0JU.A00(r1);
            AnonymousClass0JU.A01 = z2;
            AnonymousClass008.A1a(AnonymousClass008.A0S("ScreenLockReceiver manual check; locked="), z2);
            AnonymousClass0JU.A02.A02(AnonymousClass0JU.A01);
        }
        AnonymousClass0Fk r4 = this.A02;
        int i = r4.A00;
        if (i != 1) {
            boolean z3 = false;
            if (i == 2) {
                z3 = true;
            }
            if (z3) {
                this.A01.A00();
                r4.A00 = 1;
            } else if (z) {
                r4.A00 = 1;
                AnonymousClass09K r12 = this.A04;
                if (!r12.A03) {
                    AnonymousClass0JR r0 = this.A03;
                    r0.A00 = true;
                    r0.A01();
                }
                if (!r12.A02) {
                    this.A07.ANC(new AnonymousClass0JV(application), new Void[0]);
                }
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("presencestatemanager/setAvailable/new-state: ");
        A0S.append(r4);
        A0S.append(" setIfUnavailable:");
        A0S.append(z);
        Log.i(A0S.toString());
    }
}
