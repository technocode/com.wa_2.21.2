package com.whatsapp.payments.ui;

import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass3EF;
import X.C018809u;
import X.C03340Fu;
import X.C06170Sb;
import X.C449222e;
import X.C60922sD;
import X.C61122sX;
import X.C63842x6;
import X.C68393Da;
import X.C68453Dg;
import X.C69373Gu;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0700000_I1;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.components.Button;

public class IndiaUpiSendPaymentToVpaDialogFragment extends WaDialogFragment {
    public AnonymousClass3EF A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass04j A02 = AnonymousClass04j.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final C449222e A04 = C449222e.A00();
    public final C60922sD A05 = C60922sD.A00();
    public final C68393Da A06 = C68393Da.A00();
    public final C68453Dg A07 = C68453Dg.A00();
    public final AnonymousClass0GP A08 = AnonymousClass0GP.A00();
    public final C61122sX A09 = C61122sX.A00();
    public final C03340Fu A0A = C03340Fu.A00();
    public final C018809u A0B = C018809u.A00("IndiaUpiSendPaymentToVpaDialogFragment", "payment", "IN");
    public final C63842x6 A0C = C63842x6.A00();
    public final C06170Sb A0D = C06170Sb.A00();

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        Dialog dialog = ((DialogFragment) this).A03;
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        this.A00 = new AnonymousClass3EF(A00(), this.A01, this.A0C, this.A02, this.A05, this.A0A, this.A04, this.A08);
        View inflate = A0A().getLayoutInflater().inflate(R.layout.india_upi_enter_vpa_dialog, (ViewGroup) null, false);
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
        AnonymousClass0MC r1 = r4.A01;
        r1.A0J = true;
        EditText editText = (EditText) inflate.findViewById(R.id.account_id_handle);
        View findViewById = inflate.findViewById(R.id.progress);
        TextView textView = (TextView) inflate.findViewById(R.id.error_text);
        View findViewById2 = inflate.findViewById(R.id.close_dialog_button);
        Button button = (Button) inflate.findViewById(R.id.primary_payment_button);
        r1.A0C = inflate;
        r1.A01 = 0;
        AnonymousClass0MD A002 = r4.A00();
        if (A002.getWindow() != null) {
            A002.getWindow().setSoftInputMode(5);
        }
        A002.setCanceledOnTouchOutside(false);
        A002.show();
        button.setEnabled(false);
        button.setOnClickListener(new ViewOnClickEBaseShape0S0700000_I1(this, A002, textView, button, findViewById, inflate, editText, 1));
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(A002, 22));
        editText.addTextChangedListener(new C69373Gu(this, textView, button, editText));
        return A002;
    }
}
