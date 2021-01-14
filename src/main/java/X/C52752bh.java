package X;

/* renamed from: X.2bh  reason: invalid class name and case insensitive filesystem */
public class C52752bh extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final boolean A01;

    public C52752bh(String str, AnonymousClass02N r11, boolean z, long j, AnonymousClass0DM r15, boolean z2) {
        super(j, str, 3, r15, z2, C48192Lg.A03, "regular_low");
        this.A00 = r11;
        this.A01 = z;
    }

    public static C52752bh A01(boolean z, String str, C48172Le r14) {
        String[] strArr = r14.A06;
        C48192Lg r5 = r14.A01;
        C77303fw r3 = r14.A03;
        if (strArr.length == 2 && "pin".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("pin-chat-mutation/from-key-value unable to create chat jid from "), strArr[1]);
                return null;
            } else if (C48192Lg.A03.equals(r5) && r3 != null) {
                int i = r3.A00;
                if ((i & 1) == 1 && (i & 16) == 16) {
                    C77143fg r1 = r3.A0D;
                    if (r1 == null) {
                        r1 = C77143fg.A02;
                    }
                    if ((r1.A00 & 1) == 1) {
                        return new C52752bh(str, A012, r1.A01, r3.A01, r14.A02, z);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C77143fg.A02.AQb();
        boolean z = this.A01;
        A0B.A02();
        C77143fg r1 = (C77143fg) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = z;
        C76933fL A04 = super.A04();
        A04.A02();
        C77303fw r12 = (C77303fw) A04.A00;
        if (r12 != null) {
            r12.A0D = (C77143fg) A0B.A01();
            r12.A00 |= 16;
            return A04;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("PinChatMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A00);
        A0S.append(", isPinned=");
        A0S.append(this.A01);
        A0S.append(", timestamp=");
        A0S.append(this.A04);
        A0S.append(", areDependenciesMissing=");
        A0S.append(A02());
        A0S.append(", operation=");
        A0S.append(this.A05);
        A0S.append(", collectionName=");
        A0S.append(this.A06);
        A0S.append(", keyId=");
        A0S.append(super.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
