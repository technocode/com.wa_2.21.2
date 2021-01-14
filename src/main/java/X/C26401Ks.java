package X;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Ks  reason: invalid class name and case insensitive filesystem */
public class C26401Ks {
    public static volatile C26401Ks A06;
    public C39481rb A00;
    public final C04090Iz A01;
    public final C26491Ld A02;
    public final C000300f A03;
    public final AnonymousClass00C A04;
    public final AnonymousClass00T A05;

    public C26401Ks(AnonymousClass00T r1, C26491Ld r2, C000300f r3, C04090Iz r4, AnonymousClass00C r5) {
        this.A05 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public static C26401Ks A00() {
        if (A06 == null) {
            synchronized (C26401Ks.class) {
                if (A06 == null) {
                    A06 = new C26401Ks(C002101e.A00(), C26491Ld.A00(), C000300f.A00(), C04090Iz.A01, AnonymousClass00C.A00());
                }
            }
        }
        return A06;
    }

    public void A01(ActivityC004702f r18, String str, String str2, String str3, String str4, ArrayList arrayList, List list, String str5, boolean z) {
        C39481rb r0 = this.A00;
        if (r0 != null && ((AnonymousClass0JW) r0).A00.getStatus() == AsyncTask.Status.RUNNING) {
            ((AnonymousClass0JW) this.A00).A00.cancel(false);
        }
        C39481rb r3 = new C39481rb(this.A01, this.A04, new C39461rZ(this, str2, arrayList, str3, r18), str, str4, list, str5, z);
        this.A00 = r3;
        this.A05.ANC(r3, new Void[0]);
    }
}
