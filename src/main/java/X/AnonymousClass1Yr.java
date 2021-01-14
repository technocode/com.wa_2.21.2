package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Yr  reason: invalid class name */
public class AnonymousClass1Yr {
    public static final Object A02 = new Object();
    public final AnonymousClass058 A00;
    public final AnonymousClass0OD A01;

    public AnonymousClass1Yr(AnonymousClass058 r1, AnonymousClass0OD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A00(byte[] r12) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Yr.A00(byte[]):byte[]");
    }

    public byte[] A01(byte[] bArr, AbstractC29331Ya r14) {
        C68223Cj r1;
        byte[] doFinal;
        C77743gv r8;
        synchronized (A02) {
            try {
                C29481Yv A002 = this.A00.A00(this.A01);
                if (!A002.A00.isEmpty()) {
                    AnonymousClass3XD r3 = new AnonymousClass3XD(bArr);
                    int i = r3.A01;
                    Iterator it = A002.A00.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1Yw r5 = (AnonymousClass1Yw) it.next();
                        if (r5.A00.A01 == i) {
                            C77763gx r0 = r5.A00.A04;
                            if (r0 == null) {
                                r0 = C77763gx.A03;
                            }
                            r3.A00(C05360Of.A02(r0.A02.A01()));
                            int i2 = r3.A00;
                            AnonymousClass3Ci A003 = r5.A00();
                            int i3 = A003.A00;
                            if (i3 > i2) {
                                for (C77743gv r02 : r5.A00.A02) {
                                    if (r02.A01 == i2) {
                                        LinkedList linkedList = new LinkedList(r5.A00.A02);
                                        Iterator it2 = linkedList.iterator();
                                        while (true) {
                                            r1 = null;
                                            if (!it2.hasNext()) {
                                                r8 = null;
                                                break;
                                            }
                                            r8 = (C77743gv) it2.next();
                                            if (r8.A01 == i2) {
                                                it2.remove();
                                                break;
                                            }
                                        }
                                        AbstractC04160Jh A0B = r5.A00.AQb();
                                        A0B.A02();
                                        AnonymousClass2BB r2 = (AnonymousClass2BB) A0B.A00;
                                        if (r2 != null) {
                                            r2.A02 = C05030Mw.A01;
                                            A0B.A02();
                                            AnonymousClass2BB r03 = (AnonymousClass2BB) A0B.A00;
                                            r03.A0I();
                                            AnonymousClass079.A07(linkedList, r03.A02);
                                            r5.A00 = (AnonymousClass2BB) A0B.A01();
                                            if (r8 != null) {
                                                r1 = new C68223Cj(r8.A01, r8.A02.A01());
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                }
                                StringBuilder A0S = AnonymousClass008.A0S("Received message with old counter: ");
                                A0S.append(i3);
                                A0S.append(" , ");
                                A0S.append(i2);
                                throw new C29341Yb(A0S.toString());
                            } else if (i2 - i3 > 2000) {
                                throw new C29381Yg("Over 2000 messages into the future!");
                            } else {
                                while (A003.A00 < i2) {
                                    C68223Cj r10 = new C68223Cj(A003.A00, AnonymousClass3Ci.A00(AnonymousClass3Ci.A03, A003.A01));
                                    AbstractC04160Jh A0B2 = C77743gv.A03.AQb();
                                    int i4 = r10.A00;
                                    A0B2.A02();
                                    C77743gv r12 = (C77743gv) A0B2.A00;
                                    r12.A00 |= 1;
                                    r12.A01 = i4;
                                    byte[] bArr2 = r10.A03;
                                    AnonymousClass071 A004 = AnonymousClass071.A00(bArr2, 0, bArr2.length);
                                    A0B2.A02();
                                    C77743gv r13 = (C77743gv) A0B2.A00;
                                    r13.A00 |= 2;
                                    r13.A02 = A004;
                                    AnonymousClass078 A012 = A0B2.A01();
                                    AbstractC04160Jh A0B3 = r5.A00.AQb();
                                    A0B3.A02();
                                    AnonymousClass2BB r04 = (AnonymousClass2BB) A0B3.A00;
                                    r04.A0I();
                                    r04.A02.add(A012);
                                    if (((AnonymousClass2BB) A0B3.A00).A02.size() > 2000) {
                                        A0B3.A02();
                                        AnonymousClass2BB r05 = (AnonymousClass2BB) A0B3.A00;
                                        r05.A0I();
                                        r05.A02.remove(0);
                                    }
                                    r5.A00 = (AnonymousClass2BB) A0B3.A01();
                                    A003 = new AnonymousClass3Ci(A003.A00 + 1, AnonymousClass3Ci.A00(AnonymousClass3Ci.A02, A003.A01));
                                }
                                r5.A01(new AnonymousClass3Ci(A003.A00 + 1, AnonymousClass3Ci.A00(AnonymousClass3Ci.A02, A003.A01)));
                                r1 = new C68223Cj(A003.A00, AnonymousClass3Ci.A00(AnonymousClass3Ci.A03, A003.A01));
                            }
                            byte[] bArr3 = r1.A02;
                            byte[] bArr4 = r1.A01;
                            byte[] bArr5 = r3.A02;
                            try {
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                instance.init(2, new SecretKeySpec(bArr4, "AES"), ivParameterSpec);
                                doFinal = instance.doFinal(bArr5);
                                r14.AA9(doFinal);
                                this.A00.A01.A0U(C002001d.A0v(this.A01), A002.A00());
                            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                                throw new AssertionError(e);
                            } catch (BadPaddingException | IllegalBlockSizeException e2) {
                                throw new C29381Yg(e2);
                            }
                        }
                    }
                    throw new C29371Yf(AnonymousClass008.A0F("No keys for: ", i));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("No sender key for: ");
                sb.append(this.A01);
                throw new C29411Yj(sb.toString());
            } catch (C29361Ye | C29371Yf e3) {
                throw new C29381Yg(e3);
            }
        }
        return doFinal;
    }
}
