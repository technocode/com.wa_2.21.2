package com.whatsapp.authentication;

import X.AbstractC27431Py;
import X.AbstractC41241ui;
import X.ActivityC004602e;
import X.AnonymousClass008;
import X.AnonymousClass00S;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0Q7;
import X.AnonymousClass1Pq;
import X.AnonymousClass1Px;
import X.AnonymousClass3YC;
import X.AnonymousClass3YE;
import X.C002301g;
import X.C04080Iy;
import X.C41111uU;
import X.C41231uh;
import X.C459627f;
import X.C69203Gd;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.util.Log;

public class FingerprintBottomSheet extends BottomSheetDialogFragment implements AbstractC27431Py {
    public long A00 = 0;
    public TextView A01;
    public TextView A02;
    public C04080Iy A03;
    public AbstractC41241ui A04;
    public FingerprintView A05;
    public boolean A06 = false;
    public final AnonymousClass00S A07 = AnonymousClass00S.A00();
    public final AnonymousClass01X A08 = AnonymousClass01X.A00();

    public static FingerprintBottomSheet A00(int i, int i2, int i3, int i4) {
        FingerprintBottomSheet fingerprintBottomSheet = new FingerprintBottomSheet();
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        bundle.putInt("negative_button_text", i2);
        bundle.putInt("positive_button_text", i3);
        if (i4 != 0) {
            bundle.putInt("header_layout_id", i4);
        }
        bundle.putInt("fingerprint_view_style_id", R.style.FingerprintView);
        bundle.putBoolean("full_screen", false);
        fingerprintBottomSheet.A0N(bundle);
        return fingerprintBottomSheet;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0X() {
        super.A0X();
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
            this.A05 = null;
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0Y() {
        super.A0Y();
        this.A04 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            int i = bundle2.getInt("custom_layout_id");
            if (i == 0) {
                i = R.layout.fingerprint_bottom_sheet;
            }
            View inflate = layoutInflater.inflate(i, viewGroup, false);
            int i2 = bundle2.getInt("header_layout_id");
            if (i2 != 0) {
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.header_container);
                layoutInflater.inflate(i2, viewGroup2);
                viewGroup2.setVisibility(0);
            }
            ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(R.id.fingerprint_view_wrapper);
            if (viewGroup3 != null) {
                FingerprintView fingerprintView = new FingerprintView(inflate.getContext(), null, 0, bundle2.getInt("fingerprint_view_style_id"));
                this.A05 = fingerprintView;
                viewGroup3.addView(fingerprintView);
            } else {
                this.A05 = (FingerprintView) inflate.findViewById(R.id.fingerprint_view);
            }
            AnonymousClass01X r6 = this.A08;
            ((TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_title)).setText(r6.A06(bundle2.getInt("title", R.string.fingerprint_bottom_sheet_title)));
            if (bundle2.getInt("positive_button_text") != 0) {
                String A062 = r6.A06(bundle2.getInt("positive_button_text"));
                TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_positive_button);
                this.A02 = textView;
                textView.setText(A062);
                this.A02.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 2));
            }
            if (bundle2.getInt("negative_button_text") != 0) {
                String A063 = r6.A06(bundle2.getInt("negative_button_text"));
                TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_bottomsheet_negative_button);
                this.A01 = textView2;
                AnonymousClass0Q7.A0d(textView2, new C41111uU());
                this.A01.setText(A063);
                this.A01.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 1));
            }
            this.A05.A00 = this.A04;
            Window window = ((DialogFragment) this).A03.getWindow();
            if (window != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    window.getDecorView().setSystemUiVisibility(1280);
                    window.setStatusBarColor(0);
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = -1;
                attributes.gravity = 48;
                window.setAttributes(attributes);
                ((DialogFragment) this).A03.setOnShowListener(new AnonymousClass1Pq(this, bundle2));
                return inflate;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        A0y();
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        if (this.A00 <= this.A07.A05()) {
            A0z();
        }
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        A0s(0, 2131952160);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void A0q() {
        A0y();
        A0w(false, false);
    }

    public void A0x() {
        A0r();
    }

    public final void A0y() {
        C04080Iy r0 = this.A03;
        if (r0 != null) {
            r0.A01();
            this.A03 = null;
        }
    }

    public final void A0z() {
        if (!this.A06) {
            FingerprintView fingerprintView = this.A05;
            if (fingerprintView != null) {
                fingerprintView.A00();
            }
            C04080Iy r1 = new C04080Iy();
            this.A03 = r1;
            AbstractC41241ui r0 = this.A04;
            if (r0 != null) {
                r0.A01(r1, this);
            }
        }
    }

    public /* synthetic */ void A10() {
        A0r();
        AbstractC41241ui r1 = this.A04;
        if (r1 == null) {
            return;
        }
        if (r1 instanceof AnonymousClass3YE) {
            ((AnonymousClass3YE) r1).A07.A01.A03();
        } else if (r1 instanceof AnonymousClass3YC) {
            C69203Gd r0 = ((AnonymousClass3YC) r1).A07;
            BrazilPaymentActivity.A06(r0.A03, r0.A02, r0.A01, r0.A04, r0.A05);
        }
    }

    public void A11(long j) {
        AnonymousClass00S r3 = this.A07;
        if (j > r3.A05()) {
            this.A00 = j;
            A0y();
            new AnonymousClass1Px(this, j - r3.A05(), j).start();
        }
    }

    public void A12(Bundle bundle, DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior A002 = BottomSheetBehavior.A00(findViewById);
            if (bundle.getBoolean("full_screen")) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = Resources.getSystem().getDisplayMetrics().heightPixels - C002301g.A00(A00());
                findViewById.setLayoutParams(layoutParams);
            }
            A002.A0D(3);
            A002.A0E = new C41231uh(this);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        AbstractC41241ui r1 = this.A04;
        if (r1 != null && (r1 instanceof C459627f)) {
            Log.i("AppAuthSettingsActivity/fingerprint-error");
            ((C459627f) r1).A00.A0T();
        }
        if (this.A05 != null) {
            if (i == 7) {
                charSequence = this.A08.A0D(R.string.app_auth_lockout_error_short, 30);
            }
            this.A05.A03(charSequence);
        }
        A0y();
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A04(fingerprintView.A07.A06(R.string.fingerprint_not_recognized));
        }
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A04(charSequence.toString());
        }
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        AbstractC41241ui r1 = this.A04;
        if (r1 != null) {
            if (r1 instanceof AnonymousClass3YE) {
                ((AnonymousClass3YE) r1).A00 = bArr;
            } else if (r1 instanceof C459627f) {
                Log.i("AppAuthSettingsActivity/fingerprint-success");
                AppAuthSettingsActivity appAuthSettingsActivity = ((C459627f) r1).A00;
                AnonymousClass008.A0n(appAuthSettingsActivity.A0J, "privacy_fingerprint_enabled", true);
                ((ActivityC004602e) appAuthSettingsActivity).A0A.A02(false);
                appAuthSettingsActivity.A0D.A04();
                appAuthSettingsActivity.A0A.A02();
            }
        }
        FingerprintView fingerprintView = this.A05;
        if (fingerprintView != null) {
            fingerprintView.A02();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onCancel(DialogInterface dialogInterface) {
        A0y();
    }
}
