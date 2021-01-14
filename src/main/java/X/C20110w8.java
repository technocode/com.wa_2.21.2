package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.0w8  reason: invalid class name and case insensitive filesystem */
public final class C20110w8 extends ByteArrayOutputStream {
    public C20110w8(int i) {
        super(i);
    }

    public byte[] toByteArray() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        if (i == bArr.length) {
            return bArr;
        }
        return super.toByteArray();
    }
}
