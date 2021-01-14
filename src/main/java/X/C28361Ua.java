package X;

import com.whatsapp.jid.UserJid;
import java.util.Comparator;

/* renamed from: X.1Ua  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C28361Ua implements Comparator {
    public static final /* synthetic */ C28361Ua A00 = new C28361Ua();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AnonymousClass1VC r6 = (AnonymousClass1VC) obj;
        AnonymousClass1VC r7 = (AnonymousClass1VC) obj2;
        UserJid userJid = r6.A0A;
        if (AnonymousClass02Z.A02(userJid)) {
            return -1;
        }
        UserJid userJid2 = r7.A0A;
        if (AnonymousClass02Z.A02(userJid2)) {
            return 1;
        }
        if (AnonymousClass1VY.A0a(userJid)) {
            return -1;
        }
        if (AnonymousClass1VY.A0a(userJid2)) {
            return 1;
        }
        return -(r6.A07 > r7.A07 ? 1 : (r6.A07 == r7.A07 ? 0 : -1));
    }
}
