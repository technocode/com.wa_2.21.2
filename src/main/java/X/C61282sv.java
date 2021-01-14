package X;

import android.content.Context;

/* renamed from: X.2sv  reason: invalid class name and case insensitive filesystem */
public class C61282sv {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final C60862s7 A05;
    public final AnonymousClass0GP A06;
    public final C03340Fu A07;
    public final C01970Ad A08;
    public final C63842x6 A09;
    public final String A0A;

    public C61282sv(AnonymousClass00S r1, Context context, AnonymousClass02M r3, AnonymousClass01I r4, C63842x6 r5, C01970Ad r6, AnonymousClass04j r7, C03340Fu r8, C60862s7 r9, AnonymousClass0GP r10, String str) {
        this.A04 = r1;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r5;
        this.A08 = r6;
        this.A03 = r7;
        this.A07 = r8;
        this.A05 = r9;
        this.A06 = r10;
        this.A0A = str;
    }

    public void A00(AbstractC61272su r22) {
        C01970Ad r7 = this.A08;
        r7.A04();
        C018709t r1 = r7.A06;
        String str = this.A0A;
        AnonymousClass1VM A082 = r1.A08(str);
        if (A082 != null) {
            C43761yu r12 = (C43761yu) A082;
            C74723bO r2 = (C74723bO) r12.A06;
            if (r2 == null || !r2.A07) {
                this.A07.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "br-get-verification-methods", null, (byte) 0), new AnonymousClass0OS("device-id", this.A09.A02(), null, (byte) 0), new AnonymousClass0OS("credential-id", str, null, (byte) 0)}, null, null), new AnonymousClass3XZ(this.A00, this.A01, this.A03, this.A06, r22), 0);
                return;
            }
            new C61232sq(this.A04, this.A00, this.A01, this.A02, r7, this.A09, this.A03, this.A07, this.A05, this.A06, new C68583Dt(this, r22)).A00(r12);
            return;
        }
        throw null;
    }
}
