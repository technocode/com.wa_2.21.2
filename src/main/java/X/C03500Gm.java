package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Gm  reason: invalid class name and case insensitive filesystem */
public class C03500Gm {
    public static volatile C03500Gm A0J;
    public AnonymousClass0M2 A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final C000300f A05;
    public final C017009c A06;
    public final AnonymousClass01A A07;
    public final C014308b A08;
    public final AnonymousClass00C A09;
    public final AnonymousClass00S A0A;
    public final AnonymousClass00G A0B;
    public final AnonymousClass03C A0C;
    public final AnonymousClass00D A0D;
    public final AnonymousClass01X A0E;
    public final AnonymousClass00Y A0F;
    public final AnonymousClass0CH A0G;
    public final C01970Ad A0H;
    public final AnonymousClass0AL A0I;

    public C03500Gm(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass009 r5, AnonymousClass01I r6, AnonymousClass088 r7, AnonymousClass00Y r8, C000300f r9, AnonymousClass01A r10, C014308b r11, AnonymousClass01X r12, AnonymousClass0AL r13, C01970Ad r14, AnonymousClass00C r15, AnonymousClass00D r16, AnonymousClass0CH r17, AnonymousClass03C r18, C017009c r19) {
        this.A0B = r2;
        this.A0A = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A02 = r7;
        this.A0F = r8;
        this.A05 = r9;
        this.A07 = r10;
        this.A08 = r11;
        this.A0E = r12;
        this.A0I = r13;
        this.A0H = r14;
        this.A09 = r15;
        this.A0D = r16;
        this.A0G = r17;
        this.A0C = r18;
        this.A06 = r19;
    }

    public static C03500Gm A00() {
        if (A0J == null) {
            synchronized (C03500Gm.class) {
                if (A0J == null) {
                    A0J = new C03500Gm(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass088.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0AL.A01(), C01970Ad.A00(), AnonymousClass00C.A00(), AnonymousClass00D.A00(), AnonymousClass0CH.A00(), AnonymousClass03C.A00(), C017009c.A00());
                }
            }
        }
        return A0J;
    }

    public static AnonymousClass0M2 A01(AnonymousClass00G r17, AnonymousClass009 r18, AnonymousClass01A r19, AnonymousClass01X r20, C017009c r21, AnonymousClass01I r22, C000300f r23, AnonymousClass0AL r24, C01970Ad r25, byte[] bArr) {
        try {
            C02840Dr A092 = C02840Dr.A09(bArr);
            return (AnonymousClass0M2) AnonymousClass0ZG.A06(r17, r18, r20, r19, r21, r22, r23, r24, r25, A092, AnonymousClass0ZG.A03(A092), null, new C007303n(AnonymousClass282.A00, false, ""), null, 0, false, false, false, 0);
        } catch (C04190Jk | C64122xf e) {
            Log.e("gdpr/create-gdpr-message", e);
            return null;
        }
    }

    public synchronized int A02() {
        return this.A0D.A00.getInt("gdpr_report_state", 0);
    }

    public synchronized long A03() {
        return this.A0D.A00.getLong("gdpr_report_timestamp", -1);
    }

    public AnonymousClass0M2 A04() {
        if (this.A00 == null) {
            AnonymousClass00G r3 = this.A0B;
            byte[] A0F2 = C007603r.A0F(new File(r3.A00.getFilesDir(), "gdpr.info"));
            if (A0F2 != null) {
                this.A00 = A01(r3, this.A01, this.A07, this.A0E, this.A06, this.A04, this.A05, this.A0I, this.A0H, A0F2);
            }
        }
        return this.A00;
    }

    public synchronized void A05() {
        Log.i("gdpr/on-report-deleted");
        A06();
    }

    public synchronized void A06() {
        Log.i("gdpr/reset");
        this.A00 = null;
        File file = new File(this.A0B.A00.getFilesDir(), "gdpr.info");
        if (file.exists() && !file.delete()) {
            Log.e("gdpr/reset/failed-delete-report-info");
        }
        C006803i.A0b(this.A02.A06(), 0);
        this.A0D.A0M();
    }

    public synchronized void A07(long j) {
        Log.i("gdpr/on-report-requested");
        AnonymousClass00D r2 = this.A0D;
        AnonymousClass008.A0k(r2, "gdpr_report_state", 1);
        r2.A00.edit().putLong("gdpr_report_timestamp", j).apply();
    }

    public synchronized void A08(long j, byte[] bArr, long j2) {
        Log.i("gdpr/on-report-available");
        try {
            AnonymousClass00G r3 = this.A0B;
            C007603r.A06(bArr, new File(r3.A00.getFilesDir(), "gdpr.info"));
            AnonymousClass0M2 A012 = A01(r3, this.A01, this.A07, this.A0E, this.A06, this.A04, this.A05, this.A0I, this.A0H, bArr);
            this.A00 = A012;
            if (A012 == null) {
                Log.e("gdpr/on-report-available/cannot-create-message");
                return;
            }
            AnonymousClass00D r32 = this.A0D;
            AnonymousClass008.A0k(r32, "gdpr_report_state", 2);
            SharedPreferences sharedPreferences = r32.A00;
            sharedPreferences.edit().putLong("gdpr_report_timestamp", j).apply();
            sharedPreferences.edit().putLong("gdpr_report_expiration_timestamp", j2).apply();
        } catch (IOException e) {
            Log.e("gdpr/on-report-available/cannot-save", e);
        }
    }
}
