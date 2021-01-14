package X;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.0ch  reason: invalid class name and case insensitive filesystem */
public class C09330ch {
    public static final AbstractC09340cj A00 = (Build.VERSION.SDK_INT >= 21 ? new C30221ax() : null);
    public static final AbstractC09340cj A01;
    public static final int[] A02 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    static {
        AbstractC09340cj r3 = null;
        try {
            r3 = (AbstractC09340cj) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        A01 = r3;
    }

    public static View A00(AnonymousClass05V r4, C09440ct r5, Object obj, boolean z) {
        ArrayList arrayList;
        Object obj2;
        AnonymousClass0QB r3 = r5.A01;
        if (obj == null || r4 == null || (arrayList = r3.A0B) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            obj2 = arrayList.get(0);
        } else {
            obj2 = r3.A0C.get(0);
        }
        return (View) r4.get(obj2);
    }

    public static AnonymousClass05V A01(AbstractC09340cj r9, AnonymousClass05V r10, Object obj, C09440ct r12) {
        ArrayList arrayList;
        Object obj2;
        Object obj3;
        AnonymousClass037 r4 = r12.A03;
        View view = r4.A0A;
        AbstractC14640md r0 = null;
        if (r10.isEmpty() || obj == null || view == null) {
            r10.clear();
            return null;
        }
        AnonymousClass05V r3 = new AnonymousClass05V();
        r9.A03(r3, view);
        AnonymousClass0QB r2 = r12.A01;
        if (r12.A05) {
            AnonymousClass0O2 r1 = r4.A0C;
            arrayList = r2.A0B;
        } else {
            AnonymousClass0O2 r13 = r4.A0C;
            if (r13 != null) {
                r0 = r13.A05;
            }
            arrayList = r2.A0C;
        }
        if (arrayList != null) {
            AbstractC06040Rm.A00(r3, arrayList);
            AbstractC06040Rm.A00(r3, r10.values());
        }
        if (r0 == null) {
            int i = ((AnonymousClass05W) r10).A00;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                } else if (!r3.containsKey(r10.A02[(i << 1) + 1])) {
                    r10.A05(i);
                }
            }
        } else {
            r0.A00(arrayList, r3);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                String str = (String) arrayList.get(size);
                View view2 = (View) r3.get(str);
                if (view2 == null) {
                    int i2 = ((AnonymousClass05W) r10).A00;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            obj3 = null;
                            break;
                        }
                        Object[] objArr = r10.A02;
                        int i4 = i3 << 1;
                        if (str.equals(objArr[i4 + 1])) {
                            obj3 = objArr[i4];
                            break;
                        }
                        i3++;
                    }
                    if (obj3 != null) {
                        r10.remove(obj3);
                    }
                } else if (!str.equals(AnonymousClass0Q7.A0G(view2))) {
                    int i5 = ((AnonymousClass05W) r10).A00;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            obj2 = null;
                            break;
                        }
                        Object[] objArr2 = r10.A02;
                        int i7 = i6 << 1;
                        if (str.equals(objArr2[i7 + 1])) {
                            obj2 = objArr2[i7];
                            break;
                        }
                        i6++;
                    }
                    if (obj2 != null) {
                        r10.put(obj2, AnonymousClass0Q7.A0G(view2));
                    }
                }
            }
        }
        return r3;
    }

    public static AnonymousClass05V A02(AbstractC09340cj r6, AnonymousClass05V r7, Object obj, C09440ct r9) {
        ArrayList arrayList;
        AbstractC14640md r3 = null;
        if (r7.isEmpty() || obj == null) {
            r7.clear();
            return null;
        }
        AnonymousClass037 r2 = r9.A02;
        AnonymousClass05V r5 = new AnonymousClass05V();
        r6.A03(r5, r2.A07());
        AnonymousClass0QB r1 = r9.A00;
        if (r9.A04) {
            AnonymousClass0O2 r0 = r2.A0C;
            if (r0 != null) {
                r3 = r0.A05;
            }
            arrayList = r1.A0C;
        } else {
            AnonymousClass0O2 r02 = r2.A0C;
            arrayList = r1.A0B;
        }
        if (arrayList != null) {
            AbstractC06040Rm.A00(r5, arrayList);
        }
        if (r3 != null) {
            r3.A00(arrayList, r5);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                String str = (String) arrayList.get(size);
                View view = (View) r5.get(str);
                if (view == null) {
                    r7.remove(str);
                } else if (!str.equals(AnonymousClass0Q7.A0G(view))) {
                    r7.put(AnonymousClass0Q7.A0G(view), r7.remove(str));
                }
            }
        } else {
            AbstractC06040Rm.A00(r7, r5.keySet());
        }
        return r5;
    }

    public static AbstractC09340cj A03(AnonymousClass037 r7, AnonymousClass037 r8) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (r7 != null) {
            AnonymousClass0O2 r2 = r7.A0C;
            if (r2 != null) {
                Object obj4 = r2.A09;
                if (obj4 == AnonymousClass037.A0l) {
                    if (r2 != null) {
                        obj4 = r2.A07;
                    }
                }
                if (obj4 != null) {
                    arrayList.add(obj4);
                }
            }
            if (r2 != null) {
                Object obj5 = r2.A0B;
                if (obj5 == AnonymousClass037.A0l) {
                    AnonymousClass0O2 r0 = r7.A0C;
                    if (r0 != null) {
                        obj5 = r0.A0A;
                    }
                }
                if (obj5 != null) {
                    arrayList.add(obj5);
                }
            }
        }
        if (r8 != null) {
            AnonymousClass0O2 r02 = r8.A0C;
            if (!(r02 == null || (obj3 = r02.A07) == null)) {
                arrayList.add(obj3);
            }
            AnonymousClass0O2 r03 = r8.A0C;
            if (!(r03 == null || (obj2 = r03.A08) == AnonymousClass037.A0l || obj2 == null)) {
                arrayList.add(obj2);
            }
            AnonymousClass0O2 r04 = r8.A0C;
            if (!(r04 == null || (obj = r04.A0A) == null)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC09340cj r4 = A00;
        if (r4 != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (r4.A0J(arrayList.get(i))) {
                }
            }
            return r4;
        }
        AbstractC09340cj r3 = A01;
        if (r3 != null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (r3.A0J(arrayList.get(i2))) {
                }
            }
            return r3;
        }
        if (r4 == null && r3 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static Object A04(AbstractC09340cj r3, AnonymousClass037 r4, AnonymousClass037 r5, boolean z) {
        Object obj;
        if (z) {
            AnonymousClass0O2 r2 = r5.A0C;
            if (r2 == null) {
                obj = null;
            } else {
                obj = r2.A0B;
                if (obj == AnonymousClass037.A0l) {
                    if (r2 == null) {
                        obj = null;
                    } else {
                        obj = r2.A0A;
                    }
                }
            }
        } else {
            AnonymousClass0O2 r0 = r4.A0C;
            if (r0 == null) {
                obj = null;
            } else {
                obj = r0.A0A;
            }
        }
        return r3.A05(r3.A04(obj));
    }

    public static Object A05(AbstractC09340cj r2, AnonymousClass037 r3, boolean z) {
        Object obj = null;
        if (r3 == null) {
            return null;
        }
        if (z) {
            AnonymousClass0O2 r0 = r3.A0C;
            if (r0 != null && (obj = r0.A08) == AnonymousClass037.A0l) {
                obj = null;
            }
        } else {
            AnonymousClass0O2 r02 = r3.A0C;
            if (r02 != null) {
                obj = r02.A07;
            }
        }
        return r2.A04(obj);
    }

    public static Object A06(AbstractC09340cj r3, AnonymousClass037 r4, boolean z) {
        AnonymousClass0O2 r2;
        Object obj = null;
        if (r4 == null) {
            return null;
        }
        if (z && (r2 = r4.A0C) != null && (obj = r2.A09) == AnonymousClass037.A0l) {
            obj = r2 == null ? null : r2.A07;
        }
        return r3.A04(obj);
    }

    public static ArrayList A07(AbstractC09340cj r2, Object obj, AnonymousClass037 r4, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = r4.A0A;
        if (view2 != null) {
            r2.A02(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            r2.A0G(obj, arrayList2);
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0067, code lost:
        if (r6.A02 == null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0091, code lost:
        if (r2.A0T != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00c6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00e1, code lost:
        if (r2.A0Z == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x00e3, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.AnonymousClass0QB r9, X.C09130cL r10, android.util.SparseArray r11, boolean r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09330ch.A08(X.0QB, X.0cL, android.util.SparseArray, boolean, boolean):void");
    }

    public static void A09(AnonymousClass037 r5, AnonymousClass037 r6, boolean z, AnonymousClass05V r8, boolean z2) {
        AbstractC14640md r7;
        if (z) {
            AnonymousClass0O2 r0 = r6.A0C;
            if (r0 != null) {
                r7 = r0.A05;
            } else {
                return;
            }
        } else {
            AnonymousClass0O2 r02 = r5.A0C;
            if (r02 != null) {
                r7 = r02.A05;
            } else {
                return;
            }
        }
        if (r7 != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (r8 != null) {
                int i = ((AnonymousClass05W) r8).A00;
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 << 1;
                    arrayList2.add(r8.A02[i3]);
                    arrayList.add(r8.A02[i3 + 1]);
                }
            }
            if (!z2 && (r7 instanceof C51682Zr)) {
                ActivityC004802g r1 = ((C51682Zr) r7).A00;
                if (r1 != null) {
                    AnonymousClass0TX.A0G(r1, null);
                    return;
                }
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0175 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0175 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.AnonymousClass0LW r43, java.util.ArrayList r44, java.util.ArrayList r45, int r46, int r47, boolean r48, X.AnonymousClass0SW r49) {
        /*
        // Method dump skipped, instructions count: 1168
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09330ch.A0A(X.0LW, java.util.ArrayList, java.util.ArrayList, int, int, boolean, X.0SW):void");
    }

    public static void A0B(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    public static void A0C(ArrayList arrayList, AnonymousClass05V r4, Collection collection) {
        for (int i = ((AnonymousClass05W) r4).A00 - 1; i >= 0; i--) {
            View view = (View) r4.A02[(i << 1) + 1];
            if (collection.contains(AnonymousClass0Q7.A0G(view))) {
                arrayList.add(view);
            }
        }
    }
}
