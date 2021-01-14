package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;

/* renamed from: X.2mn  reason: invalid class name and case insensitive filesystem */
public class C58942mn extends AnonymousClass2ZC {
    public final C000300f A00;
    public final C006903j A01;

    public C58942mn(ActivityC004802g r19, AnonymousClass02M r20, C002301g r21, AnonymousClass00T r22, C006903j r23, C02590Cr r24, C000300f r25, AnonymousClass0HJ r26, C09050cD r27, C014308b r28, AnonymousClass01X r29, AnonymousClass1PN r30, AnonymousClass08B r31, AnonymousClass31y r32, AnonymousClass0HK r33, AnonymousClass0AQ r34, AnonymousClass02N r35, C007003k r36) {
        super(r19, r20, r21, r22, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
        this.A01 = r23;
        this.A00 = r25;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        if (r4.A01.A02(r3) <= 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r4 = this;
            X.03k r1 = r4.A0D
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r3 = r1.A02(r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.00f r1 = r4.A00
            X.01l r0 = X.AbstractC000400g.A0t
            boolean r0 = r1.A0D(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0020
            if (r3 == 0) goto L_0x0020
            X.03j r0 = r4.A01
            int r0 = r0.A02(r3)
            r1 = 1
            if (r0 > 0) goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            com.whatsapp.WaImageView r0 = r4.A0B
            if (r1 != 0) goto L_0x0027
            r2 = 8
        L_0x0027:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58942mn.A02():void");
    }

    @Override // X.AnonymousClass1PD, X.AnonymousClass2ZC
    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        this.A03.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, activity, 28));
        C002001d.A2w(this.A0Q, this.A03, R.string.accessibility_action_click_conversation_title_for_contact_info);
        A02();
    }
}
