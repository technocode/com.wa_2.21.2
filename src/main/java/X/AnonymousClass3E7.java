package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3E7  reason: invalid class name */
public class AnonymousClass3E7 extends C61432tA {
    public AbstractC61362t3 A00;
    public final Context A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass04j A03;
    public final C60922sD A04;
    public final C68393Da A05;
    public final AnonymousClass0GP A06;
    public final C01970Ad A07;

    public AnonymousClass3E7(Context context, AnonymousClass02M r3, C01970Ad r4, AnonymousClass04j r5, C60922sD r6, C03340Fu r7, AnonymousClass0GP r8, C68393Da r9, AbstractC61362t3 r10) {
        super(r7, r6.A04);
        this.A01 = context;
        this.A02 = r3;
        this.A07 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A05 = r9;
        this.A00 = r10;
    }

    public static boolean A00(C68393Da r3, ArrayList arrayList, ArrayList arrayList2, AnonymousClass3DY r6) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        if (((C74463ay) arrayList.get(0)).A01 <= 1 || !TextUtils.isEmpty(r3.A04()) || (arrayList2 != null && arrayList2.size() > 0 && r6 != null)) {
            return true;
        }
        return false;
    }

    public void A01() {
        Log.i("PAY: IndiaUpiPaymentSetup sendGetBanksList called");
        C61082sT r12 = super.A00;
        r12.A03("upi-get-banks");
        super.A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-get-banks", null, (byte) 0), new AnonymousClass0OS("version", 2)}, null, null), new C74503b2(this, this.A01, this.A02, this.A03, this.A06, r12), 0);
    }
}
