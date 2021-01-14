package com.whatsapp.biz.catalog;

import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC27761Rh;
import X.DialogInterface$OnClickListenerC27771Ri;
import X.DialogInterface$OnClickListenerC27781Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class CatalogReportDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r2 = new AnonymousClass0MB(A01());
        AnonymousClass01X r3 = this.A00;
        String A06 = r3.A06(R.string.catalog_product_report_dialog_title);
        AnonymousClass0MC r1 = r2.A01;
        r1.A0I = A06;
        r1.A0E = r3.A06(R.string.catalog_product_report_content);
        r2.A06(r3.A06(R.string.catalog_product_report_title), new DialogInterface$OnClickListenerC27781Rj(this));
        r2.A07(r3.A06(R.string.catalog_product_report_details_title), new DialogInterface$OnClickListenerC27771Ri(this));
        r2.A05(r3.A06(R.string.cancel), new DialogInterface$OnClickListenerC27761Rh(this));
        return r2.A00();
    }
}
