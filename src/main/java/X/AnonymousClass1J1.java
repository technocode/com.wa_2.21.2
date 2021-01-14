package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;

/* renamed from: X.1J1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ RoundedBottomSheetDialogFragment A01;

    public /* synthetic */ AnonymousClass1J1(RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment, Dialog dialog) {
        this.A01 = roundedBottomSheetDialogFragment;
        this.A00 = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        RoundedBottomSheetDialogFragment roundedBottomSheetDialogFragment = this.A01;
        View findViewById = this.A00.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            roundedBottomSheetDialogFragment.A0y(findViewById);
            return;
        }
        throw null;
    }
}
