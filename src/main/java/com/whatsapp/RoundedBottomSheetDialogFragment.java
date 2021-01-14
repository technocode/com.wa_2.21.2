package com.whatsapp;

import X.AnonymousClass1J1;
import X.C001901c;
import X.DialogC458926w;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public abstract class RoundedBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public final C001901c A00 = C001901c.A00();

    @Override // X.AnonymousClass037
    public void A0T(boolean z) {
        super.A0T(z);
        if (z) {
            this.A00.A03(this, "visible");
        } else {
            this.A00.A03(this, "invisible");
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        DialogC458926w r1 = new DialogC458926w(A00(), A0n());
        r1.setOnShowListener(new AnonymousClass1J1(this, r1));
        return r1;
    }

    public int A0x() {
        Point point = new Point();
        A0B().getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        A0B().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return point.y - rect.top;
    }

    public void A0y(View view) {
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view);
        A002.A0D(3);
        A002.A0N = true;
        A002.A0C(view.getHeight());
    }
}
