package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2L0  reason: invalid class name */
public class AnonymousClass2L0 {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public boolean A00(UserJid userJid, int i, long j) {
        if (j <= 0) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.A00;
        C48122Kz r8 = (C48122Kz) concurrentHashMap.get(userJid);
        if (r8 == null) {
            r8 = C48122Kz.A03;
        }
        if (i == 5) {
            long j2 = r8.A00;
            if (j2 > 0 && j2 <= j) {
                return false;
            }
            r8 = new C48122Kz(j, r8.A02, r8.A01);
        } else if (i == 8) {
            long j3 = r8.A01;
            if (j3 > 0 && j3 <= j) {
                return false;
            }
            r8 = new C48122Kz(r8.A00, r8.A02, j);
        } else if (i == 13) {
            long j4 = r8.A02;
            if (j4 > 0 && j4 <= j) {
                return false;
            }
            r8 = new C48122Kz(r8.A00, j, r8.A01);
        }
        concurrentHashMap.put(userJid, r8);
        return true;
    }
}
