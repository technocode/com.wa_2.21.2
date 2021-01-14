package X;

import android.text.TextUtils;

/* renamed from: X.0Ai  reason: invalid class name and case insensitive filesystem */
public class C02020Ai {
    public static volatile C02020Ai A06;
    public AbstractC05890Qx A00;
    public C05870Qv A01;
    public boolean A02;
    public final AnonymousClass00D A03;
    public final C02030Aj A04;
    public final C018809u A05 = C018809u.A00("PaymentsCountryManager", "infra", "COMMON");

    public C02020Ai(AnonymousClass00D r4, C02030Aj r5) {
        this.A03 = r4;
        this.A04 = r5;
    }

    public static C02020Ai A00() {
        if (A06 == null) {
            synchronized (C02020Ai.class) {
                if (A06 == null) {
                    A06 = new C02020Ai(AnonymousClass00D.A00(), C02030Aj.A00);
                }
            }
        }
        return A06;
    }

    public synchronized AbstractC05890Qx A01() {
        if (!this.A02) {
            A03();
        }
        return this.A00;
    }

    public synchronized C05870Qv A02() {
        if (!this.A02) {
            A03();
        }
        return this.A01;
    }

    public final synchronized void A03() {
        C018809u r3 = this.A05;
        r3.A03("tryInitFromMock: no mockedCountry");
        AnonymousClass00D r0 = this.A03;
        String A0F = r0.A0F();
        String A0H = r0.A0H();
        if (TextUtils.isEmpty(A0H) || TextUtils.isEmpty(A0F)) {
            StringBuilder sb = new StringBuilder();
            sb.append("phoneNumber:");
            sb.append(A0H);
            sb.append(" countryCode:");
            sb.append(A0F);
            r3.A07(null, sb.toString(), null);
        } else {
            C05870Qv A012 = C05870Qv.A01(A0F);
            if (A012 == C05870Qv.A0F) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("not enabled with unsupported country code: ");
                sb2.append(A0F);
                r3.A03(sb2.toString());
                this.A01 = null;
                this.A00 = null;
            } else {
                String str = A012.A02;
                AbstractC05890Qx r4 = C05870Qv.A00(str).A09;
                if (r4 == C05880Qw.A02) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("not enabled; could not find default currency with country code: ");
                    sb3.append(str);
                    r3.A03(sb3.toString());
                    this.A01 = null;
                    this.A00 = null;
                } else {
                    this.A01 = A012;
                    this.A00 = r4;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("init enabled for country: ");
                    sb4.append(str);
                    sb4.append(" and default currency: ");
                    sb4.append(r4.A5e());
                    r3.A07(null, sb4.toString(), null);
                }
            }
            this.A02 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1.A0B == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A04() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A02     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0008
            r2.A03()     // Catch:{ all -> 0x0018 }
        L_0x0008:
            X.0Qv r1 = r2.A01     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0015
            X.0Qx r0 = r2.A00     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            boolean r1 = r1.A0B     // Catch:{ all -> 0x0018 }
            r0 = 1
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            monitor-exit(r2)
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02020Ai.A04():boolean");
    }
}
