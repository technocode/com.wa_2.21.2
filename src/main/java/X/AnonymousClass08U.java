package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.08U  reason: invalid class name */
public final class AnonymousClass08U {
    public static volatile AnonymousClass08U A01;
    public final AnonymousClass08V A00 = new AnonymousClass08V(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);

    public static AnonymousClass08U A00() {
        if (A01 == null) {
            synchronized (AnonymousClass08U.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass08U();
                }
            }
        }
        return A01;
    }

    public static final UserJid A01(String str, String str2) {
        int hashCode = str2.hashCode();
        if (hashCode != -2070199035) {
            if (hashCode == -1673355044 && str2.equals("s.whatsapp.net")) {
                int hashCode2 = str.hashCode();
                if (hashCode2 != -1821959325) {
                    if (hashCode2 == 48 && str.equals("0")) {
                        return AnonymousClass08T.A00;
                    }
                } else if (str.equals("Server")) {
                    return AnonymousClass2A1.A00;
                }
                return new UserJid(str);
            }
        } else if (str2.equals("status_me")) {
            return AnonymousClass02Z.A00;
        }
        throw new AnonymousClass02Y(Jid.buildRawString(str, str2));
    }
}
