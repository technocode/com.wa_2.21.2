package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0ZF  reason: invalid class name */
public class AnonymousClass0ZF extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv {
    public long A00;
    public AnonymousClass02U A01;
    public UserJid A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;

    public AnonymousClass0ZF(AnonymousClass01I r3, C007303n r4, long j, C75983do r7, boolean z) {
        super(r4, j, (byte) 24);
        UserJid of;
        if (r4.A02) {
            r3.A04();
            of = r3.A03;
        } else {
            of = UserJid.of(r4.A00);
        }
        this.A02 = of;
        this.A01 = AnonymousClass02U.A03(r7.A05);
        this.A04 = r7.A06;
        this.A00 = r7.A01;
        this.A05 = r7.A07;
        this.A03 = r7.A04;
        byte[] A012 = r7.A02.A01();
        if (A012.length > 0) {
            super.A01 = 1;
            A0B().A04(A012, z);
        }
    }

    public AnonymousClass0ZF(C007303n r2, long j) {
        super(r2, j, (byte) 24);
    }

    public AnonymousClass0ZF(AnonymousClass0ZF r9, C007303n r10, long j) {
        super(r9, r10, j, true);
        this.A02 = r9.A02;
        this.A01 = r9.A01;
        this.A04 = r9.A04;
        this.A00 = r9.A00;
        this.A05 = r9.A05;
        this.A06 = r9.A06;
        this.A03 = r9.A03;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r7) {
        C04970Mo r5 = r7.A01;
        C75983do r0 = ((C02840Dr) r5.A00).A0G;
        if (r0 == null) {
            r0 = C75983do.A08;
        }
        AbstractC04160Jh A0B = r0.AQb();
        if (this.A01 != null) {
            String str = this.A05;
            if (str != null) {
                A0B.A02();
                C75983do r1 = (C75983do) A0B.A00;
                r1.A00 |= 2;
                r1.A07 = str;
            } else {
                Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
            }
            if (!r7.A04 || !this.A06) {
                long j = this.A00;
                A0B.A02();
                C75983do r12 = (C75983do) A0B.A00;
                r12.A00 |= 4;
                r12.A01 = j;
            } else {
                A0B.A02();
                C75983do r3 = (C75983do) A0B.A00;
                r3.A00 |= 4;
                r3.A01 = 0;
            }
            String str2 = this.A04;
            if (str2 != null) {
                A0B.A02();
                C75983do r13 = (C75983do) A0B.A00;
                r13.A00 |= 8;
                r13.A06 = str2;
            }
            String rawString = this.A01.getRawString();
            A0B.A02();
            C75983do r14 = (C75983do) A0B.A00;
            if (rawString != null) {
                r14.A00 |= 1;
                r14.A05 = rawString;
                if (!TextUtils.isEmpty(this.A03)) {
                    String str3 = this.A03;
                    A0B.A02();
                    C75983do r15 = (C75983do) A0B.A00;
                    if (str3 != null) {
                        r15.A00 |= 32;
                        r15.A04 = str3;
                    } else {
                        throw null;
                    }
                }
                C05440On A0B2 = A0B();
                if (!(A0B2 == null || A0B2.A08() == null)) {
                    byte[] A08 = A0B2.A08();
                    AnonymousClass071 A002 = AnonymousClass071.A00(A08, 0, A08.length);
                    A0B.A02();
                    C75983do r16 = (C75983do) A0B.A00;
                    r16.A00 |= 16;
                    r16.A02 = A002;
                }
                C007103l r32 = r7.A02;
                byte[] bArr = r7.A05;
                if (AnonymousClass0ZG.A0M(this, r32, bArr)) {
                    C75423cu A022 = AnonymousClass0ZG.A02(r7.A00, this, r7.A03, r32, bArr);
                    A0B.A02();
                    C75983do r17 = (C75983do) A0B.A00;
                    if (A022 != null) {
                        r17.A03 = A022;
                        r17.A00 |= 64;
                    } else {
                        throw null;
                    }
                }
                r5.A02();
                C02840Dr r2 = (C02840Dr) r5.A00;
                if (r2 != null) {
                    r2.A0G = (C75983do) A0B.A01();
                    r2.A00 |= 4194304;
                    return;
                }
                throw null;
            }
            throw null;
        }
        Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r4) {
        return new AnonymousClass0ZF(this, r4, this.A0E);
    }
}
