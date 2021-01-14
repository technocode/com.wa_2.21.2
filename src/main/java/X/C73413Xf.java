package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3Xf  reason: invalid class name and case insensitive filesystem */
public class C73413Xf extends AbstractC10160eB {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass0GP A05;
    public final C03340Fu A06;
    public final C01970Ad A07;
    public final C61632tU A08;
    public final C61722td A09;
    public final AnonymousClass3FC A0A;
    public final C63842x6 A0B;
    public final AnonymousClass00T A0C;

    public C73413Xf(AnonymousClass00S r1, Context context, AnonymousClass02M r3, AnonymousClass01I r4, AnonymousClass00T r5, C63842x6 r6, C01970Ad r7, C61632tU r8, C02010Ah r9, C64412y9 r10, AnonymousClass04j r11, C03340Fu r12, AnonymousClass0GP r13, C61722td r14, AnonymousClass3FC r15) {
        super(r9, r10, r11, r12);
        this.A04 = r1;
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A0C = r5;
        this.A0B = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A03 = r11;
        this.A06 = r12;
        this.A05 = r13;
        this.A09 = r14;
        this.A0A = r15;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str;
        String str2;
        AnonymousClass02R r0 = (AnonymousClass02R) obj;
        String str3 = (String) r0.A00;
        C61072sS r2 = (C61072sS) r0.A01;
        if (str3 == null) {
            StringBuilder sb = new StringBuilder("PAY: BrazilMerchantRegAction token error: ");
            sb.append(r2);
            Log.e(sb.toString());
            this.A0A.A00(r2);
            return;
        }
        byte[] A0x = AnonymousClass0FI.A0x(this.A04, this.A02, false);
        if (A0x != null) {
            String A032 = C007603r.A03(A0x);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass0OS("action", "br-reg-merchant", null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("nonce", A032, null, (byte) 0));
            C61722td r9 = this.A09;
            String str4 = r9.A0I;
            AnonymousClass00E.A03(str4);
            arrayList.add(new AnonymousClass0OS("tax-id", str4, null, (byte) 0));
            String str5 = r9.A07;
            AnonymousClass00E.A03(str5);
            arrayList.add(new AnonymousClass0OS("business-name", str5, null, (byte) 0));
            String str6 = r9.A0A;
            AnonymousClass00E.A03(str6);
            arrayList.add(new AnonymousClass0OS("email", str6, null, (byte) 0));
            String str7 = r9.A0D;
            AnonymousClass00E.A03(str7);
            arrayList.add(new AnonymousClass0OS("owner-name", str7, null, (byte) 0));
            String str8 = r9.A09;
            AnonymousClass00E.A03(str8);
            arrayList.add(new AnonymousClass0OS("cpf", str8, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("bank-token", str3, null, (byte) 0));
            String str9 = r9.A06;
            AnonymousClass00E.A03(str9);
            arrayList.add(new AnonymousClass0OS("bank-code", str9, null, (byte) 0));
            String str10 = r9.A05;
            AnonymousClass00E.A03(str10);
            arrayList.add(new AnonymousClass0OS("bank-branch", str10, null, (byte) 0));
            String str11 = r9.A04;
            AnonymousClass00E.A03(str11);
            arrayList.add(new AnonymousClass0OS("bank-account-type", str11, null, (byte) 0));
            arrayList.add(new AnonymousClass0OS("device-id", this.A0B.A02(), null, (byte) 0));
            AnonymousClass0M5[] r4 = new AnonymousClass0M5[2];
            r4[0] = this.A08.A01(r9.A02, r9.A01, r9.A00);
            AnonymousClass0OS[] r8 = new AnonymousClass0OS[8];
            String str12 = "";
            if (TextUtils.isEmpty(r9.A0B)) {
                str = str12;
            } else {
                str = r9.A0B;
            }
            r8[0] = new AnonymousClass0OS("house-number", str, null, (byte) 0);
            String str13 = r9.A0G;
            AnonymousClass00E.A03(str13);
            r8[1] = new AnonymousClass0OS("street", str13, null, (byte) 0);
            if (TextUtils.isEmpty(r9.A0H)) {
                str2 = str12;
            } else {
                str2 = r9.A0H;
            }
            r8[2] = new AnonymousClass0OS("extra-line", str2, null, (byte) 0);
            if (!TextUtils.isEmpty(r9.A0C)) {
                str12 = r9.A0C;
            }
            r8[3] = new AnonymousClass0OS("neighborhood", str12, null, (byte) 0);
            String str14 = r9.A08;
            AnonymousClass00E.A03(str14);
            r8[4] = new AnonymousClass0OS("city", str14, null, (byte) 0);
            String str15 = r9.A0F;
            AnonymousClass00E.A03(str15);
            r8[5] = new AnonymousClass0OS("state", str15, null, (byte) 0);
            r8[6] = new AnonymousClass0OS("country", "BR", null, (byte) 0);
            String str16 = r9.A0E;
            AnonymousClass00E.A03(str16);
            r8[7] = new AnonymousClass0OS("post-code", str16, null, (byte) 0);
            r4[1] = new AnonymousClass0M5("address", r8, null, null);
            this.A06.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), r4, null), new C73403Xe(this, this.A00, this.A01, this.A03, this.A05), 30000);
            return;
        }
        throw null;
    }
}
