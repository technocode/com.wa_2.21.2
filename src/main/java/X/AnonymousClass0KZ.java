package X;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0KZ  reason: invalid class name */
public class AnonymousClass0KZ implements AbstractC02140Au {
    public static volatile AnonymousClass0KZ A0D;
    public C11130fl A00;
    public final C04350Ka A01;
    public final C04360Kb A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00D A05;
    public final AnonymousClass01K A06;
    public final C014508d A07;
    public final C04490Ko A08;
    public final C02550Cn A09;
    public final AnonymousClass0FZ A0A;
    public final C04500Kp A0B;
    public final AnonymousClass00T A0C;

    public AnonymousClass0KZ(AnonymousClass00S r1, C04350Ka r2, AnonymousClass00T r3, C04360Kb r4, C02550Cn r5, AnonymousClass01K r6, AnonymousClass0FZ r7, C04490Ko r8, AnonymousClass00D r9, C014508d r10, AnonymousClass04j r11, C04500Kp r12) {
        this.A04 = r1;
        this.A01 = r2;
        this.A0C = r3;
        this.A02 = r4;
        this.A09 = r5;
        this.A06 = r6;
        this.A0A = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A07 = r10;
        this.A03 = r11;
        this.A0B = r12;
    }

    public static AnonymousClass0KZ A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0KZ.class) {
                if (A0D == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C04350Ka A003 = C04350Ka.A00();
                    AnonymousClass00T A004 = C002101e.A00();
                    C04360Kb A005 = C04360Kb.A00();
                    C02550Cn A012 = C02550Cn.A01();
                    AnonymousClass01K A006 = AnonymousClass01K.A00();
                    AnonymousClass0FZ A007 = AnonymousClass0FZ.A00();
                    C04490Ko A008 = C04490Ko.A00();
                    AnonymousClass00D A009 = AnonymousClass00D.A00();
                    C014508d A0010 = C014508d.A00();
                    AnonymousClass04j A0011 = AnonymousClass04j.A00();
                    if (C04500Kp.A04 == null) {
                        synchronized (C04500Kp.class) {
                            if (C04500Kp.A04 == null) {
                                C04500Kp.A04 = new C04500Kp(AnonymousClass00G.A01, AnonymousClass01X.A00(), AnonymousClass03C.A00());
                            }
                        }
                    }
                    A0D = new AnonymousClass0KZ(A002, A003, A004, A005, A012, A006, A007, A008, A009, A0010, A0011, C04500Kp.A04);
                }
            }
        }
        return A0D;
    }

    public void A01() {
        Log.d("app/sendunsent");
        C11130fl r0 = this.A00;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C11130fl r2 = new C11130fl(this);
        this.A00 = r2;
        this.A0C.ANC(r2, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a5, code lost:
        if (r0 != false) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(X.AbstractC007503q r12) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0KZ.A02(X.03q):boolean");
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        C014508d r0 = this.A07;
        r0.A05();
        if (r0.A01) {
            Iterator it = this.A08.A02().iterator();
            while (it.hasNext()) {
                AbstractC007503q r9 = (AbstractC007503q) it.next();
                long A052 = this.A04.A05();
                long j = r9.A0E;
                if (10800000 + j < A052 && j + 86400000 >= A052 && A02(r9)) {
                    AnonymousClass00D r6 = this.A05;
                    if (r6.A00.getLong("last_unsent_notification_time", 0) + 86400000 < A052) {
                        Log.i("Posting notification about unsent messages");
                        AnonymousClass008.A0l(r6, "last_unsent_notification_time", A052);
                        C04500Kp r62 = this.A0B;
                        Application application = r62.A00.A00;
                        AnonymousClass01X r1 = r62.A02;
                        String A062 = r1.A06(R.string.messages_failed_notification_title);
                        String A063 = r1.A06(R.string.messages_failed_notification_message);
                        PendingIntent activity = PendingIntent.getActivity(application, 1, new Intent(application, HomeActivity.class), 0);
                        AnonymousClass03E A002 = AnonymousClass0BS.A00(application);
                        A002.A0J = "failure_notifications@1";
                        A002.A0B(A062);
                        A002.A07.when = System.currentTimeMillis();
                        A002.A04(3);
                        A002.A06(16, true);
                        A002.A0A(A062);
                        A002.A09(A063);
                        A002.A09 = activity;
                        A002.A07.icon = R.drawable.notifybar;
                        r62.A01.A03(null, 6, A002.A01());
                        r62.A03 = true;
                        return;
                    }
                    return;
                }
            }
        }
    }
}
