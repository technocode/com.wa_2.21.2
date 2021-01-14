package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0ck  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC09350ck implements Cloneable {
    public static ThreadLocal A0L = new ThreadLocal();
    public static final AbstractC17200r8 A0M = new C30851c3();
    public static final int[] A0N = {2, 1, 3, 4};
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public TimeInterpolator A03 = null;
    public AbstractC17200r8 A04 = A0M;
    public C30821c0 A05;
    public AbstractC09390co A06;
    public C09360cl A07 = null;
    public C17290rI A08 = new C17290rI();
    public C17290rI A09 = new C17290rI();
    public String A0A = getClass().getName();
    public ArrayList A0B = new ArrayList();
    public ArrayList A0C = new ArrayList();
    public ArrayList A0D;
    public ArrayList A0E = null;
    public ArrayList A0F;
    public ArrayList A0G = new ArrayList();
    public ArrayList A0H = new ArrayList();
    public boolean A0I = false;
    public boolean A0J = false;
    public int[] A0K = A0N;

    public static AnonymousClass05V A00() {
        AnonymousClass05V r1 = (AnonymousClass05V) A0L.get();
        if (r1 != null) {
            return r1;
        }
        AnonymousClass05V r12 = new AnonymousClass05V();
        A0L.set(r12);
        return r12;
    }

    public static void A01(C17290rI r8, View view, C17280rH r10) {
        r8.A02.put(view, r10);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = r8.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A0G2 = AnonymousClass0Q7.A0G(view);
        if (A0G2 != null) {
            AnonymousClass05V r1 = r8.A01;
            if (r1.A02(A0G2) >= 0) {
                r1.put(A0G2, null);
            } else {
                r1.put(A0G2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C015008i r4 = r8.A03;
                if (r4.A01) {
                    r4.A05();
                }
                if (AnonymousClass03W.A01(r4.A02, r4.A00, itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A03(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        r4.A08(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                r4.A08(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: A02 */
    public AbstractC09350ck clone() {
        try {
            AbstractC09350ck r1 = (AbstractC09350ck) super.clone();
            r1.A0B = new ArrayList();
            r1.A09 = new C17290rI();
            r1.A08 = new C17290rI();
            r1.A0F = null;
            r1.A0D = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public AbstractC09350ck A03(long j) {
        if (!(this instanceof C09360cl)) {
            this.A01 = j;
            return this;
        }
        C09360cl r4 = (C09360cl) this;
        ((AbstractC09350ck) r4).A01 = j;
        if (j >= 0) {
            ArrayList arrayList = r4.A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC09350ck) arrayList.get(i)).A03(j);
            }
        }
        return r4;
    }

    public AbstractC09350ck A04(TimeInterpolator timeInterpolator) {
        if (!(this instanceof C09360cl)) {
            this.A03 = timeInterpolator;
            return this;
        }
        C09360cl r4 = (C09360cl) this;
        r4.A00 |= 1;
        ArrayList arrayList = r4.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC09350ck) arrayList.get(i)).A04(timeInterpolator);
            }
        }
        ((AbstractC09350ck) r4).A03 = timeInterpolator;
        return r4;
    }

    public AbstractC09350ck A05(View view) {
        if (!(this instanceof C09360cl)) {
            this.A0H.add(view);
            return this;
        }
        C09360cl r0 = (C09360cl) this;
        r0.A0U(view);
        return r0;
    }

    public AbstractC09350ck A06(View view) {
        if (!(this instanceof C09360cl)) {
            this.A0H.remove(view);
            return this;
        }
        C09360cl r3 = (C09360cl) this;
        int i = 0;
        while (true) {
            ArrayList arrayList = r3.A02;
            if (i < arrayList.size()) {
                ((AbstractC09350ck) arrayList.get(i)).A06(view);
                i++;
            } else {
                r3.A0H.remove(view);
                return r3;
            }
        }
    }

    public AbstractC09350ck A07(AbstractC09420cr r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0E = arrayList;
        }
        arrayList.add(r2);
        return this;
    }

    public AbstractC09350ck A08(AbstractC09420cr r2) {
        ArrayList arrayList = this.A0E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(r2);
        if (this.A0E.size() == 0) {
            this.A0E = null;
        }
        return this;
    }

    public C17280rH A09(View view, boolean z) {
        ArrayList arrayList;
        C09360cl r0 = this.A07;
        if (r0 != null) {
            return r0.A09(view, z);
        }
        ArrayList arrayList2 = z ? this.A0F : this.A0D;
        if (arrayList2 == null) {
            return null;
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C17280rH r1 = (C17280rH) arrayList2.get(i);
            if (r1 == null) {
                return null;
            }
            if (r1.A00 == view) {
                if (i < 0) {
                    return null;
                } else {
                    if (z) {
                        arrayList = this.A0D;
                    } else {
                        arrayList = this.A0F;
                    }
                    return (C17280rH) arrayList.get(i);
                }
            }
        }
        return null;
    }

    public C17280rH A0A(View view, boolean z) {
        C17290rI r0;
        C09360cl r02 = this.A07;
        if (r02 != null) {
            return r02.A0A(view, z);
        }
        if (z) {
            r0 = this.A09;
        } else {
            r0 = this.A08;
        }
        return (C17280rH) r0.A02.getOrDefault(view, null);
    }

    public String A0B(String str) {
        StringBuilder A0S = AnonymousClass008.A0S(str);
        A0S.append(getClass().getSimpleName());
        A0S.append("@");
        A0S.append(Integer.toHexString(hashCode()));
        A0S.append(": ");
        String obj = A0S.toString();
        long j = this.A01;
        if (j != -1) {
            StringBuilder A0Y = AnonymousClass008.A0Y(obj, "dur(");
            A0Y.append(j);
            A0Y.append(") ");
            obj = A0Y.toString();
        }
        long j2 = this.A02;
        if (j2 != -1) {
            StringBuilder A0Y2 = AnonymousClass008.A0Y(obj, "dly(");
            A0Y2.append(j2);
            A0Y2.append(") ");
            obj = A0Y2.toString();
        }
        TimeInterpolator timeInterpolator = this.A03;
        if (timeInterpolator != null) {
            StringBuilder A0Y3 = AnonymousClass008.A0Y(obj, "interp(");
            A0Y3.append(timeInterpolator);
            A0Y3.append(") ");
            obj = A0Y3.toString();
        }
        ArrayList arrayList = this.A0G;
        if (arrayList.size() <= 0 && this.A0H.size() <= 0) {
            return obj;
        }
        String A0K2 = AnonymousClass008.A0K(obj, "tgts(");
        int i = 0;
        if (arrayList.size() > 0) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0G;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                if (i2 > 0) {
                    A0K2 = AnonymousClass008.A0K(A0K2, ", ");
                }
                StringBuilder A0S2 = AnonymousClass008.A0S(A0K2);
                A0S2.append(arrayList2.get(i2));
                A0K2 = A0S2.toString();
                i2++;
            }
        }
        if (this.A0H.size() > 0) {
            while (true) {
                ArrayList arrayList3 = this.A0H;
                if (i >= arrayList3.size()) {
                    break;
                }
                if (i > 0) {
                    A0K2 = AnonymousClass008.A0K(A0K2, ", ");
                }
                StringBuilder A0S3 = AnonymousClass008.A0S(A0K2);
                A0S3.append(arrayList3.get(i));
                A0K2 = A0S3.toString();
                i++;
            }
        }
        return AnonymousClass008.A0K(A0K2, ")");
    }

    public void A0C() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC09420cr) abstractList.get(i2)).ALG(this);
                }
            }
            int i3 = 0;
            while (true) {
                C015008i r1 = this.A09.A03;
                if (i3 >= r1.A00()) {
                    break;
                }
                View view = (View) r1.A02(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C015008i r12 = this.A08.A03;
                if (i4 < r12.A00()) {
                    View view2 = (View) r12.A02(i4);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                    }
                    i4++;
                } else {
                    this.A0I = true;
                    return;
                }
            }
        }
    }

    public void A0D() {
        ArrayList arrayList;
        if (!(this instanceof C09360cl)) {
            A0E();
            AnonymousClass05V A002 = A00();
            Iterator it = this.A0B.iterator();
            while (it.hasNext()) {
                Animator animator = (Animator) it.next();
                if (A002.containsKey(animator)) {
                    A0E();
                    if (animator != null) {
                        animator.addListener(new C17230rC(this, A002));
                        long j = this.A01;
                        if (j >= 0) {
                            animator.setDuration(j);
                        }
                        long j2 = this.A02;
                        if (j2 >= 0) {
                            animator.setStartDelay(j2);
                        }
                        TimeInterpolator timeInterpolator = this.A03;
                        if (timeInterpolator != null) {
                            animator.setInterpolator(timeInterpolator);
                        }
                        animator.addListener(new C17240rD(this));
                        animator.start();
                    }
                }
            }
            this.A0B.clear();
            A0C();
            return;
        }
        C09360cl r4 = (C09360cl) this;
        ArrayList arrayList2 = r4.A02;
        if (arrayList2.isEmpty()) {
            r4.A0E();
            r4.A0C();
            return;
        }
        AnonymousClass24M r2 = new AnonymousClass24M(r4);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((AbstractC09350ck) it2.next()).A07(r2);
        }
        ArrayList arrayList3 = r4.A02;
        r4.A01 = arrayList3.size();
        if (!r4.A03) {
            int i = 1;
            while (true) {
                arrayList = r4.A02;
                if (i >= arrayList.size()) {
                    break;
                }
                ((AbstractC09350ck) arrayList.get(i - 1)).A07(new AnonymousClass24L(r4, (AbstractC09350ck) arrayList.get(i)));
                i++;
            }
            AbstractC09350ck r0 = (AbstractC09350ck) arrayList.get(0);
            if (r0 != null) {
                r0.A0D();
                return;
            }
            return;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            ((AbstractC09350ck) it3.next()).A0D();
        }
    }

    public void A0E() {
        if (this.A00 == 0) {
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC09420cr) abstractList.get(i)).ALJ(this);
                }
            }
            this.A0I = false;
        }
        this.A00++;
    }

    public void A0F(View view) {
        int i;
        if (!this.A0I) {
            AnonymousClass05V A002 = A00();
            int i2 = ((AnonymousClass05W) A002).A00;
            AbstractC17380rR A003 = C17340rN.A00(view);
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                C17250rE r1 = (C17250rE) A002.A02[(i3 << 1) + 1];
                if (r1.A00 != null && A003.equals(r1.A03)) {
                    Animator animator = (Animator) A002.A02[i3 << 1];
                    if (Build.VERSION.SDK_INT >= 19) {
                        animator.pause();
                    } else {
                        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                        if (listeners != null) {
                            int size = listeners.size();
                            while (i < size) {
                                Animator.AnimatorListener animatorListener = listeners.get(i);
                                if (animatorListener instanceof AbstractC17090qx) {
                                    ((AbstractC17090qx) animatorListener).onAnimationPause(animator);
                                }
                                i++;
                            }
                        }
                    }
                }
                i3--;
            }
            ArrayList arrayList = this.A0E;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size2 = abstractList.size();
                while (i < size2) {
                    ((AbstractC09420cr) abstractList.get(i)).ALH(this);
                    i++;
                }
            }
            this.A0J = true;
        }
    }

    public void A0G(View view) {
        if (this.A0J) {
            if (!this.A0I) {
                AnonymousClass05V A002 = A00();
                int i = ((AnonymousClass05W) A002).A00;
                AbstractC17380rR A003 = C17340rN.A00(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C17250rE r1 = (C17250rE) A002.A02[(i2 << 1) + 1];
                    if (r1.A00 != null && A003.equals(r1.A03)) {
                        Animator animator = (Animator) A002.A02[i2 << 1];
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size = listeners.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof AbstractC17090qx) {
                                        ((AbstractC17090qx) animatorListener).onAnimationResume(animator);
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList = this.A0E;
                if (arrayList != null && arrayList.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList.clone();
                    int size2 = abstractList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((AbstractC09420cr) abstractList.get(i4)).ALI(this);
                    }
                }
            }
            this.A0J = false;
        }
    }

    public final void A0H(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C17280rH r1 = new C17280rH();
                r1.A00 = view;
                if (z) {
                    A0P(r1);
                } else {
                    A0N(r1);
                }
                r1.A01.add(this);
                A0O(r1);
                if (z) {
                    A01(this.A09, view, r1);
                } else {
                    A01(this.A08, view, r1);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A0H(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01e0, code lost:
        if (X.AnonymousClass0Q7.A05(r28) == 1) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018f, code lost:
        if (X.AnonymousClass0Q7.A05(r28) == 1) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x004f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.view.ViewGroup r28, X.C17290rI r29, X.C17290rI r30, java.util.ArrayList r31, java.util.ArrayList r32) {
        /*
        // Method dump skipped, instructions count: 716
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09350ck.A0I(android.view.ViewGroup, X.0rI, X.0rI, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A0J(ViewGroup viewGroup, boolean z) {
        A0Q(z);
        if (this.A0G.size() > 0 || this.A0H.size() > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.A0G;
                if (i2 >= arrayList.size()) {
                    break;
                }
                View findViewById = viewGroup.findViewById(((Number) arrayList.get(i2)).intValue());
                if (findViewById != null) {
                    C17280rH r1 = new C17280rH();
                    r1.A00 = findViewById;
                    if (z) {
                        A0P(r1);
                    } else {
                        A0N(r1);
                    }
                    r1.A01.add(this);
                    A0O(r1);
                    if (z) {
                        A01(this.A09, findViewById, r1);
                    } else {
                        A01(this.A08, findViewById, r1);
                    }
                }
                i2++;
            }
            while (true) {
                ArrayList arrayList2 = this.A0H;
                if (i < arrayList2.size()) {
                    View view = (View) arrayList2.get(i);
                    C17280rH r12 = new C17280rH();
                    r12.A00 = view;
                    if (z) {
                        A0P(r12);
                    } else {
                        A0N(r12);
                    }
                    r12.A01.add(this);
                    A0O(r12);
                    if (z) {
                        A01(this.A09, view, r12);
                    } else {
                        A01(this.A08, view, r12);
                    }
                    i++;
                } else {
                    return;
                }
            }
        } else {
            A0H(viewGroup, z);
        }
    }

    public void A0K(AbstractC17200r8 r5) {
        if (this instanceof C09360cl) {
            C09360cl r3 = (C09360cl) this;
            if (r5 == null) {
                ((AbstractC09350ck) r3).A04 = A0M;
            } else {
                ((AbstractC09350ck) r3).A04 = r5;
            }
            r3.A00 |= 4;
            int i = 0;
            while (true) {
                ArrayList arrayList = r3.A02;
                if (i < arrayList.size()) {
                    ((AbstractC09350ck) arrayList.get(i)).A0K(r5);
                    i++;
                } else {
                    return;
                }
            }
        } else if (r5 == null) {
            this.A04 = A0M;
        } else {
            this.A04 = r5;
        }
    }

    public void A0L(C30821c0 r5) {
        if (!(this instanceof C09360cl)) {
            this.A05 = r5;
            return;
        }
        C09360cl r1 = (C09360cl) this;
        r1.A05 = r5;
        r1.A00 |= 2;
        ArrayList arrayList = r1.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC09350ck) arrayList.get(i)).A0L(r5);
        }
    }

    public void A0M(AbstractC09390co r5) {
        if (!(this instanceof C09360cl)) {
            this.A06 = r5;
            return;
        }
        C09360cl r1 = (C09360cl) this;
        r1.A06 = r5;
        r1.A00 |= 8;
        ArrayList arrayList = r1.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC09350ck) arrayList.get(i)).A0M(r5);
        }
    }

    public void A0N(C17280rH r4) {
        if (this instanceof C09360cl) {
            C09360cl r1 = (C09360cl) this;
            if (r1.A0R(r4.A00)) {
                Iterator it = r1.A02.iterator();
                while (it.hasNext()) {
                    AbstractC09350ck r12 = (AbstractC09350ck) it.next();
                    if (r12.A0R(r4.A00)) {
                        r12.A0N(r4);
                        r4.A01.add(r12);
                    }
                }
            }
        } else if (!(this instanceof AbstractC30911cA)) {
            if (!(this instanceof C30811bz)) {
                ((C30801by) this).A0U(r4);
            } else {
                C30811bz.A02(r4);
            }
        } else if (!(((AbstractC30911cA) this) instanceof AnonymousClass24J)) {
            AbstractC30911cA.A03(r4);
        } else {
            AbstractC30911cA.A03(r4);
            int[] iArr = new int[2];
            r4.A00.getLocationOnScreen(iArr);
            r4.A02.put("android:slide:screenPosition", iArr);
        }
    }

    public void A0O(C17280rH r10) {
        String[] strArr;
        if (this.A05 != null) {
            Map map = r10.A02;
            if (map.isEmpty()) {
                return;
            }
            if (this.A05 != null) {
                for (String str : C30821c0.A02) {
                    if (!map.containsKey(str)) {
                        if (this.A05 != null) {
                            View view = r10.A00;
                            Object obj = map.get("android:visibility:visibility");
                            if (obj == null) {
                                obj = Integer.valueOf(view.getVisibility());
                            }
                            map.put("android:visibilityPropagation:visibility", obj);
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            int round = Math.round(view.getTranslationX()) + iArr[0];
                            iArr[0] = round;
                            iArr[0] = (view.getWidth() / 2) + round;
                            int round2 = Math.round(view.getTranslationY()) + iArr[1];
                            iArr[1] = round2;
                            iArr[1] = (view.getHeight() / 2) + round2;
                            map.put("android:visibilityPropagation:center", iArr);
                            return;
                        } else {
                            throw null;
                        }
                    }
                }
                return;
            }
            throw null;
        }
    }

    public void A0P(C17280rH r4) {
        if (this instanceof C09360cl) {
            C09360cl r1 = (C09360cl) this;
            if (r1.A0R(r4.A00)) {
                Iterator it = r1.A02.iterator();
                while (it.hasNext()) {
                    AbstractC09350ck r12 = (AbstractC09350ck) it.next();
                    if (r12.A0R(r4.A00)) {
                        r12.A0P(r4);
                        r4.A01.add(r12);
                    }
                }
            }
        } else if (this instanceof AnonymousClass24J) {
            AbstractC30911cA.A03(r4);
            int[] iArr = new int[2];
            r4.A00.getLocationOnScreen(iArr);
            r4.A02.put("android:slide:screenPosition", iArr);
        } else if (this instanceof AnonymousClass24C) {
            AbstractC30911cA.A03(r4);
            r4.A02.put("android:fade:transitionAlpha", Float.valueOf(C17340rN.A04.A00(r4.A00)));
        } else if (!(this instanceof C30811bz)) {
            ((C30801by) this).A0U(r4);
        } else {
            C30811bz.A02(r4);
        }
    }

    public void A0Q(boolean z) {
        if (z) {
            this.A09.A02.clear();
            this.A09.A00.clear();
            this.A09.A03.A04();
            return;
        }
        this.A08.A02.clear();
        this.A08.A00.clear();
        this.A08.A03.A04();
    }

    public boolean A0R(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0G;
        if ((arrayList.size() != 0 || this.A0H.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !this.A0H.contains(view)) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 161
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public boolean A0S(X.C17280rH r8, X.C17280rH r9) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09350ck.A0S(X.0rH, X.0rH):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r12 != r7) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A0T(android.view.ViewGroup r18, X.C17280rH r19, X.C17280rH r20) {
        /*
        // Method dump skipped, instructions count: 442
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09350ck.A0T(android.view.ViewGroup, X.0rH, X.0rH):android.animation.Animator");
    }

    public String toString() {
        return A0B("");
    }
}
