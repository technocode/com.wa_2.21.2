package X;

import java.util.zip.ZipEntry;

/* renamed from: X.1hG  reason: invalid class name and case insensitive filesystem */
public final class C33731hG extends AnonymousClass11X implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public C33731hG(String str, ZipEntry zipEntry, int i) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())));
        this.A01 = zipEntry;
        this.A00 = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return super.A01.compareTo(((AnonymousClass11X) obj).A01);
    }
}
