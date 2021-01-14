package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ax  reason: invalid class name and case insensitive filesystem */
public class C30221ax extends AbstractC09340cj {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0.isEmpty() != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1 != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r1 != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.transition.Transition r2) {
        /*
            java.util.List r0 = r2.getTargetIds()
            if (r0 == 0) goto L_0x000d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r2.getTargetNames()
            if (r0 == 0) goto L_0x001d
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r2.getTargetTypes()
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            r0 = 0
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30221ax.A02(android.transition.Transition):boolean");
    }

    @Override // X.AbstractC09340cj
    public Object A04(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // X.AbstractC09340cj
    public Object A05(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // X.AbstractC09340cj
    public Object A06(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // X.AbstractC09340cj
    public void A07(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // X.AbstractC09340cj
    public void A08(AnonymousClass037 r2, Object obj, C04080Iy r4, Runnable runnable) {
        ((Transition) obj).addListener(new C15560oH(runnable));
    }

    @Override // X.AbstractC09340cj
    public void A09(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C15570oI(rect));
        }
    }

    @Override // X.AbstractC09340cj
    public void A0A(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // X.AbstractC09340cj
    public void A0B(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // X.AbstractC09340cj
    public void A0C(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC09340cj.A00(view, rect);
            ((Transition) obj).setEpicenterCallback(new C15530oE(rect));
        }
    }

    @Override // X.AbstractC09340cj
    public void A0D(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C15540oF(view, arrayList));
    }

    @Override // X.AbstractC09340cj
    public void A0E(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC09340cj.A01(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        A0G(transitionSet, arrayList);
    }

    @Override // X.AbstractC09340cj
    public void A0F(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C15550oG(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != false) goto L_0x002f;
     */
    @Override // X.AbstractC09340cj
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(java.lang.Object r4, java.util.ArrayList r5) {
        /*
            r3 = this;
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r4 instanceof android.transition.TransitionSet
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.transition.TransitionSet r4 = (android.transition.TransitionSet) r4
            int r1 = r4.getTransitionCount()
        L_0x0010:
            if (r2 >= r1) goto L_0x0044
            android.transition.Transition r0 = r4.getTransitionAt(r2)
            r3.A0G(r0, r5)
            int r2 = r2 + 1
            goto L_0x0010
        L_0x001c:
            boolean r0 = A02(r4)
            if (r0 != 0) goto L_0x0044
            java.util.List r0 = r4.getTargets()
            if (r0 == 0) goto L_0x002f
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 == 0) goto L_0x0044
            int r1 = r5.size()
        L_0x0036:
            if (r2 >= r1) goto L_0x0044
            java.lang.Object r0 = r5.get(r2)
            android.view.View r0 = (android.view.View) r0
            r4.addTarget(r0)
            int r2 = r2 + 1
            goto L_0x0036
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30221ax.A0G(java.lang.Object, java.util.ArrayList):void");
    }

    @Override // X.AbstractC09340cj
    public void A0H(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A0H(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!A02(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // X.AbstractC09340cj
    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            A0H(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // X.AbstractC09340cj
    public boolean A0J(Object obj) {
        return obj instanceof Transition;
    }
}
