package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.3Gt  reason: invalid class name and case insensitive filesystem */
public class C69363Gt implements AnonymousClass0GT {
    public final /* synthetic */ IndiaUpiResetPinActivity A00;

    public C69363Gt(IndiaUpiResetPinActivity indiaUpiResetPinActivity) {
        this.A00 = indiaUpiResetPinActivity;
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r5) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        C018809u r2 = indiaUpiResetPinActivity.A0F;
        StringBuilder sb = new StringBuilder("incorrect format retry: get-methods request error: ");
        sb.append(r5);
        r2.A08(sb.toString(), null);
        indiaUpiResetPinActivity.A0i();
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r5) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        C018809u r2 = indiaUpiResetPinActivity.A0F;
        StringBuilder sb = new StringBuilder("incorrect format retry: get-methods response error: ");
        sb.append(r5);
        r2.A08(sb.toString(), null);
        indiaUpiResetPinActivity.A0i();
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r6) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        ((AnonymousClass1PY) indiaUpiResetPinActivity).A0D.ANC(new C10070dz(((AnonymousClass1DU) indiaUpiResetPinActivity).A0H, indiaUpiResetPinActivity.A04.A07, new AnonymousClass3G0(this)), new Void[0]);
    }
}
