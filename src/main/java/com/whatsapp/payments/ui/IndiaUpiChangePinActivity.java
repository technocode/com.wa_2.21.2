package com.whatsapp.payments.ui;

import X.AbstractC43781yw;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass0RM;
import X.AnonymousClass0S2;
import X.AnonymousClass1DU;
import X.C002001d;
import X.C018809u;
import X.C05900Qy;
import X.C28051Sr;
import X.C43751yt;
import X.C61072sS;
import X.C69293Gm;
import X.C74463ay;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class IndiaUpiChangePinActivity extends AnonymousClass1DU {
    public ProgressBar A00;
    public TextView A01;
    public C43751yt A02;
    public String A03;
    public final C018809u A04 = C018809u.A00("IndiaUpiChangePinActivity", "payment-settings", "IN");

    public final void A0m() {
        ((AnonymousClass1DU) this).A03.A01("pin-entry-ui");
        if (this.A02 != null) {
            ((AnonymousClass1DU) this).A04.A00();
            return;
        }
        this.A04.A07(null, "could not find bank account; showErrorAndFinish", null);
        A0i();
    }

    public final void A0n(boolean z) {
        TextView textView = this.A01;
        int i = 0;
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        ProgressBar progressBar = this.A00;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    @Override // X.AbstractC61462tD
    public void AE2(boolean z, boolean z2, C05900Qy r6, C05900Qy r7, AnonymousClass0RM r8, AnonymousClass0RM r9, C61072sS r10) {
        C018809u r2 = this.A04;
        throw new UnsupportedOperationException(r2.A02(r2.A02, " onCheckPin unsupported").toString());
    }

    @Override // X.AbstractC61462tD
    public void AH0(String str, C61072sS r13) {
        Integer num;
        AbstractC43781yw r0;
        C43751yt r02;
        ((AnonymousClass1DU) this).A0I.A03(1, this.A02, r13);
        if (!TextUtils.isEmpty(str) && (r02 = this.A02) != null && r02.A06 != null) {
            this.A03 = A0X(((AnonymousClass1DU) this).A0D.A03());
            ((AnonymousClass1DU) this).A03.A02("upi-get-credential");
            C43751yt r03 = this.A02;
            A0l(str, r03.A08, this.A03, (C74463ay) r03.A06, 2, r03.A0A);
        } else if (r13 != null && !C69293Gm.A02(this, "upi-list-keys", r13.code, true)) {
            if (((AnonymousClass1DU) this).A03.A06("upi-list-keys")) {
                ((AnonymousClass1DU) this).A0D.A0A();
                ((ActivityC004702f) this).A0F.A0C(((AnonymousClass1DU) this).A0B.A06(R.string.payments_still_working), 1);
                ((AnonymousClass1DU) this).A04.A00();
                return;
            }
            C018809u r3 = this.A04;
            StringBuilder A0S = AnonymousClass008.A0S("IndiaUpiChangePinActivity: onListKeys: ");
            if (str != null) {
                num = Integer.valueOf(str.length());
            } else {
                num = null;
            }
            A0S.append(num);
            A0S.append(" bankAccount: ");
            A0S.append(this.A02);
            A0S.append(" countrydata: ");
            C43751yt r04 = this.A02;
            if (r04 != null) {
                r0 = r04.A06;
            } else {
                r0 = null;
            }
            A0S.append(r0);
            A0S.append(" failed; ; showErrorAndFinish");
            r3.A06("payment-settings", A0S.toString(), null);
            A0i();
        }
    }

    @Override // X.AbstractC61462tD
    public void AK1(C61072sS r5) {
        ((AnonymousClass1DU) this).A0I.A03(7, this.A02, r5);
        if (r5 == null) {
            this.A04.A07(null, "onSetPin success; showSuccessAndFinish", null);
            A0a();
            APq(0, R.string.payments_change_pin_success, C28051Sr.A14(this.A02.A0A));
        } else if (!C69293Gm.A02(this, "upi-change-mpin", r5.code, true)) {
            int i = r5.code;
            if (i == 11459) {
                C002001d.A2O(this, 10);
            } else if (i == 11468) {
                C002001d.A2O(this, 11);
            } else if (i == 11454) {
                C002001d.A2O(this, 12);
            } else if (i == 11456 || i == 11471) {
                C002001d.A2O(this, 13);
            } else {
                this.A04.A07(null, " onSetPin failed; showErrorAndFinish", null);
                A0i();
            }
        }
    }

    @Override // X.AnonymousClass1DU, X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.india_upi_pin_change);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass1DU) this).A0B.A07(R.string.payments_change_upi_pin_title));
            A09.A0A(true);
        }
        this.A01 = (TextView) findViewById(R.id.payments_upi_pin_setup_desc);
        this.A00 = (ProgressBar) findViewById(R.id.progress);
    }

    @Override // X.AnonymousClass1DU, X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        A0n(false);
        switch (i) {
            case 10:
                return A0d(i, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_change_pin_invalid_pin), R.string.yes, R.string.no, new RunnableEBaseShape11S0100000_I1_6(this, 24));
            case 11:
                return A0d(i, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_pin_max_retries), R.string.yes, R.string.no, new RunnableEBaseShape11S0100000_I1_6(this, 21));
            case 12:
                return A0d(i, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_pin_no_pin_set), R.string.yes, R.string.no, new RunnableEBaseShape11S0100000_I1_6(this, 22));
            case 13:
                ((AnonymousClass1DU) this).A0D.A0B();
                return A0d(i, ((AnonymousClass1DU) this).A0B.A06(R.string.payments_set_pin_retry), R.string.yes, R.string.no, new RunnableEBaseShape11S0100000_I1_6(this, 23));
            default:
                return super.onCreateDialog(i);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C43751yt r0 = (C43751yt) bundle.getParcelable("bankAccountSavedInst");
        this.A02 = r0;
        if (r0 != null) {
            this.A02.A06 = (AbstractC43781yw) bundle.getParcelable("countryDataSavedInst");
        }
        this.A03 = bundle.getString("seqNumSavedInst");
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        C018809u r2 = this.A04;
        StringBuilder A0S = AnonymousClass008.A0S("onResume with states: ");
        A0S.append(((AnonymousClass1DU) this).A03);
        r2.A07(null, A0S.toString(), null);
        byte[] A0I = ((AnonymousClass1DU) this).A0D.A0I();
        if (!((AnonymousClass1DU) this).A03.A06.contains("upi-get-challenge") && A0I == null) {
            ((AnonymousClass1DU) this).A03.A02("upi-get-challenge");
            ((AnonymousClass1DU) this).A02.A00();
        } else if (!((AnonymousClass1DU) this).A03.A06.contains("upi-get-challenge")) {
            A0j();
        }
    }

    @Override // X.AnonymousClass1DU, X.AbstractActivityC34761jB, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC43781yw r1;
        super.onSaveInstanceState(bundle);
        C43751yt r12 = this.A02;
        if (r12 != null) {
            bundle.putParcelable("bankAccountSavedInst", r12);
        }
        C43751yt r0 = this.A02;
        if (!(r0 == null || (r1 = r0.A06) == null)) {
            bundle.putParcelable("countryDataSavedInst", r1);
        }
        String str = this.A03;
        if (str != null) {
            bundle.putString("seqNumSavedInst", str);
        }
    }
}
