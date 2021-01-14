package com.whatsapp.payments.ui;

import X.AnonymousClass008;
import X.AnonymousClass037;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0QC;
import X.AnonymousClass3H5;
import X.C018809u;
import X.View$OnTouchListenerC62812vO;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class PaymentBottomSheet extends WaDialogFragment {
    public DialogInterface.OnDismissListener A00;
    public AnonymousClass037 A01;
    public C018809u A02 = C018809u.A00("PaymentBottomSheet", "payment", "COMMON");

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.payment_bottom_sheet, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        BottomSheetBehavior A002 = BottomSheetBehavior.A00(view.findViewById(R.id.bottom_sheet));
        A002.A0C(0);
        A002.A0D(3);
        A002.A0E = new AnonymousClass3H5(this);
        view.findViewById(R.id.dismiss_space).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 23));
        view.findViewById(R.id.fragment_container).setOnTouchListener(View$OnTouchListenerC62812vO.A00);
        AnonymousClass0LW A0C = A0C();
        if (A0C != null) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(A0C);
            r2.A05(R.id.fragment_container, this.A01);
            r2.A08(null);
            r2.A00();
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        RelativeLayout relativeLayout = new RelativeLayout(A0A());
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Dialog dialog = new Dialog(A01());
        dialog.requestWindowFeature(1);
        dialog.setContentView(relativeLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.getAttributes().windowAnimations = R.style.BottomSheetDialogFragmentAnimation;
        }
        return dialog;
    }

    public void A0x(AnonymousClass037 r5) {
        C018809u r2 = this.A02;
        StringBuilder A0S = AnonymousClass008.A0S("navigate-to fragment=");
        A0S.append(r5.getClass().getName());
        r2.A03(A0S.toString());
        AnonymousClass0LW A0C = A0C();
        if (A0C != null) {
            AnonymousClass0QB r22 = new AnonymousClass0QB(A0C);
            ((AnonymousClass0QC) r22).A02 = 17432576;
            r22.A03 = 17432577;
            r22.A04 = 17432576;
            r22.A05 = 17432577;
            r22.A03((AnonymousClass037) A0C().A0Q.A04().get(0));
            r22.A06(R.id.fragment_container, r5, null);
            r22.A08(null);
            r22.A00();
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
