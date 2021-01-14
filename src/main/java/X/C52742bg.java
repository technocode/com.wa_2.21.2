package X;

/* renamed from: X.2bg  reason: invalid class name and case insensitive filesystem */
public class C52742bg extends AbstractC48162Ld {
    public final long A00;
    public final AnonymousClass02N A01;
    public final boolean A02;

    public C52742bg(String str, AnonymousClass02N r11, boolean z, AnonymousClass0DM r13, boolean z2, long j, long j2) {
        super(j2, str, 2, r13, z2, C48192Lg.A03, "regular_high");
        this.A01 = r11;
        this.A02 = z;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r13 != -1) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C52742bg A01(boolean r17, java.lang.String r18, X.C48172Le r19) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52742bg.A01(boolean, java.lang.String, X.2Le):X.2bg");
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C77123fe.A03.AQb();
        boolean z = this.A02;
        A0B.A02();
        C77123fe r1 = (C77123fe) A0B.A00;
        r1.A00 |= 1;
        r1.A02 = z;
        if (z) {
            long j = this.A00;
            A0B.A02();
            C77123fe r12 = (C77123fe) A0B.A00;
            r12.A00 |= 2;
            r12.A01 = j;
        }
        C76933fL A04 = super.A04();
        A04.A02();
        C77303fw r13 = (C77303fw) A04.A00;
        if (r13 != null) {
            r13.A0C = (C77123fe) A0B.A01();
            r13.A00 |= 8;
            return A04;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("MuteChatMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A01);
        A0S.append(", muteEndTimestamp=");
        A0S.append(this.A00);
        A0S.append(", isMuted=");
        A0S.append(this.A02);
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
