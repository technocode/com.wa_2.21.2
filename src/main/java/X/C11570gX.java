package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.0gX  reason: invalid class name and case insensitive filesystem */
public class C11570gX {
    public static final byte[] A06 = {69, 68, 0, 1};
    public static final byte[] A07 = {87, 65, 4, 1};
    public final AnonymousClass00S A00;
    public final C11310g4 A01;
    public final C03260Fm A02;
    public final C68103Bs A03;
    public final C11620ge A04;
    public final C11630gf A05;

    public C11570gX(AnonymousClass00S r16, C03260Fm r17, C11310g4 r18, C11470gL r19, C11460gK r20, InputStream inputStream, OutputStream outputStream) {
        C68103Bs r0;
        byte[] decode;
        int length;
        this.A00 = r16;
        this.A02 = r17;
        C11470gL A002 = C11470gL.A00();
        String string = this.A02.A00.A00.getString("routing_info", null);
        if (!TextUtils.isEmpty(string) && (decode = Base64.decode(string, 3)) != null && (length = decode.length) > 0) {
            Log.d("noisesocket/maybe-send-edge-header sending edge header");
            outputStream.write(A06);
            byte[] bArr = new byte[3];
            bArr[2] = (byte) length;
            bArr[1] = (byte) (length >> 8);
            bArr[0] = (byte) (length >> 16);
            outputStream.write(bArr);
            outputStream.write(decode);
        }
        byte[] bArr2 = A07;
        outputStream.write(bArr2);
        this.A01 = r18;
        this.A04 = new C11620ge(inputStream);
        this.A05 = new C11630gf(outputStream);
        if (r20 == null) {
            try {
                C11640gg r7 = new C11640gg(C11640gg.A05, bArr2);
                byte[] bArr3 = A002.A02.A01;
                r7.A03.A00(bArr3);
                AbstractC04160Jh A0B = C11840h4.A04.AQb();
                AnonymousClass071 A003 = AnonymousClass071.A00(bArr3, 0, bArr3.length);
                A0B.A02();
                C11840h4 r1 = (C11840h4) A0B.A00;
                r1.A00 |= 1;
                r1.A01 = A003;
                C11840h4 r3 = (C11840h4) A0B.A01();
                AbstractC04160Jh A0B2 = C11860h6.A04.AQb();
                A0B2.A02();
                C11860h6 r12 = (C11860h6) A0B2.A00;
                if (r3 != null) {
                    r12.A02 = r3;
                    r12.A00 |= 1;
                    this.A05.write(A0B2.A01().A09());
                    r0 = A01(r7, A002, r19, A00());
                } else {
                    throw null;
                }
            } catch (C68123Bu e) {
                C77433g9 r32 = e.serverHello;
                C11640gg r2 = new C11640gg(C11640gg.A04, bArr2);
                r2.A03.A00(A002.A02.A01);
                r0 = A01(r2, A002, r19, r32);
            }
        } else {
            try {
                C11640gg r13 = new C11640gg(C11640gg.A06, bArr2);
                C11460gK r8 = new C11460gK(r13.A01(r20.A01));
                byte[] bArr4 = A002.A02.A01;
                C11650gh r11 = r13.A03;
                r11.A00(bArr4);
                C11480gM r33 = A002.A01;
                C11580gY A004 = C11580gY.A00();
                byte[] bArr5 = r8.A01;
                byte[] bArr6 = r33.A01;
                r13.A00(A004.A04(bArr5, bArr6));
                byte[] A022 = r13.A02(r19.A02.A01);
                C11480gM r34 = r19.A01;
                C11580gY A005 = C11580gY.A00();
                byte[] bArr7 = r34.A01;
                r13.A00(A005.A04(bArr5, bArr7));
                byte[] A023 = r13.A02(this.A01.A09());
                AbstractC04160Jh A0B3 = C11840h4.A04.AQb();
                AnonymousClass071 A006 = AnonymousClass071.A00(bArr4, 0, bArr4.length);
                A0B3.A02();
                C11840h4 r22 = (C11840h4) A0B3.A00;
                r22.A00 |= 1;
                r22.A01 = A006;
                AnonymousClass071 A007 = AnonymousClass071.A00(A022, 0, A022.length);
                A0B3.A02();
                C11840h4 r23 = (C11840h4) A0B3.A00;
                r23.A00 |= 2;
                r23.A03 = A007;
                AnonymousClass071 A008 = AnonymousClass071.A00(A023, 0, A023.length);
                A0B3.A02();
                C11840h4 r24 = (C11840h4) A0B3.A00;
                r24.A00 |= 4;
                r24.A02 = A008;
                C11840h4 r72 = (C11840h4) A0B3.A01();
                AbstractC04160Jh A0B4 = C11860h6.A04.AQb();
                A0B4.A02();
                C11860h6 r25 = (C11860h6) A0B4.A00;
                if (r72 != null) {
                    r25.A02 = r72;
                    r25.A00 |= 1;
                    this.A05.write(A0B4.A01().A09());
                    C77433g9 A009 = A00();
                    if ((A009.A00 & 2) == 2) {
                        throw new C68123Bu(A009);
                    }
                    byte[] A012 = A009.A01.A01();
                    r11.A00(A012);
                    int length2 = A012.length;
                    if (length2 == 32) {
                        r13.A00(C11580gY.A00().A04(A012, bArr6));
                        r13.A00(C11580gY.A00().A04(A012, bArr7));
                        r13.A01(A009.A02.A01());
                        byte[][] A09 = C05360Of.A09(C002001d.A3p(new byte[0], r13.A02, null, 64));
                        r0 = new C68103Bs(A09[0], A09[1], r8);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Wrong length: ");
                        sb.append(length2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    throw null;
                }
            } catch (C68163By e2) {
                throw new C68113Bt(e2);
            }
        }
        this.A03 = r0;
    }

    public final C77433g9 A00() {
        C11620ge r2 = this.A04;
        byte[] A002 = r2.A00(3);
        if (!Arrays.equals(C11620ge.A01, A002)) {
            C11860h6 r22 = (C11860h6) AnonymousClass078.A02(C11860h6.A04, r2.A00(C05360Of.A01(A002)));
            if ((r22.A00 & 2) == 2) {
                C77433g9 r0 = r22.A03;
                if (r0 == null) {
                    return C77433g9.A04;
                }
                return r0;
            }
            throw new IOException("Handshake message does not contain server hello!");
        }
        throw new C68133Bv();
    }

    public final C68103Bs A01(C11640gg r12, C11470gL r13, C11470gL r14, C77433g9 r15) {
        try {
            byte[] A012 = r15.A01.A01();
            r12.A03.A00(A012);
            int length = A012.length;
            if (length == 32) {
                C11480gM r1 = r13.A01;
                C11580gY A002 = C11580gY.A00();
                byte[] bArr = r1.A01;
                r12.A00(A002.A04(A012, bArr));
                C11460gK r5 = new C11460gK(r12.A01(r15.A03.A01()));
                C11580gY A003 = C11580gY.A00();
                byte[] bArr2 = r5.A01;
                r12.A00(A003.A04(bArr2, bArr));
                byte[] A013 = r12.A01(r15.A02.A01());
                AnonymousClass00S r4 = this.A00;
                try {
                    C77473gD r2 = (C77473gD) AnonymousClass078.A02(C77473gD.A03, A013);
                    byte[] A014 = r2.A01.A01();
                    try {
                        C77463gC r6 = (C77463gC) AnonymousClass078.A02(C77463gC.A06, A014);
                        C11460gK r8 = (C11460gK) C68153Bx.A00.get(r6.A04);
                        if (r8 == null) {
                            AnonymousClass008.A1T(AnonymousClass008.A0S("noise certificate issued by unknown source; issuer="), r6.A04);
                        } else {
                            if (!C11580gY.A00().A03(r8.A01, A014, r2.A02.A01())) {
                                AnonymousClass008.A1T(AnonymousClass008.A0S("invalid signature on noise certificate; issuer="), r6.A04);
                            } else if (!Arrays.equals(r6.A03.A01(), bArr2)) {
                                AnonymousClass008.A1T(AnonymousClass008.A0S("noise certificate key does not match proposed server static key; issuer="), r6.A04);
                            } else if ((r6.A00 & 4) != 4 || r6.A02 >= r4.A05() / 1000) {
                                byte[] A022 = r12.A02(r14.A02.A01);
                                r12.A00(C11580gY.A00().A04(A012, r14.A01.A01));
                                byte[] A023 = r12.A02(this.A01.A09());
                                AbstractC04160Jh A0B = C77413g7.A03.AQb();
                                AnonymousClass071 A004 = AnonymousClass071.A00(A022, 0, A022.length);
                                A0B.A02();
                                C77413g7 r16 = (C77413g7) A0B.A00;
                                r16.A00 |= 1;
                                r16.A02 = A004;
                                AnonymousClass071 A005 = AnonymousClass071.A00(A023, 0, A023.length);
                                A0B.A02();
                                C77413g7 r17 = (C77413g7) A0B.A00;
                                r17.A00 |= 2;
                                r17.A01 = A005;
                                C77413g7 r3 = (C77413g7) A0B.A01();
                                AbstractC04160Jh A0B2 = C11860h6.A04.AQb();
                                A0B2.A02();
                                C11860h6 r18 = (C11860h6) A0B2.A00;
                                if (r3 != null) {
                                    r18.A01 = r3;
                                    r18.A00 |= 4;
                                    this.A05.write(A0B2.A01().A09());
                                    byte[][] A09 = C05360Of.A09(C002001d.A3p(new byte[0], r12.A02, null, 64));
                                    return new C68103Bs(A09[0], A09[1], r5);
                                }
                                throw null;
                            } else {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
                                StringBuilder A0S = AnonymousClass008.A0S("noise certificate expired; issuer=");
                                A0S.append(r6.A04);
                                A0S.append("; expires=");
                                A0S.append(simpleDateFormat.format(new Date(r6.A02 * 1000)));
                                Log.e(A0S.toString());
                            }
                        }
                    } catch (C04190Jk e) {
                        Log.e("noise certificate details parsing failed", e);
                    }
                } catch (C04190Jk e2) {
                    Log.e("noise certificate parsing failed", e2);
                }
                throw new C68143Bw(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Wrong length: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } catch (C68163By e3) {
            throw new C68113Bt(e3);
        }
    }
}
