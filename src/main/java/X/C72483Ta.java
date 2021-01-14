package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Ta  reason: invalid class name and case insensitive filesystem */
public class C72483Ta implements AbstractC675238y {
    public C11260fz A00;

    @Override // X.AbstractC675238y
    public int A6u() {
        return 2;
    }

    public C72483Ta(C11260fz r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC675238y
    public UserJid A6x() {
        C007003k A02 = this.A00.A02();
        if (A02 == null) {
            return null;
        }
        return (UserJid) A02.A02(UserJid.class);
    }
}
