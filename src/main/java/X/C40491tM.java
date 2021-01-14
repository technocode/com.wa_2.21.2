package X;

import com.whatsapp.util.Log;

/* renamed from: X.1tM  reason: invalid class name and case insensitive filesystem */
public class C40491tM extends AnonymousClass1NN implements AnonymousClass1XV {
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass0A8 A03;
    public final AnonymousClass02U A04;
    public final AnonymousClass0AR A05;
    public final C02360Br A06;
    public final AnonymousClass0C4 A07;
    public final String A08;

    public C40491tM(AnonymousClass02M r1, AnonymousClass0C4 r2, AnonymousClass0AR r3, C000300f r4, C02360Br r5, AnonymousClass01X r6, AnonymousClass0A8 r7, AnonymousClass02U r8, String str) {
        this.A00 = r1;
        this.A07 = r2;
        this.A05 = r3;
        this.A01 = r4;
        this.A06 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A04 = r8;
        this.A08 = str;
    }

    @Override // X.AnonymousClass1NN
    public void A00() {
        if (!super.A00) {
            super.A01 = true;
            Log.w("web/web-action/setgroupdescription/timeout");
            AFY(0);
        }
    }

    @Override // X.AnonymousClass1XV
    public boolean ABc() {
        return super.A01;
    }

    @Override // X.AnonymousClass1XV
    public void AFY(int i) {
        super.A02.cancel();
        AnonymousClass02M r2 = this.A00;
        r2.A02.post(new RunnableEBaseShape1S0101000_I1(this, i, 6));
        AnonymousClass0C4 r0 = this.A07;
        String str = this.A08;
        r0.A0E(str, i);
        this.A06.A0E(str, i);
        this.A03.A07(this.A04, false);
    }

    @Override // X.AnonymousClass1XV
    public void AKf() {
        super.A02.cancel();
        AnonymousClass0C4 r0 = this.A07;
        String str = this.A08;
        r0.A0E(str, 200);
        this.A06.A0E(str, 200);
        this.A03.A07(this.A04, false);
    }
}
