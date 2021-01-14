package com.whatsapp;

import X.AnonymousClass01J;
import X.AnonymousClass01X;
import X.AnonymousClass09E;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1IC;
import X.AnonymousClass1ID;
import X.C26641Lu;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.AbstractCollection;

public class FirstStatusConfirmationDialogFragment extends WaDialogFragment {
    public TextView A00;
    public final AnonymousClass01J A01 = AnonymousClass01J.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass09E A03 = AnonymousClass09E.A00();

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 0) {
            this.A00.setText(A0x());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        View inflate = A0A().getLayoutInflater().inflate(R.layout.first_status_confirmation, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        this.A00 = textView;
        textView.setText(A0x());
        this.A00.setMovementMethod(LinkMovementMethod.getInstance());
        AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
        AnonymousClass0MC r1 = r3.A01;
        r1.A0C = inflate;
        r1.A01 = 0;
        r1.A0J = true;
        AnonymousClass01X r2 = this.A02;
        r3.A07(r2.A06(R.string.send), new AnonymousClass1IC(this));
        r3.A05(r2.A06(R.string.cancel), new AnonymousClass1ID(this));
        return r3.A00();
    }

    public final Spanned A0x() {
        AnonymousClass01X r6;
        String A06;
        AnonymousClass09E r3 = this.A03;
        int A04 = r3.A04();
        if (A04 == 0) {
            r6 = this.A02;
            A06 = r6.A06(R.string.first_status_all_contacts);
        } else if (A04 == 1) {
            int size = ((AbstractCollection) r3.A0A()).size();
            r6 = this.A02;
            A06 = r6.A0A(R.plurals.first_status_selected_contacts, (long) size, Integer.valueOf(size));
        } else if (A04 == 2) {
            int size2 = ((AbstractCollection) r3.A09()).size();
            if (size2 == 0) {
                r6 = this.A02;
                A06 = r6.A06(R.string.first_status_all_contacts);
            } else {
                r6 = this.A02;
                A06 = r6.A0A(R.plurals.first_status_excluded_contacts, (long) size2, Integer.valueOf(size2));
            }
        } else {
            throw new IllegalStateException("unknown status distribution mode");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A06);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(r6.A06(R.string.change_privacy_settings));
        spannableStringBuilder2.setSpan(new C26641Lu(this), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        return spannableStringBuilder;
    }
}
