package X;

/* renamed from: X.2bi  reason: invalid class name and case insensitive filesystem */
public class C52762bi extends AbstractC48162Ld {
    public final String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52762bi(java.lang.String r10, java.lang.String r11, long r12, X.AnonymousClass0DM r14, X.C000300f r15) {
        /*
            r9 = this;
            X.2Lg r7 = X.C48192Lg.A03
            X.03a r0 = X.AbstractC000400g.A41
            int r1 = r15.A06(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0019
            java.lang.String r8 = "generic"
        L_0x000d:
            r4 = 1
            r6 = 0
            r3 = r10
            r0 = r9
            r1 = r12
            r5 = r14
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            r9.A00 = r11
            return
        L_0x0019:
            java.lang.String r8 = "critical_block"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52762bi.<init>(java.lang.String, java.lang.String, long, X.0DM, X.00f):void");
    }

    public static C52762bi A01(String str, C48172Le r7, C000300f r8) {
        String[] strArr = r7.A06;
        C48192Lg r5 = r7.A01;
        C77303fw r4 = r7.A03;
        if (strArr.length == 1 && "setting_pushName".equals(strArr[0]) && C48192Lg.A03.equals(r5) && r4 != null) {
            int i = r4.A00;
            if ((i & 1) == 1 && (i & 64) == 64) {
                C77163fi r1 = r4.A0E;
                if (r1 == null) {
                    r1 = C77163fi.A02;
                }
                if ((r1.A00 & 1) == 1) {
                    return new C52762bi(str, r1.A01, r4.A01, r7.A02, r8);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C77163fi.A02.AQb();
        String str = this.A00;
        A0B.A02();
        C77163fi r1 = (C77163fi) A0B.A00;
        if (str != null) {
            r1.A00 |= 1;
            r1.A01 = str;
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r12 = (C77303fw) A04.A00;
            if (r12 != null) {
                r12.A0E = (C77163fi) A0B.A01();
                r12.A00 |= 64;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("PushNameSettingMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", pushName=");
        A0S.append(this.A00);
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
