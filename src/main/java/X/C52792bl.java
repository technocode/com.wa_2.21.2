package X;

import com.whatsapp.util.Log;

/* renamed from: X.2bl  reason: invalid class name and case insensitive filesystem */
public class C52792bl extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final C007303n A01;
    public final boolean A02;

    public C52792bl(String str, C007303n r12, boolean z, long j, AnonymousClass0DM r16, boolean z2, AnonymousClass02N r18) {
        super(j, str, 2, r16, z2, C48192Lg.A03, "regular");
        this.A01 = r12;
        this.A00 = r18;
        this.A02 = z;
    }

    public static C52792bl A01(boolean z, String str, C48172Le r14) {
        String[] strArr = r14.A06;
        C48192Lg r10 = r14.A01;
        C77303fw r4 = r14.A03;
        if (strArr.length == 5 && "star".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("star-message-mutation/from-key-value unable to create chat jid from "), strArr[1]);
                return null;
            }
            String str2 = strArr[3];
            Boolean A002 = C48182Lf.A00(str2);
            if (A002 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("star-message-mutation/from-key-value value=");
                A0S.append(str2);
                A0S.append(" at index=");
                A0S.append(3);
                A0S.append(" is not one of the valid strings");
                Log.e(A0S.toString());
                return null;
            } else if (C48192Lg.A03.equals(r10) && r4 != null) {
                int i = r4.A00;
                if ((i & 1) == 1 && (i & 2) == 2) {
                    C77283fu r0 = r4.A0K;
                    if (r0 == null) {
                        r0 = C77283fu.A02;
                    }
                    if ((r0.A00 & 1) == 1) {
                        C007303n r5 = new C007303n(A012, A002.booleanValue(), strArr[2]);
                        AnonymousClass02N A013 = AnonymousClass02N.A01(strArr[4]);
                        C77283fu r02 = r4.A0K;
                        if (r02 == null) {
                            r02 = C77283fu.A02;
                        }
                        return new C52792bl(str, r5, r02.A01, r4.A01, r14.A02, z, A013);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        C76933fL A04 = super.A04();
        AbstractC04160Jh A0B = C77283fu.A02.AQb();
        boolean z = this.A02;
        A0B.A02();
        C77283fu r1 = (C77283fu) A0B.A00;
        r1.A00 |= 1;
        r1.A01 = z;
        A04.A02();
        C77303fw r12 = (C77303fw) A04.A00;
        if (r12 != null) {
            r12.A0K = (C77283fu) A0B.A01();
            r12.A00 |= 2;
            return A04;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("StarMessageMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", key=");
        A0S.append(this.A01);
        A0S.append(", participant=");
        A0S.append(this.A00);
        A0S.append(", starred=");
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
