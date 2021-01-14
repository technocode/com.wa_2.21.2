package com.whatsapp.payments.ui;

import X.AbstractActivityC34761jB;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass01I;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0RM;
import X.AnonymousClass1DU;
import X.AnonymousClass3EI;
import X.AnonymousClass3EL;
import X.AnonymousClass3I5;
import X.C002001d;
import X.C018809u;
import X.C01970Ad;
import X.C01980Ae;
import X.C02020Ai;
import X.C03340Fu;
import X.C05900Qy;
import X.C43751yt;
import X.C60922sD;
import X.C61072sS;
import X.C63282wA;
import X.C63332wF;
import X.C63842x6;
import X.C68393Da;
import X.C68683Ed;
import X.C68933Fc;
import X.C68943Fd;
import X.C69293Gm;
import X.C73823Yv;
import X.DialogInterface$OnClickListenerC62322ub;
import X.DialogInterface$OnClickListenerC62332uc;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

public class IndiaUpiCheckBalanceActivity extends AnonymousClass1DU {
    public C43751yt A00;
    public AnonymousClass3I5 A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass0GP A05 = AnonymousClass0GP.A00();
    public final C018809u A06 = C018809u.A00("IndiaUpiCheckPinActivity", "payment-settings", "IN");
    public final C63332wF A07 = C63332wF.A00();

    @Override // X.AbstractC61462tD
    public void AK1(C61072sS r1) {
    }

    @Override // X.AbstractC61462tD
    public void AE2(boolean z, boolean z2, C05900Qy r6, C05900Qy r7, AnonymousClass0RM r8, AnonymousClass0RM r9, C61072sS r10) {
        this.A06.A07(null, "onCheckPin called", null);
    }

    @Override // X.AbstractC61462tD
    public void AH0(String str, C61072sS r6) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A06.A07(null, "onListKeys called", null);
            C63282wA r1 = new C63282wA(1);
            r1.A01 = str;
            this.A01.A02(r1);
        } else if (r6 != null && !C69293Gm.A02(this, "upi-list-keys", r6.code, false)) {
            if (((AnonymousClass1DU) this).A03.A06("upi-list-keys")) {
                ((AnonymousClass1DU) this).A0D.A0A();
                ((ActivityC004702f) this).A0K.A00();
                A0G(R.string.payments_still_working);
                ((AnonymousClass1DU) this).A04.A00();
                return;
            }
            C018809u r2 = this.A06;
            StringBuilder A0S = AnonymousClass008.A0S("onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0S.append(num);
            A0S.append(" failed; ; showErrorAndFinish");
            r2.A07(null, A0S.toString(), null);
            finish();
        }
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = (C43751yt) getIntent().getParcelableExtra("payment_bank_account");
        AnonymousClass02M r6 = ((ActivityC004702f) this).A0F;
        AnonymousClass01I r7 = ((AnonymousClass1DU) this).A0A;
        C63842x6 r8 = ((AnonymousClass1DU) this).A0K;
        C01970Ad r9 = ((AnonymousClass1DU) this).A0H;
        AnonymousClass04j r10 = ((ActivityC004702f) this).A0H;
        C01980Ae r11 = ((AbstractActivityC34761jB) this).A0I;
        C60922sD r12 = ((AnonymousClass1DU) this).A0C;
        C03340Fu r13 = ((AbstractActivityC34761jB) this).A0J;
        C02020Ai r14 = ((AnonymousClass1DU) this).A0G;
        C68683Ed r15 = ((AnonymousClass1DU) this).A0I;
        AnonymousClass0GP r1 = this.A05;
        C68393Da r0 = ((AnonymousClass1DU) this).A0D;
        ((AnonymousClass1DU) this).A04 = new AnonymousClass3EL(this, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r1, r0, this);
        AnonymousClass3EI r16 = new AnonymousClass3EI(this, r6, r7, r9, r8, r12, r10, r13, r15, r1, r0);
        String A0X = A0X(r0.A03());
        this.A04 = A0X;
        C63332wF r3 = this.A07;
        AnonymousClass3EL r2 = ((AnonymousClass1DU) this).A04;
        C43751yt r17 = this.A00;
        if (r3 != null) {
            AnonymousClass3I5 r02 = (AnonymousClass3I5) C002001d.A0l(this, new C73823Yv(r3, this, r2, r16, r17, A0X)).A00(AnonymousClass3I5.class);
            this.A01 = r02;
            r02.A01.A03(r02.A00, new C68933Fc(this));
            AnonymousClass3I5 r03 = this.A01;
            r03.A02.A03(r03.A00, new C68943Fd(this));
            this.A01.A02(new C63282wA(0));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass1DU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 100) {
            AnonymousClass0MB r2 = new AnonymousClass0MB(this);
            String str = this.A02;
            AnonymousClass0MC r0 = r2.A01;
            r0.A0E = str;
            r0.A0J = false;
            r2.A07(((AnonymousClass1DU) this).A0B.A06(R.string.ok), new DialogInterface$OnClickListenerC62322ub(this));
            return r2.A00();
        } else if (i != 101) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass0MB r22 = new AnonymousClass0MB(this);
            String str2 = this.A03;
            AnonymousClass0MC r02 = r22.A01;
            r02.A0E = str2;
            r02.A0J = false;
            r22.A07(((AnonymousClass1DU) this).A0B.A06(R.string.ok), new DialogInterface$OnClickListenerC62332uc(this));
            return r22.A00();
        }
    }
}
