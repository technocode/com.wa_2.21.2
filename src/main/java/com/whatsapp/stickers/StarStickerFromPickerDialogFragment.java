package com.whatsapp.stickers;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0B3;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass33B;
import X.C002101e;
import X.C03570Gt;
import X.C29241Xq;
import X.DialogInterface$OnClickListenerC661032w;
import X.DialogInterface$OnShowListenerC660932v;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;

public class StarStickerFromPickerDialogFragment extends WaDialogFragment {
    public AnonymousClass33B A00;
    public C29241Xq A01;
    public final AnonymousClass0B3 A02 = AnonymousClass0B3.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final C03570Gt A04 = C03570Gt.A00();
    public final AnonymousClass00T A05 = C002101e.A00();

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A00 = (AnonymousClass33B) context;
        } catch (ClassCastException unused) {
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ActivityC004902h A0A = A0A();
        if (A0A != null) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                C29241Xq r0 = (C29241Xq) bundle2.getParcelable("sticker");
                if (r0 != null) {
                    this.A01 = r0;
                    AnonymousClass0MB r4 = new AnonymousClass0MB(A0A);
                    AnonymousClass01X r3 = this.A03;
                    r4.A01.A0E = r3.A06(R.string.sticker_save_to_picker_title);
                    String A06 = r3.A06(R.string.sticker_save_to_picker);
                    r4.A07(A06, new DialogInterface$OnClickListenerC661032w(this));
                    AnonymousClass0MD A032 = AnonymousClass008.A03(r3, R.string.cancel, r4);
                    A032.setOnShowListener(new DialogInterface$OnShowListenerC660932v(A032, A06));
                    return A032;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
