package X;

import java.util.HashMap;

/* renamed from: X.0dy  reason: invalid class name and case insensitive filesystem */
public class C10060dy extends AnonymousClass0JW {
    public final C28021Sn A00;
    public final C01970Ad A01;

    public C10060dy(C01970Ad r1, C28021Sn r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str;
        AnonymousClass02R r6 = (AnonymousClass02R) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            if (obj2 != null) {
                AnonymousClass1VM r4 = (AnonymousClass1VM) obj2;
                HashMap hashMap = new HashMap();
                hashMap.put("credential_id", r4.A07);
                hashMap.put("last4", r4.A0A);
                StringBuilder sb = new StringBuilder("");
                sb.append(r6.A00);
                hashMap.put("remaining_cards", sb.toString());
                AbstractC460627w r0 = (AbstractC460627w) r4.A06;
                if (r0 != null) {
                    StringBuilder A0S = AnonymousClass008.A0S("");
                    A0S.append(r0.A04);
                    str = A0S.toString();
                } else {
                    str = "-1";
                }
                hashMap.put("remaining_retries", str);
                C28021Sn r2 = this.A00;
                if (r2.A00) {
                    AnonymousClass008.A0f(r2, "on_success", hashMap, r2.A03);
                    return;
                }
                return;
            }
            throw null;
        }
        this.A00.A00("on_failure");
    }
}
