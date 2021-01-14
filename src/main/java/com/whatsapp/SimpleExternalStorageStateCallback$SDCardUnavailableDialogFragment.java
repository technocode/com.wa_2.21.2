package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1JS;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment extends WaDialogFragment {
    public final AnonymousClass00C A00 = AnonymousClass00C.A00();
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
        boolean A012 = AnonymousClass00C.A01();
        AnonymousClass01X r2 = this.A01;
        int i = R.string.record_need_sd_card_title_shared_storage;
        if (A012) {
            i = R.string.record_need_sd_card_title;
        }
        String A06 = r2.A06(i);
        AnonymousClass0MC r1 = r4.A01;
        r1.A0I = A06;
        int i2 = R.string.record_need_sd_card_message_shared_storage;
        if (A012) {
            i2 = R.string.record_need_sd_card_message;
        }
        r1.A0E = r2.A06(i2);
        r4.A07(r2.A06(R.string.ok), AnonymousClass1JS.A00);
        return r4.A00();
    }
}
