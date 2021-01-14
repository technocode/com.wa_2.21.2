package X;

import java.util.Random;

/* renamed from: X.2ti  reason: invalid class name and case insensitive filesystem */
public class C61772ti {
    public static volatile C61772ti A05;
    public long A00;
    public AnonymousClass00S A01;
    public String A02;
    public Random A03 = new Random();
    public final C018809u A04 = C018809u.A00("PaymentFieldStats", "notification", "COMMON");

    public C61772ti(AnonymousClass00S r4) {
        this.A01 = r4;
    }

    public static C61772ti A00() {
        if (A05 == null) {
            synchronized (C61772ti.class) {
                if (A05 == null) {
                    A05 = new C61772ti(AnonymousClass00S.A00());
                }
            }
        }
        return A05;
    }

    public long A01() {
        if (this.A00 > 0) {
            return this.A01.A05() - this.A00;
        }
        return -1;
    }

    public String A02() {
        byte[] bArr = new byte[8];
        this.A03.nextBytes(bArr);
        String A032 = C007603r.A03(bArr);
        this.A02 = A032;
        return A032;
    }
}
