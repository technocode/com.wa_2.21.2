package X;

import android.app.Activity;

/* renamed from: X.2mp  reason: invalid class name and case insensitive filesystem */
public class C58962mp extends AnonymousClass2ZC {
    public final C000300f A00;
    public final C47262Hc A01;
    public final AnonymousClass01T A02;
    public final AbstractC49342Qc A03 = new C51482Yx(this);
    public final AnonymousClass0EZ A04;
    public final AnonymousClass02U A05;

    public C58962mp(ActivityC004802g r21, AnonymousClass02M r22, C002301g r23, AnonymousClass00T r24, C02590Cr r25, C000300f r26, AnonymousClass0HJ r27, C09050cD r28, C014308b r29, AnonymousClass01X r30, AnonymousClass1PN r31, AnonymousClass08B r32, AnonymousClass31y r33, AnonymousClass0EZ r34, AnonymousClass01T r35, AnonymousClass0HK r36, AnonymousClass0AQ r37, AnonymousClass02U r38, C007003k r39) {
        super(r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r36, r37, r38, r39);
        this.A04 = r34;
        this.A02 = r35;
        this.A05 = r38;
        this.A00 = r26;
        this.A01 = new C47262Hc(r24, r29, r38, new AnonymousClass2Z0(this));
    }

    @Override // X.AnonymousClass2ZC
    public void A00() {
        super.A00();
        this.A01.A00();
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.A0D.A00 <= 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r3 = this;
            X.00f r1 = r3.A00
            X.01l r0 = X.AbstractC000400g.A0t
            boolean r0 = r1.A0D(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0012
            X.03k r0 = r3.A0D
            int r0 = r0.A00
            r1 = 1
            if (r0 > 0) goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            com.whatsapp.WaImageView r0 = r3.A0B
            if (r1 != 0) goto L_0x0019
            r2 = 8
        L_0x0019:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58962mp.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r0 == false) goto L_0x0049;
     */
    @Override // X.AnonymousClass1PD, X.AnonymousClass2ZC
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onActivityCreated(r5, r6)
            X.03k r1 = r4.A0D
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x0038
            r2 = 2131890450(0x7f121112, float:1.9415592E38)
        L_0x000c:
            android.widget.TextView r1 = r4.A08
            X.01X r3 = r4.A0Q
            java.lang.String r0 = r3.A06(r2)
            r1.setText(r0)
            android.view.ViewGroup r2 = r4.A03
            r1 = 30
            com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0 r0 = new com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0
            r0.<init>(r4, r5, r1)
            r2.setOnClickListener(r0)
            android.view.ViewGroup r1 = r4.A03
            r0 = 2131886121(0x7f120029, float:1.9406812E38)
            X.C002001d.A2w(r3, r1, r0)
            r4.A02()
            X.0EZ r0 = r4.A04
            X.2Qc r1 = r4.A03
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            return
        L_0x0038:
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x0049
            X.01T r1 = r4.A02
            X.02U r0 = r4.A05
            boolean r0 = r1.A05(r0)
            r2 = 2131888298(0x7f1208aa, float:1.9411227E38)
            if (r0 != 0) goto L_0x000c
        L_0x0049:
            r2 = 2131889789(0x7f120e7d, float:1.9414251E38)
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58962mp.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // X.AnonymousClass1PD, X.AnonymousClass2ZC
    public void onActivityDestroyed(Activity activity) {
        super.onActivityDestroyed(activity);
        AnonymousClass0EZ r0 = this.A04;
        r0.A00.remove(this.A03);
        C47262Hc r1 = this.A01;
        C10750f8 r02 = r1.A00;
        if (r02 != null) {
            r02.A04();
            r1.A00 = null;
        }
    }
}
