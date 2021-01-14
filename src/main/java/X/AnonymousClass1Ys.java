package X;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.LinkedList;

/* renamed from: X.1Ys  reason: invalid class name */
public class AnonymousClass1Ys {
    public final AnonymousClass058 A00;

    public AnonymousClass1Ys(AnonymousClass058 r1) {
        this.A00 = r1;
    }

    public AnonymousClass23B A00(AnonymousClass0OD r14) {
        AnonymousClass23B r5;
        synchronized (AnonymousClass1Yr.A02) {
            try {
                C29481Yv A002 = this.A00.A00(r14);
                if (A002.A00.isEmpty()) {
                    try {
                        int nextInt = SecureRandom.getInstance("SHA1PRNG").nextInt(Integer.MAX_VALUE);
                        try {
                            byte[] bArr = new byte[32];
                            SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
                            C29451Yn A03 = C05360Of.A03();
                            LinkedList linkedList = A002.A00;
                            linkedList.clear();
                            AnonymousClass238 r11 = A03.A00;
                            AbstractC29461Yo r0 = A03.A01;
                            if (r0 != null) {
                                linkedList.add(new AnonymousClass1Yw(nextInt, 0, bArr, r11, new AnonymousClass3XF(r0)));
                                this.A00.A01.A0U(C002001d.A0v(r14), A002.A00());
                            } else {
                                throw null;
                            }
                        } catch (NoSuchAlgorithmException e) {
                            throw new AssertionError(e);
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        throw new AssertionError(e2);
                    }
                }
                if (!A002.A00.isEmpty()) {
                    AnonymousClass1Yw r1 = (AnonymousClass1Yw) A002.A00.get(0);
                    int i = r1.A00.A01;
                    int i2 = r1.A00().A00;
                    byte[] bArr2 = r1.A00().A01;
                    C77763gx r02 = r1.A00.A04;
                    if (r02 == null) {
                        r02 = C77763gx.A03;
                    }
                    r5 = new AnonymousClass23B(i, i2, bArr2, C05360Of.A02(r02.A02.A01()));
                } else {
                    throw new C29371Yf("No key state in record!");
                }
            } catch (C29361Ye | C29371Yf e3) {
                throw new AssertionError(e3);
            }
        }
        return r5;
    }

    public void A01(AnonymousClass0OD r13, AnonymousClass23B r14) {
        synchronized (AnonymousClass1Yr.A02) {
            C29481Yv A002 = this.A00.A00(r13);
            A002.A00.addFirst(new AnonymousClass1Yw(r14.A00, r14.A01, r14.A03, r14.A02, AnonymousClass3XE.A00));
            if (A002.A00.size() > 5) {
                A002.A00.removeLast();
            }
            this.A00.A01.A0U(new AnonymousClass0OE(r13.A00, C002001d.A0u(r13.A01)), A002.A00());
        }
    }
}
