package X;

import android.view.View;

/* renamed from: X.35H  reason: invalid class name */
public final /* synthetic */ class AnonymousClass35H extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AbstractC007503q A01;
    public final /* synthetic */ C05440On A02;
    public final /* synthetic */ AnonymousClass0D9 A03;
    public final /* synthetic */ C02580Cq A04;
    public final /* synthetic */ AbstractC667235o A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass35H(C02580Cq r1, C05440On r2, AbstractC007503q r3, boolean z, Object obj, View view, AnonymousClass0D9 r7, AbstractC667235o r8, boolean z2) {
        this.A04 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A07 = z;
        this.A06 = obj;
        this.A00 = view;
        this.A03 = r7;
        this.A05 = r8;
        this.A08 = z2;
    }

    public final void run() {
        C02580Cq r2 = this.A04;
        C05440On r0 = this.A02;
        AbstractC007503q r8 = this.A01;
        boolean z = this.A07;
        Object obj = this.A06;
        View view = this.A00;
        AnonymousClass0D9 r6 = this.A03;
        AbstractC667235o r11 = this.A05;
        boolean z2 = this.A08;
        byte[] A082 = r0.A08();
        if (A082 == null || A082.length <= 0) {
            r2.A0E(new RunnableEBaseShape0S0400000_I0(obj, view, r6, r8, 11));
        } else {
            r2.A0E(new RunnableEBaseShape0S0500000_I0(obj, view, r6, r2.A05(r8, true, z, C02580Cq.A02(r8)), r8, 4));
        }
        r2.A05.A01(r8, view, r6, r11, obj, z2);
    }
}
