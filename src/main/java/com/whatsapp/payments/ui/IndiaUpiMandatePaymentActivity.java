package com.whatsapp.payments.ui;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0GP;
import X.AnonymousClass0RM;
import X.AnonymousClass1DU;
import X.AnonymousClass1VM;
import X.AnonymousClass3EC;
import X.AnonymousClass3EL;
import X.AnonymousClass3I7;
import X.C002001d;
import X.C018809u;
import X.C03340Fu;
import X.C05900Qy;
import X.C61072sS;
import X.C63312wD;
import X.C63332wF;
import X.C68973Fg;
import X.C68983Fh;
import X.C69293Gm;
import X.C73803Yt;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

public class IndiaUpiMandatePaymentActivity extends AnonymousClass1DU {
    public AnonymousClass3I7 A00;
    public C63332wF A01 = C63332wF.A00();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final AnonymousClass04j A03 = AnonymousClass04j.A00();
    public final AnonymousClass0GP A04 = AnonymousClass0GP.A00();
    public final C03340Fu A05 = C03340Fu.A00();
    public final C018809u A06 = C018809u.A00("IndiaUpiMandatePaymentActivity", "payment-settings", "IN");

    @Override // X.AbstractC61462tD
    public void AE2(boolean z, boolean z2, C05900Qy r3, C05900Qy r4, AnonymousClass0RM r5, AnonymousClass0RM r6, C61072sS r7) {
    }

    @Override // X.AbstractC61462tD
    public void AH0(String str, C61072sS r6) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A06.A07(null, "onListKeys contains non empty keys", null);
            C63312wD r1 = new C63312wD(1);
            r1.A01 = str;
            this.A00.A02(r1);
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
            A0i();
        }
    }

    @Override // X.AbstractC61462tD
    public void AK1(C61072sS r4) {
        C018809u r2 = this.A06;
        throw new UnsupportedOperationException(r2.A02(r2.A02, "onSetPin unsupported").toString());
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass3EC r8 = new AnonymousClass3EC(this, this.A02, ((AnonymousClass1DU) this).A03, ((AnonymousClass1DU) this).A0K, this.A03, this.A05, this.A04);
        C63332wF r3 = this.A01;
        String stringExtra = getIntent().getStringExtra("payment_transaction_info_id");
        AnonymousClass1VM r6 = (AnonymousClass1VM) getIntent().getParcelableExtra("payment_method");
        AnonymousClass3EL r7 = ((AnonymousClass1DU) this).A04;
        boolean booleanExtra = getIntent().getBooleanExtra("is_accept_mandate", true);
        String A0X = A0X(((AnonymousClass1DU) this).A0D.A03());
        if (r3 != null) {
            AnonymousClass3I7 r0 = (AnonymousClass3I7) C002001d.A0l(this, new C73803Yt(r3, this, stringExtra, r6, r7, r8, booleanExtra, A0X)).A00(AnonymousClass3I7.class);
            this.A00 = r0;
            r0.A01.A03(r0.A00, new C68983Fh(this));
            AnonymousClass3I7 r02 = this.A00;
            r02.A05.A03(r02.A00, new C68973Fg(this));
            this.A00.A02(new C63312wD(0));
            return;
        }
        throw null;
    }
}
