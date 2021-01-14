package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3EF  reason: invalid class name */
public class AnonymousClass3EF extends C61432tA {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final C449222e A03;
    public final AnonymousClass0GP A04;
    public final C63842x6 A05;

    public AnonymousClass3EF(Context context, AnonymousClass02M r3, C63842x6 r4, AnonymousClass04j r5, C60922sD r6, C03340Fu r7, C449222e r8, AnonymousClass0GP r9) {
        super(r7, r6.A04);
        this.A00 = context;
        this.A01 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A03 = r8;
        this.A04 = r9;
    }

    public void A00(String str, String str2, AbstractC61032sO r22) {
        Log.i("PAY: verifyPaymentVpa called");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-get-vpa-name", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A05.A02(), null, (byte) 0));
        AnonymousClass008.A1F("vpa", str, arrayList);
        if (!TextUtils.isEmpty(str2)) {
            AnonymousClass008.A1F("url", str2, arrayList);
        }
        super.A01.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73493Xo(this, this.A00, this.A01, this.A02, this.A04, r22, str), 0);
    }
}
