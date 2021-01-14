package X;

import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* renamed from: X.3Fd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68943Fd implements AnonymousClass0SG {
    public final /* synthetic */ IndiaUpiCheckBalanceActivity A00;

    public /* synthetic */ C68943Fd(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity) {
        this.A00 = indiaUpiCheckBalanceActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = this.A00;
        C63292wB r10 = (C63292wB) obj;
        int i = r10.A00;
        if (i == 0) {
            indiaUpiCheckBalanceActivity.A0l(r10.A05, r10.A04, indiaUpiCheckBalanceActivity.A04, r10.A01, 3, r10.A06);
        } else if (i == 1) {
            indiaUpiCheckBalanceActivity.finish();
            indiaUpiCheckBalanceActivity.overridePendingTransition(0, 0);
        } else if (i == 2) {
            indiaUpiCheckBalanceActivity.A02 = r10.A02;
            C002001d.A2O(indiaUpiCheckBalanceActivity, 100);
        } else if (i == 3) {
            indiaUpiCheckBalanceActivity.A03 = r10.A03;
            C002001d.A2O(indiaUpiCheckBalanceActivity, 101);
        }
    }
}
