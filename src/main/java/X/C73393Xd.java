package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3Xd  reason: invalid class name and case insensitive filesystem */
public class C73393Xd extends AbstractC10160eB {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass0GP A05;
    public final C03340Fu A06;
    public final AnonymousClass3FN A07;
    public final C63842x6 A08;
    public final AnonymousClass00T A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;

    public C73393Xd(Context context, AnonymousClass00S r3, AnonymousClass02M r4, AnonymousClass01I r5, AnonymousClass00T r6, C63842x6 r7, C02010Ah r8, C64412y9 r9, AnonymousClass04j r10, C03340Fu r11, AnonymousClass0GP r12, String str, String str2, String str3, String str4, String str5, String str6, String str7, AnonymousClass3FN r20) {
        super(r8, r9, r10, r11);
        this.A00 = context;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A09 = r6;
        this.A08 = r7;
        this.A03 = r10;
        this.A06 = r11;
        this.A05 = r12;
        this.A0G = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0C = str4;
        this.A0B = str5;
        this.A0A = str6;
        this.A0E = str7;
        this.A07 = r20;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass02R r0 = (AnonymousClass02R) obj;
        String str = (String) r0.A00;
        C61072sS r4 = (C61072sS) r0.A01;
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass008.A1F("action", "br-prelink-merchant", arrayList);
            String str2 = this.A0G;
            if ("PREPAID".equals(str2)) {
                AnonymousClass00E.A03(str);
                arrayList.add(new AnonymousClass0OS("card-token", str, null, (byte) 0));
            } else if ("BANK".equals(str2)) {
                AnonymousClass00E.A03(str);
                arrayList.add(new AnonymousClass0OS("bank-token", str, null, (byte) 0));
                String str3 = this.A0D;
                AnonymousClass00E.A03(str3);
                arrayList.add(new AnonymousClass0OS("bank-code", str3, null, (byte) 0));
                String str4 = this.A0C;
                AnonymousClass00E.A03(str4);
                arrayList.add(new AnonymousClass0OS("bank-branch", str4, null, (byte) 0));
                String str5 = this.A0B;
                AnonymousClass00E.A03(str5);
                arrayList.add(new AnonymousClass0OS("bank-account-type", str5, null, (byte) 0));
            } else {
                throw new IllegalStateException("Expecting card token or bank account!");
            }
            arrayList.add(new AnonymousClass0OS("device-id", this.A08.A02(), null, (byte) 0));
            byte[] A0x = AnonymousClass0FI.A0x(this.A04, this.A02, false);
            if (A0x != null) {
                arrayList.add(new AnonymousClass0OS("nonce", C007603r.A03(A0x), null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("verify-type", str2, null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("verify-id", this.A0F, null, (byte) 0));
                this.A06.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73383Xc(this, this.A00, this.A01, this.A03, this.A05), 30000);
                return;
            }
            throw null;
        }
        StringBuilder sb = new StringBuilder("PAY: BrazilMerchantPreLinkAction token error: ");
        sb.append(r4);
        Log.e(sb.toString());
        this.A07.A00(null, r4);
    }
}
