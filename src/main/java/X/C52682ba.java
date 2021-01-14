package X;

import com.whatsapp.util.Log;

/* renamed from: X.2ba  reason: invalid class name and case insensitive filesystem */
public class C52682ba extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final C04820Ly A01;
    public final boolean A02;
    public final boolean A03;

    public C52682ba(String str, AnonymousClass02N r12, boolean z, boolean z2, long j, AnonymousClass0DM r17, boolean z3, C04820Ly r19) {
        super(j, str, 3, r17, z3, C48192Lg.A03, "regular_high");
        this.A00 = r12;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = r19;
    }

    public static C52682ba A01(boolean z, String str, C48172Le r21) {
        String[] strArr = r21.A06;
        C48192Lg r10 = r21.A01;
        C77303fw r6 = r21.A03;
        if (strArr.length == 4 && "clearChat".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                Log.e("clear-chat-mutation/from-key-value unable to create chat jid");
                return null;
            }
            String str2 = strArr[2];
            Boolean A002 = C48182Lf.A00(str2);
            if (A002 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("clear-chat-mutation/from-key-value value=");
                A0S.append(str2);
                A0S.append(" at index=");
                A0S.append(2);
                A0S.append(" is not one of the valid strings");
                Log.e(A0S.toString());
                return null;
            }
            String str3 = strArr[3];
            Boolean A003 = C48182Lf.A00(str3);
            if (A003 == null) {
                StringBuilder A0S2 = AnonymousClass008.A0S("clear-chat-mutation/from-key-value value=");
                A0S2.append(str3);
                A0S2.append(" at index=");
                A0S2.append(3);
                A0S2.append(" is not one of the valid strings");
                Log.e(A0S2.toString());
                return null;
            } else if (C48192Lg.A03.equals(r10) && r6 != null) {
                int i = r6.A00;
                if ((i & 1) == 1 && (i & 262144) == 262144) {
                    C76953fN r4 = r6.A03;
                    if (r4 == null) {
                        r4 = C76953fN.A02;
                    }
                    if ((r4.A00 & 1) == 1) {
                        boolean booleanValue = A002.booleanValue();
                        boolean booleanValue2 = A003.booleanValue();
                        long j = r6.A01;
                        AnonymousClass0DM r3 = r21.A02;
                        C04820Ly r0 = r4.A01;
                        if (r0 == null) {
                            r0 = C04820Ly.A04;
                        }
                        return new C52682ba(str, A012, booleanValue, booleanValue2, j, r3, z, r0);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C76953fN.A02.AQb();
        C04820Ly r0 = this.A01;
        A0B.A02();
        C76953fN r1 = (C76953fN) A0B.A00;
        if (r0 != null) {
            r1.A01 = r0;
            r1.A00 |= 1;
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r2 = (C77303fw) A04.A00;
            if (r2 != null) {
                r2.A03 = (C76953fN) A0B.A01();
                r2.A00 |= 262144;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ClearChatMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A00);
        A0S.append(", deleteStarredMessages=");
        A0S.append(this.A03);
        A0S.append(", deleteMediaFiles=");
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
