package X;

import android.app.Activity;

/* renamed from: X.3DV  reason: invalid class name */
public class AnonymousClass3DV implements AbstractC61042sP {
    public final AnonymousClass02M A00;
    public final AnonymousClass04j A01;
    public final AnonymousClass00G A02;
    public final C018609s A03;
    public final C449222e A04;
    public final C60922sD A05;
    public final AnonymousClass0GP A06;
    public final C03340Fu A07;
    public final C01970Ad A08;
    public final C63842x6 A09;
    public final AnonymousClass00T A0A;

    @Override // X.AbstractC61042sP
    public long A8H() {
        return 604800000;
    }

    public AnonymousClass3DV(AnonymousClass02M r1, AnonymousClass00G r2, AnonymousClass00T r3, C63842x6 r4, C01970Ad r5, AnonymousClass04j r6, C60922sD r7, C03340Fu r8, C018609s r9, C449222e r10, AnonymousClass0GP r11) {
        this.A00 = r1;
        this.A02 = r2;
        this.A0A = r3;
        this.A09 = r4;
        this.A08 = r5;
        this.A01 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A03 = r9;
        this.A04 = r10;
        this.A06 = r11;
    }

    @Override // X.AbstractC61042sP
    public void AMS(AnonymousClass0MH r4, AbstractC61022sN r5, Activity activity) {
        this.A0A.ANC(new C10190eE(this, r4, r5, activity), new Void[0]);
    }

    @Override // X.AbstractC61042sP
    public void AR2(String str, AbstractC61032sO r12) {
        new AnonymousClass3EF(this.A02.A00, this.A00, this.A09, this.A01, this.A05, this.A07, this.A04, this.A06).A00(str, null, r12);
    }
}
