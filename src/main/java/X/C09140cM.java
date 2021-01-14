package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0cM  reason: invalid class name and case insensitive filesystem */
public class C09140cM {
    public static volatile C09140cM A04;
    public AnonymousClass0M3 A00;
    public Integer A01;
    public final AnonymousClass0CH A02;
    public final ArrayList A03 = new ArrayList();

    public C09140cM(AnonymousClass0CH r2) {
        this.A02 = r2;
    }

    public static synchronized C09140cM A00() {
        C09140cM r0;
        synchronized (C09140cM.class) {
            if (A04 == null) {
                if (A04 == null) {
                    C002701k.A00();
                    A04 = new C09140cM(AnonymousClass0CH.A00());
                }
            }
            r0 = A04;
        }
        return r0;
    }

    public final void A01(AnonymousClass0M3 r3, int i) {
        Integer num;
        StringBuilder A0S = AnonymousClass008.A0S("statusdownload/queue-status-download ");
        A0S.append(r3.A0n.A01);
        A0S.append(" ");
        A0S.append(r3.A0G);
        A0S.append(", mode = ");
        A0S.append(i);
        Log.i(A0S.toString());
        if (!r3.equals(this.A00) || ((num = this.A01) != null && i < num.intValue())) {
            this.A00 = r3;
            this.A01 = Integer.valueOf(i);
            this.A02.A06(r3, i, new AnonymousClass3PW(this));
        }
    }
}
