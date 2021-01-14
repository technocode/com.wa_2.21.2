package com.whatsapp.twofactor;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.C04530Ks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.base.WaFragment;

public class SetCodeFragment extends WaFragment {
    public int A00;
    public Button A01;
    public TextView A02;
    public CodeInputField A03;
    public TwoFactorAuthActivity A04;
    public final AnonymousClass01X A05 = AnonymousClass01X.A00();
    public final C04530Ks A06 = C04530Ks.A00();

    public static void A00(SetCodeFragment setCodeFragment) {
        int i = setCodeFragment.A00;
        if (i == 0) {
            TwoFactorAuthActivity twoFactorAuthActivity = setCodeFragment.A04;
            twoFactorAuthActivity.A0W(twoFactorAuthActivity.A0T(), false);
        } else if (i == 1) {
            TwoFactorAuthActivity twoFactorAuthActivity2 = setCodeFragment.A04;
            Bundle A012 = AnonymousClass008.A01("type", 2);
            SetCodeFragment setCodeFragment2 = new SetCodeFragment();
            setCodeFragment2.A0N(A012);
            twoFactorAuthActivity2.A0W(setCodeFragment2, true);
        } else if (i == 2) {
            TwoFactorAuthActivity twoFactorAuthActivity3 = setCodeFragment.A04;
            if (twoFactorAuthActivity3.A0X(setCodeFragment)) {
                twoFactorAuthActivity3.A0U();
                return;
            }
            Bundle A013 = AnonymousClass008.A01("type", 1);
            SetEmailFragment setEmailFragment = new SetEmailFragment();
            setEmailFragment.A0N(A013);
            twoFactorAuthActivity3.A0W(setEmailFragment, true);
        }
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A0U = true;
        this.A04 = null;
        this.A01 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_two_factor_auth_code, viewGroup, false);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        String str;
        boolean z = true;
        this.A0U = true;
        if (this.A00 != 2 || !this.A04.A0X(this)) {
            z = false;
        }
        Button button = this.A01;
        AnonymousClass01X r1 = this.A05;
        int i = R.string.next;
        if (z) {
            i = R.string.two_factor_auth_submit;
        }
        button.setText(r1.A06(i));
        if (this.A00 == 2 && (str = this.A04.A02) != null) {
            this.A03.setCode(str);
            A0o(this.A03.getCode());
        }
        A0n();
        this.A03.requestFocus();
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        this.A00 = super.A06.getInt("type", 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x006b  */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(android.view.View r12, android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0l(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r1.contentEquals(r3.A03.getCode()) == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n() {
        /*
            r3 = this;
            android.widget.Button r0 = r3.A01
            if (r0 == 0) goto L_0x001c
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x001d
            com.whatsapp.CodeInputField r1 = r3.A03
            java.lang.String r1 = r1.getCode()
            int r2 = r1.length()
            r1 = 6
            if (r2 == r1) goto L_0x0017
            r0 = 0
        L_0x0017:
            android.widget.Button r1 = r3.A01
            r1.setEnabled(r0)
        L_0x001c:
            return
        L_0x001d:
            com.whatsapp.twofactor.TwoFactorAuthActivity r0 = r3.A04
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x0030
            com.whatsapp.CodeInputField r0 = r3.A03
            java.lang.String r0 = r0.getCode()
            boolean r1 = r1.contentEquals(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0030:
            r0 = 0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.twofactor.SetCodeFragment.A0n():void");
    }

    public final boolean A0o(CharSequence charSequence) {
        this.A02.setText("");
        if (charSequence.length() != 6) {
            return false;
        }
        int i = this.A00;
        if (i == 0) {
            String string = this.A06.A00.getString("two_factor_auth_code", "");
            if (string != null && string.contentEquals(this.A03.getCode())) {
                return true;
            }
            this.A02.setText(this.A05.A06(R.string.two_factor_auth_code_verification_error));
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                String str = this.A04.A01;
                if (str != null && str.contentEquals(this.A03.getCode())) {
                    return true;
                }
                this.A02.setText(this.A05.A06(R.string.two_factor_auth_code_mismatch_error));
            }
        }
        this.A03.requestFocus();
        return false;
    }
}
