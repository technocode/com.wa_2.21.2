package X;

import com.whatsapp.util.Log;

/* renamed from: X.0eC  reason: invalid class name and case insensitive filesystem */
public class C10170eC extends AnonymousClass0JW {
    public final AbstractC60932sE A00;
    public final C63842x6 A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass3BB A04;

    public C10170eC(C63842x6 r1, AnonymousClass3BB r2, String str, String str2, AbstractC60932sE r5) {
        this.A01 = r1;
        this.A02 = str;
        this.A04 = r2;
        this.A03 = str2;
        this.A00 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool = (Boolean) obj;
        AbstractC60932sE r2 = this.A00;
        if (r2 != null) {
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiSetupCoordinator/registered: ");
            sb.append(bool);
            Log.i(sb.toString());
            r2.AJD(bool.booleanValue());
        }
        C60942sF.A08 = null;
    }
}
