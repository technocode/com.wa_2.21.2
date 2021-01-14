package com.whatsapp;

import X.AbstractC000400g;
import X.AbstractC47272Hd;
import X.ActivityC004902h;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.C000300f;
import X.C002101e;
import X.C007003k;
import X.C014308b;
import X.C47282He;
import X.DialogInterface$OnClickListenerC25921Iv;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;

public class ReportSpamDialogFragment extends DialogFragment implements AbstractC47272Hd {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C000300f A01 = C000300f.A00();
    public final AnonymousClass01A A02 = AnonymousClass01A.A00();
    public final C014308b A03 = C014308b.A00();
    public final C47282He A04 = C47282He.A00();
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final AnonymousClass00T A06 = C002101e.A00();

    public static ReportSpamDialogFragment A00(AnonymousClass02N r4, String str) {
        ReportSpamDialogFragment reportSpamDialogFragment = new ReportSpamDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r4.getRawString());
        if (str != null) {
            bundle.putString("flow", str);
        }
        reportSpamDialogFragment.A0N(bundle);
        return reportSpamDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass01X r1;
        ActivityC004902h A0A = A0A();
        AnonymousClass02N A012 = AnonymousClass02N.A01(((AnonymousClass037) this).A06.getString("jid"));
        if (A012 != null) {
            String string = ((AnonymousClass037) this).A06.getString("flow");
            C007003k A0A2 = this.A02.A0A(A012);
            View inflate = LayoutInflater.from(A00()).inflate(R.layout.dialog_report_spam, (ViewGroup) null);
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.block_checkbox);
            checkBox.setChecked(true);
            DialogInterface$OnClickListenerC25921Iv r4 = new DialogInterface$OnClickListenerC25921Iv(this, A0A2, string, checkBox);
            TextView textView = (TextView) inflate.findViewById(R.id.block_checkbox_text);
            TextView textView2 = (TextView) inflate.findViewById(R.id.report_spam_dialog_message);
            if (A0A != null) {
                AnonymousClass0MB r2 = new AnonymousClass0MB(A0A);
                AnonymousClass0MC r10 = r2.A01;
                r10.A0C = inflate;
                r10.A01 = 0;
                if (A0A2.A09()) {
                    AnonymousClass01X r8 = this.A05;
                    r1 = r8;
                    r10.A0I = r8.A06(R.string.report_group_ask);
                    textView2.setText(r8.A06(R.string.reporting_flow_general_group));
                    textView.setText(r8.A06(R.string.report_exit_group_also));
                } else if (!this.A01.A0D(AbstractC000400g.A0q) || !A0A2.A08()) {
                    r1 = this.A05;
                    r10.A0I = r1.A06(R.string.report_contact_ask);
                    textView2.setText(r1.A06(R.string.reporting_flow_general_one_on_one));
                    textView.setText(r1.A06(R.string.report_block_also));
                } else {
                    r1 = this.A05;
                    r10.A0I = r1.A0D(R.string.report_business_ask, this.A03.A08(A0A2, false));
                    textView2.setText(r1.A06(R.string.reporting_flow_general_one_on_one_with_business));
                    textView.setText(r1.A06(R.string.report_block_business_also));
                }
                r2.A07(r1.A06(R.string.report_spam), r4);
                r2.A05(r1.A06(R.string.cancel), null);
                AnonymousClass0MD A002 = r2.A00();
                A002.setCanceledOnTouchOutside(true);
                return A002;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC47272Hd
    public void AGe(C007003k r4) {
        AnonymousClass02M r2 = this.A00;
        r2.A02();
        r2.A02.post(new RunnableEBaseShape6S0100000_I1_1(this, 28));
    }

    @Override // X.AbstractC47272Hd
    public void ALb(C007003k r4) {
        AnonymousClass02M r2 = this.A00;
        r2.A02();
        r2.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, r4, 10));
    }
}
