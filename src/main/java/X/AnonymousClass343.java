package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.storage.StorageUsageGallerySortBottomSheet;

/* renamed from: X.343  reason: invalid class name */
public final /* synthetic */ class AnonymousClass343 implements DialogInterface.OnShowListener {
    public final /* synthetic */ StorageUsageGallerySortBottomSheet A00;

    public /* synthetic */ AnonymousClass343(StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet) {
        this.A00 = storageUsageGallerySortBottomSheet;
    }

    public final void onShow(DialogInterface dialogInterface) {
        StorageUsageGallerySortBottomSheet storageUsageGallerySortBottomSheet = this.A00;
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
            A002.A0D(3);
            A002.A0E = new C71983Rb(storageUsageGallerySortBottomSheet);
        }
    }
}
