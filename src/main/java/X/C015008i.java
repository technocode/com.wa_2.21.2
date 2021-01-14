package X;

/* renamed from: X.08i  reason: invalid class name and case insensitive filesystem */
public class C015008i implements Cloneable {
    public static final Object A04 = new Object();
    public int A00;
    public boolean A01 = false;
    public long[] A02;
    public Object[] A03;

    public C015008i() {
        int i = 10 << 3;
        int i2 = 4;
        while (true) {
            int i3 = (1 << i2) - 12;
            if (i > i3) {
                i2++;
                if (i2 >= 32) {
                    break;
                }
            } else {
                i = i3;
                break;
            }
        }
        int i4 = i >> 3;
        this.A02 = new long[i4];
        this.A03 = new Object[i4];
    }

    public int A00() {
        if (this.A01) {
            A05();
        }
        return this.A00;
    }

    /* renamed from: A01 */
    public C015008i clone() {
        try {
            C015008i r1 = (C015008i) super.clone();
            r1.A02 = (long[]) this.A02.clone();
            r1.A03 = (Object[]) this.A03.clone();
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Object A02(int i) {
        if (this.A01) {
            A05();
        }
        return this.A03[i];
    }

    public Object A03(long j, Object obj) {
        Object obj2;
        int A012 = AnonymousClass03W.A01(this.A02, this.A00, j);
        return (A012 < 0 || (obj2 = this.A03[A012]) == A04) ? obj : obj2;
    }

    public void A04() {
        int i = this.A00;
        Object[] objArr = this.A03;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A00 = 0;
        this.A01 = false;
    }

    public final void A05() {
        int i = this.A00;
        long[] jArr = this.A02;
        Object[] objArr = this.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A04) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.A01 = false;
        this.A00 = i2;
    }

    public void A06(long j) {
        Object[] objArr;
        Object obj;
        int A012 = AnonymousClass03W.A01(this.A02, this.A00, j);
        if (A012 >= 0 && (objArr = this.A03)[A012] != (obj = A04)) {
            objArr[A012] = obj;
            this.A01 = true;
        }
    }

    public void A07(long j, Object obj) {
        int i = this.A00;
        if (i == 0 || j > this.A02[i - 1]) {
            if (this.A01 && i >= this.A02.length) {
                A05();
            }
            int i2 = this.A00;
            long[] jArr = this.A02;
            long[] jArr2 = jArr;
            int length = jArr.length;
            if (i2 >= length) {
                int i3 = (i2 + 1) << 3;
                int i4 = 4;
                while (true) {
                    int i5 = (1 << i4) - 12;
                    if (i3 > i5) {
                        i4++;
                        if (i4 >= 32) {
                            break;
                        }
                    } else {
                        i3 = i5;
                        break;
                    }
                }
                int i6 = i3 >> 3;
                jArr2 = new long[i6];
                Object[] objArr = new Object[i6];
                System.arraycopy(jArr, 0, jArr2, 0, length);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A02 = jArr2;
                this.A03 = objArr;
            }
            jArr2[i2] = j;
            this.A03[i2] = obj;
            this.A00 = i2 + 1;
            return;
        }
        A08(j, obj);
    }

    public void A08(long j, Object obj) {
        long[] jArr = this.A02;
        long[] jArr2 = jArr;
        int i = this.A00;
        int i2 = i;
        int A012 = AnonymousClass03W.A01(jArr, i, j);
        if (A012 >= 0) {
            this.A03[A012] = obj;
            return;
        }
        int i3 = A012 ^ -1;
        if (i3 < i) {
            Object[] objArr = this.A03;
            if (objArr[i3] == A04) {
                jArr[i3] = j;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.A01 && i >= jArr.length) {
            A05();
            i2 = this.A00;
            i3 = AnonymousClass03W.A01(jArr, i2, j) ^ -1;
        }
        int length = jArr.length;
        if (i2 >= length) {
            int i4 = (i2 + 1) << 3;
            int i5 = 4;
            while (true) {
                int i6 = (1 << i5) - 12;
                if (i4 > i6) {
                    i5++;
                    if (i5 >= 32) {
                        break;
                    }
                } else {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 >> 3;
            jArr2 = new long[i7];
            Object[] objArr2 = new Object[i7];
            System.arraycopy(jArr, 0, jArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = jArr2;
            this.A03 = objArr2;
        }
        int i8 = this.A00 - i3;
        if (i8 != 0) {
            int i9 = i3 + 1;
            System.arraycopy(jArr2, i3, jArr2, i9, i8);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i3, objArr4, i9, this.A00 - i3);
        }
        this.A02[i3] = j;
        this.A03[i3] = obj;
        this.A00++;
    }

    public String toString() {
        if (A00() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.A01) {
                A05();
            }
            sb.append(this.A02[i]);
            sb.append('=');
            Object A022 = A02(i);
            if (A022 != this) {
                sb.append(A022);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
