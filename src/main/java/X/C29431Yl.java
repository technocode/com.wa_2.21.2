package X;

import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Yl  reason: invalid class name and case insensitive filesystem */
public class C29431Yl {
    public static final Object A04 = new Object();
    public final AnonymousClass057 A00;
    public final AnonymousClass057 A01;
    public final C29421Yk A02;
    public final AnonymousClass0OC A03;

    public C29431Yl(AnonymousClass057 r7, AnonymousClass057 r8, AnonymousClass059 r9, AnonymousClass057 r10, AnonymousClass0OC r11) {
        this.A01 = r7;
        this.A00 = r8;
        this.A03 = r11;
        this.A02 = new C29421Yk(r7, r8, r9, r10, r11);
    }

    public static final Cipher A00(int i, SecretKeySpec secretKeySpec, int i2) {
        try {
            Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
            byte[] bArr = new byte[16];
            bArr[3] = (byte) i2;
            bArr[2] = (byte) (i2 >> 8);
            bArr[1] = (byte) (i2 >> 16);
            bArr[0] = (byte) (i2 >> 24);
            instance.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static final Cipher A01(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, secretKeySpec, ivParameterSpec);
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.23A] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC29491Yx A02(byte[] r21) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29431Yl.A02(byte[]):X.1Yx");
    }

