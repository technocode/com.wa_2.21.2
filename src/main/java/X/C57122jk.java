package X;

import java.io.File;

/* renamed from: X.2jk  reason: invalid class name and case insensitive filesystem */
public class C57122jk extends AnonymousClass2TV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final boolean A04;
    public final int[] A05;

    public C57122jk(File file, byte[] bArr, boolean z, int i, int i2, int i3, int i4, boolean z2, int[] iArr, String str) {
        super(file, bArr, z, str);
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = z2;
        if (iArr == null) {
            this.A05 = new int[0];
        } else {
            this.A05 = iArr;
        }
    }
}
