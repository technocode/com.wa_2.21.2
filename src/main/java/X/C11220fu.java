package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0fu  reason: invalid class name and case insensitive filesystem */
public class C11220fu {
    public static final C11220fu A04 = new C11220fu(null, 0, null, null);
    public final long A00;
    public final UserJid A01;
    public final String A02;
    public final String A03;

    public C11220fu(String str, long j, UserJid userJid, String str2) {
        this.A03 = str;
        this.A00 = j;
        this.A01 = userJid;
        this.A02 = str2;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("GroupDescription{id=");
        A0S.append(this.A03);
        A0S.append(", time=");
        A0S.append(this.A00);
        A0S.append(", setterJid='");
        A0S.append(this.A01);
        A0S.append('\'');
        A0S.append(", len(description)='");
        String str = this.A02;
        if (str == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(str.length());
        }
        A0S.append(valueOf);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
