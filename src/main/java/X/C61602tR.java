package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2tR  reason: invalid class name and case insensitive filesystem */
public class C61602tR {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass0GP A03;
    public final C03340Fu A04;
    public final C61202sf A05;
    public final C61572tO A06;
    public final C61762th A07;
    public final C61942tz A08;
    public final C61962u1 A09;
    public final C63842x6 A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;

    public C61602tR(AnonymousClass00S r14, Context context, AnonymousClass02M r16, C61202sf r17, C63842x6 r18, AnonymousClass04j r19, C61942tz r20, C03340Fu r21, AnonymousClass0GP r22, C61762th r23, String str, List list, String str2, String str3) {
        AnonymousClass00E.A06((TextUtils.isEmpty(str2) ^ true) != (TextUtils.isEmpty(str3) ^ true) ? false : true);
        this.A00 = context;
        this.A01 = r16;
        this.A05 = r17;
        this.A0A = r18;
        this.A02 = r19;
        this.A08 = r20;
        this.A04 = r21;
        this.A03 = r22;
        this.A07 = r23;
        this.A09 = new C61962u1(r14, r21);
        this.A06 = new C61572tO(context, r16, r19, r21, r22, r23, "PIN");
        this.A0B = "BR";
        this.A0C = str;
        this.A0F = list;
        this.A0D = str2;
        this.A0E = str3;
    }

    public final void A00(C61952u0 r22, String str, AnonymousClass3FO r24) {
        C61202sf r4 = this.A05;
        List list = this.A0F;
        AnonymousClass3EU r1 = new AnonymousClass3EU(this, r22, r24);
        if (r4 != null) {
            C61172sc r12 = new C61172sc(2, r1);
            if ("token".equals(r22.A00.A03)) {
                AnonymousClass00T r13 = r4.A04;
                C02010Ah r5 = r4.A01;
                C64412y9 r6 = r4.A03;
                AnonymousClass04j r7 = r4.A00;
                C03340Fu r8 = r4.A02;
                r13.ANC(new AnonymousClass3XU(r5, r6, r7, r8, list, null, 0, r12), new Void[0]);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AnonymousClass02R("fbpay_pin", str));
                r13.ANC(new AnonymousClass3XU(r5, r6, r7, r8, arrayList, null, 1, r12), new Void[0]);
                return;
            }
            r12.A00(1, str);
            r4.A04.ANC(new AnonymousClass3XU(r4.A01, r4.A03, r4.A00, r4.A02, list, new C68513Dm(r12), -1, null), new Void[0]);
            return;
        }
        throw null;
    }
}
