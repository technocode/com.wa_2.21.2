package X;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.0g5  reason: invalid class name and case insensitive filesystem */
public final class C11320g5 extends AbstractC05040Mx<Integer> implements AbstractC11330g6, RandomAccess {
    public static final C11320g5 A02;
    public int A00;
    public int[] A01;

    static {
        C11320g5 r1 = new C11320g5();
        A02 = r1;
        ((AbstractC05040Mx) r1).A00 = false;
    }

    public C11320g5() {
        this.A01 = new int[10];
        this.A00 = 0;
    }

    public C11320g5(int[] iArr, int i) {
        this.A01 = iArr;
        this.A00 = i;
    }

    /* renamed from: A01 */
    public AbstractC11330g6 ACC(int i) {
        if (i >= this.A00) {
            return new C11320g5(Arrays.copyOf(this.A01, i), this.A00);
        }
        throw new IllegalArgumentException();
    }

    public final void A02(int i) {
        if (i < 0 || i >= this.A00) {
            StringBuilder A0T = AnonymousClass008.A0T("Index:", i, ", Size:");
            A0T.append(this.A00);
            throw new IndexOutOfBoundsException(A0T.toString());
        }
    }

    public final void A03(int i, int i2) {
        int i3;
        A00();
        if (i < 0 || i > (i3 = this.A00)) {
            StringBuilder A0T = AnonymousClass008.A0T("Index:", i, ", Size:");
            A0T.append(this.A00);
            throw new IndexOutOfBoundsException(A0T.toString());
        }
        int[] iArr = this.A01;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) >> 1) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.A01, i, iArr2, i + 1, this.A00 - i);
            this.A01 = iArr2;
        }
        this.A01[i] = i2;
        this.A00++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, Object obj) {
        A03(i, ((Number) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, X.AbstractC05040Mx
    public boolean addAll(Collection collection) {
        A00();
        if (collection == null) {
            throw null;
        } else if (!(collection instanceof C11320g5)) {
            return super.addAll(collection);
        } else {
            C11320g5 r7 = (C11320g5) collection;
            int i = r7.A00;
            if (i == 0) {
                return false;
            }
            int i2 = this.A00;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.A01;
                if (i3 > iArr.length) {
                    iArr = Arrays.copyOf(iArr, i3);
                    this.A01 = iArr;
                }
                System.arraycopy(r7.A01, 0, iArr, this.A00, r7.A00);
                this.A00 = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    @Override // X.AbstractC05040Mx
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11320g5)) {
            return super.equals(obj);
        }
        C11320g5 r8 = (C11320g5) obj;
        int i = this.A00;
        if (i != r8.A00) {
            return false;
        }
        int[] iArr = r8.A01;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.A01[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object get(int i) {
        A02(i);
        return Integer.valueOf(this.A01[i]);
    }

    @Override // X.AbstractC05040Mx
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.A00; i2++) {
            i = (i * 31) + this.A01[i2];
        }
        return i;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object remove(int i) {
        A00();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.A00 - i);
        this.A00--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.List, X.AbstractC05040Mx
    public boolean remove(Object obj) {
        A00();
        for (int i = 0; i < this.A00; i++) {
            if (obj.equals(Integer.valueOf(this.A01[i]))) {
                int[] iArr = this.A01;
                System.arraycopy(iArr, i + 1, iArr, i, this.A00 - i);
                this.A00--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.AbstractList
    public Object set(int i, Object obj) {
        int intValue = ((Number) obj).intValue();
        A00();
        A02(i);
        int[] iArr = this.A01;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.A00;
    }
}
