package com.whatsapp.payments.ui;

import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0O5;
import X.AnonymousClass0SD;
import X.AnonymousClass3IY;
import X.AnonymousClass3YI;
import X.C000300f;
import X.C002001d;
import X.C018809u;
import X.C01980Ae;
import X.C02020Ai;
import X.C68393Da;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import java.util.HashMap;

public class IndiaUpiQrCodeScannedDialogFragment extends WaFragment {
    public View A00;
    public View A01;
    public Button A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass3IY A0A;
    public final C000300f A0B = C000300f.A00();
    public final AnonymousClass01X A0C = AnonymousClass01X.A00();
    public final C68393Da A0D = C68393Da.A00();
    public final C01980Ae A0E = C01980Ae.A00();
    public final C02020Ai A0F = C02020Ai.A00();
    public final C018809u A0G = C018809u.A00("IndiaUpiQrCodeScannedDialogFragment", "payment-settings", "IN");

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A0G.A07(null, "scanned payment QR code deep link", null);
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            View inflate = A0A2.getLayoutInflater().inflate(R.layout.india_upi_qr_code_detail_dialog, (ViewGroup) null);
            this.A01 = inflate;
            this.A06 = (ProgressBar) inflate.findViewById(R.id.progress);
            this.A03 = (LinearLayout) this.A01.findViewById(R.id.details_row);
            this.A08 = (TextView) this.A01.findViewById(R.id.contact_info_title);
            this.A07 = (TextView) this.A01.findViewById(R.id.contact_info_subtitle);
            this.A09 = (TextView) this.A01.findViewById(R.id.error_desc);
            this.A02 = (Button) this.A01.findViewById(R.id.positive_button);
            this.A04 = (LinearLayout) this.A01.findViewById(R.id.prefill_amount);
            this.A05 = (LinearLayout) this.A01.findViewById(R.id.qr_code_secure_info_container);
            this.A00 = this.A01.findViewById(R.id.qr_code_secure_info_container_divider);
            Drawable[] compoundDrawables = ((TextView) this.A01.findViewById(R.id.warning_text)).getCompoundDrawables();
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    C002001d.A2Z(drawable, A02().getColor(R.color.secondary_text));
                }
            }
            return this.A01;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        this.A0U = true;
        Bundle bundle2 = super.A06;
        if (bundle2 != null) {
            AnonymousClass3YI r5 = new AnonymousClass3YI(this, bundle2.getString("ARG_URL"), bundle2.getString("external_payment_source"));
            AnonymousClass0O5 A9n = A9n();
            String canonicalName = AnonymousClass3IY.class.getCanonicalName();
            if (canonicalName != null) {
                String A0K = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                HashMap hashMap = A9n.A00;
                AnonymousClass0SD r1 = (AnonymousClass0SD) hashMap.get(A0K);
                if (!AnonymousClass3IY.class.isInstance(r1)) {
                    r1 = r5.A3B(AnonymousClass3IY.class);
                    AnonymousClass0SD r0 = (AnonymousClass0SD) hashMap.put(A0K, r1);
                    if (r0 != null) {
                        r0.A00();
                    }
                }
                this.A0A = (AnonymousClass3IY) r1;
                this.A02.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 21));
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw null;
    }
}
