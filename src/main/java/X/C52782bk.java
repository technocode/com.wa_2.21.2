package X;

/* renamed from: X.2bk  reason: invalid class name and case insensitive filesystem */
public class C52782bk extends AbstractC48162Ld {
    public final boolean A00;

    public C52782bk(String str, boolean z, long j, AnonymousClass0DM r14) {
        super(j, str, 2, r14, false, C48192Lg.A03, "critical_block");
        this.A00 = z;
    }

    public static C52782bk A01(String str, C48172Le r7) {
        String[] strArr = r7.A06;
        C48192Lg r5 = r7.A01;
        C77303fw r4 = r7.A03;
        if (strArr.length == 1 && "setting_securityNotification".equals(strArr[0]) && C48192Lg.A03.equals(r5) && r4 != null) {
            int i = r4.A00;
            if ((i & 1) == 1 && (i & 32) == 32) {
                C77263fs r1 = r4.A0J;
                if (r1 == null) {
                    r1 = C77263fs.A02;
                }
                if ((r1.A00 & 1) == 1) {
                    return new C52782bk(str, r1.A01, r4.A01, r7.A02);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C77263fs.A02.AQb();
        boolean z = this.A00;
        A0B.A02();
        C77263fs r1 = (C77263fs) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = z;
        C76933fL A04 = super.A04();
        A04.A02();
        C77303fw r12 = (C77303fw) A04.A00;
        if (r12 != null) {
            r12.A0J = (C77263fs) A0B.A01();
            r12.A00 |= 32;
            return A04;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SecurityNotificationSettingMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", showNotification=");
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
