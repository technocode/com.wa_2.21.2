package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1bH  reason: invalid class name and case insensitive filesystem */
public class C30391bH implements AbstractC16270pX {
    public int A00 = 0;
    public C14840my A01 = new C14840my(30);
    public final AbstractC15900ov A02;
    public final C16280pY A03;
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();

    public C30391bH(AbstractC15900ov r3) {
        this.A02 = r3;
        this.A03 = new C16280pY(this);
    }

    public int A00(int i, int i2) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        while (i2 < size) {
            C15910ow r3 = (C15910ow) arrayList.get(i2);
            int i3 = r3.A00;
            if (i3 == 8) {
                int i4 = r3.A02;
                if (i4 == i) {
                    i = r3.A01;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (r3.A01 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = r3.A02;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = r3.A01;
                    i -= i6;
                    if (i < i5 + i6) {
                        return -1;
                    }
                } else if (i3 == 1) {
                    i += r3.A01;
                }
            }
            i2++;
        }
        return i;
    }

    public final int A01(int i, int i2) {
        ArrayList arrayList = this.A05;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C15910ow r3 = (C15910ow) arrayList.get(size);
            int i3 = r3.A00;
            if (i3 == 8) {
                int i4 = r3.A02;
                int i5 = r3.A01;
                if (i4 >= i5) {
                    i5 = i4;
                    i4 = i5;
                }
                if (i < i4 || i > i5) {
                    int i6 = r3.A02;
                    if (i < i6) {
                        if (i2 == 1) {
                            r3.A02 = i6 + 1;
                            r3.A01++;
                        } else if (i2 == 2) {
                            r3.A02 = i6 - 1;
                            r3.A01--;
                        }
                    }
                } else {
                    int i7 = r3.A02;
                    if (i4 == i7) {
                        if (i2 == 1) {
                            r3.A01++;
                        } else if (i2 == 2) {
                            r3.A01--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            r3.A02 = i7 + 1;
                        } else if (i2 == 2) {
                            r3.A02 = i7 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i8 = r3.A02;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= r3.A01;
                    } else if (i3 == 2) {
                        i += r3.A01;
                    }
                } else if (i2 == 1) {
                    r3.A02 = i8 + 1;
                } else if (i2 == 2) {
                    r3.A02 = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C15910ow r32 = (C15910ow) arrayList.get(size2);
            if (r32.A00 == 8) {
                int i9 = r32.A01;
                if (i9 == r32.A02 || i9 < 0) {
                    arrayList.remove(size2);
                    r32.A03 = null;
                    this.A01.A01(r32);
                }
            } else if (r32.A01 <= 0) {
                arrayList.remove(size2);
                r32.A03 = null;
                this.A01.A01(r32);
            }
        }
        return i;
    }

    public C15910ow A02(int i, int i2, int i3, Object obj) {
        C15910ow r0 = (C15910ow) this.A01.A00();
        if (r0 == null) {
            return new C15910ow(i, i2, i3, obj);
        }
        r0.A00 = i;
        r0.A02 = i2;
        r0.A01 = i3;
        r0.A03 = obj;
        return r0;
    }

    public void A03() {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C30571bZ) this.A02).A03((C15910ow) arrayList.get(i));
        }
        A09(arrayList);
        this.A00 = 0;
    }

    public void A04() {
        A03();
        ArrayList arrayList = this.A04;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15910ow r8 = (C15910ow) arrayList.get(i);
            int i2 = r8.A00;
            if (i2 == 1) {
                C30571bZ r2 = (C30571bZ) this.A02;
                r2.A03(r8);
                r2.A00(r8.A02, r8.A01);
            } else if (i2 == 2) {
                C30571bZ r0 = (C30571bZ) this.A02;
                r0.A03(r8);
                int i3 = r8.A02;
                int i4 = r8.A01;
                RecyclerView recyclerView = r0.A00;
                recyclerView.A0d(i3, i4, true);
                recyclerView.A0l = true;
                recyclerView.A0z.A00 += i4;
            } else if (i2 == 4) {
                C30571bZ r7 = (C30571bZ) this.A02;
                r7.A03(r8);
                r7.A02(r8.A02, r8.A01, r8.A03);
            } else if (i2 == 8) {
                C30571bZ r22 = (C30571bZ) this.A02;
                r22.A03(r8);
                r22.A01(r8.A02, r8.A01);
            }
        }
        A09(arrayList);
        this.A00 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x020a, code lost:
        if (r0.A0K.A02.contains(r15.A0H) != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x026e, code lost:
        if (r0.A0K.A02.contains(r15.A0H) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r3.A01 != (r6 - r1)) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        if (r3.A01 != (r1 - r6)) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0122, code lost:
        r14 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x000a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
        // Method dump skipped, instructions count: 703
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30391bH.A05():void");
    }

    public final void A06(C15910ow r13) {
        int i;
        int i2 = r13.A00;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int A012 = A01(r13.A02, i2);
        int i3 = r13.A02;
        int i4 = r13.A00;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(r13);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = 1;
        for (int i6 = 1; i6 < r13.A01; i6++) {
            int A013 = A01((i * i6) + r13.A02, i4);
            i4 = r13.A00;
            if (i4 == 2 ? A013 != A012 : !(i4 == 4 && A013 == A012 + 1)) {
                C15910ow A022 = A02(i4, A012, i5, r13.A03);
                A08(A022, i3);
                A022.A03 = null;
                this.A01.A01(A022);
                i4 = r13.A00;
                if (i4 == 4) {
                    i3 += i5;
                }
                A012 = A013;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = r13.A03;
        r13.A03 = null;
        this.A01.A01(r13);
        if (i5 > 0) {
            C15910ow A023 = A02(r13.A00, A012, i5, obj);
            A08(A023, i3);
            A023.A03 = null;
            this.A01.A01(A023);
        }
    }

    public final void A07(C15910ow r6) {
        this.A05.add(r6);
        int i = r6.A00;
        if (i == 1) {
            ((C30571bZ) this.A02).A00(r6.A02, r6.A01);
        } else if (i == 2) {
            AbstractC15900ov r0 = this.A02;
            int i2 = r6.A02;
            int i3 = r6.A01;
            RecyclerView recyclerView = ((C30571bZ) r0).A00;
            recyclerView.A0d(i2, i3, false);
            recyclerView.A0l = true;
        } else if (i == 4) {
            ((C30571bZ) this.A02).A02(r6.A02, r6.A01, r6.A03);
        } else if (i == 8) {
            ((C30571bZ) this.A02).A01(r6.A02, r6.A01);
        } else {
            StringBuilder sb = new StringBuilder("Unknown update op type for ");
            sb.append(r6);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A08(C15910ow r5, int i) {
        C30571bZ r3 = (C30571bZ) this.A02;
        r3.A03(r5);
        int i2 = r5.A00;
        if (i2 == 2) {
            int i3 = r5.A01;
            RecyclerView recyclerView = r3.A00;
            recyclerView.A0d(i, i3, true);
            recyclerView.A0l = true;
            recyclerView.A0z.A00 += i3;
        } else if (i2 == 4) {
            r3.A02(i, r5.A01, r5.A03);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public void A09(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C15910ow r1 = (C15910ow) list.get(i);
            r1.A03 = null;
            this.A01.A01(r1);
        }
        list.clear();
    }

    public final boolean A0A(int i) {
        ArrayList arrayList = this.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C15910ow r4 = (C15910ow) arrayList.get(i2);
            int i3 = r4.A00;
            if (i3 == 8) {
                if (A00(r4.A01, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = r4.A02;
                int i5 = r4.A01 + i4;
                while (i4 < i5) {
                    if (A00(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }
}
