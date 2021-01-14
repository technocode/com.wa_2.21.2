package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0J9  reason: invalid class name */
public class AnonymousClass0J9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;

    public AnonymousClass0J9(UserJid userJid, long j, String str, String str2, int i, byte[] bArr, int i2, AnonymousClass0OB r11) {
        this.A06 = userJid;
        this.A05 = j;
        this.A07 = str;
        this.A08 = str2;
        this.A03 = i;
        this.A09 = bArr;
        this.A02 = i2;
        this.A01 = r11.A01;
        this.A00 = r11.A00;
        this.A04 = r11.A02;
    }

    public AnonymousClass0OB A00() {
        return new AnonymousClass0OB(this.A01, this.A00, this.A04);
    }

    public boolean A01() {
        String str = this.A07;
        return str != null && str.startsWith("ent:");
    }
}
