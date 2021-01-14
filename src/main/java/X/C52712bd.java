package X;

import com.whatsapp.util.Log;

/* renamed from: X.2bd  reason: invalid class name and case insensitive filesystem */
public class C52712bd extends AbstractC48162Ld {
    public final long A00;
    public final AnonymousClass02N A01;
    public final C007303n A02;
    public final boolean A03;

    public C52712bd(String str, C007303n r13, boolean z, long j, long j2, AnonymousClass0DM r19, boolean z2, AnonymousClass02N r21) {
        super(j, str, 3, r19, z2, C48192Lg.A03, "regular_high");
        this.A02 = r13;
        this.A01 = r21;
        this.A03 = z;
        this.A00 = j2;
    }

    public static C52712bd A01(boolean z, String str, C48172Le r14) {
        String[] strArr = r14.A06;
        C48192Lg r10 = r14.A01;
        C77303fw r3 = r14.A03;
        if (strArr.length == 5 && "deleteMessageForMe".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("delete-message-for-me-mutation/from-key-value unable to create chat jid from "), strArr[1]);
                return null;
            }
            String str2 = strArr[3];
            Boolean A002 = C48182Lf.A00(str2);
            if (A002 == null) {
                StringBuilder A0S = AnonymousClass008.A0S("delete-message-for-me-mutation/from-key-value value=");
                A0S.append(str2);
                A0S.append(" at index=");
                A0S.append(3);
                A0S.append(" is not one of the valid strings");
                Log.e(A0S.toString());
                return null;
            } else if (C48192Lg.A03.equals(r10) && r3 != null) {
                int i = r3.A00;
                if ((i & 1) == 1 && (i & 32768) == 32768) {
                    C77003fS r0 = r3.A06;
                    if (r0 == null) {
                        r0 = C77003fS.A03;
                    }
                    int i2 = r0.A00;
                    if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                        C007303n r6 = new C007303n(A012, A002.booleanValue(), strArr[2]);
                        AnonymousClass02N A013 = AnonymousClass02N.A01(strArr[4]);
                        C77003fS r02 = r3.A06;
                        if (r02 == null) {
                            r02 = C77003fS.A03;
                        }
                        return new C52712bd(str, r6, r02.A02, r3.A01, r02.A01, r14.A02, z, A013);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        C76933fL A04 = super.A04();
        AbstractC04160Jh A0B = C77003fS.A03.AQb();
        boolean z = this.A03;
        A0B.A02();
        C77003fS r1 = (C77003fS) A0B.A00;
        r1.A00 |= 1;
        r1.A02 = z;
        long j = this.A00;
        A0B.A02();
        C77003fS r12 = (C77003fS) A0B.A00;
        r12.A00 |= 2;
        r12.A01 = j;
        A04.A02();
        C77303fw r2 = (C77303fw) A04.A00;
        if (r2 != null) {
            r2.A06 = (C77003fS) A0B.A01();
            r2.A00 |= 32768;
            return A04;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("DeleteMessageForMeMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", key=");
        A0S.append(this.A02);
        A0S.append(", participant=");
        A0S.append(this.A01);
        A0S.append(", deleteMedia=");
        A0S.append(this.A03);
        A0S.append(", timestamp=");
        A0S.append(this.A04);
        A0S.append(", messageTimestamp=");
        A0S.append(this.A00);
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
