package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2IC  reason: invalid class name */
public class AnonymousClass2IC {
    public static volatile AnonymousClass2IC A02;
    public C51822a5 A00;
    public C51822a5 A01;

    public AnonymousClass2IC(AnonymousClass00G r2, AnonymousClass01X r3) {
        this.A00 = new C59272nN(r2, r3);
        this.A01 = new C51822a5(r2, r3);
    }

    public static AnonymousClass2IC A00() {
        if (A02 == null) {
            synchronized (AnonymousClass2IC.class) {
                if (A02 == null) {
                    AnonymousClass00G r2 = AnonymousClass00G.A01;
                    AnonymousClass01X A002 = AnonymousClass01X.A00();
                    AbstractC658931z.A00();
                    A02 = new AnonymousClass2IC(r2, A002);
                }
            }
        }
        return A02;
    }

    public void A01(Context context) {
        C51822a5 r2 = this.A00;
        if (r2 != null) {
            int A002 = C004302a.A00(context, R.color.conversationRowSelectionColor);
            r2.A00 = A002;
            r2.A01.setColor(A002);
            C51822a5 r22 = this.A01;
            if (r22 != null) {
                int A003 = C004302a.A00(context, R.color.conversationRowSelectionColor);
                r22.A00 = A003;
                r22.A01.setColor(A003);
                return;
            }
            throw null;
        }
        throw null;
    }
}
