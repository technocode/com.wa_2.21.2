package X;

import java.net.DatagramPacket;

/* renamed from: X.3B1  reason: invalid class name */
public class AnonymousClass3B1 {
    public final byte[] A00 = new byte[48];
    public volatile DatagramPacket A01;

    public final int A00(int i) {
        byte[] bArr = this.A00;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final AnonymousClass3B3 A01(int i) {
        byte[] bArr = this.A00;
        return new AnonymousClass3B3((((long) (bArr[i] & 255)) << 56) | (((long) (bArr[i + 1] & 255)) << 48) | (((long) (bArr[i + 2] & 255)) << 40) | (((long) (bArr[i + 3] & 255)) << 32) | (((long) (bArr[i + 4] & 255)) << 24) | (((long) (bArr[i + 5] & 255)) << 16) | (((long) (bArr[i + 6] & 255)) << 8) | ((long) (bArr[i + 7] & 255)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 283
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3B1.toString():java.lang.String");
    }
}
