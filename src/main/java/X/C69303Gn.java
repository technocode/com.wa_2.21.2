package X;

import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;

/* renamed from: X.3Gn  reason: invalid class name and case insensitive filesystem */
public class C69303Gn implements AbstractC29091Wz {
    public final /* synthetic */ IndiaUpiMandateHistoryActivity A00;

    @Override // X.AbstractC29091Wz
    public void AIP(AnonymousClass0MH r1) {
    }

    public C69303Gn(IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity) {
        this.A00 = indiaUpiMandateHistoryActivity;
    }

    @Override // X.AbstractC29091Wz
    public void AIQ(AnonymousClass0MH r5) {
        IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = this.A00;
        indiaUpiMandateHistoryActivity.A03.A03("payment transaction updated");
        AnonymousClass3I6 r3 = indiaUpiMandateHistoryActivity.A01;
        if (r3 != null) {
            r3.A06.ANF(new RunnableEBaseShape11S0100000_I1_6(r3, 38));
            return;
        }
        throw null;
    }
}
