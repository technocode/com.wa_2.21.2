package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.3Xm  reason: invalid class name and case insensitive filesystem */
public class C73483Xm extends AbstractC68463Dh {
    public final C61082sT A00;
    public final String A01;

    public C73483Xm(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, C61082sT r5, String str) {
        super(context, r2, r3, r4);
        this.A01 = str;
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: onRequestError action: ");
        String str = this.A01;
        A0S.append(str);
        A0S.append(" error: ");
        A0S.append(r4);
        Log.i(A0S.toString());
        C61082sT r1 = this.A00;
        if (r1 != null) {
            r1.A05(str, r4.code);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r6) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: onResponseError action: ");
        String str = this.A01;
        A0S.append(str);
        A0S.append(" error: ");
        A0S.append(r6);
        Log.i(A0S.toString());
        C61082sT r3 = this.A00;
        if (r3 != null) {
            r3.A05(str, r6.code);
            int i = r6.code;
            if (i == 403 || i == 405 || i == 406 || i == 426 || i == 460 || i == 410 || i == 409 || i == 2826008) {
                synchronized (r3) {
                    r3.A01 = i;
                    CopyOnWriteArrayList copyOnWriteArrayList = r3.A06;
                    StringBuilder sb = new StringBuilder();
                    sb.append("payability-");
                    sb.append(i);
                    copyOnWriteArrayList.add(sb.toString());
                }
            } else if (i == 440) {
                synchronized (r3) {
                    r3.A02 = i;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = r3.A06;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("tos-");
                    sb2.append(i);
                    copyOnWriteArrayList2.add(sb2.toString());
                }
            }
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r3) {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: onResponseSuccess for op: action: ");
        String str = this.A01;
        AnonymousClass008.A1U(A0S, str);
        C61082sT r0 = this.A00;
        if (r0 != null) {
            r0.A04(str);
        }
    }
}
