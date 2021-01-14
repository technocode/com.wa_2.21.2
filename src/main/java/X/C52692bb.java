package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2bb  reason: invalid class name and case insensitive filesystem */
public class C52692bb extends AbstractC48162Ld {
    public final UserJid A00;
    public final String A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r1[0].equals(r3) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52692bb(java.lang.String r14, long r15, X.AnonymousClass0DM r17, boolean r18, com.whatsapp.jid.UserJid r19, java.lang.String r20, java.lang.String r21, X.C48192Lg r22) {
        /*
            r13 = this;
            r3 = r20
            r1 = r21
            r8 = 2
            java.lang.String r12 = "critical_unblock_low"
            r10 = r18
            r9 = r17
            r4 = r13
            r7 = r14
            r11 = r22
            r5 = r15
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            r0 = r19
            r13.A00 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0020
            r1 = r2
        L_0x0020:
            r13.A01 = r1
            if (r20 == 0) goto L_0x0039
            java.lang.String r0 = " "
            java.lang.String[] r1 = r1.split(r0)
            int r0 = r1.length
            if (r0 == 0) goto L_0x0036
            r0 = 0
            r0 = r1[r0]
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0039
        L_0x0036:
            r13.A02 = r3
            return
        L_0x0039:
            r3 = r2
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52692bb.<init>(java.lang.String, long, X.0DM, boolean, com.whatsapp.jid.UserJid, java.lang.String, java.lang.String, X.2Lg):void");
    }

    public static C52692bb A01(boolean z, String str, C48172Le r18) {
        String[] strArr = r18.A06;
        C48192Lg r6 = r18.A01;
        C77303fw r2 = r18.A03;
        String str2 = null;
        if (strArr.length == 2 && "contact".equals(strArr[0])) {
            UserJid nullable = UserJid.getNullable(strArr[1]);
            if (nullable == null) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("contact-mutation/from-key-value unable to create user jid from "), strArr[1]);
                return null;
            }
            C48192Lg r15 = C48192Lg.A03;
            if (r15.equals(r6)) {
                if (r2 != null) {
                    int i = r2.A00;
                    if ((i & 1) == 1 && (i & 4) == 4) {
                        long j = r2.A01;
                        AnonymousClass0N4 r22 = r2.A04;
                        if (r22 == null) {
                            r22 = AnonymousClass0N4.A03;
                        }
                        int i2 = r22.A00;
                        if ((i2 & 1) == 1) {
                            String str3 = r22.A02;
                            if ((i2 & 2) == 2) {
                                str2 = r22.A01;
                            }
                            return new C52692bb(str, j, r18.A02, z, nullable, str2, str3, r15);
                        }
                        Log.e("contact-mutation/from-key-value fullName was not in contactAction protobuf");
                        return null;
                    }
                }
                Log.e("contact-mutation/from-key-value syncActionValue is null, missing timestamp, or is missing contactAction");
                return null;
            }
            C48192Lg r1 = C48192Lg.A02;
            if (r1.equals(r6)) {
                return new C52692bb(str, 0, r18.A02, z, nullable, null, null, r1);
            }
            StringBuilder sb = new StringBuilder("contact-mutation/from-key-value unknown operation: ");
            sb.append(r6);
            Log.e(sb.toString());
        }
        return null;
    }

    @Override // X.AbstractC48162Ld
    public C76933fL A04() {
        if (this.A05.equals(C48192Lg.A02)) {
            return null;
        }
        AbstractC04160Jh A0B = AnonymousClass0N4.A03.AQb();
        String str = this.A01;
        A0B.A02();
        AnonymousClass0N4 r1 = (AnonymousClass0N4) A0B.A00;
        if (str != null) {
            r1.A00 |= 1;
            r1.A02 = str;
            String str2 = this.A02;
            if (!TextUtils.isEmpty(str2)) {
                A0B.A02();
                AnonymousClass0N4 r12 = (AnonymousClass0N4) A0B.A00;
                if (str2 != null) {
                    r12.A00 |= 2;
                    r12.A01 = str2;
                } else {
                    throw null;
                }
            }
            C76933fL A04 = super.A04();
            A04.A02();
            C77303fw r13 = (C77303fw) A04.A00;
            if (r13 != null) {
                r13.A04 = (AnonymousClass0N4) A0B.A01();
                r13.A00 |= 4;
                return A04;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AbstractC48162Ld
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("ContactMutation{rowId=");
        A0S.append(this.A07);
        A0S.append(", contactJid=");
        A0S.append(this.A00);
        A0S.append(", givenName=");
        A0S.append(this.A02);
        A0S.append(", displayName=");
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
