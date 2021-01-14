package X;

import com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

/* renamed from: X.3Gh  reason: invalid class name and case insensitive filesystem */
public class C69243Gh implements AnonymousClass0GT {
    public final /* synthetic */ int A00 = 13;
    public final /* synthetic */ AnonymousClass0GT A01;
    public final /* synthetic */ AbstractC61782tj A02;
    public final /* synthetic */ IndiaUpiBankAccountDetailsActivity A03;

    public C69243Gh(IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity, AnonymousClass0GT r3, AbstractC61782tj r4) {
        this.A03 = indiaUpiBankAccountDetailsActivity;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r2) {
        this.A01.AJP(r2);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r6) {
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = this.A03;
        C018809u r3 = indiaUpiBankAccountDetailsActivity.A0D;
        StringBuilder sb = new StringBuilder("removePayment/onResponseError. paymentNetworkError: ");
        sb.append(r6);
        r3.A07(null, sb.toString(), null);
        AbstractC61782tj r1 = this.A02;
        if (r1 != null) {
            r1.ABo(this.A00, r6);
        }
        int A002 = C69293Gm.A00(r6.code, null);
        if (A002 != 0) {
            indiaUpiBankAccountDetailsActivity.A0K.A00();
            indiaUpiBankAccountDetailsActivity.APo(A002);
            return;
        }
        this.A01.AJU(r6);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r2) {
        this.A01.AJV(r2);
    }
}
