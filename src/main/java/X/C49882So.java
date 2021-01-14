package X;

/* renamed from: X.2So  reason: invalid class name and case insensitive filesystem */
public class C49882So {
    public final long A00;
    public final byte[] A01;

    public C49882So(byte[] bArr, long j) {
        AnonymousClass00E.A07(j > 0);
        this.A01 = bArr;
        this.A00 = j;
    }

    public static C49882So A00(AnonymousClass0M4 r6, long j) {
        byte[] bArr = r6.A0U;
        if (bArr == null) {
            return null;
        }
        long j2 = r6.A0B;
        if (j2 > 0) {
            j = j2;
        }
        return new C49882So(bArr, j);
    }
}
