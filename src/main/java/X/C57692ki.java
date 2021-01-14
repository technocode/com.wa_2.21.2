package X;

import java.io.DataOutputStream;

/* renamed from: X.2ki  reason: invalid class name and case insensitive filesystem */
public class C57692ki implements AbstractC50392Un {
    public final AbstractC50392Un A00;
    public final DataOutputStream A01;

    public C57692ki(AbstractC50392Un r1, DataOutputStream dataOutputStream) {
        this.A00 = r1;
        this.A01 = dataOutputStream;
    }

    @Override // X.AbstractC50392Un
    public boolean AAN() {
        return this.A00.AAN();
    }

    @Override // X.AbstractC50392Un
    public void AML(byte[] bArr) {
        this.A00.AML(bArr);
        this.A01.write(bArr);
    }

    @Override // X.AbstractC50392Un
    public long AMX() {
        return this.A00.AMX();
    }

    @Override // X.AbstractC50392Un
    public void AOq(long j) {
        AbstractC50392Un r2 = this.A00;
        byte[] bArr = new byte[((int) (j - r2.position()))];
        r2.AML(bArr);
        this.A01.write(bArr);
    }

    @Override // X.AbstractC50392Un
    public void close() {
        this.A00.close();
        this.A01.close();
    }

    @Override // X.AbstractC50392Un
    public long position() {
        return this.A00.position();
    }

    @Override // X.AbstractC50392Un
    public byte readByte() {
        byte readByte = this.A00.readByte();
        this.A01.write(readByte);
        return readByte;
    }

    @Override // X.AbstractC50392Un
    public int readInt() {
        int readInt = this.A00.readInt();
        this.A01.writeInt(readInt);
        return readInt;
    }

    @Override // X.AbstractC50392Un
    public long readLong() {
        long readLong = this.A00.readLong();
        this.A01.writeLong(readLong);
        return readLong;
    }

    @Override // X.AbstractC50392Un
    public short readShort() {
        short readShort = this.A00.readShort();
        this.A01.writeShort(readShort);
        return readShort;
    }
}
