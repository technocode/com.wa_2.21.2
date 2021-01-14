package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass0BB;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.DialogInterface$OnClickListenerC25501Hf;
import X.DialogInterface$OnClickListenerC25511Hg;
import X.DialogInterface$OnClickListenerC25521Hh;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class ChatMediaVisibilityDialog extends WaDialogFragment {
    public int A00;
    public int A01;
    public AnonymousClass02N A02;
    public boolean A03;
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass0BB A05 = AnonymousClass0BB.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r2 == 2) goto L_0x0033;
     */
    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(android.os.Bundle r5) {
        /*
            r4 = this;
            super.A0i(r5)
            android.os.Bundle r1 = r4.A06
            if (r1 == 0) goto L_0x0043
            java.lang.String r0 = "chatJid"
            java.lang.String r0 = r1.getString(r0)
            X.02N r2 = X.AnonymousClass02N.A01(r0)
            java.lang.String r0 = "Chat jid must be passed to "
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            java.lang.String r0 = "ChatMediaVisibilityDialog"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00E.A04(r2, r0)
            r4.A02 = r2
            X.0BB r3 = r4.A05
            X.0BG r0 = r3.A05()
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0033
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r4.A03 = r0
            X.02N r0 = r4.A02
            X.0BG r0 = r3.A08(r0)
            int r0 = r0.A00
            r4.A00 = r0
            r4.A01 = r0
            return
        L_0x0043:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatMediaVisibilityDialog.A0i(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        AnonymousClass01X r5 = this.A04;
        boolean z = this.A03;
        int i = R.string.default_media_visibility_off;
        if (z) {
            i = R.string.default_media_visibility_on;
        }
        int i2 = 0;
        charSequenceArr[0] = r5.A06(i);
        charSequenceArr[1] = r5.A06(R.string.yes);
        charSequenceArr[2] = r5.A06(R.string.no);
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            TextView textView = (TextView) A0A.getLayoutInflater().inflate(R.layout.custom_dialog_title, (ViewGroup) null);
            textView.setText(r5.A06(R.string.chat_media_visibility_inquiry));
            AnonymousClass0MB r2 = new AnonymousClass0MB(A0A);
            AnonymousClass0MC r1 = r2.A01;
            r1.A0B = textView;
            DialogInterface$OnClickListenerC25521Hh r0 = new DialogInterface$OnClickListenerC25521Hh(this);
            r1.A0M = charSequenceArr;
            r1.A05 = r0;
            r1.A00 = i2;
            r1.A0L = true;
            r2.A07(r5.A06(R.string.ok), new DialogInterface$OnClickListenerC25501Hf(this));
            r2.A05(r5.A06(R.string.cancel), new DialogInterface$OnClickListenerC25511Hg(this));
            return r2.A00();
        }
        throw null;
    }
}
