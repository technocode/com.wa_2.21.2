package com.whatsapp.conversation;

import X.AbstractC03700Hh;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MD;
import X.DialogInterface$OnClickListenerC47212Gx;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public final class CapturePictureOrVideoDialogFragment extends WaDialogFragment {
    public static final int[] A02 = {R.string.take_picture, R.string.record_video};
    public AbstractC03700Hh A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A00 = (AbstractC03700Hh) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement CapturePictureOrVideoDialogClickListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        Context A002 = A00();
        if (A002 != null) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A002);
            String[] A0N = this.A01.A0N(A02);
            DialogInterface$OnClickListenerC47212Gx r1 = new DialogInterface$OnClickListenerC47212Gx(this);
            AnonymousClass0MC r0 = r3.A01;
            r0.A0M = A0N;
            r0.A05 = r1;
            AnonymousClass0MD A003 = r3.A00();
            A003.setCanceledOnTouchOutside(true);
            return A003;
        }
        throw null;
    }
}
