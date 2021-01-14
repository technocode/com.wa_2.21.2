package X;

import android.database.ContentObserver;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: X.2eK  reason: invalid class name and case insensitive filesystem */
public class C54082eK implements AbstractC48892Oe {
    public int A00;
    public int A01;
    public int[] A02;
    public long[] A03;
    public final PriorityQueue A04;
    public final AbstractC48892Oe[] A05;

    public C54082eK(AbstractC48892Oe[] r5, int i) {
        Comparator r2;
        this.A05 = (AbstractC48892Oe[]) r5.clone();
        if (i == 1) {
            r2 = new AnonymousClass2P6();
        } else {
            r2 = new AnonymousClass2P7();
        }
        PriorityQueue priorityQueue = new PriorityQueue(4, r2);
        this.A04 = priorityQueue;
        this.A03 = new long[16];
        this.A01 = 0;
        this.A02 = new int[this.A05.length];
        this.A00 = -1;
        priorityQueue.clear();
        int length = this.A05.length;
        for (int i2 = 0; i2 < length; i2++) {
            AnonymousClass2P8 r1 = new AnonymousClass2P8(this.A05[i2], i2);
            if (r1.A00()) {
                this.A04.add(r1);
            }
        }
    }

    @Override // X.AbstractC48892Oe
    public HashMap A4z() {
        HashMap hashMap = new HashMap();
        for (AbstractC48892Oe r0 : this.A05) {
            hashMap.putAll(r0.A4z());
        }
        return hashMap;
    }

    @Override // X.AbstractC48892Oe
    public AbstractC48882Od A7I(int i) {
        if (i < 0 || i > getCount()) {
            StringBuilder A0T = AnonymousClass008.A0T("index ", i, " out of range max is ");
            A0T.append(getCount());
            throw new IndexOutOfBoundsException(A0T.toString());
        }
        Arrays.fill(this.A02, 0);
        int i2 = this.A01;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            long j = this.A03[i3];
            int i5 = (int) (-1 & j);
            int i6 = (int) (j >> 32);
            int i7 = i4 + i5;
            if (i7 > i) {
                return this.A05[i6].A7I((i - i4) + this.A02[i6]);
            }
            int[] iArr = this.A02;
            iArr[i6] = iArr[i6] + i5;
            i3++;
            i4 = i7;
        }
        while (true) {
            PriorityQueue priorityQueue = this.A04;
            AnonymousClass2P8 r3 = (AnonymousClass2P8) priorityQueue.poll();
            if (r3 == null) {
                return null;
            }
            int i8 = r3.A03;
            if (i8 == this.A00) {
                int i9 = this.A01 - 1;
                long[] jArr = this.A03;
                jArr[i9] = jArr[i9] + 1;
            } else {
                this.A00 = i8;
                long[] jArr2 = this.A03;
                int length = jArr2.length;
                int i10 = this.A01;
                if (length == i10) {
                    long[] jArr3 = new long[(i10 << 1)];
                    System.arraycopy(jArr2, 0, jArr3, 0, i10);
                    this.A03 = jArr3;
                    jArr2 = jArr3;
                }
                int i11 = this.A01;
                this.A01 = i11 + 1;
                jArr2[i11] = 1 | (((long) this.A00) << 32);
            }
            if (i4 == i) {
                AbstractC48882Od r1 = r3.A02;
                if (r3.A00()) {
                    priorityQueue.add(r3);
                }
                return r1;
            }
            if (r3.A00()) {
                priorityQueue.add(r3);
            }
            i4++;
        }
    }

    @Override // X.AbstractC48892Oe
    public void AMq() {
        for (AbstractC48892Oe r0 : this.A05) {
            r0.AMq();
        }
    }

    @Override // X.AbstractC48892Oe
    public void close() {
        for (AbstractC48892Oe r0 : this.A05) {
            r0.close();
        }
    }

    @Override // X.AbstractC48892Oe
    public int getCount() {
        int i = 0;
        for (AbstractC48892Oe r0 : this.A05) {
            i += r0.getCount();
        }
        return i;
    }

    @Override // X.AbstractC48892Oe
    public boolean isEmpty() {
        for (AbstractC48892Oe r0 : this.A05) {
            if (!r0.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC48892Oe
    public void registerContentObserver(ContentObserver contentObserver) {
        for (AbstractC48892Oe r0 : this.A05) {
            r0.registerContentObserver(contentObserver);
        }
    }

    @Override // X.AbstractC48892Oe
    public void unregisterContentObserver(ContentObserver contentObserver) {
        for (AbstractC48892Oe r0 : this.A05) {
            r0.unregisterContentObserver(contentObserver);
        }
    }
}
