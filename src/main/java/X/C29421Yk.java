package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.1Yk  reason: invalid class name and case insensitive filesystem */
public class C29421Yk {
    public final AnonymousClass057 A00;
    public final AnonymousClass057 A01;
    public final AnonymousClass057 A02;
    public final AnonymousClass059 A03;
    public final AnonymousClass0OC A04;

    public C29421Yk(AnonymousClass057 r1, AnonymousClass057 r2, AnonymousClass059 r3, AnonymousClass057 r4, AnonymousClass0OC r5) {
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A04 = r5;
    }

    public void A00(C29501Yy r23) {
        AbstractC68363Cx r6;
        AbstractC68363Cx r9;
        synchronized (C29431Yl.A04) {
            AnonymousClass057 r0 = this.A00;
            AnonymousClass0OC r1 = this.A04;
            AnonymousClass1Yc r2 = r23.A03;
            AnonymousClass051 r02 = r0.A03;
            AnonymousClass0E6 A0u = C002001d.A0u(r1);
            byte[] bArr = r2.A00.A00;
            AnonymousClass051.A00(A0u);
            if (r23.A05 != null) {
                if (!C11580gY.A00().A03(r23.A03.A00.A00, r23.A05.A00(), r23.A06)) {
                    throw new C29361Ye("Invalid signature on device key!");
                }
            }
            if (r23.A05 != null) {
                AnonymousClass1Z0 A022 = this.A02.A02(this.A04);
                C29451Yn A032 = C05360Of.A03();
                AnonymousClass238 r8 = r23.A05;
                AnonymousClass238 r03 = r23.A04;
                if (r03 == null) {
                    r6 = AnonymousClass3XE.A00;
                } else {
                    r6 = new AnonymousClass3XF(r03);
                }
                if (r6 instanceof AnonymousClass3XF) {
                    Integer valueOf = Integer.valueOf(r23.A00);
                    if (valueOf != null) {
                        r9 = new AnonymousClass3XF(valueOf);
                    } else {
                        throw null;
                    }
                } else {
                    r9 = AnonymousClass3XE.A00;
                }
                C29351Yd A012 = this.A00.A01();
                AnonymousClass1Yc r12 = r23.A03;
                A022.A00(new AnonymousClass1Z1());
                AnonymousClass1Z1 r7 = A022.A01;
                C68273Co r15 = new C68273Co(A012, A032, r12, r8, r8, r6);
                try {
                    r7.A05();
                    AnonymousClass1Yc r10 = r15.A00;
                    r7.A09(r10);
                    C29351Yd r122 = r15.A01;
                    r7.A08(r122.A00);
                    C29451Yn A033 = C05360Of.A03();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[32];
                    Arrays.fill(bArr2, (byte) -1);
                    byteArrayOutputStream.write(bArr2);
                    AnonymousClass238 r11 = r15.A03;
                    byteArrayOutputStream.write(C05360Of.A06(r11, r122.A01));
                    AnonymousClass238 r13 = r10.A00;
                    AbstractC29461Yo r102 = r15.A04.A01;
                    byteArrayOutputStream.write(C05360Of.A06(r13, r102));
                    byteArrayOutputStream.write(C05360Of.A06(r11, r102));
                    AbstractC68363Cx r14 = r15.A05;
                    if (r14 instanceof AnonymousClass3XF) {
                        byteArrayOutputStream.write(C05360Of.A06((AnonymousClass238) r14.A00(), r102));
                    }
                    C68303Cr A0B = AnonymousClass1YV.A0B(byteArrayOutputStream.toByteArray());
                    C68313Cs r16 = A0B.A01;
                    AnonymousClass238 r112 = r15.A02;
                    byte[] A06 = C05360Of.A06(r112, A033.A01);
                    AbstractC68253Cm r132 = r16.A00;
                    C68243Cl r17 = new C68243Cl(r132.A01(A06, r16.A01, "WhisperRatchet".getBytes(), 64));
                    C68353Cw r18 = new C68353Cw(new C68313Cs(r132, r17.A01), new C68283Cp(r132, r17.A00, 0));
                    r7.A0A(r112, A0B.A00);
                    r7.A0B(A033, (C68283Cp) r18.A01);
                    r7.A0C((C68313Cs) r18.A00);
                    AnonymousClass1Z1 r72 = A022.A01;
                    int i = r23.A02;
                    AnonymousClass238 r62 = A032.A00;
                    AbstractC04160Jh A0B2 = AnonymousClass3Ai.A04.AQb();
                    A0B2.A02();
                    AnonymousClass3Ai r19 = (AnonymousClass3Ai) A0B2.A00;
                    r19.A00 |= 2;
                    r19.A02 = i;
                    byte[] A002 = r62.A00();
                    AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
                    A0B2.A02();
                    AnonymousClass3Ai r110 = (AnonymousClass3Ai) A0B2.A00;
                    r110.A00 |= 4;
                    r110.A03 = A003;
                    if (r9 instanceof AnonymousClass3XF) {
                        int intValue = ((Integer) r9.A00()).intValue();
                        A0B2.A02();
                        AnonymousClass3Ai r111 = (AnonymousClass3Ai) A0B2.A00;
                        r111.A00 |= 1;
                        r111.A01 = intValue;
                    }
                    AbstractC04160Jh A0B3 = r72.A00.AQb();
                    AnonymousClass3Ai r04 = (AnonymousClass3Ai) A0B2.A01();
                    A0B3.A02();
                    AnonymousClass3AO r113 = (AnonymousClass3AO) A0B3.A00;
                    if (r04 != null) {
                        r113.A0C = r04;
                        r113.A00 |= 128;
                        r72.A00 = (AnonymousClass3AO) A0B3.A01();
                        A022.A01.A06(this.A00.A07.A08.A02());
                        A022.A01.A07(r23.A01);
                        A022.A01.A0D(A032.A00.A00());
                        this.A02.A04(this.A04, A022);
                        this.A00.A03(this.A04, r23.A03);
                    } else {
                        throw null;
                    }
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            } else {
                throw new C29361Ye("No signed prekey!");
            }
        }
    }
}
