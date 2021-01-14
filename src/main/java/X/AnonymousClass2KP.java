package X;

import java.nio.charset.Charset;
import java.text.ParseException;

/* renamed from: X.2KP  reason: invalid class name */
public class AnonymousClass2KP {
    public static final Charset A05 = Charset.forName("UTF-8");
    public static final int[] A06 = {32, 32, 32, 32, 32};
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public AnonymousClass2KP(AnonymousClass0DO r10) {
        int[] iArr = A06;
        int length = iArr.length;
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        byte[] A3o = C002001d.A3o(r10.A02, "WhatsApp Mutation Keys".getBytes(A05), i);
        if (A3o != null) {
            int i3 = 0;
            for (int i4 : iArr) {
                try {
                    if (i4 >= 0) {
                        i3 += i4;
                    } else {
                        throw new ParseException(AnonymousClass008.A0F("Invalid length: ", i4), 0);
                    }
                } catch (ParseException e) {
                    throw new C52522bG(e);
                }
            }
            if (A3o.length >= i3) {
                byte[][] bArr = new byte[length][];
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = iArr[i6];
                    bArr[i6] = new byte[i7];
                    System.arraycopy(A3o, i5, bArr[i6], 0, i7);
                    i5 += i7;
                }
                this.A00 = bArr[0];
                this.A03 = bArr[1];
                this.A04 = bArr[2];
                this.A02 = bArr[3];
                this.A01 = bArr[4];
                return;
            }
            StringBuilder A0S = AnonymousClass008.A0S("Input too small: ");
            A0S.append(AnonymousClass3CL.A00(A3o));
            throw new ParseException(A0S.toString(), 0);
        }
        throw new ParseException("Null input", 0);
    }
}
