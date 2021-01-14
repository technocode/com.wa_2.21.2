package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1Yp  reason: invalid class name */
public class AnonymousClass1Yp {
    public static final Object A02 = new Object();
    public final AnonymousClass05A A00;
    public final AnonymousClass0OD A01;

    public AnonymousClass1Yp(AnonymousClass05A r1, AnonymousClass0OD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public byte[] A00(byte[] bArr) {
        byte[] bArr2;
        synchronized (A02) {
            try {
                AnonymousClass1Yt A002 = this.A00.A00(this.A01);
                C29471Yu A003 = A002.A00();
                C68213Ch r0 = new C68213Ch(A003.A00.A02);
                byte[][] A03 = r0.A03();
                C68223Cj r8 = new C68223Cj(r0.A00, C68213Ch.A01((byte) 1, A03[A03.length - 1]));
                byte[] bArr3 = r8.A02;
                byte[] bArr4 = r8.A01;
                try {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance.init(1, new SecretKeySpec(bArr4, "AES"), ivParameterSpec);
                    byte[] doFinal = instance.doFinal(bArr);
                    int i = A003.A00.A01;
                    int i2 = r8.A00;
                    C77763gx r02 = A003.A00.A03;
                    if (r02 == null) {
                        r02 = C77763gx.A03;
                    }
                    AnonymousClass3XD r3 = new AnonymousClass3XD(i, i2, doFinal, new AnonymousClass3XA(r02.A01.A01()));
                    A003.A00(new C68213Ch(A003.A00.A02).A02(1));
                    this.A00.A01.A0T(C002001d.A0v(this.A01), A002.A01());
                    bArr2 = r3.A03;
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                    throw new AssertionError(e);
                }
            } catch (C29371Yf e2) {
                throw new C29411Yj(e2);
            }
        }
        return bArr2;
    }

    public byte[] A01(byte[] bArr, AbstractC29331Ya r11) {
        byte[] doFinal;
        synchronized (A02) {
            try {
                AnonymousClass1Yt A002 = this.A00.A00(this.A01);
                if (!A002.A00.isEmpty()) {
                    AnonymousClass3XD r4 = new AnonymousClass3XD(bArr);
                    int i = r4.A01;
                    Iterator it = A002.A00.iterator();
                    while (it.hasNext()) {
                        C29471Yu r5 = (C29471Yu) it.next();
                        if (r5.A00.A01 == i) {
                            C77763gx r0 = r5.A00.A03;
                            if (r0 == null) {
                                r0 = C77763gx.A03;
                            }
                            r4.A00(C05360Of.A02(r0.A02.A01()));
                            int i2 = r4.A00;
                            C68213Ch r1 = new C68213Ch(r5.A00.A02);
                            int i3 = r1.A00;
                            if (i3 <= i2) {
                                if (i3 < i2) {
                                    r1 = r1.A02(i2 - i3);
                                }
                                r5.A00(r1.A02(1));
                                byte[][] A03 = r1.A03();
                                C68223Cj r12 = new C68223Cj(r1.A00, C68213Ch.A01((byte) 1, A03[A03.length - 1]));
                                byte[] bArr2 = r12.A02;
                                byte[] bArr3 = r12.A01;
                                byte[] bArr4 = r4.A02;
                                try {
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                    Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                                    instance.init(2, new SecretKeySpec(bArr3, "AES"), ivParameterSpec);
                                    doFinal = instance.doFinal(bArr4);
                                    r11.AA9(doFinal);
                                    this.A00.A01.A0T(C002001d.A0v(this.A01), A002.A01());
                                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                                    throw new AssertionError(e);
                                } catch (BadPaddingException | IllegalBlockSizeException e2) {
                                    throw new C29381Yg(e2);
                                }
                            } else {
                                StringBuilder A0S = AnonymousClass008.A0S("Received message with old counter: ");
                                A0S.append(i3);
                                A0S.append(" , ");
                                A0S.append(i2);
                                throw new C29341Yb(A0S.toString());
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
