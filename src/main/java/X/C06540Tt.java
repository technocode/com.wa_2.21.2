package X;

/* renamed from: X.0Tt  reason: invalid class name and case insensitive filesystem */
public class C06540Tt implements Cloneable {
    public static final Object A04 = new Object();
    public int A00;
    public boolean A01 = false;
    public int[] A02;
    public Object[] A03;

    public C06540Tt(int i) {
        if (i == 0) {
            this.A02 = AnonymousClass03W.A00;
            this.A03 = AnonymousClass03W.A02;
            return;
        }
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            int i4 = (1 << i3) - 12;
            if (i2 > i4) {
                i3++;
                if (i3 >= 32) {
                    break;
                }
            } else {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 >> 2;
        this.A02 = new int[i5];
        this.A03 = new Object[i5];
    }

    public int A00() {
        if (this.A01) {
            A03();
        }
        return this.A00;
    }

    /* renamed from: A01 */
    public C06540Tt clone() {
        try {
            C06540Tt r1 = (C06540Tt) super.clone();
            r1.A02 = (int[]) this.A02.clone();
            r1.A03 = (Object[]) this.A03.clone();
            return r1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Object A02(int i, Object obj) {
        Object obj2;
        int A002 = AnonymousClass03W.A00(this.A02, this.A00, i);
        return (A002 < 0 || (obj2 = this.A03[A002]) == A04) ? obj : obj2;
    }

    public final void A03() {
        int i = this.A00;
        int[] iArr = this.A02;
        Object[] objArr = this.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A04) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.A01 = false;
        this.A00 = i2;
    }

    public void A04(int i, Object obj) {
        int i2 = this.A00;
        if (i2 == 0 || i > this.A02[i2 - 1]) {
            if (this.A01 && i2 >= this.A02.length) {
                A03();
            }
            int i3 = this.A00;
            int[] iArr = this.A02;
            int[] iArr2 = iArr;
            int length = iArr.length;
            if (i3 >= length) {
                int i4 = (i3 + 1) << 2;
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
                int i7 = i4 >> 2;
                iArr2 = new int[i7];
                Object[] objArr = new Object[i7];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                Object[] objArr2 = this.A03;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.A02 = iArr2;
                this.A03 = objArr;
            }
            iArr2[i3] = i;
            this.A03[i3] = obj;
            this.A00 = i3 + 1;
            return;
        }
        A05(i, obj);
    }

    public void A05(int i, Object obj) {
        int[] iArr = this.A02;
        int[] iArr2 = iArr;
        int i2 = this.A00;
        int i3 = i2;
        int A002 = AnonymousClass03W.A00(iArr, i2, i);
        if (A002 >= 0) {
            this.A03[A002] = obj;
            return;
        }
        int i4 = A002 ^ -1;
        if (i4 < i2) {
            Object[] objArr = this.A03;
            if (objArr[i4] == A04) {
                iArr[i4] = i;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.A01 && i2 >= iArr.length) {
            A03();
            i3 = this.A00;
            i4 = AnonymousClass03W.A00(iArr, i3, i) ^ -1;
        }
        int length = iArr.length;
        if (i3 >= length) {
            int i5 = (i3 + 1) << 2;
            int i6 = 4;
            while (true) {
                int i7 = (1 << i6) - 12;
                if (i5 > i7) {
                    i6++;
                    if (i6 >= 32) {
                        break;
                    }
                } else {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 >> 2;
            iArr2 = new int[i8];
            Object[] objArr2 = new Object[i8];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            Object[] objArr3 = this.A03;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.A02 = iArr2;
            this.A03 = objArr2;
        }
        int i9 = this.A00 - i4;
        if (i9 != 0) {
            int i10 = i4 + 1;
            System.arraycopy(iArr2, i4, iArr2, i10, i9);
            Object[] objArr4 = this.A03;
            System.arraycopy(objArr4, i4, objArr4, i10, this.A00 - i4);
        }
        this.A02[i4] = i;
        this.A03[i4] = obj;
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
                A03();
            }
            sb.append(this.A02[i]);
            sb.append('=');
            if (this.A01) {
                A03();
            }
            Object obj = this.A03[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
