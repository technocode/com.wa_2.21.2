package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.0eD  reason: invalid class name and case insensitive filesystem */
public class C10180eD extends AnonymousClass0JW {
    public final AbstractC60932sE A00;
    public final C02020Ai A01;
    public final C63842x6 A02;
    public final String A03 = "initial";
    public final WeakReference A04;
    public final AnonymousClass3BB A05;
    public final boolean A06;

    public C10180eD(C63842x6 r2, AnonymousClass3BB r3, boolean z, AbstractC60932sE r5, C68403Db r6, C02020Ai r7) {
        this.A02 = r2;
        this.A05 = r3;
        this.A06 = z;
        this.A00 = r5;
        this.A04 = new WeakReference(r6);
        this.A01 = r7;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            Log.i("PAY: IndiaUpiSetupCoordinator/challenge got");
            C68403Db r9 = (C68403Db) this.A04.get();
            if (r9 != null) {
                String str2 = this.A03;
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder("PAY: IndiaUpiSetupCoordinator/getToken called with invalid type: ");
                    sb.append(str2);
                    sb.append(" challenge: ");
                    sb.append(str);
                    Log.i(sb.toString());
                } else {
                    Log.i("PAY: IndiaUpiSetupCoordinator/getToken called");
                    if (!TextUtils.isEmpty(str)) {
                        r9.A06.AQ7();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new AnonymousClass0OS("action", "upi-get-token", null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("device-id", r9.A07.A02(), null, (byte) 0));
                        arrayList.add(new AnonymousClass0OS("token-type", str2.toUpperCase(Locale.US), null, (byte) 0));
                        AnonymousClass008.A1F("challenge", str, arrayList);
                        String A042 = r9.A03.A04();
                        if (!TextUtils.isEmpty(A042)) {
                            AnonymousClass008.A1F("provider-type", A042, arrayList);
                        }
                        C61082sT r14 = ((C61432tA) r9).A00;
                        r14.A03("upi-get-token");
                        ((C61432tA) r9).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74473az(r9, r9.A00, r9.A01, r9.A02, r9.A05, r14), 0);
                    }
                }
            }
        } else {
            AbstractC60932sE r0 = this.A00;
            if (r0 != null) {
                r0.AGR();
            }
        }
        C60942sF.A07 = null;
    }
}
