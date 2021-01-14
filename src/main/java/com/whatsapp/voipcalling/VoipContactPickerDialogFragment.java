package com.whatsapp.voipcalling;

import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;

public class VoipContactPickerDialogFragment extends WaDialogFragment {
    public final ContactPickerFragment A00 = new ContactPickerFragment();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.voip_contact_picker_dialog_fragment, viewGroup, false);
        AnonymousClass0LW A0C = A0C();
        if (A0C != null) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(A0C);
            r2.A05(R.id.fragment_container, this.A00);
            r2.A04();
            return inflate;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004d, code lost:
        if (r1 == false) goto L_0x004f;
     */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0e() {
        /*
            r5 = this;
            r0 = 1
            r5.A0U = r0
            android.app.Dialog r1 = r5.A03
            if (r1 == 0) goto L_0x0059
            X.38a r0 = new X.38a
            r0.<init>(r5)
            r1.setOnKeyListener(r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x0059
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0059
            android.app.Dialog r0 = r5.A03
            android.view.Window r2 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r1 = r0.getContext()
            r0 = 2131100423(0x7f060307, float:1.7813227E38)
            int r0 = X.C004302a.A00(r1, r0)
            r2.setStatusBarColor(r0)
            android.app.Dialog r0 = r5.A03
            android.view.Window r4 = r0.getWindow()
            android.app.Dialog r0 = r5.A03
            android.content.Context r3 = r0.getContext()
            android.os.Bundle r2 = r5.A06
            if (r2 == 0) goto L_0x004f
            r1 = 0
            java.lang.String r0 = "is_video_call"
            boolean r1 = r2.getBoolean(r0, r1)
            r0 = 2131100331(0x7f0602ab, float:1.781304E38)
            if (r1 != 0) goto L_0x0052
        L_0x004f:
            r0 = 2131100675(0x7f060403, float:1.7813738E38)
        L_0x0052:
            int r0 = X.C004302a.A00(r3, r0)
            r4.setNavigationBarColor(r0)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipContactPickerDialogFragment.A0e():void");
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(0, R.style.VoipContactPickerDialogFragment);
    }
}
