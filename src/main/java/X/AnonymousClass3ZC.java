package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.3ZC  reason: invalid class name */
public class AnonymousClass3ZC extends AnonymousClass0XV {
    public final /* synthetic */ AnonymousClass1Y6 A00;

    public AnonymousClass3ZC(AnonymousClass1Y6 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
        AnonymousClass1Y6 r2 = this.A00;
        boolean z = true;
        if (i != r2.A0O.A0M() && f == 0.0f) {
            z = false;
        }
        if (r2.A0D != z) {
            r2.A0D = z;
            if (z) {
                r2.A0V();
                return;
            }
            QrScanCodeFragment qrScanCodeFragment = r2.A09;
            AnonymousClass02M r0 = qrScanCodeFragment.A0D;
            r0.A02.postDelayed(qrScanCodeFragment.A0I, 200);
            AnonymousClass02M r02 = qrScanCodeFragment.A0D;
            r02.A02.removeCallbacks(qrScanCodeFragment.A0H);
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        AnonymousClass1Y6 r4 = this.A00;
        r4.A05();
        C08460b9 r3 = r4.A07;
        if (r3 != null) {
            int i2 = 0;
            do {
                C64862yv r0 = r3.A00[i2];
                boolean z = false;
                if (i2 == i) {
                    z = true;
                }
                r0.A00.setSelected(z);
                i2++;
            } while (i2 < 2);
            if (r4.A0T(i) == 1) {
                if (!r4.A0D) {
                    r4.A0D = true;
                    r4.A0V();
                }
                if (!r4.A0M.A05()) {
                    ((ActivityC004702f) r4).A0F.A06(R.string.no_internet_message, 1);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }
}
