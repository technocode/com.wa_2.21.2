package X;

import android.content.DialogInterface;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;

/* renamed from: X.1Ri  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27771Ri implements DialogInterface.OnClickListener {
    public final /* synthetic */ CatalogReportDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC27771Ri(CatalogReportDialogFragment catalogReportDialogFragment) {
        this.A00 = catalogReportDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CatalogReportDialogFragment catalogReportDialogFragment = this.A00;
        CatalogReportReasonDialogFragment catalogReportReasonDialogFragment = new CatalogReportReasonDialogFragment();
        AnonymousClass0LW r0 = catalogReportDialogFragment.A0H;
        if (r0 != null) {
            AnonymousClass0QB r3 = new AnonymousClass0QB(r0);
            r3.A0A(0, catalogReportReasonDialogFragment, "report reason", 1);
            r3.A00();
        }
        catalogReportDialogFragment.A0r();
    }
}
