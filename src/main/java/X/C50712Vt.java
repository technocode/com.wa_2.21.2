package X;

import java.util.Arrays;

/* renamed from: X.2Vt  reason: invalid class name and case insensitive filesystem */
public class C50712Vt {
    public byte A00;
    public short A01;
    public byte[] A02;

    public C50712Vt(byte[] bArr) {
        int length = bArr.length;
        int i = length - 1;
        while (true) {
            byte b = bArr[i];
            if (b == 0) {
                i--;
            } else {
                this.A01 = (short) ((length - i) - 1);
                this.A00 = b;
                this.A02 = Arrays.copyOfRange(bArr, 0, i);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WtTlsInnerPlainText{content= [");
        byte[] bArr = this.A02;
        A0S.append(bArr.length);
        A0S.append("] ");
        A0S.append(C28051Sr.A1A(bArr));
        A0S.append(", contentType=");
        A0S.append((int) this.A00);
        A0S.append(", zeros=");
        A0S.append((int) this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
