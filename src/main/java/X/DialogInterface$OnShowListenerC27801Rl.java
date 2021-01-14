package X;

import android.content.DialogInterface;
import com.whatsapp.biz.catalog.CatalogReportReasonDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

/* renamed from: X.1Rl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnShowListenerC27801Rl implements DialogInterface.OnShowListener {
    public final /* synthetic */ CatalogReportReasonDialogFragment A00;

    public /* synthetic */ DialogInterface$OnShowListenerC27801Rl(CatalogReportReasonDialogFragment catalogReportReasonDialogFragment) {
        this.A00 = catalogReportReasonDialogFragment;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ((AnonymousClass0MD) dialogInterface).A02(-1).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this.A00, 34));
    }
}
