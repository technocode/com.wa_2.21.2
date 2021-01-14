package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2Gt  reason: invalid class name and case insensitive filesystem */
public class C47172Gt {
    public long A00;
    public long A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final C007003k A0F;
    public final UserJid A0G;
    public final String A0H;

    public C47172Gt(C007003k r3) {
        this.A0F = r3;
        this.A0G = (UserJid) r3.A02(UserJid.class);
        AnonymousClass0QW r0 = r3.A08;
        if (r0 != null) {
            this.A0H = r0.A01;
        } else {
            this.A0H = null;
        }
        if (r3.A0X) {
            this.A01 = r3.A07;
        } else {
            this.A01 = -1;
        }
    }

    public C47172Gt(UserJid userJid, String str) {
        this.A0F = null;
        this.A0G = userJid;
        this.A0H = str;
        this.A01 = 0;
        this.A0A = false;
    }
}
