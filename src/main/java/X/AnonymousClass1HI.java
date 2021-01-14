package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.1HI  reason: invalid class name */
public class AnonymousClass1HI {
    public static final AbstractC011306t A06 = C008805h.A0T("false");
    public static final AbstractC011306t A07 = C008805h.A0T("length");
    public static final AbstractC011306t A08 = new C463229b(1.0d);
    public static final AbstractC011306t A09 = C008805h.A0T("true");
    public static final AbstractC011306t A0A = C008805h.A0T("undefined");
    public static final AbstractC011306t A0B = new C463229b(0.0d);
    public int A00;
    public int A01;
    public C38181pS A02;
    public int[] A03 = new int[16];
    public Object[] A04 = new Object[16];
    public final Random A05 = new Random();

    public static AnonymousClass27D A00(Object obj) {
        double d;
        AnonymousClass27D r0;
        if ((obj instanceof C463229b) && (r0 = (AnonymousClass27D) obj) != null) {
            return r0;
        }
        if (C008805h.A1T(obj)) {
            return new C463229b(Double.NaN);
        }
        if (!(obj instanceof AnonymousClass1HD)) {
            return null;
        }
        if (((AnonymousClass1HD) obj).A00) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        return new C463229b(d);
    }

    public static final void A01(String str) {
        throw new AnonymousClass1HF(AnonymousClass008.A0K("TypeError: ", str));
    }

