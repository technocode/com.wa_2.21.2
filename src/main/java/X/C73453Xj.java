package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3Xj  reason: invalid class name and case insensitive filesystem */
public class C73453Xj extends AbstractC10160eB {
    public final int A00;
    public final Context A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass0GP A04;
    public final C03340Fu A05;
    public final C01970Ad A06;
    public final AnonymousClass3FI A07;
    public final C63842x6 A08;
    public final AnonymousClass00T A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C73453Xj(Context context, AnonymousClass02M r3, AnonymousClass00T r4, C63842x6 r5, C01970Ad r6, C02010Ah r7, C64412y9 r8, AnonymousClass04j r9, C03340Fu r10, AnonymousClass0GP r11, String str, String str2, String str3, String str4, int i, AnonymousClass3FI r17) {
        super(r7, r8, r9, r10);
        this.A01 = context;
        this.A02 = r3;
        this.A09 = r4;
        this.A08 = r5;
        this.A06 = r6;
        this.A03 = r9;
        this.A05 = r10;
        this.A04 = r11;
        this.A0A = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A00 = i;
        this.A0D = str4;
        this.A07 = r17;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r0 = (AnonymousClass02R) obj;
        String str = (String) r0.A00;
        C61072sS r2 = (C61072sS) r0.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilUpdateMerchantAccountAction token error: ");
            sb.append(r2);
            Log.e(sb.toString());
            this.A07.A00(r2);
            return;
        }
        this.A05.A09(true, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "br-update-merchant-account", null, (byte) 0), new AnonymousClass0OS("bank-token", str, null, (byte) 0), new AnonymousClass0OS("bank-code", this.A0C, null, (byte) 0), new AnonymousClass0OS("bank-branch", this.A0B, null, (byte) 0), new AnonymousClass0OS("bank-account-type", String.valueOf(this.A00), null, (byte) 0), new AnonymousClass0OS("device-id", this.A08.A02(), null, (byte) 0), new AnonymousClass0OS("nonce", this.A0D, null, (byte) 0)}, null, null), new C73443Xi(this, this.A01, this.A02, this.A03, this.A04), 30000);
    }
}
