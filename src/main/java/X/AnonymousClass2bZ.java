package X;

/* renamed from: X.2bZ  reason: invalid class name */
public class AnonymousClass2bZ extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final C04820Ly A01;
    public final boolean A02;

    public AnonymousClass2bZ(String str, AnonymousClass02N r12, boolean z, long j, AnonymousClass0DM r16, boolean z2, C04820Ly r18) {
        super(j, str, 3, r16, z2, C48192Lg.A03, "regular_low");
        this.A00 = r12;
        this.A02 = z;
        this.A01 = r18;
    }

    public static AnonymousClass2bZ A01(boolean z, String str, C48172Le r18) {
        String[] strArr = r18.A06;
        C48192Lg r2 = r18.A01;
        C77303fw r5 = r18.A03;
        if (strArr.length == 2 && "archive".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("archive-chat-mutation/from-key-value unable to create chat jid from "), strArr[1]);
                return null;
            } else if (C48192Lg.A03.equals(r2) && r5 != null) {
                int i = r5.A00;
                if ((i & 1) == 1 && (i & 16384) == 16384) {
                    AnonymousClass0N6 r22 = r5.A02;
                    if (r22 == null) {
                        r22 = AnonymousClass0N6.A03;
                    }
                    int i2 = r22.A00;
                    if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                        boolean z2 = r22.A02;
                        long j = r5.A01;
                        AnonymousClass0DM r13 = r18.A02;
                        C04820Ly r15 = r22.A01;
                        if (r15 == null) {
                            r15 = C04820Ly.A04;
                        }
                        return new AnonymousClass2bZ(str, A012, z2, j, r13, z, r15);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = AnonymousClass0N6.A03.AQb();
        boolean z = this.A02;
        A0B.A02();
        AnonymousClass0N6 r1 = (AnonymousClass0N6) A0B.A00;
        r1.A00 |= 1;
        r1.A02 = z;
        C04820Ly r0 = this.A01;
        A0B.A02();
        AnonymousClass0N6 r12 = (AnonymousClass0N6) A0B.A00;
        if (r0 != null) {
            r12.A01 = r0;
            r12.A00 |= 2;
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r13 = (C77303fw) A04.A00;
            if (r13 != null) {
                r13.A02 = (AnonymousClass0N6) A0B.A01();
                r13.A00 |= 16384;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ArchiveChatMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A00);
        A0S.append(", isArchived=");
        A0S.append(this.A02);
        A0S.append(", messageRange=");
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
