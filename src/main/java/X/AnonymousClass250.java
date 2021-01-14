package X;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BufferMemoryChunkPool;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: X.250  reason: invalid class name */
public abstract class AnonymousClass250 implements AbstractC32511f4 {
    public boolean A00;
    public final SparseArray A01;
    public final AbstractC19980vv A02;
    public final C20630x2 A03;
    public final C20630x2 A04;
    public final C20790xI A05;
    public final AbstractC20800xJ A06;
    public final Class A07 = getClass();
    public final Set A08;

    public AnonymousClass250(AbstractC19980vv r10, C20790xI r11, AbstractC20800xJ r12) {
        if (r10 != null) {
            this.A02 = r10;
            if (r11 != null) {
                this.A05 = r11;
                if (r12 != null) {
                    this.A06 = r12;
                    this.A01 = new SparseArray();
                    SparseIntArray sparseIntArray = new SparseIntArray(0);
                    synchronized (this) {
                        this.A01.clear();
                        SparseIntArray sparseIntArray2 = this.A05.A03;
                        if (sparseIntArray2 != null) {
                            for (int i = 0; i < sparseIntArray2.size(); i++) {
                                int keyAt = sparseIntArray2.keyAt(i);
                                this.A01.put(keyAt, new C20660x5(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
                            }
                            this.A00 = false;
                        } else {
                            this.A00 = true;
                        }
                    }
                    this.A08 = Collections.newSetFromMap(new IdentityHashMap());
                    this.A03 = new C20630x2();
                    this.A04 = new C20630x2();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public int A00(int i) {
        if (!(this instanceof AbstractC461428g)) {
            C461228e r0 = (C461228e) this;
            if (i > 0) {
                int[] iArr = r0.A00;
                for (int i2 : iArr) {
                    if (i2 >= i) {
                        return i2;
                    }
                }
                return i;
            }
            throw new C20640x3(Integer.valueOf(i));
        }
        AbstractC461428g r02 = (AbstractC461428g) this;
        if (i > 0) {
            int[] iArr2 = r02.A00;
            for (int i3 : iArr2) {
                if (i3 >= i) {
                    return i3;
                }
            }
            return i;
        }
        throw new C20640x3(Integer.valueOf(i));
    }

    public int A01(Object obj) {
        if (!(this instanceof AbstractC461428g)) {
            return ((byte[]) obj).length;
        }
        return ((AbstractC20730xC) obj).A96();
    }

    public synchronized C20660x5 A02(int i) {
        C20660x5 r1;
        SparseArray sparseArray = this.A01;
        C20660x5 r12 = (C20660x5) sparseArray.get(i);
        if (r12 != null || !this.A00) {
            return r12;
        }
        if (!(this instanceof AnonymousClass2AK)) {
            r1 = new C20660x5(i, Integer.MAX_VALUE, 0);
        } else {
            r1 = new C32931fq(i, this.A05.A00);
        }
        sparseArray.put(i, r1);
        return r1;
    }

    public Object A03(int i) {
        if (this instanceof C461228e) {
            return new byte[i];
        }
        AbstractC461428g r1 = (AbstractC461428g) this;
        if (!(r1 instanceof BufferMemoryChunkPool)) {
            return r1.A09(i);
        }
        return new C32881fl(i);
    }

    public synchronized Object A04(C20660x5 r3) {
        Object A002;
        A002 = r3.A00();
        if (A002 != null) {
            r3.A00++;
        }
        return A002;
    }

    public synchronized void A05(int i) {
        int i2 = this.A04.A01;
        C20630x2 r4 = this.A03;
        int i3 = r4.A01;
        int min = Math.min((i2 + i3) - i, i3);
        if (min > 0) {
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = this.A01;
                if (i4 < sparseArray.size() && min > 0) {
                    C20660x5 r1 = (C20660x5) sparseArray.valueAt(i4);
                    do {
                        Object A002 = r1.A00();
                        if (A002 == null) {
                            break;
                        }
                        A06(A002);
                        min -= r1.A01;
                        r4.A00(r1.A01);
                    } while (min > 0);
                    i4++;
                }
            }
        }
    }

    public void A06(Object obj) {
        if (this instanceof AbstractC461428g) {
            ((AbstractC20730xC) obj).close();
        }
    }

    public synchronized boolean A07() {
        boolean z;
        z = false;
        if (this.A04.A01 + this.A03.A01 > this.A05.A02) {
            z = true;
        }
        return z;
    }

    public boolean A08(Object obj) {
        if (!(this instanceof AbstractC461428g)) {
            return true;
        }
        return !((AbstractC20730xC) obj).isClosed();
    }

    @Override // X.AbstractC32511f4, X.AbstractC20050w2
    public void AMT(Object obj) {
        if (obj != null) {
            int A012 = A01(obj);
            synchronized (this) {
                C20660x5 r2 = (C20660x5) this.A01.get(A012);
                if (!this.A08.remove(obj)) {
                    C19960vt.A00.A00(6, this.A07.getSimpleName(), String.format(null, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(A012)));
                    A06(obj);
                } else {
                    if (r2 != null) {
                        if (r2.A00 + r2.A03.size() > r2.A02 || A07() || !A08(obj)) {
                            int i = r2.A00;
                            boolean z = false;
                            if (i > 0) {
                                z = true;
                            }
                            AnonymousClass0N2.A1Z(z);
                            r2.A00 = i - 1;
                        } else {
                            int i2 = r2.A00;
                            if (i2 > 0) {
                                r2.A00 = i2 - 1;
                                if (!(r2 instanceof C32931fq)) {
                                    r2.A03.add(obj);
                                } else {
                                    C32931fq r22 = (C32931fq) r2;
                                    C20040w1 r1 = (C20040w1) r22.A00.poll();
                                    if (r1 == null) {
                                        r1 = new C20040w1();
                                    }
                                    r1.A00 = new SoftReference(obj);
                                    r1.A01 = new SoftReference(obj);
                                    r1.A02 = new SoftReference(obj);
                                    r22.A03.add(r1);
                                }
                            } else {
                                C19960vt.A00.A00(6, "BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", obj));
                            }
                            C20630x2 r12 = this.A03;
                            r12.A00++;
                            r12.A01 += A012;
                            this.A04.A00(A012);
                        }
                    }
                    A06(obj);
                    this.A04.A00(A012);
                }
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r3 <= r0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r11.A03.A01 == 0) goto L_0x0010;
     */
    @Override // X.AbstractC32511f4
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(int r12) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass250.get(int):java.lang.Object");
    }
}
