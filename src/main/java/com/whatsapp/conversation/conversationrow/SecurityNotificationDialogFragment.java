package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00D;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass0M9;
import X.C002001d;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C02780Dk;
import com.whatsapp.base.WaDialogFragment;

public abstract class SecurityNotificationDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass01I A01 = AnonymousClass01I.A00();
    public final AnonymousClass01A A02 = AnonymousClass01A.A00();
    public final C014308b A03 = C014308b.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final C02590Cr A05 = C02590Cr.A00();
    public final AnonymousClass0M9 A06 = AnonymousClass0M9.A01();

    public SecurityNotificationDialogFragment() {
        AnonymousClass00D.A00();
    }

    public CharSequence A0x(int i, C007003k r6) {
        String A0E;
        AnonymousClass01X r3 = this.A04;
        Object[] objArr = new Object[1];
        String A08 = this.A03.A08(r6, false);
        if (A08 == null) {
            A0E = null;
        } else {
            A0E = r3.A0E(A08);
        }
        objArr[0] = A0E;
        return C002001d.A1J(String.format(r3.A0I(), r3.A06(i), objArr), A00(), this.A05);
    }
}
