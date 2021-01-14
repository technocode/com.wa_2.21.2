package com.whatsapp.dialogs;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.C002001d;
import X.C02590Cr;
import X.C02780Dk;
import X.DialogInterface$OnClickListenerC48292Lq;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class FAQLearnMoreDialogFragment extends WaDialogFragment {
    public final C02780Dk A00 = C02780Dk.A02();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();
    public final C02590Cr A02 = C02590Cr.A00();
    public final AnonymousClass0M9 A03 = AnonymousClass0M9.A01();

    public static Dialog A00(Context context, C02590Cr r7, C02780Dk r8, AnonymousClass0M9 r9, AnonymousClass01X r10, String str, CharSequence charSequence, String str2, String str3) {
        DialogInterface$OnClickListenerC48292Lq r1 = new DialogInterface$OnClickListenerC48292Lq(r9, str, str3, r8, context);
        AnonymousClass0MB r3 = new AnonymousClass0MB(context);
        CharSequence A1J = C002001d.A1J(charSequence, context, r7);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0E = A1J;
        r2.A0J = true;
        r3.A06(r10.A06(R.string.learn_more), r1);
        r3.A05(r10.A06(R.string.ok), null);
        if (str2 != null) {
            r2.A0I = C002001d.A1J(str2, context, r7);
        }
        return r3.A00();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String string;
        String str;
        String str2;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            String string2 = bundle2.getString("faq_id");
            if (string2 != null) {
                if (((AnonymousClass037) this).A06.containsKey("message_string_res_id")) {
                    string = this.A01.A06(((AnonymousClass037) this).A06.getInt("message_string_res_id"));
                } else {
                    string = ((AnonymousClass037) this).A06.getString("message_text");
                    if (string == null) {
                        throw null;
                    }
                }
                if (((AnonymousClass037) this).A06.containsKey("title_string_res_id")) {
                    str = this.A01.A06(((AnonymousClass037) this).A06.getInt("title_string_res_id"));
                } else {
                    str = null;
                }
                if (((AnonymousClass037) this).A06.containsKey("faq_section_name")) {
                    str2 = ((AnonymousClass037) this).A06.getString("faq_section_name");
                } else {
                    str2 = null;
                }
                Context A002 = A00();
                if (A002 != null) {
                    return A00(A002, this.A02, this.A00, this.A03, this.A01, string2, string, str, str2);
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
