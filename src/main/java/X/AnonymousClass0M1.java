package X;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0M1  reason: invalid class name */
public class AnonymousClass0M1 extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public String A00;
    public List A01;
    public List A02;
    public final C017009c A03;
    public final AnonymousClass01A A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass01X A06;

    public AnonymousClass0M1(AnonymousClass00G r2, AnonymousClass01A r3, AnonymousClass01X r4, C017009c r5, C007303n r6, long j) {
        super(r6, j, (byte) 14);
        this.A05 = r2;
        this.A04 = r3;
        this.A06 = r4;
        this.A03 = r5;
        super.A01 = 1;
    }

    public AnonymousClass0M1(AnonymousClass00G r8, AnonymousClass01A r9, AnonymousClass01X r10, C017009c r11, AnonymousClass0M1 r12, C007303n r13, long j, boolean z) {
        super(r12, r13, j, z);
        this.A05 = r8;
        this.A04 = r9;
        this.A06 = r10;
        this.A03 = r11;
        super.A01 = 1;
        this.A01 = r12.A01;
        this.A00 = r12.A00;
    }

    public List A0u() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        List A0B = C003701u.A0B(A0t());
        this.A01 = A0B;
        return A0B;
    }

    public void A0v(List list) {
        this.A01 = new ArrayList(list);
        this.A02 = null;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this.A01);
            A0o(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new AssertionError("ObjectOutputStream backed by ByteArrayOutputStream should not throw IOException");
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r11) {
        C04970Mo r5 = r11.A01;
        C75843da r0 = ((C02840Dr) r5.A00).A09;
        if (r0 == null) {
            r0 = C75843da.A04;
        }
        AbstractC04160Jh A0B = r0.AQb();
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            A0B.A02();
            C75843da r1 = (C75843da) A0B.A00;
            if (str != null) {
                r1.A00 |= 1;
                r1.A03 = str;
            } else {
                throw null;
            }
        }
        List A0u = A0u();
        int i = 0;
        while (i < A0u.size() && i < 257) {
            String str2 = (String) A0u.get(i);
            AbstractC04160Jh A0B2 = C75823dY.A04.AQb();
            String A002 = AnonymousClass1Z4.A00(this.A05, this.A04, this.A06, this.A03, str2);
            if (A002 != null) {
                A0B2.A02();
                C75823dY r12 = (C75823dY) A0B2.A00;
                if (A002 != null) {
                    r12.A00 |= 1;
                    r12.A02 = A002;
                } else {
                    throw null;
                }
            }
            A0B2.A02();
            C75823dY r13 = (C75823dY) A0B2.A00;
            if (str2 != null) {
                r13.A00 |= 2;
                r13.A03 = str2;
                AnonymousClass078 A012 = A0B2.A01();
                A0B.A02();
                C75843da r2 = (C75843da) A0B.A00;
                if (A012 != null) {
                    AbstractC04120Jd r14 = r2.A01;
                    if (!((AbstractC05040Mx) r14).A00) {
                        r14 = AnonymousClass078.A04(r14);
                        r2.A01 = r14;
                    }
                    r14.add(A012);
                    i++;
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        C007103l r3 = r11.A02;
        byte[] bArr = r11.A05;
        if (AnonymousClass0ZG.A0M(this, r3, bArr)) {
            C75423cu A022 = AnonymousClass0ZG.A02(r11.A00, this, r11.A03, r3, bArr);
            A0B.A02();
            C75843da r15 = (C75843da) A0B.A00;
            if (A022 != null) {
                r15.A02 = A022;
                r15.A00 |= 2;
            } else {
                throw null;
            }
        }
        r5.A02();
        C02840Dr r16 = (C02840Dr) r5.A00;
        if (r16 != null) {
            r16.A09 = (C75843da) A0B.A01();
            r16.A00 |= 4096;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass0M0
    public AbstractC007503q A2m(C007303n r11, long j) {
        return new AnonymousClass0M1(this.A05, this.A04, this.A06, this.A03, this, r11, j, false);
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r11) {
        return new AnonymousClass0M1(this.A05, this.A04, this.A06, this.A03, this, r11, this.A0E, true);
    }
}
