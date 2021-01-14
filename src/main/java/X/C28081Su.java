package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Su  reason: invalid class name and case insensitive filesystem */
public class C28081Su {
    public static final C28081Su A02 = new C28081Su();
    public String A00;
    public Map A01;

    public synchronized Map A00(UserJid userJid) {
        Map map;
        map = this.A01;
        if (map == null || !userJid.getRawString().equals(this.A00)) {
            this.A00 = userJid.getRawString();
            map = new HashMap();
            this.A01 = map;
        }
        return map;
    }
}
