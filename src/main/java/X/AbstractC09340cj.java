package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.FragmentTransitionSupport;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0cj  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC09340cj {
    public static void A00(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public static void A01(List list, View view) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == view) {
                return;
            }
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            list.add(childAt);
                            break;
                        }
                        if (list.get(i4) == childAt) {
                            break;
                        }
                        i4++;
                    }
                }
            }
        }
    }

    public void A02(ArrayList arrayList, View view) {
        Boolean bool;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT < 21 ? ((bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group)) == null || !bool.booleanValue()) && viewGroup.getBackground() == null && AnonymousClass0Q7.A0G(viewGroup) == null : !viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A02(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        arrayList.add(view);
    }

    public void A03(Map map, View view) {
        if (view.getVisibility() == 0) {
            String A0G = AnonymousClass0Q7.A0G(view);
            if (A0G != null) {
                map.put(A0G, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    A03(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public Object A04(Object obj) {
        if (obj != null) {
            return ((AbstractC09350ck) obj).clone();
        }
        return null;
    }

    public Object A05(Object obj) {
        if (obj == null) {
            return null;
        }
        C09360cl r0 = new C09360cl();
        r0.A0V((AbstractC09350ck) obj);
        return r0;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        C09360cl r0 = new C09360cl();
        if (obj != null) {
            r0.A0V((AbstractC09350ck) obj);
        }
        if (obj2 != null) {
            r0.A0V((AbstractC09350ck) obj2);
        }
        if (obj3 != null) {
            r0.A0V((AbstractC09350ck) obj3);
        }
        return r0;
    }

    public void A07(ViewGroup viewGroup, Object obj) {
        C09370cm.A01(viewGroup, (AbstractC09350ck) obj);
    }

    public void A08(AnonymousClass037 r1, Object obj, C04080Iy r3, Runnable runnable) {
        runnable.run();
    }

    public void A09(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC09350ck) obj).A0M(new C09380cn(rect));
        }
    }

    public void A0A(Object obj, View view) {
        if (obj != null) {
            ((AbstractC09350ck) obj).A05(view);
        }
    }

    public void A0B(Object obj, View view) {
        if (obj != null) {
            ((AbstractC09350ck) obj).A06(view);
        }
    }

    public void A0C(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            A00(view, rect);
            ((AbstractC09350ck) obj).A0M(new C09400cp(rect));
        }
    }

    public void A0D(Object obj, View view, ArrayList arrayList) {
        ((AbstractC09350ck) obj).A07(new C09410cq(view, arrayList));
    }

    public void A0E(Object obj, View view, ArrayList arrayList) {
        AbstractC09350ck r5 = (AbstractC09350ck) obj;
        ArrayList arrayList2 = r5.A0H;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            A01(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0G(r5, arrayList);
    }

    public void A0F(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC09350ck) obj).A07(new C09430cs((FragmentTransitionSupport) this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r1 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r1 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        if (r1 != false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(java.lang.Object r5, java.util.ArrayList r6) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09340cj.A0G(java.lang.Object, java.util.ArrayList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r1 != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if (r1 != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(java.lang.Object r5, java.util.ArrayList r6, java.util.ArrayList r7) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC09340cj.A0H(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC09350ck r2 = (AbstractC09350ck) obj;
        if (r2 != null) {
            r2.A0H.clear();
            r2.A0H.addAll(arrayList2);
            A0H(r2, arrayList, arrayList2);
        }
    }

    public boolean A0J(Object obj) {
        return obj instanceof AbstractC09350ck;
    }
}
