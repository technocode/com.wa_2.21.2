package X;

import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.0dz  reason: invalid class name and case insensitive filesystem */
public class C10070dz extends AnonymousClass0JW {
    public final C01970Ad A00;
    public final AnonymousClass3G0 A01;
    public final String A02;

    public C10070dz(C01970Ad r1, String str, AnonymousClass3G0 r3) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass1VM r4 = (AnonymousClass1VM) obj;
        C69363Gt r0 = this.A01.A00;
        if (r4 != null) {
            IndiaUpiResetPinActivity indiaUpiResetPinActivity = r0.A00;
            C43751yt r42 = (C43751yt) r4;
            indiaUpiResetPinActivity.A04 = r42;
            indiaUpiResetPinActivity.A05.A00((C74463ay) r42.A06, indiaUpiResetPinActivity);
            return;
        }
        r0.A00.A0i();
    }
}
