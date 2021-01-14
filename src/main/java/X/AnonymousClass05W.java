package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.05W  reason: invalid class name */
public class AnonymousClass05W {
    public static int A03;
    public static int A04;
    public static Object[] A05;
    public static Object[] A06;
    public int A00;
    public int[] A01;
    public Object[] A02;

    public AnonymousClass05W() {
        this.A01 = AnonymousClass03W.A00;
        this.A02 = AnonymousClass03W.A02;
        this.A00 = 0;
    }

    public AnonymousClass05W(int i) {
        if (i == 0) {
            this.A01 = AnonymousClass03W.A00;
            this.A02 = AnonymousClass03W.A02;
        } else {
            A07(i);
        }
        this.A00 = 0;
    }

    public static void A00(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (AnonymousClass05W.class) {
                int i2 = A04;
                if (i2 < 10) {
                    objArr[0] = A06;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    A06 = objArr;
                    A04 = i2 + 1;
                }
            }
        } else if (length == 4) {
            synchronized (AnonymousClass05W.class) {
                int i4 = A03;
                if (i4 < 10) {
                    objArr[0] = A05;
                    objArr[1] = iArr;
                    for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                        objArr[i5] = null;
                    }
                    A05 = objArr;
                    A03 = i4 + 1;
                }
            }
        }
    }

    public int A01() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int[] iArr = this.A01;
        try {
            int A002 = AnonymousClass03W.A00(iArr, i, 0);
            if (A002 < 0) {
                return A002;
            }
            Object[] objArr = this.A02;
            if (objArr[A002 << 1] == null) {
                return A002;
            }
            int i2 = A002 + 1;
            while (i2 < i && iArr[i2] == 0) {
                if (objArr[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = A002 - 1;
            while (i3 >= 0 && iArr[i3] == 0) {
                if (objArr[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return i2 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int A02(Object obj) {
        return obj == null ? A01() : A04(obj, obj.hashCode());
    }

    public int A03(Object obj) {
        int i = this.A00 << 1;
        Object[] objArr = this.A02;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int A04(Object obj, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int A002 = AnonymousClass03W.A00(this.A01, i2, i);
            if (A002 < 0 || obj.equals(this.A02[A002 << 1])) {
                return A002;
            }
            int i3 = A002 + 1;
            while (i3 < i2 && this.A01[i3] == i) {
                if (obj.equals(this.A02[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = A002 - 1;
            while (i4 >= 0 && this.A01[i4] == i) {
                if (obj.equals(this.A02[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public Object A05(int i) {
        Object[] objArr = this.A02;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.A00;
        int i4 = 0;
        if (i3 <= 1) {
            A00(this.A01, objArr, i3);
            this.A01 = AnonymousClass03W.A00;
            this.A02 = AnonymousClass03W.A02;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.A01;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.A02;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.A02;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                A07(i6);
                if (i3 == this.A00) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.A01, 0, i);
                        System.arraycopy(objArr, 0, this.A02, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.A01, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.A02, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.A00) {
            this.A00 = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public void A06(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            Object[] objArr = this.A02;
            A07(i);
            if (this.A00 > 0) {
                System.arraycopy(iArr, 0, this.A01, 0, i2);
                System.arraycopy(objArr, 0, this.A02, 0, i2 << 1);
            }
            A00(iArr, objArr, i2);
        }
        if (this.A00 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void A07(int i) {
        if (i == 8) {
            synchronized (AnonymousClass05W.class) {
                Object[] objArr = A06;
                if (objArr != null) {
                    this.A02 = objArr;
                    A06 = (Object[]) objArr[0];
                    this.A01 = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    A04--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (AnonymousClass05W.class) {
                Object[] objArr2 = A05;
                if (objArr2 != null) {
                    this.A02 = objArr2;
                    A05 = (Object[]) objArr2[0];
                    this.A01 = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    A03--;
                    return;
                }
            }
        }
        this.A01 = new int[i];
        this.A02 = new Object[(i << 1)];
    }

    public void A08(AnonymousClass05W r6) {
        int i = r6.A00;
        A06(this.A00 + i);
        if (this.A00 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = r6.A02;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        } else if (i > 0) {
            System.arraycopy(r6.A01, 0, this.A01, 0, i);
            System.arraycopy(r6.A02, 0, this.A02, 0, i << 1);
            this.A00 = i;
        }
    }

    public void clear() {
        int i = this.A00;
        if (i > 0) {
            int[] iArr = this.A01;
            Object[] objArr = this.A02;
            this.A01 = AnonymousClass03W.A00;
            this.A02 = AnonymousClass03W.A02;
            this.A00 = 0;
            A00(iArr, objArr, i);
        }
        if (this.A00 > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return A02(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return A03(obj) >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass05W) {
            AnonymousClass05W r7 = (AnonymousClass05W) obj;
            if (this.A00 != r7.A00) {
                return false;
            }
            for (int i = 0; i < this.A00; i++) {
                try {
                    Object[] objArr = this.A02;
                    Object obj2 = objArr[i << 1];
                    Object obj3 = objArr[(i << 1) + 1];
                    Object obj4 = r7.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null) {
                            return false;
                        }
                        if (!r7.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.A00 != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.A00; i2++) {
                try {
                    Object[] objArr2 = this.A02;
                    Object obj5 = objArr2[i2 << 1];
                    Object obj6 = objArr2[(i2 << 1) + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null) {
                            return false;
                        }
                        if (!map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int A022 = A02(obj);
        return A022 >= 0 ? this.A02[(A022 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = this.A00;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.A00 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int hashCode;
        int A042;
        int i = this.A00;
        if (obj == null) {
            A042 = A01();
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
            A042 = A04(obj, hashCode);
        }
        if (A042 >= 0) {
            int i2 = (A042 << 1) + 1;
            Object[] objArr = this.A02;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = A042 ^ -1;
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i4 = 4;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i >= 4) {
                i4 = 8;
            }
            Object[] objArr2 = this.A02;
            A07(i4);
            if (i == this.A00) {
                int[] iArr2 = this.A01;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.A02, 0, objArr2.length);
                }
                A00(iArr, objArr2, i);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr3 = this.A01;
            int i5 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i5, i - i3);
            Object[] objArr3 = this.A02;
            System.arraycopy(objArr3, i3 << 1, objArr3, i5 << 1, (this.A00 - i3) << 1);
        }
        int i6 = this.A00;
        if (i == i6) {
            int[] iArr4 = this.A01;
            if (i3 < iArr4.length) {
                iArr4[i3] = hashCode;
                Object[] objArr4 = this.A02;
                int i7 = i3 << 1;
                objArr4[i7] = obj;
                objArr4[i7 + 1] = obj2;
                this.A00 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public Object remove(Object obj) {
        int A022 = A02(obj);
        if (A022 >= 0) {
            return A05(A022);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int A022 = A02(obj);
        if (A022 < 0) {
            return false;
        }
        Object obj3 = this.A02[(A022 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        A05(A022);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        int A022 = A02(obj);
        if (A022 < 0) {
            return null;
        }
        int i = (A022 << 1) + 1;
        Object[] objArr = this.A02;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int A022 = A02(obj);
        if (A022 < 0) {
            return false;
        }
        int i = (A022 << 1) + 1;
        Object obj4 = this.A02[i];
        if (obj4 != obj2 && (obj2 == null || !obj2.equals(obj4))) {
            return false;
        }
        this.A02[i] = obj3;
        return true;
    }

    public int size() {
        return this.A00;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A00 * 28);
        sb.append('{');
        for (int i = 0; i < this.A00; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.A02[i << 1];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.A02[(i << 1) + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
