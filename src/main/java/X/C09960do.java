package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.0do  reason: invalid class name and case insensitive filesystem */
public class C09960do extends AnonymousClass0JW {
    public final AnonymousClass0EW A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass0XN A02;
    public final UserJid A03;
    public final AnonymousClass0IA A04;
    public final String A05;
    public final WeakReference A06;

    public C09960do(AnonymousClass01A r2, AnonymousClass0EW r3, AnonymousClass0XN r4, AnonymousClass0IA r5, AnonymousClass3ME r6, UserJid userJid, String str) {
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A06 = new WeakReference(r6);
        this.A03 = userJid;
        this.A05 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass0QK r3 = (AnonymousClass0QK) obj;
        AnonymousClass3ME r1 = (AnonymousClass3ME) this.A06.get();
        if (r1 != null && !r1.A03) {
            r1.A02(r3);
        }
    }
}
