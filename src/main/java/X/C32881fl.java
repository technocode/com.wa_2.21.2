package X;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.1fl  reason: invalid class name and case insensitive filesystem */
public class C32881fl implements Closeable, AbstractC20730xC {
    public ByteBuffer A00;
    public final int A01;
    public final long A02 = ((long) System.identityHashCode(this));

    public C32881fl(int i) {
        this.A00 = ByteBuffer.allocateDirect(i);
        this.A01 = i;
    }

    public final void A00(int i, AbstractC20730xC r5, int i2, int i3) {
        if (r5 instanceof C32881fl) {
            AnonymousClass0N2.A1Z(!isClosed());
            AnonymousClass0N2.A1Z(!r5.isClosed());
            AnonymousClass0N2.A0z(i, r5.A96(), i2, i3, this.A01);
            this.A00.position(i);
            r5.A52().position(i2);
            byte[] bArr = new byte[i3];
            this.A00.get(bArr, 0, i3);
            r5.A52().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // X.AbstractC20730xC
    public void A38(int i, AbstractC20730xC r9, int i2, int i3) {
        if (r9 != null) {
            long A9Y = r9.A9Y();
            long j = this.A02;
            if (A9Y == j) {
                StringBuilder A0S = AnonymousClass008.A0S("Copying from BufferMemoryChunk ");
                A0S.append(Long.toHexString(j));
                A0S.append(" to BufferMemoryChunk ");
                A0S.append(Long.toHexString(A9Y));
                A0S.append(" which are the same ");
                Log.w("BufferMemoryChunk", A0S.toString());
                AnonymousClass0N2.A1Y(false);
            }
            if (A9Y < j) {
                synchronized (r9) {
                    synchronized (this) {
                        A00(i, r9, i2, i3);
                    }
                }
                return;
            }
            synchronized (this) {
                synchronized (r9) {
                    A00(i, r9, i2, i3);
                }
            }
            return;
        }
        throw null;
    }

    @Override // X.AbstractC20730xC
    public synchronized ByteBuffer A52() {
        return this.A00;
    }

    @Override // X.AbstractC20730xC
    public int A96() {
        return this.A01;
    }

    @Override // X.AbstractC20730xC
    public long A9Y() {
        return this.A02;
    }

    @Override // X.AbstractC20730xC
    public synchronized byte AMJ(int i) {
        boolean z = true;
        boolean z2 = false;
        if (!isClosed()) {
            z2 = true;
        }
        AnonymousClass0N2.A1Z(z2);
        boolean z3 = false;
        if (i >= 0) {
            z3 = true;
        }
        AnonymousClass0N2.A1Y(z3);
        if (i >= this.A01) {
            z = false;
        }
        AnonymousClass0N2.A1Y(z);
        return this.A00.get(i);
    }

    @Override // X.AbstractC20730xC
    public synchronized int AMK(int i, byte[] bArr, int i2, int i3) {
        int min;
        if (bArr != null) {
            boolean z = false;
            if (!isClosed()) {
                z = true;
            }
            AnonymousClass0N2.A1Z(z);
            int i4 = this.A01;
            min = Math.min(Math.max(0, i4 - i), i3);
            AnonymousClass0N2.A0z(i, bArr.length, i2, min, i4);
            this.A00.position(i);
            this.A00.get(bArr, i2, min);
        } else {
            throw null;
        }
        return min;
    }

    @Override // X.AbstractC20730xC
    public synchronized int ARL(int i, byte[] bArr, int i2, int i3) {
        int min;
        boolean z = false;
        if (!isClosed()) {
            z = true;
        }
        AnonymousClass0N2.A1Z(z);
        int i4 = this.A01;
        min = Math.min(Math.max(0, i4 - i), i3);
        AnonymousClass0N2.A0z(i, bArr.length, i2, min, i4);
        this.A00.position(i);
        this.A00.put(bArr, i2, min);
        return min;
    }

    @Override // java.io.Closeable, X.AbstractC20730xC, java.lang.AutoCloseable
    public synchronized void close() {
        this.A00 = null;
    }

    @Override // X.AbstractC20730xC
    public synchronized boolean isClosed() {
        boolean z;
        z = false;
        if (this.A00 == null) {
            z = true;
        }
        return z;
    }
}
