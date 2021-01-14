package X;

import java.io.File;

/* renamed from: X.2Pk  reason: invalid class name and case insensitive filesystem */
public final class C49202Pk {
    public final long A00;
    public final long A01;
    public final File A02;
    public final byte[] A03;

    public C49202Pk(File file, long j, long j2, byte[] bArr) {
        this.A02 = file;
        this.A00 = j;
        this.A01 = j2;
        this.A03 = bArr;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("DownloadResult{fileSize=");
        A0S.append(this.A00);
        A0S.append(", roundTripTime=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
