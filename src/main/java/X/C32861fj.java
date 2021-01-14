package X;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: X.1fj  reason: invalid class name and case insensitive filesystem */
public class C32861fj implements Closeable, AbstractC20730xC {
    public SharedMemory A00;
    public ByteBuffer A01;
    public final long A02;

    public C32861fj(int i) {
        AnonymousClass0N2.A1Y(i > 0);
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.A00 = create;
            this.A01 = create.mapReadWrite();
            this.A02 = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final void A00(int i, AbstractC20730xC r5, int i2, int i3) {
        if (r5 instanceof C32861fj) {
            AnonymousClass0N2.A1Z(!isClosed());
            AnonymousClass0N2.A1Z(!r5.isClosed());
            AnonymousClass0N2.A0z(i, r5.A96(), i2, i3, A96());
            this.A01.position(i);
            r5.A52().position(i2);
            byte[] bArr = new byte[i3];
            this.A01.get(bArr, 0, i3);
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
                StringBuilder A0S = AnonymousClass008.A0S("Copying from AshmemMemoryChunk ");
                A0S.append(Long.toHexString(j));
                A0S.append(" to AshmemMemoryChunk ");
                A0S.append(Long.toHexString(A9Y));
                A0S.append(" which are the same ");
                Log.w("AshmemMemoryChunk", A0S.toString());
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
    public ByteBuffer A52() {
        return this.A01;
    }

    @Override // X.AbstractC20730xC
    public int A96() {
        AnonymousClass0N2.A1Z(!isClosed());
        return this.A00.getSize();
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
        if (i >= A96()) {
            z = false;
        }
        AnonymousClass0N2.A1Y(z);
        return this.A01.get(i);
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
            min = Math.min(Math.max(0, A96() - i), i3);
            AnonymousClass0N2.A0z(i, bArr.length, i2, min, A96());
            this.A01.position(i);
            this.A01.get(bArr, i2, min);
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
        min = Math.min(Math.max(0, A96() - i), i3);
        AnonymousClass0N2.A0z(i, bArr.length, i2, min, A96());
        this.A01.position(i);
        this.A01.put(bArr, i2, min);
        return min;
    }

    @Override // java.io.Closeable, X.AbstractC20730xC, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.A01);
            this.A00.close();
            this.A01 = null;
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A00 == null) goto L_0x000a;
     */
    @Override // X.AbstractC20730xC
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isClosed() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.A01     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            android.os.SharedMemory r1 = r2.A00     // Catch:{ all -> 0x000d }
            r0 = 0
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32861fj.isClosed():boolean");
    }
}
