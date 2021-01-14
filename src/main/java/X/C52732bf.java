package X;

import com.whatsapp.util.Log;

/* renamed from: X.2bf  reason: invalid class name and case insensitive filesystem */
public class C52732bf extends AbstractC48162Ld {
    public final AnonymousClass02N A00;
    public final C04820Ly A01;
    public final boolean A02;

    public C52732bf(String str, AnonymousClass02N r12, boolean z, long j, AnonymousClass0DM r16, boolean z2, C04820Ly r18) {
        super(j, str, 3, r16, z2, C48192Lg.A03, "regular_low");
        this.A00 = r12;
        this.A02 = z;
        this.A01 = r18;
    }

    public static C52732bf A01(boolean z, String str, C48172Le r17) {
        String[] strArr = r17.A06;
        C48192Lg r2 = r17.A01;
        C77303fw r5 = r17.A03;
        if (strArr.length == 2 && "markChatAsRead".equals(strArr[0])) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(strArr[1]);
            if (A012 == null) {
                Log.e("mark-chat-as-read-mutation/from-key-value unable to create chat jid");
                return null;
            } else if (C48192Lg.A03.equals(r2) && r5 != null) {
                int i = r5.A00;
                if ((i & 1) == 1 && (i & 131072) == 131072) {
                    C77103fc r22 = r5.A0B;
                    if (r22 == null) {
                        r22 = C77103fc.A03;
                    }
                    int i2 = r22.A00;
                    if ((i2 & 1) == 1 && (i2 & 2) == 2) {
                        boolean z2 = r22.A02;
                        long j = r5.A01;
                        AnonymousClass0DM r12 = r17.A02;
                        C04820Ly r14 = r22.A01;
                        if (r14 == null) {
                            r14 = C04820Ly.A04;
                        }
                        return new C52732bf(str, A012, z2, j, r12, z, r14);
                    }
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        AbstractC04160Jh A0B = C77103fc.A03.AQb();
        boolean z = this.A02;
        A0B.A02();
        C77103fc r1 = (C77103fc) A0B.A00;
        r1.A00 |= 1;
        r1.A02 = z;
        C04820Ly r0 = this.A01;
        A0B.A02();
        C77103fc r12 = (C77103fc) A0B.A00;
        if (r0 != null) {
            r12.A01 = r0;
            r12.A00 |= 2;
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r2 = (C77303fw) A04.A00;
            if (r2 != null) {
                r2.A0B = (C77103fc) A0B.A01();
                r2.A00 |= 131072;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("MarkChatAsReadMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", chatJid=");
        A0S.append(this.A00);
        A0S.append(", isRead=");
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
