package X;

import android.content.DialogInterface;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.1Rj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC27781Rj implements DialogInterface.OnClickListener {
    public final /* synthetic */ CatalogReportDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC27781Rj(CatalogReportDialogFragment catalogReportDialogFragment) {
        this.A00 = catalogReportDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CatalogReportDialogFragment catalogReportDialogFragment = this.A00;
        ((ProductDetailActivity) catalogReportDialogFragment.A0B()).A0W(null);
        catalogReportDialogFragment.A0r();
    }
}