    public static void A02(List list, int i) {
        int size = list.size();
        if (i > size) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(i);
            }
            do {
                list.add(AnonymousClass1H5.A00);
                size++;
            } while (i > size);
        } else if (i < size) {
            do {
                size--;
                list.remove(size);
            } while (i < size);
            if (list instanceof ArrayList) {
                ((ArrayList) list).trimToSize();
            }
        }
    }

    public static boolean A03(Object obj) {
        if (obj instanceof AnonymousClass1HD) {
            return ((AnonymousClass1HD) obj).A00;
        }
        if (C008805h.A1T(obj)) {
            return false;
        }
        if (C008805h.A1U(obj)) {
            return !C008805h.A0h(obj).isEmpty();
        }
        if (obj instanceof C463229b) {
            double doubleValue = ((Number) obj).doubleValue();
            if (doubleValue == 0.0d || Double.isNaN(doubleValue)) {
                return false;
            }
            return true;
        } else if (!(obj instanceof C463329c) || ((Number) obj).longValue() != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (((double) r5) == r3) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((long) r5) == r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(java.lang.Object r7, int r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C463329c
            if (r0 == 0) goto L_0x0015
            java.lang.Number r7 = (java.lang.Number) r7
            long r3 = r7.longValue()
            int r5 = (int) r3
            long r1 = (long) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
        L_0x0010:
            if (r5 < 0) goto L_0x0026
            if (r5 > r8) goto L_0x0026
            return r5
        L_0x0015:
            boolean r0 = r7 instanceof X.C463229b
            if (r0 == 0) goto L_0x0026
            java.lang.Number r7 = (java.lang.Number) r7
            double r3 = r7.doubleValue()
            int r5 = (int) r3
            double r1 = (double) r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0026
            goto L_0x0010
        L_0x0026:
            A01(r9)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HI.A04(java.lang.Object, int, java.lang.String):int");
    }

    public final AbstractC011306t A05(Object obj) {
        String d;
        if (C008805h.A1T(obj)) {
            return A0A;
        }
        if (obj instanceof AnonymousClass1HD) {
            return ((AnonymousClass1HD) obj).A00 ? A09 : A06;
        }
        if (obj instanceof C463329c) {
            return C008805h.A0T(Long.toString(((Number) obj).longValue()));
        }
        if (obj instanceof C463229b) {
            double doubleValue = ((Number) obj).doubleValue();
            int i = (int) doubleValue;
            if (((double) i) == doubleValue) {
                d = Integer.toString(i);
            } else {
                d = Double.toString(doubleValue);
                int indexOf = d.indexOf(69);
                if (indexOf >= 0) {
                    int length = d.length();
                    int i2 = length + 1;
                    char[] cArr = new char[i2];
                    d.getChars(0, indexOf, cArr, 0);
                    cArr[indexOf] = 'e';
                    int i3 = indexOf + 1;
                    if (d.charAt(i3) == '-') {
                        d.getChars(i3, length, cArr, i3);
                    } else {
                        cArr[i3] = '+';
                        d.getChars(i3, length, cArr, indexOf + 2);
                        length = i2;
                    }
                    d = new String(cArr, 0, length);
                }
            }
            return C008805h.A0T(d);
        } else if (C008805h.A1U(obj)) {
            return (AbstractC011306t) obj;
        } else {
            if (obj == null) {
                A01("Java null cannot be converted to string");
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append(" cannot be converted to string");
            A01(sb.toString());
            throw null;
        }
    }

    public final Object A06(int i) {
        return this.A04[(this.A01 - 1) - i];
    }

    public final Object A07(Object obj, Object obj2, AnonymousClass1HG r7, String str) {
        AnonymousClass27D A002;
        AnonymousClass27D A003 = A00(obj);
        if (A003 != null && (A002 = A00(obj2)) != null) {
            return new C463229b(r7.A22(A003.doubleValue(), A002.doubleValue()));
        }
        if ((obj instanceof C463329c) && (obj2 instanceof C463329c)) {
            return new C463329c(r7.A24(((Number) obj).longValue(), ((Number) obj2).longValue()));
        }
        StringBuilder sb = new StringBuilder("Incompatible operand types of ");
        sb.append(str);
        A01(sb.toString());
        throw null;
    }

    public final Map A08(Object obj, int i) {
        if (C008805h.A1S(obj)) {
            return (Map) C008805h.A0a((AnonymousClass27G) obj);
        }
        A0C(i);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v164 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02fe, code lost:
        if (r3 == ((java.lang.Number) r2).doubleValue()) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0317, code lost:
        if (r3 == ((java.lang.Number) r2).longValue()) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0332, code lost:
        if (X.C008805h.A0h(r1).equals(X.C008805h.A0h(r2)) != false) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x034b, code lost:
        if (r1 == r2) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0b3d, code lost:
        if (r4 == null) goto L_0x0b3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02e4, code lost:
        if (r1 == ((X.AnonymousClass1HD) r2).A00) goto L_0x02e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
        // Method dump skipped, instructions count: 3874
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HI.A09():void");
    }

    public final void A0A() {
        int i = this.A01 - 1;
        this.A01 = i;
        this.A04[i] = null;
    }

    public final void A0B(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A04, i2, i + i2, (Object) null);
    }

    public final void A0C(int i) {
        StringBuilder A0S = AnonymousClass008.A0S("invalid stack value for opcode ");
        A0S.append(AnonymousClass1HJ.A00[i]);
        A01(A0S.toString());
        throw null;
    }

    public final void A0D(int i) {
        Object[] objArr = this.A04;
        int length = objArr.length;
        int i2 = this.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw new IllegalStateException("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            this.A04 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(this.A03, 0, iArr, 0, this.A01);
            this.A03 = iArr;
        }
    }

    public final void A0E(int i, Object obj) {
        this.A04[(this.A01 - i) - 1] = obj;
    }

    public final void A0F(Object obj) {
        Object[] objArr = this.A04;
        int i = this.A01;
        objArr[i] = obj;
        this.A01 = i + 1;
    }

    public final void A0G(Object obj, int i, Object obj2, int i2) {
        Object[] objArr = this.A04;
        int i3 = this.A01;
        objArr[i3] = obj;
        int i4 = i3 + 1;
        this.A01 = i4;
        int[] iArr = this.A03;
        iArr[i4] = i;
        int i5 = i4 + 1;
        this.A01 = i5;
        objArr[i5] = obj2;
        int i6 = i5 + 1;
        this.A01 = i6;
        iArr[i6] = i2;
        int i7 = i6 + 1;
        this.A01 = i7;
        iArr[i7] = this.A00;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A00 = i8 - 1;
    }

    public final boolean A0H(Object obj, Object obj2, AnonymousClass1HH r7, String str) {
        AnonymousClass27D A002 = A00(obj);
        if (A002 != null) {
            AnonymousClass27D A003 = A00(obj2);
            if (A003 != null) {
                return r7.AQU(A002.doubleValue(), A003.doubleValue());
            }
            if (obj2 instanceof C463329c) {
                return r7.AQV(A002.doubleValue(), ((Number) obj2).longValue());
            }
        } else if (obj instanceof C463329c) {
            if (obj2 instanceof C463329c) {
                return r7.AQX(((Number) obj).longValue(), ((Number) obj2).longValue());
            }
            AnonymousClass27D A004 = A00(obj2);
            if (A004 != null) {
                return r7.AQW(((Number) obj).longValue(), A004.doubleValue());
            }
        }
        StringBuilder sb = new StringBuilder("Incompatible operand types of ");
        sb.append(str);
        A01(sb.toString());
        throw null;
    }
}
