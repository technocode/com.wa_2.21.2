package X;

import android.text.TextUtils;

/* renamed from: X.22l  reason: invalid class name and case insensitive filesystem */
public class C449922l extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv {
    public C64562yO A00;
    public String A01;
    public String A02;

    public C449922l(C007303n r2, long j) {
        super(r2, j, (byte) 48);
    }

    public C449922l(C007303n r2, long j, C76183e8 r5) {
        super(r2, j, (byte) 48);
        this.A01 = r5.A09;
        this.A02 = r5.A0A;
        this.A00 = new C64562yO(r5);
    }

    public C449922l(C449922l r8, C007303n r9, long j) {
        super(r8, r9, j, true);
        this.A01 = r8.A01;
        this.A02 = r8.A02;
        this.A00 = r8.A00;
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r8) {
        C04970Mo r4 = r8.A01;
        C76183e8 r0 = ((C02840Dr) r4.A00).A0J;
        if (r0 == null) {
            r0 = C76183e8.A0B;
        }
        AbstractC04160Jh A0B = r0.AQb();
        if (!TextUtils.isEmpty(this.A01)) {
            String str = this.A01;
            A0B.A02();
            C76183e8 r1 = (C76183e8) A0B.A00;
            if (str != null) {
                r1.A01 |= 1;
                r1.A09 = str;
            } else {
                throw null;
            }
        }
        String str2 = this.A02;
        if (!TextUtils.isEmpty(str2)) {
            A0B.A02();
            C76183e8 r12 = (C76183e8) A0B.A00;
            if (str2 != null) {
                r12.A01 |= 2;
                r12.A0A = str2;
            } else {
                throw null;
            }
        }
        C64562yO r5 = this.A00;
        if (r5 != null) {
            AnonymousClass3JT r2 = r5.A01;
            A0B.A02();
            C76183e8 r13 = (C76183e8) A0B.A00;
            if (r2 != null) {
                r13.A01 |= 4;
                r13.A00 = r2.value;
                String str3 = r5.A03;
                A0B.A02();
                C76183e8 r14 = (C76183e8) A0B.A00;
                if (str3 != null) {
                    r14.A01 |= 8;
                    r14.A08 = str3;
                    byte[] bArr = r5.A07;
                    AnonymousClass071 A002 = AnonymousClass071.A00(bArr, 0, bArr.length);
                    A0B.A02();
                    C76183e8 r15 = (C76183e8) A0B.A00;
                    r15.A01 |= 16;
                    r15.A06 = A002;
                    long j = r5.A00;
                    A0B.A02();
                    C76183e8 r6 = (C76183e8) A0B.A00;
                    r6.A01 |= 32;
                    r6.A02 = j;
                    byte[] bArr2 = r5.A05;
                    AnonymousClass071 A003 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
                    A0B.A02();
                    C76183e8 r16 = (C76183e8) A0B.A00;
                    r16.A01 |= 64;
                    r16.A04 = A003;
                    byte[] bArr3 = r5.A04;
                    AnonymousClass071 A004 = AnonymousClass071.A00(bArr3, 0, bArr3.length);
                    A0B.A02();
                    C76183e8 r17 = (C76183e8) A0B.A00;
                    r17.A01 |= 128;
                    r17.A03 = A004;
                    String str4 = r5.A02;
                    A0B.A02();
                    C76183e8 r18 = (C76183e8) A0B.A00;
                    if (str4 != null) {
                        r18.A01 |= 256;
                        r18.A07 = str4;
                        byte[] bArr4 = r5.A06;
                        AnonymousClass071 A005 = AnonymousClass071.A00(bArr4, 0, bArr4.length);
                        A0B.A02();
                        C76183e8 r19 = (C76183e8) A0B.A00;
                        r19.A01 |= 512;
                        r19.A05 = A005;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        r4.A02();
        C02840Dr r110 = (C02840Dr) r4.A00;
        if (r110 != null) {
            r110.A0J = (C76183e8) A0B.A01();
            r110.A01 |= 1;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r4) {
        return new C449922l(this, r4, this.A0E);
    }
}
