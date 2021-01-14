package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.3YB  reason: invalid class name */
public class AnonymousClass3YB implements AbstractC27431Py, AbstractC61542tL {
    public final /* synthetic */ AbstractC27431Py A00;
    public final /* synthetic */ AnonymousClass3YC A01;

    public AnonymousClass3YB(AnonymousClass3YC r1, AbstractC27431Py r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00() {
        C69203Gd r0 = this.A01.A07;
        BrazilPaymentActivity.A06(r0.A03, r0.A02, r0.A01, r0.A04, r0.A05);
    }

    @Override // X.AbstractC27431Py
    public void ADA(int i, CharSequence charSequence) {
        this.A00.ADA(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADB() {
        this.A00.ADB();
    }

    @Override // X.AbstractC27431Py
    public void ADC(int i, CharSequence charSequence) {
        this.A00.ADC(i, charSequence);
    }

    @Override // X.AbstractC27431Py
    public void ADD(byte[] bArr) {
        AnonymousClass3YC r2 = this.A01;
        r2.A02.A06 = true;
        r2.A01.A0G(R.string.payment_verifying);
    }

    @Override // X.AbstractC61542tL
    public void AFb(C61072sS r13) {
        AnonymousClass3YC r1 = this.A01;
        r1.A01.AMi();
        FingerprintBottomSheet fingerprintBottomSheet = r1.A02;
        fingerprintBottomSheet.A06 = false;
        int i = r13.code;
        if (i == 1441) {
            fingerprintBottomSheet.A11(r13.nextAttemptTs * 1000);
            return;
        }
        C69203Gd r3 = r1.A07;
        BrazilPaymentActivity brazilPaymentActivity = r3.A03;
        AnonymousClass3DQ r5 = new AnonymousClass3DQ(((AnonymousClass2C0) brazilPaymentActivity).A01, brazilPaymentActivity.A0E);
        if (i == 454) {
            BrazilPaymentActivity.A07(brazilPaymentActivity, r13);
            BrazilPaymentActivity.A05(brazilPaymentActivity, r3.A00);
            return;
        }
        C014308b r2 = brazilPaymentActivity.A05;
        AnonymousClass0AQ r12 = brazilPaymentActivity.A07;
        UserJid userJid = ((AbstractActivityC34761jB) brazilPaymentActivity).A03;
        if (userJid != null) {
            String A08 = r2.A08(r12.A02(userJid), false);
            FingerprintBottomSheet fingerprintBottomSheet2 = r3.A00;
            r5.A02(brazilPaymentActivity, i, A08, new DialogInterface$OnDismissListenerC62142uJ(r3, fingerprintBottomSheet2), new DialogInterface$OnDismissListenerC62122uH(fingerprintBottomSheet2), new DialogInterface$OnDismissListenerC62132uI(r3, fingerprintBottomSheet2)).show();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC61542tL
    public void AJc(String str) {
        AnonymousClass3YC r3 = this.A01;
        r3.A01.AMi();
        FingerprintBottomSheet fingerprintBottomSheet = r3.A02;
        fingerprintBottomSheet.A0v(false);
        fingerprintBottomSheet.A02.setEnabled(false);
        fingerprintBottomSheet.A01.setEnabled(false);
        r3.A00 = str;
        this.A00.ADD(null);
    }
}
