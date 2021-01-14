package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3DS  reason: invalid class name */
public class AnonymousClass3DS implements AbstractC61142sZ {
    @Override // X.AbstractC61142sZ
    public ArrayList ALu(AnonymousClass0M5 r5) {
        ArrayList arrayList = new ArrayList();
        String str = r5.A00;
        if (str.equals("card-update")) {
            try {
                AnonymousClass0M5 A0E = r5.A0E("card");
                C74723bO r0 = new C74723bO();
                r0.A01(0, A0E);
                arrayList.add(r0);
                return arrayList;
            } catch (AnonymousClass1XC unused) {
                Log.w("PAY: BrazilProtoParser/parse: no card node for card-update notification");
            }
        } else {
            if (str.equals("merchant-update")) {
                try {
                    AnonymousClass0M5 A0E2 = r5.A0E("merchant");
                    C74733bP r02 = new C74733bP();
                    r02.A01(0, A0E2);
                    arrayList.add(r02);
                    return arrayList;
                } catch (AnonymousClass1XC unused2) {
                    Log.w("PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification");
                    return arrayList;
                }
            }
            return arrayList;
        }
    }
}
