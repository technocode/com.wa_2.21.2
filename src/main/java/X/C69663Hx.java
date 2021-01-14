package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3Hx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69663Hx implements AbstractC61252ss {
    public final /* synthetic */ C74733bP A00;
    public final /* synthetic */ C73743Yn A01;

    public /* synthetic */ C69663Hx(C73743Yn r1, C74733bP r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC61252ss
    public final void AGU(List list, C61072sS r9) {
        C73743Yn r3 = this.A01;
        C74733bP r6 = this.A00;
        C63262w8 r1 = new C63262w8(5);
        r1.A08 = false;
        r3.A00.A07(r1);
        if (r9 == null) {
            JSONArray A012 = C60842s5.A01(list);
            C63262w8 r4 = new C63262w8(4);
            HashMap hashMap = new HashMap();
            r4.A07 = hashMap;
            hashMap.put("update", "1");
            HashMap hashMap2 = r4.A07;
            if (A012 != null) {
                hashMap2.put("banks", A012.toString());
                String str = ((AbstractC59432ne) r6).A02;
                if (TextUtils.isEmpty(str)) {
                    str = r3.A02.A02();
                }
                r4.A07.put("business_name", str);
                r4.A06 = "brpay_m_payout_info";
                r3.A00.A07(r4);
                return;
            }
            throw null;
        }
        C63262w8 r12 = new C63262w8(7);
        r12.A04 = r9;
        r3.A00.A07(r12);
    }
}