    public byte[] A03(AnonymousClass23A r19, AbstractC29331Ya r20) {
        AbstractC68363Cx r6;
        byte[] A05;
        AbstractC68363Cx r13;
        synchronized (A04) {
            AnonymousClass1Z0 A022 = this.A01.A02(this.A03);
            C29421Yk r10 = this.A02;
            AnonymousClass1Yc r8 = r19.A03;
            AnonymousClass0OC r7 = r10.A04;
            AnonymousClass051.A00(C002001d.A0u(r7));
            int i = r19.A02;
            AnonymousClass238 r2 = r19.A04;
            byte[] A002 = r2.A00();
            AnonymousClass1Z1 r11 = A022.A01;
            int i2 = r11.A00.A04;
            if (i2 == 0) {
                i2 = 2;
            }
            boolean z = true;
            if (i2 != i || !Arrays.equals(A002, r11.A00.A05.A01())) {
                Iterator it = A022.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AnonymousClass1Z1 r1 = (AnonymousClass1Z1) it.next();
                    int i3 = r1.A00.A04;
                    if (i3 == 0) {
                        i3 = 2;
                    }
                    if (i3 == i && Arrays.equals(A002, r1.A00.A05.A01())) {
                        break;
                    }
                }
            }
            if (z) {
                if (AnonymousClass1YV.A00 != null) {
                    Log.w(AnonymousClass008.A0M("SignalProtocolLogger (", "SessionBuilder", "): ", "We've already setup a session for this V3 message, letting bundled message fall through..."));
                }
                r6 = AnonymousClass3XE.A00;
            } else {
                AnonymousClass059 r12 = r10.A03;
                int i4 = r19.A01;
                r12.A01.A00();
                byte[] A012 = r12.A00.A01(i4);
                if (A012 != null) {
                    try {
                        AnonymousClass2BD r62 = (AnonymousClass2BD) AnonymousClass078.A02(AnonymousClass2BD.A06, A012);
                        StringBuilder sb = new StringBuilder();
                        sb.append("axolotl loaded a signed pre key with id ");
                        sb.append(i4);
                        Log.i(sb.toString());
                        try {
                            C29451Yn r122 = new C29451Yn(C05360Of.A02(r62.A04.A01()), new AnonymousClass3XA(r62.A03.A01()));
                            AnonymousClass057 r3 = r10.A00;
                            C29351Yd A013 = r3.A01();
                            r6 = r19.A06;
                            boolean z2 = r6 instanceof AnonymousClass3XF;
                            if (z2) {
                                AnonymousClass057 r14 = r10.A01;
                                int intValue = ((Integer) r6.A00()).intValue();
                                r14.A08.A00();
                                AnonymousClass04y r132 = r14.A04;
                                byte[] A042 = r132.A04(intValue);
                                if (A042 != null) {
                                    try {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("axolotl found a pre key with id ");
                                        sb2.append(intValue);
                                        Log.i(sb2.toString());
                                        AnonymousClass2B9 r15 = (AnonymousClass2B9) AnonymousClass078.A02(AnonymousClass2B9.A04, A042);
                                        try {
                                            r13 = new AnonymousClass3XF(new C29451Yn(C05360Of.A02(r15.A03.A01()), new AnonymousClass3XA(r15.A02.A01())));
                                        } catch (C29361Ye e) {
                                            throw new AssertionError(e);
                                        }
                                    } catch (IOException e2) {
                                        StringBuilder sb3 = new StringBuilder("error reading prekey ");
                                        sb3.append(intValue);
                                        sb3.append("; deleting");
                                        Log.e(sb3.toString(), e2);
                                        r132.A02(intValue);
                                        throw new C29371Yf(e2);
                                    }
                                } else {
                                    throw new C29371Yf(AnonymousClass008.A0F("No prekey found with id ", intValue));
                                }
                            } else {
                                r13 = AnonymousClass3XE.A00;
                            }
                            A022.A00(new AnonymousClass1Z1());
                            AnonymousClass1Z1 r112 = A022.A01;
                            if (r8 == null || r2 == null) {
                                throw new IllegalArgumentException("Null value!");
                            }
                            try {
                                r112.A05();
                                r112.A09(r8);
                                r112.A08(A013.A00);
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[32];
                                Arrays.fill(bArr, (byte) -1);
                                byteArrayOutputStream.write(bArr);
                                AnonymousClass238 r0 = r8.A00;
                                AbstractC29461Yo r142 = r122.A01;
                                byteArrayOutputStream.write(C05360Of.A06(r0, r142));
                                byteArrayOutputStream.write(C05360Of.A06(r2, A013.A01));
                                byteArrayOutputStream.write(C05360Of.A06(r2, r142));
                                if (r13 instanceof AnonymousClass3XF) {
                                    byteArrayOutputStream.write(C05360Of.A06(r2, ((C29451Yn) r13.A00()).A01));
                                }
                                C68303Cr A0B = AnonymousClass1YV.A0B(byteArrayOutputStream.toByteArray());
                                r112.A0B(r122, A0B.A00);
                                r112.A0C(A0B.A01);
                                A022.A01.A06(r3.A07.A08.A02());
                                A022.A01.A07(r19.A00);
                                A022.A01.A0D(r2.A00());
                                if (!z2 || ((Integer) r6.A00()).intValue() == 16777215) {
                                    r6 = AnonymousClass3XE.A00;
                                }
                            } catch (IOException e3) {
                                throw new AssertionError(e3);
                            }
                        } catch (C29361Ye e4) {
                            throw new AssertionError(e4);
                        }
                    } catch (IOException e5) {
                        StringBuilder sb4 = new StringBuilder("failed to parse signed pre key record during load for id ");
                        sb4.append(i4);
                        Log.e(sb4.toString(), e5);
                        throw new C29371Yf(AnonymousClass008.A0F("invalid prekey record with id ", i4));
                    }
                } else {
                    throw new C29371Yf(AnonymousClass008.A0F("no signed prekey available with id ", i4));
                }
            }
            r10.A00.A03(r7, r8);
            A05 = A05(A022, r19.A05);
            r20.AA9(A05);
            this.A01.A04(this.A03, A022);
            if (r6 instanceof AnonymousClass3XF) {
                AnonymousClass057 r22 = this.A00;
                int intValue2 = ((Integer) r6.A00()).intValue();
                r22.A08.A00();
                r22.A04.A02(intValue2);
            }
        }
        return A05;
    }

    public byte[] A04(AnonymousClass23C r6, AbstractC29331Ya r7) {
        byte[] A05;
        synchronized (A04) {
            if (this.A01.A07.A0W(C002001d.A0u(this.A03))) {
                AnonymousClass1Z0 A022 = this.A01.A02(this.A03);
                A05 = A05(A022, r6);
                r7.AA9(A05);
                this.A01.A04(this.A03, A022);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No session for: ");
                sb.append(this.A03);
                throw new C29411Yj(sb.toString());
            }
        }
        return A05;
    }

    public final byte[] A05(AnonymousClass1Z0 r6, AnonymousClass23C r7) {
        byte[] A06;
        synchronized (A04) {
            Iterator it = r6.A00.iterator();
            LinkedList linkedList = new LinkedList();
            try {
                AnonymousClass1Z1 r1 = new AnonymousClass1Z1(r6.A01);
                A06 = A06(r1, r7);
                r6.A01 = r1;
            } catch (C29381Yg e) {
                linkedList.add(e);
                while (it.hasNext()) {
                    try {
                        AnonymousClass1Z1 r12 = new AnonymousClass1Z1((AnonymousClass1Z1) it.next());
                        byte[] A062 = A06(r12, r7);
                        it.remove();
                        r6.A00(r12);
                        return A062;
                    } catch (C29381Yg e2) {
                        linkedList.add(e2);
                    }
                }
                throw new C29381Yg(linkedList);
            }
        }
        return A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0388  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A06(X.AnonymousClass1Z1 r17, X.AnonymousClass23C r18) {
        /*
        // Method dump skipped, instructions count: 975
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29431Yl.A06(X.1Z1, X.23C):byte[]");
    }
}
