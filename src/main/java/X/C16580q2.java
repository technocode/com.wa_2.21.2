package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0q2  reason: invalid class name and case insensitive filesystem */
public class C16580q2 {
    public List A00;
    public int[] A01;

    public C16570q1 A00(int i) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C16570q1 r1 = (C16570q1) this.A00.get(size);
            if (r1.A01 == i) {
                return r1;
            }
        }
        return null;
    }

    public C16570q1 A01(int i, int i2, int i3) {
        List list = this.A00;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C16570q1 r1 = (C16570q1) this.A00.get(i4);
            int i5 = r1.A01;
            if (i5 >= i2) {
                return null;
            }
            if (i5 >= i && (i3 == 0 || r1.A00 == i3 || r1.A02)) {
                return r1;
            }
        }
        return null;
    }

    public void A02() {
        int[] iArr = this.A01;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.A00 = null;
    }

    public void A03(int i) {
        int[] iArr = this.A01;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.A01 = iArr2;
            Arrays.fill(iArr2, -1);
            return;
        }
        int length = iArr.length;
        if (i >= length) {
            while (length <= i) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.A01 = iArr3;
            int length2 = iArr.length;
            System.arraycopy(iArr, 0, iArr3, 0, length2);
            int[] iArr4 = this.A01;
            Arrays.fill(iArr4, length2, iArr4.length, -1);
        }
    }

    public void A04(int i) {
        List list = this.A00;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((C16570q1) this.A00.get(size)).A01 >= i) {
                    this.A00.remove(size);
                }
            }
        }
        A05(i);
    }

    public void A05(int i) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            if (this.A00 != null) {
                C16570q1 A002 = A00(i);
                if (A002 != null) {
                    this.A00.remove(A002);
                }
                int size = this.A00.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (((C16570q1) this.A00.get(i2)).A01 < i) {
                        i2++;
                    } else if (i2 != -1) {
                        this.A00.remove(i2);
                        int i3 = ((C16570q1) this.A00.get(i2)).A01;
                        if (i3 != -1) {
                            Arrays.fill(this.A01, i, i3 + 1, -1);
                            return;
                        }
                    }
                }
            }
            int[] iArr2 = this.A01;
            Arrays.fill(iArr2, i, iArr2.length, -1);
        }
    }

    public void A06(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A03(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.A01, i, i3, -1);
            List list = this.A00;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C16570q1 r1 = (C16570q1) this.A00.get(size);
                    int i4 = r1.A01;
                    if (i4 >= i) {
                        r1.A01 = i4 + i2;
                    }
                }
            }
        }
    }

    public void A07(int i, int i2) {
        int[] iArr = this.A01;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            A03(i3);
            int[] iArr2 = this.A01;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.A01;
            int length = iArr3.length;
            Arrays.fill(iArr3, length - i2, length, -1);
            List list = this.A00;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C16570q1 r1 = (C16570q1) this.A00.get(size);
                    int i4 = r1.A01;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.A00.remove(size);
                        } else {
                            r1.A01 = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public void A08(C16570q1 r6) {
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C16570q1 r2 = (C16570q1) this.A00.get(i);
            if (r2.A01 == r6.A01) {
                this.A00.remove(i);
            }
            if (r2.A01 >= r6.A01) {
                this.A00.add(i, r6);
                return;
            }
        }
        this.A00.add(r6);
    }
}
