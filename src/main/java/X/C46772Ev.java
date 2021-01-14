package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Ev  reason: invalid class name and case insensitive filesystem */
public class C46772Ev {
    public C007003k A00;
    public UserJid A01;
    public String A02;
    public final String A03;

    public C46772Ev(C007003k r2, AnonymousClass01X r3) {
        this.A02 = C12420i4.A00(r2);
        this.A03 = (String) C014308b.A01(r3, r2);
        if (r2.A0X) {
            this.A01 = (UserJid) r2.A02(UserJid.class);
        }
        this.A00 = r2;
    }

    public C46772Ev(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
    }
}
