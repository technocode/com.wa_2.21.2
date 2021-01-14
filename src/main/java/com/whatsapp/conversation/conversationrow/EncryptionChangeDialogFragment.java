package com.whatsapp.conversation.conversationrow;

import X.AbstractC000400g;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01P;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1VY;
import X.C000300f;
import X.C002001d;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C02780Dk;
import X.DialogInterface$OnClickListenerC47402Hs;
import X.DialogInterface$OnClickListenerC47412Ht;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class EncryptionChangeDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final C000300f A01 = C000300f.A00();
    public final AnonymousClass01A A02 = AnonymousClass01A.A00();
    public final C014308b A03 = C014308b.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass01P A05 = AnonymousClass01P.A00();
    public final C02590Cr A06 = C02590Cr.A00();
    public final AnonymousClass0M9 A07 = AnonymousClass0M9.A01();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        boolean z;
        String A0F;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string = bundle2.getString("jid");
            boolean z2 = false;
            int i = bundle2.getInt("provider_category", 0);
            AnonymousClass02N A012 = AnonymousClass02N.A01(string);
            StringBuilder sb = new StringBuilder("Invalid jid=");
            sb.append(string);
            AnonymousClass00E.A04(A012, sb.toString());
            AnonymousClass01A r0 = this.A02;
            C007003k A0A = r0.A0A(A012);
            if (i != 0) {
                Context A013 = A01();
                String A08 = this.A03.A08(r0.A0A(A012), true);
                switch (i) {
                    case 1:
                    case 4:
                        A0F = A013.getString(R.string.blue_alert_bsp_premise, A08);
                        break;
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        if (!AnonymousClass1VY.A0W(A012)) {
                            A0F = A013.getString(R.string.blue_alert_self_fb_or_fb_and_other_verified, A08);
                            break;
                        } else {
                            A0F = A013.getString(R.string.contact_info_security_modal_company_number, A08);
                            break;
                        }
                    default:
                        A0F = A013.getString(R.string.encryption_description);
                        break;
                }
            } else if (A0A.A09()) {
                boolean z3 = A0A.A0S;
                int i2 = R.string.encryption_description;
                if (z3) {
                    i2 = R.string.contact_info_security_modal_in_app_support;
                }
                A0F = A0F(i2);
            } else {
                UserJid of = UserJid.of(A012);
                if (of == null || !A0A.A08()) {
                    z = false;
                } else {
                    z = this.A05.A02(of);
                }
                if (AnonymousClass1VY.A0W(A012)) {
                    A0F = A0F(R.string.wa_enterprise_encryption_state_change_description);
                } else if (!z || this.A01.A0D(AbstractC000400g.A0a)) {
                    A0F = A0F(R.string.encryption_description);
                } else {
                    A0F = A02().getString(R.string.enterprise_encryption_state_change_description, this.A03.A08(A0A, false));
                }
                z2 = z;
            }
            AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
            CharSequence A1J = C002001d.A1J(A0F, A0A(), this.A06);
            AnonymousClass0MC r02 = r2.A01;
            r02.A0E = A1J;
            r02.A0J = true;
            r2.A06(A0F(R.string.learn_more), new DialogInterface$OnClickListenerC47402Hs(this, i, z2, A0A));
            r2.A05(A0F(R.string.ok), new DialogInterface$OnClickListenerC47412Ht(this));
            return r2.A00();
        }
        throw null;
    }
}
