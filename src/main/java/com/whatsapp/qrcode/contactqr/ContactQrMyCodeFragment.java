package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;

public class ContactQrMyCodeFragment extends WaFragment {
    public ContactQrContactCardView A00;
    public String A01;
    public final AnonymousClass01I A02 = AnonymousClass01I.A00();
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.contact_qr_my_code, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.contact_qr_card);
        if (findViewById != null) {
            ContactQrContactCardView contactQrContactCardView = (ContactQrContactCardView) findViewById;
            this.A00 = contactQrContactCardView;
            contactQrContactCardView.setStyle(0);
            ContactQrContactCardView contactQrContactCardView2 = this.A00;
            AnonymousClass01I r0 = this.A02;
            r0.A04();
            contactQrContactCardView2.A01(r0.A01, true);
            this.A00.setPrompt(this.A03.A06(R.string.contact_qr_prompt));
            ContactQrContactCardView contactQrContactCardView3 = this.A00;
            if (!(contactQrContactCardView3 == null || (str = this.A01) == null)) {
                contactQrContactCardView3.setQrCode(AnonymousClass008.A0K("https://wa.me/qr/", str));
            }
            return inflate;
        }
        throw null;
    }
}
