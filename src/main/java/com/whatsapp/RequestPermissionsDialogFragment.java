package com.whatsapp;

import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0IY;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

public final class RequestPermissionsDialogFragment extends WaDialogFragment {
    public final AnonymousClass0IY A00 = AnonymousClass0IY.A00();
    public final AnonymousClass00D A01 = AnonymousClass00D.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, com.whatsapp.base.WaDialogFragment, androidx.fragment.app.DialogFragment
    public void A0f() {
        super.A0f();
        Window window = ((DialogFragment) this).A03.getWindow();
        if (window != null) {
            window.setLayout(A02().getDisplayMetrics().widthPixels, A02().getDisplayMetrics().heightPixels);
            return;
        }
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String str;
        int i;
        String str2;
        Dialog dialog = new Dialog(A0A());
        dialog.requestWindowFeature(1);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.setContentView(R.layout.permissions_request);
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            int[] intArray = bundle2.getIntArray("drawables");
            if (intArray != null) {
                if (intArray.length == 1) {
                    ((ImageView) dialog.findViewById(R.id.permission_image_1)).setImageResource(intArray[0]);
                    dialog.findViewById(R.id.permission_image).setVisibility(8);
                    dialog.findViewById(R.id.permission_image_2).setVisibility(8);
                } else {
                    ((ImageView) dialog.findViewById(R.id.permission_image)).setImageResource(intArray[0]);
                    ((ImageView) dialog.findViewById(R.id.permission_image_1)).setImageResource(intArray[1]);
                    ((ImageView) dialog.findViewById(R.id.permission_image_2)).setImageResource(intArray[2]);
                    dialog.findViewById(R.id.permission_image).setVisibility(0);
                    dialog.findViewById(R.id.permission_image_2).setVisibility(0);
                }
            }
            dialog.findViewById(R.id.cancel).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 11));
            String[] stringArray = bundle2.getStringArray("permissions");
            if (stringArray == null) {
                Log.e("permissions/dialog/fragment/no permissions provided");
                return dialog;
            }
            TextView textView = (TextView) dialog.findViewById(R.id.submit);
            boolean A0M = RequestPermissionActivity.A0M(A0A(), stringArray);
            TextView textView2 = (TextView) dialog.findViewById(R.id.permission_message);
            AnonymousClass01X r4 = this.A02;
            boolean z = this.A00.A00;
            Bundle bundle3 = ((AnonymousClass037) this).A06;
            if (A0M) {
                if (z) {
                    str2 = "locked_msg_id";
                } else {
                    str2 = "msg_id";
                }
                i = bundle3.getInt(str2);
            } else {
                if (z) {
                    str = "locked_perm_denial_msg_id";
                } else {
                    str = "perm_denial_msg_id";
                }
                i = bundle3.getInt(str);
            }
            textView2.setText(r4.A06(i));
            if (A0M) {
                textView.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, stringArray, 2));
                return dialog;
            }
            textView.setText(r4.A06(R.string.permission_settings_open));
            textView.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 12));
            return dialog;
        }
        throw null;
    }
}
