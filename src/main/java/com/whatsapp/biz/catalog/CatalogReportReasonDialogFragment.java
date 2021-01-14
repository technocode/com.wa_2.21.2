package com.whatsapp.biz.catalog;

import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.AnonymousClass1S5;
import X.DialogInterface$OnClickListenerC27791Rk;
import X.DialogInterface$OnShowListenerC27801Rl;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class CatalogReportReasonDialogFragment extends WaDialogFragment {
    public int A00 = -1;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass1S5[] A03 = {new AnonymousClass1S5("no-match", R.string.catalog_product_report_reason_no_match), new AnonymousClass1S5("spam", R.string.catalog_product_report_reason_spam), new AnonymousClass1S5("illegal", R.string.catalog_product_report_reason_illegal), new AnonymousClass1S5("scam", R.string.catalog_product_report_reason_scam), new AnonymousClass1S5("knockoff", R.string.catalog_product_report_reason_knockoff), new AnonymousClass1S5("other", R.string.catalog_product_report_reason_other)};

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(A01());
        AnonymousClass1S5[] r6 = this.A03;
        int length = r6.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            charSequenceArr[i] = this.A02.A06(r6[i].A00);
        }
        int i2 = this.A00;
        DialogInterface$OnClickListenerC27791Rk r0 = new DialogInterface$OnClickListenerC27791Rk(this);
        AnonymousClass0MC r2 = r3.A01;
        r2.A0M = charSequenceArr;
        r2.A05 = r0;
        r2.A00 = i2;
        r2.A0L = true;
        AnonymousClass01X r1 = this.A02;
        r2.A0I = r1.A06(R.string.catalog_product_report_details_title);
        r3.A07(r1.A06(R.string.submit), null);
        AnonymousClass0MD A002 = r3.A00();
        A002.setOnShowListener(new DialogInterface$OnShowListenerC27801Rl(this));
        return A002;
    }
}
