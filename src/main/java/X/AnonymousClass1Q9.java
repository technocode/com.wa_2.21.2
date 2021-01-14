package X;

import com.whatsapp.util.Log;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.1Q9  reason: invalid class name */
public class AnonymousClass1Q9 extends DigestOutputStream {
    public long A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass1QA A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Q9(AnonymousClass1QA r3, OutputStream outputStream, MessageDigest messageDigest) {
        super(outputStream, messageDigest);
        this.A02 = r3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        AnonymousClass1QD r3;
        if (this.A01) {
            Log.i("BackupFile/get-output-stream/close/already-closed");
            return;
        }
        flush();
        byte[] digest = getMessageDigest().digest();
        StringBuilder A0S = AnonymousClass008.A0S("BackupFile/get-output-stream/close/writing-digest ");
        A0S.append(C007603r.A04(digest));
        A0S.append(" bytes written = ");
        AnonymousClass008.A1P(A0S, this.A00);
        AnonymousClass1QA r1 = this.A02;
        if (!(r1 instanceof C41291un)) {
            String A022 = ((C41281um) r1).A02();
            byte[] bArr = new byte[4];
            Arrays.fill(bArr, (byte) 45);
            if (A022 != null) {
                int length = A022.length();
                if (length < 2) {
                    StringBuilder sb = new StringBuilder("BackupFooter/get-jid-suffix/unexpected-phone-number ");
                    sb.append(A022);
                    sb.append(" it has less than ");
                    sb.append(2);
                    sb.append(" digits");
                    Log.e(sb.toString());
                    r3 = new AnonymousClass1QD(digest, bArr);
                } else {
                    System.arraycopy(A022.getBytes(), length - 2, bArr, 2, 2);
                }
            }
            StringBuilder A0Z = AnonymousClass008.A0Z("BackupFooter/get-jid-suffix ", A022, " suffix: ");
            A0Z.append(new String(bArr));
            Log.i(A0Z.toString());
            r3 = new AnonymousClass1QD(digest, bArr);
        } else {
            r3 = new AnonymousClass1QD(digest, null);
        }
        byte[] bArr2 = r3.A01;
        byte[][] bArr3 = bArr2 == null ? new byte[][]{r3.A00} : new byte[][]{r3.A00, bArr2};
        int i = 0;
        for (byte[] bArr4 : bArr3) {
            Arrays.toString(bArr4);
            i += bArr4.length;
            write(bArr4);
        }
        AnonymousClass008.A0v("BackupFile/write-backup-footer/size=", i);
        super.close();
        this.A01 = true;
    }

    @Override // java.io.OutputStream, java.security.DigestOutputStream, java.io.FilterOutputStream
    public void write(int i) {
        super.write(i);
        this.A00++;
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr) {
        int length = bArr.length;
        super.write(bArr, 0, length);
        this.A00 += (long) (length - 0);
    }

    @Override // java.io.OutputStream, java.security.DigestOutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) {
        super.write(bArr, i, i2);
        this.A00 += (long) (i2 - i);
    }
}
