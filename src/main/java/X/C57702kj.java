package X;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.2kj  reason: invalid class name and case insensitive filesystem */
public class C57702kj implements AbstractC50392Un {
    public long A00 = 0;
    public final long A01;
    public final DataInputStream A02;

    public C57702kj(File file) {
        this.A01 = file.length();
        this.A02 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
    }

    @Override // X.AbstractC50392Un
    public boolean AAN() {
        return this.A00 < this.A01;
    }

    @Override // X.AbstractC50392Un
    public void AML(byte[] bArr) {
        this.A02.read(bArr);
        this.A00 += (long) bArr.length;
    }

    @Override // X.AbstractC50392Un
    public long AMX() {
        return this.A01 - this.A00;
    }

    @Override // X.AbstractC50392Un
    public void AOq(long j) {
        AML(new byte[((int) (j - this.A00))]);
    }

    @Override // X.AbstractC50392Un
    public void close() {
        this.A02.close();
    }

    @Override // X.AbstractC50392Un
    public long position() {
        return this.A00;
    }

    @Override // X.AbstractC50392Un
    public byte readByte() {
        byte readByte = this.A02.readByte();
        this.A00++;
        return readByte;
    }

    @Override // X.AbstractC50392Un
    public int readInt() {
        int readInt = this.A02.readInt();
        this.A00 += 4;
        return readInt;
    }

    @Override // X.AbstractC50392Un
    public long readLong() {
        this.A00 += 8;
        return this.A02.readLong();
    }

    @Override // X.AbstractC50392Un
    public short readShort() {
        short readShort = this.A02.readShort();
        this.A00 += 2;
        return readShort;
    }
}
