package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;

/* renamed from: X.2JE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JE implements DialogInterface.OnShowListener {
    public static final /* synthetic */ AnonymousClass2JE A00 = new AnonymousClass2JE();

    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
            A002.A0D(3);
            A002.A0C(findViewById.getHeight());
            return;
        }
        throw null;
    }
}
