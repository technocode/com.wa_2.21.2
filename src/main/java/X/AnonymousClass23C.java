package X;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.23C  reason: invalid class name */
public class AnonymousClass23C implements AbstractC29491Yx {
    public final int A00;
    public final int A01;
    public final AnonymousClass238 A02;
    public final byte[] A03;
    public final byte[] A04;

    @Override // X.AbstractC29491Yx
    public int A9V() {
        return 2;
    }

    public AnonymousClass23C(int i, SecretKeySpec secretKeySpec, AnonymousClass238 r12, int i2, int i3, byte[] bArr, AnonymousClass1Yc r16, AnonymousClass1Yc r17) {
        byte[] bArr2 = {(byte) (((i << 4) | 3) & 255)};
        AbstractC04160Jh A0B = C77633gk.A05.AQb();
        byte[] A002 = r12.A00();
        AnonymousClass071 A003 = AnonymousClass071.A00(A002, 0, A002.length);
        A0B.A02();
        C77633gk r1 = (C77633gk) A0B.A00;
        r1.A00 |= 1;
        r1.A04 = A003;
        A0B.A02();
        C77633gk r13 = (C77633gk) A0B.A00;
        r13.A00 |= 2;
        r13.A01 = i2;
        A0B.A02();
        C77633gk r14 = (C77633gk) A0B.A00;
        r14.A00 |= 4;
        r14.A02 = i3;
        AnonymousClass071 A004 = AnonymousClass071.A00(bArr, 0, bArr.length);
        A0B.A02();
        C77633gk r15 = (C77633gk) A0B.A00;
        r15.A00 |= 8;
        r15.A03 = A004;
        byte[] A09 = A0B.A01().A09();
        this.A04 = AnonymousClass1YV.A0f(bArr2, A09, A00(i, r16, r17, secretKeySpec, AnonymousClass1YV.A0f(bArr2, A09)));
        this.A02 = r12;
        this.A00 = i2;
        this.A03 = bArr;
        this.A01 = i;
    }

    public AnonymousClass23C(byte[] bArr) {
        try {
            byte[][] A0i = AnonymousClass1YV.A0i(bArr, 1, (bArr.length - 1) - 8, 8);
            byte b = A0i[0][0];
            byte[] bArr2 = A0i[1];
            int i = (b & 255) >> 4;
            if (i <= 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Legacy message: ");
                sb.append(i);
                throw new C29401Yi(sb.toString());
            } else if (i <= 3) {
                C77633gk r5 = (C77633gk) AnonymousClass078.A02(C77633gk.A05, bArr2);
                int i2 = r5.A00;
                if ((i2 & 8) == 8) {
                    if ((i2 & 2) == 2) {
                        if ((i2 & 1) != 1 ? false : true) {
                            this.A04 = bArr;
                            this.A02 = C05360Of.A02(r5.A04.A01());
                            this.A01 = i;
                            this.A00 = r5.A01;
                            this.A03 = r5.A03.A01();
                            return;
                        }
                    }
                }
                throw new C29381Yg("Incomplete message.");
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown version: ");
                sb2.append(i);
                throw new C29381Yg(sb2.toString());
            }
        } catch (C04190Jk | C29361Ye | ParseException e) {
            throw new C29381Yg(e);
        }
    }

    public static final byte[] A00(int i, AnonymousClass1Yc r3, AnonymousClass1Yc r4, SecretKeySpec secretKeySpec, byte[] bArr) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(secretKeySpec);
            if (i >= 3) {
                instance.update(r3.A00.A00());
                instance.update(r4.A00.A00());
            }
            byte[] doFinal = instance.doFinal(bArr);
            byte[] bArr2 = new byte[8];
            System.arraycopy(doFinal, 0, bArr2, 0, 8);
            return bArr2;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // X.AbstractC29491Yx
    public byte[] ANr() {
        return this.A04;
    }
}
