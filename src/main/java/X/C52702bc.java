package X;

import com.whatsapp.util.Log;

/* renamed from: X.2bc  reason: invalid class name and case insensitive filesystem */
public class C52702bc extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final C04820Ly A01;
    public final boolean A02;

    public C52702bc(String str, AnonymousClass02N r12, boolean z, long j, AnonymousClass0DM r16, boolean z2, C04820Ly r18) {
        super(j, str, 3, r16, z2, C48192Lg.A03, "regular_high");
        this.A00 = r12;
        this.A02 = z;
        this.A01 = r18;
    }

    public static C52702bc A01(boolean z, String str, C48172Le r17) {
        String[] strArr = r17.A06;
        C48192Lg r9 = r17.A01;
        C77303fw r7 = r17.A03;
        if (strArr.length == 3 && "deleteChat".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                Log.e("delete-chat-mutation/from-key-value unable to create chat jid");
                return null;
            }
            String str2 = strArr[2];
            Boolean A002 = C48182Lf.A00(str2);
            if (A002 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("delete-chat-mutation/from-key-value value=");
                A0S.append(str2);
                A0S.append(" at index=");
                A0S.append(2);
                A0S.append(" is not one of the valid strings");
                Log.e(A0S.toString());
                return null;
            } else if (C48192Lg.A03.equals(r9) && r7 != null) {
                int i = r7.A00;
                if ((i & 1) == 1 && (i & 524288) == 524288) {
                    C76983fQ r1 = r7.A05;
                    if (r1 == null) {
                        r1 = C76983fQ.A02;
                    }
                    if ((r1.A00 & 1) == 1) {
                        boolean booleanValue = A002.booleanValue();
                        long j = r7.A01;
                        AnonymousClass0DM r14 = r17.A02;
                        C04820Ly r0 = r1.A01;
                        if (r0 == null) {
                            r0 = C04820Ly.A04;
                        }
                        return new C52702bc(str, A012, booleanValue, j, r14, z, r0);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C76983fQ.A02.AQb();
        C04820Ly r0 = this.A01;
        A0B.A02();
        C76983fQ r1 = (C76983fQ) A0B.A00;
        if (r0 != null) {
            r1.A01 = r0;
            r1.A00 |= 1;
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r2 = (C77303fw) A04.A00;
            if (r2 != null) {
                r2.A05 = (C76983fQ) A0B.A01();
                r2.A00 |= 524288;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("DeleteChatMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A00);
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
