package X;

import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.security.MessageDigest;

/* renamed from: X.2KM  reason: invalid class name */
public class AnonymousClass2KM extends RandomAccessFile {
    public long A00;
    public byte[] A01;
    public final MessageDigest A02 = MessageDigest.getInstance("SHA-256");

    public AnonymousClass2KM(File file, String str) {
        super(file, str);
    }

    public String A00() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            seek(this.A00);
            do {
            } while (read(new byte[8192], 0, 8192) != -1);
            bArr = this.A02.digest();
            this.A01 = bArr;
        }
        return Base64.encodeToString(bArr, 2);
    }

    public final void A01(byte[] bArr, int i, int i2, long j) {
        if (i2 > 0) {
            long j2 = this.A00;
            if (j2 >= j && j2 < ((long) i2) + j) {
                this.A01 = null;
                int i3 = ((int) (j - j2)) + i2;
                this.A02.update(bArr, (i + i2) - i3, i3);
                this.A00 += (long) i3;
                long length = length();
                long j3 = this.A00;
                if (j3 > length) {
                    StringBuilder A0S = AnonymousClass008.A0S("ShaPosition crossed EOF. (This may be a write sync timing issue) shaUpdatedTillPosition=");
                    A0S.append(j3);
                    A0S.append(" lengthOfFile=");
                    A0S.append(length);
                    Log.d(A0S.toString());
                }
            }
        }
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        A01(bArr, i, read, getFilePointer() - ((long) read));
        return read;
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        A01(bArr, i, i2, getFilePointer() - ((long) i2));
    }
}
