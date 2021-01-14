package X;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: X.28D  reason: invalid class name */
public class AnonymousClass28D extends AbstractC05460Oq {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public byte[] A0C;

    public AnonymousClass28D(C007303n r2, long j) {
        super(r2, j, (byte) 35);
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r8) {
        AnonymousClass3JS r2;
        C04970Mo r4 = r8.A01;
        C76413eV r0 = ((C02840Dr) r4.A00).A0Q;
        if (r0 == null) {
            r0 = C76413eV.A09;
        }
        C76403eU r3 = (C76403eU) r0.AQb();
        C76123e2 r02 = ((C76413eV) r3.A00).A06;
        if (r02 == null) {
            r02 = C76123e2.A09;
        }
        AbstractC04160Jh A0B2 = r02.AQb();
        long j = this.A04;
        A0B2.A02();
        C76123e2 r6 = (C76123e2) A0B2.A00;
        r6.A00 |= 2;
        r6.A03 = j;
        int i = this.A03;
        if (i == 0) {
            r2 = AnonymousClass3JS.INITIAL_BOOTSTRAP;
        } else if (i == 1) {
            r2 = AnonymousClass3JS.INITIAL_STATUS_V3;
        } else if (i == 2) {
            r2 = AnonymousClass3JS.RECENT;
        } else if (i == 3) {
            r2 = AnonymousClass3JS.FULL;
        } else if (i == 4) {
            r2 = AnonymousClass3JS.PUSH_NAME;
        } else {
            throw new IllegalArgumentException(AnonymousClass008.A0G("Unexpected type (", i, ")"));
        }
        A0B2.A02();
        C76123e2 r1 = (C76123e2) A0B2.A00;
        if (r2 != null) {
            r1.A00 |= 32;
            r1.A02 = r2.value;
            int i2 = this.A00;
            if (i2 > 0) {
                A0B2.A02();
                C76123e2 r12 = (C76123e2) A0B2.A00;
                r12.A00 |= 64;
                r12.A01 = i2;
            }
            String str = this.A08;
            if (str != null) {
                A0B2.A02();
                C76123e2 r13 = (C76123e2) A0B2.A00;
                r13.A00 |= 16;
                r13.A07 = str;
            }
            String str2 = this.A0A;
            if (str2 != null) {
                byte[] decode = Base64.decode(str2, 0);
                AnonymousClass071 A002 = AnonymousClass071.A00(decode, 0, decode.length);
                A0B2.A02();
                C76123e2 r14 = (C76123e2) A0B2.A00;
                r14.A00 |= 1;
                r14.A05 = A002;
            }
            String str3 = this.A09;
            if (str3 != null) {
                byte[] decode2 = Base64.decode(str3, 0);
                AnonymousClass071 A003 = AnonymousClass071.A00(decode2, 0, decode2.length);
                A0B2.A02();
                C76123e2 r15 = (C76123e2) A0B2.A00;
                r15.A00 |= 8;
                r15.A04 = A003;
            }
            byte[] bArr = this.A0C;
            if (bArr != null) {
                AnonymousClass071 A004 = AnonymousClass071.A00(bArr, 0, bArr.length);
                A0B2.A02();
                C76123e2 r16 = (C76123e2) A0B2.A00;
                r16.A00 |= 4;
                r16.A06 = A004;
            }
            if (!TextUtils.isEmpty(this.A0B)) {
                String str4 = this.A0B;
                A0B2.A02();
                C76123e2 r17 = (C76123e2) A0B2.A00;
                if (str4 != null) {
                    r17.A00 |= 128;
                    r17.A08 = str4;
                } else {
                    throw null;
                }
            }
            r3.A04(AnonymousClass3JY.HISTORY_SYNC_NOTIFICATION);
            r3.A02();
            C76413eV r18 = (C76413eV) r3.A00;
            if (r18 != null) {
                r18.A06 = (C76123e2) A0B2.A01();
                r18.A00 |= 16;
                r4.A09(r3);
                return;
            }
            throw null;
        }
        throw null;
    }
}
