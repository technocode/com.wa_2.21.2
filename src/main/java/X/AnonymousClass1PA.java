package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1PA  reason: invalid class name */
public class AnonymousClass1PA {
    public final long A00;
    public final UserJid A01;
    public final String A02;

    public AnonymousClass1PA(long j, UserJid userJid, String str) {
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("id=");
        A0S.append(this.A00);
        A0S.append(" jid=");
        A0S.append(this.A01);
        A0S.append(" display=");
        A0S.append(this.A02);
        return A0S.toString();
    }
}
