package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.2tO  reason: invalid class name and case insensitive filesystem */
public class C61572tO {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass0GP A03;
    public final C03340Fu A04;
    public final C61762th A05;
    public final C018809u A06 = C018809u.A00("PaymentProviderKeyAction", "network", "COMMON");
    public final String A07;

    public C61572tO(Context context, AnonymousClass02M r5, AnonymousClass04j r6, C03340Fu r7, AnonymousClass0GP r8, C61762th r9, String str) {
        this.A00 = context;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A07 = str;
    }

    public void A00(String str, AbstractC61562tN r20) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "get-provider-key", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("provider", str, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("key-scope", this.A07, null, (byte) 0));
        this.A04.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73573Xw(this, this.A00, this.A01, this.A02, this.A03, r20), 0);
    }
}
