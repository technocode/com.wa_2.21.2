package com.whatsapp.backup.google;

import X.AbstractC005802u;
import android.content.Context;
import com.whatsapp.base.WaDialogFragment;

public class PromptDialogFragment extends WaDialogFragment {
    public AbstractC005802u A00;

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A00 = (AbstractC005802u) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement PromptDialogClickListener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r3.getBoolean("cancelable") != false) goto L_0x0083;
     */
    @Override // androidx.fragment.app.DialogFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A0p(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.PromptDialogFragment.A0p(android.os.Bundle):android.app.Dialog");
    }
}
