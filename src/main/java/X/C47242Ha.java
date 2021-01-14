package X;

import android.app.Activity;
import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Ha  reason: invalid class name and case insensitive filesystem */
public class C47242Ha {
    public static volatile C47242Ha A07;
    public final C26491Ld A00;
    public final C014308b A01;
    public final AnonymousClass00C A02;
    public final AnonymousClass01X A03;
    public final C47912Ke A04;
    public final AnonymousClass0BV A05;
    public final AnonymousClass00T A06;

    public C47242Ha(AnonymousClass00T r1, C26491Ld r2, C014308b r3, AnonymousClass01X r4, C47912Ke r5, AnonymousClass0BV r6, AnonymousClass00C r7) {
        this.A06 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r7;
    }

    public static C47242Ha A00() {
        if (A07 == null) {
            synchronized (C47242Ha.class) {
                if (A07 == null) {
                    AnonymousClass00T A002 = C002101e.A00();
                    C26491Ld A003 = C26491Ld.A00();
                    C014308b A004 = C014308b.A00();
                    AnonymousClass01X A005 = AnonymousClass01X.A00();
                    if (C47912Ke.A0C == null) {
                        synchronized (C47912Ke.class) {
                            if (C47912Ke.A0C == null) {
                                C47912Ke.A0C = new C47912Ke(AnonymousClass00S.A00(), C014408c.A00(), AnonymousClass01I.A00(), AnonymousClass088.A00(), C02150Av.A02(), AnonymousClass01A.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass01K.A00(), C014508d.A00(), C018609s.A04(), AnonymousClass0Z7.A00());
                            }
                        }
                    }
                    A07 = new C47242Ha(A002, A003, A004, A005, C47912Ke.A0C, AnonymousClass0BV.A00(), AnonymousClass00C.A00());
                }
            }
        }
        return A07;
    }

    public AnonymousClass0MD A01(Activity activity, AbstractC004502c r6, C007003k r7) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(activity);
        AnonymousClass01X r2 = this.A03;
        r3.A01.A0E = r2.A06(R.string.export_conversation_ask_about_media);
        r3.A07(r2.A06(R.string.include_media), new AnonymousClass2H8(this, activity, r6, r7));
        r3.A06(r2.A06(R.string.without_media), new AnonymousClass2H7(this, activity, r6, r7));
        return r3.A00();
    }

    public final void A02(Context context, AbstractC004502c r14, C007003k r15, boolean z) {
        r14.APv(R.string.register_xmpp_title, R.string.register_wait_message);
        this.A06.ANC(new AnonymousClass2ZE(context, this.A04, this.A01, this.A02, this.A03, r14, r15, this.A00, z), new Void[0]);
    }
}
