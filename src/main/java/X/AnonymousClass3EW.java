package X;

import java.util.HashMap;

/* renamed from: X.3EW  reason: invalid class name */
public class AnonymousClass3EW {
    public final /* synthetic */ C61622tT A00;
    public final /* synthetic */ C69423Gz A01;

    public AnonymousClass3EW(C61622tT r1, C69423Gz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C61072sS r5) {
        C018809u r2 = this.A00.A07;
        StringBuilder sb = new StringBuilder("performNameCheck onError: ");
        sb.append(r5);
        r2.A07(null, sb.toString(), null);
        C69423Gz r22 = this.A01;
        if (r22 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(r5.code));
            C28021Sn r23 = r22.A00;
            if (r23.A00) {
                AnonymousClass008.A0f(r23, "on_exception", hashMap, r23.A03);
                return;
            }
            return;
        }
        throw null;
    }

    public void A01(boolean z) {
        C018809u r2 = this.A00.A07;
        StringBuilder sb = new StringBuilder("performNameCheck onNameCheckComplete, eligible: ");
        sb.append(z);
        r2.A07(null, sb.toString(), null);
        C69423Gz r0 = this.A01;
        if (!z) {
            r0.A00.A00("on_failure");
        } else {
            r0.A00.A00("on_success");
        }
    }
}
