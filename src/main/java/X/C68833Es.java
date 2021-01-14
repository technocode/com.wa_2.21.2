package X;

import java.util.ArrayList;

/* renamed from: X.3Es  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68833Es implements AbstractC61912tw {
    public final /* synthetic */ AbstractC61922tx A00;
    public final /* synthetic */ C61932ty A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C68833Es(C61932ty r1, String str, String str2, AbstractC61922tx r4) {
        this.A01 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = r4;
    }

    @Override // X.AbstractC61912tw
    public final void AJb(C61952u0 r16) {
        C61932ty r7 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        AbstractC61922tx r1 = this.A00;
        C61202sf r5 = r7.A06;
        String[] strArr = {str, str2};
        C68903Ez r6 = new C68903Ez(r7, r16, r1);
        if ("token".equals(r16.A00.A03)) {
            C61172sc r14 = new C61172sc(2, r6);
            for (int i = 0; i < 2; i++) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AnonymousClass02R("fbpay_pin", strArr[i]));
                r5.A04.ANC(new AnonymousClass3XU(r5.A01, r5.A03, r5.A00, r5.A02, arrayList, null, i, r14), new Void[0]);
            }
            return;
        }
        r6.AKl(strArr);
    }
}
