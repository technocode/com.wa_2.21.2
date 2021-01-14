package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.02Y  reason: invalid class name */
public class AnonymousClass02Y extends Exception {
    public AnonymousClass02Y(Jid jid) {
        super(jid.getObfuscatedString());
    }

    public AnonymousClass02Y(String str) {
        super(str);
    }
}
