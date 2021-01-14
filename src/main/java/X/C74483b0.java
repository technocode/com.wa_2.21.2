package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3b0  reason: invalid class name and case insensitive filesystem */
public class C74483b0 extends AbstractC10160eB {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass02M A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass04j A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass0GP A07;
    public final C03340Fu A08;
    public final C01970Ad A09;
    public final C018809u A0A = C018809u.A00("BaseTokenAddCardAction", "network", "COMMON");
    public final AnonymousClass3FQ A0B;
    public final C62942vb A0C;
    public final C63842x6 A0D;
    public final AnonymousClass00T A0E;
    public final String A0F;
    public final String A0G;

    public C74483b0(AnonymousClass00S r4, Context context, AnonymousClass02M r6, AnonymousClass01I r7, AnonymousClass00T r8, C63842x6 r9, C01970Ad r10, C02010Ah r11, C64412y9 r12, AnonymousClass04j r13, C62942vb r14, C03340Fu r15, AnonymousClass0GP r16, String str, String str2, int i, int i2, AnonymousClass3FQ r21) {
        super(r11, r12, r13, r15);
        this.A03 = r6;
        this.A0E = r8;
        this.A0D = r9;
        this.A09 = r10;
        this.A08 = r15;
        this.A07 = r16;
        this.A0F = str;
        this.A0G = str2;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = r4;
        this.A02 = context;
        this.A04 = r7;
        this.A05 = r13;
        this.A0C = r14;
        this.A0B = r21;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r13 = (AnonymousClass02R) obj;
        String str = (String) r13.A00;
        C61072sS r2 = (C61072sS) r13.A01;
        if (str == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilAddCardAction token error: ");
            sb.append(r2);
            Log.i(sb.toString());
            this.A0B.A00(null, false, null, r2);
            return;
        }
        Log.i("PAY: BrazilAddCardAction sendAddCard token success");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "br-add-card", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("token", str, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A0D.A02(), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("card-expiry-month", String.format(Locale.US, "%02d", Integer.valueOf(this.A00)), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("card-expiry-year", Integer.toString(this.A01), null, (byte) 0));
        byte[] A0x = AnonymousClass0FI.A0x(this.A06, this.A04, false);
        if (A0x != null) {
            arrayList.add(new AnonymousClass0OS("nonce", C007603r.A03(A0x), null, (byte) 0));
            this.A08.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new AnonymousClass3XV(this, this.A02, this.A03, this.A05, this.A07), 0);
            return;
        }
        throw null;
    }
}
