package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.2tI  reason: invalid class name and case insensitive filesystem */
public class C61512tI {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass0GP A03;
    public final C03340Fu A04;
    public final AbstractC61502tH A05;
    public final C018809u A06 = C018809u.A00("PaymentGetTokenIdAction", "network", "COMMON");

    public C61512tI(Context context, AnonymousClass02M r5, AnonymousClass04j r6, C03340Fu r7, AnonymousClass0GP r8, AbstractC61502tH r9) {
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
        this.A03 = r8;
        this.A05 = r9;
    }

    public void A00(String str) {
        if (TextUtils.isEmpty(str)) {
            this.A05.AJe(null, null);
            return;
        }
        this.A06.A07(null, "starts to fetch token id", null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "get-token-id", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str, null, (byte) 0));
        this.A04.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73543Xt(this, this.A00, this.A01, this.A02, this.A03), 0);
    }
}
