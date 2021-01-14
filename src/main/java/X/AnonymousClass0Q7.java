package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0Q7  reason: invalid class name */
public class AnonymousClass0Q7 {
    public static ThreadLocal A00;
    public static Field A01;
    public static Method A02;
    public static Method A03;
    public static WeakHashMap A04;
    public static WeakHashMap A05;
    public static boolean A06;
    public static boolean A07;
    public static final AtomicInteger A08 = new AtomicInteger(1);

    static {
        new WeakHashMap();
    }

    public static float A00(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static float A01(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static int A02() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = A08;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static int A03(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    public static int A04(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int A05(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int A06(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    public static int A07(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    public static ColorStateList A08(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC05570Pf) {
            return ((AbstractC05570Pf) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static Rect A09() {
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static Rect A0A(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static Display A0B(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (A0i(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static View.AccessibilityDelegate A0C(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (!A06) {
            if (A01 == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    A01 = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    A06 = true;
                    return null;
                }
            }
            try {
                Object obj = A01.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
            } catch (Throwable unused2) {
                A06 = true;
            }
        }
        return null;
    }

    public static View A0D(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static C06330Su A0E(View view) {
        WeakHashMap weakHashMap = A05;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A05 = weakHashMap;
        }
        C06330Su r1 = (C06330Su) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        C06330Su r12 = new C06330Su(view);
        A05.put(view, r12);
        return r12;
    }

    public static C06730Um A0F(View view, C06730Um r4) {
        if (Build.VERSION.SDK_INT < 21) {
            return r4;
        }
        WindowInsets windowInsets = (WindowInsets) r4.A00;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C06730Um.A00(windowInsets);
    }

    public static String A0G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    public static void A0H() {
        try {
            A03 = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A02 = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        A07 = true;
    }

    public static void A0I(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchFinishTemporaryDetach();
            return;
        }
        if (!A07) {
            A0H();
        }
        Method method = A02;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void A0J(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.dispatchStartTemporaryDetach();
            return;
        }
        if (!A07) {
            A0H();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0K(android.view.View r2) {
        /*
            android.view.View$AccessibilityDelegate r1 = A0C(r2)
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1 instanceof X.C06740Un
            if (r0 == 0) goto L_0x0019
            X.0Un r1 = (X.C06740Un) r1
            X.0Q0 r0 = r1.A00
            if (r0 != 0) goto L_0x0015
        L_0x0010:
            X.0Q0 r0 = new X.0Q0
            r0.<init>()
        L_0x0015:
            A0d(r2, r0)
            return
        L_0x0019:
            X.0Q0 r0 = new X.0Q0
            r0.<init>(r1)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q7.A0K(android.view.View):void");
    }

    public static void A0L(View view) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = false;
            if (new C06750Uo().A00(view) != null) {
                z = true;
            }
            if ((Build.VERSION.SDK_INT >= 19 && view.getAccessibilityLiveRegion() != 0) || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                int i = 2048;
                if (z) {
                    i = 32;
                }
                obtain.setEventType(i);
                obtain.setContentChangeTypes(0);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, 0);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    public static void A0M(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
        } else {
            view.requestFitSystemWindows();
        }
    }

    public static void A0N(View view) {
        boolean booleanValue;
        boolean booleanValue2;
        C06770Uq r3 = new C06770Uq();
        Boolean bool = true;
        int i = Build.VERSION.SDK_INT;
        if (i >= r3.A00) {
            r3.A02(view, bool);
        } else if (i >= 19) {
            Boolean bool2 = (Boolean) r3.A00(view);
            if (bool2 == null) {
                booleanValue = false;
            } else {
                booleanValue = bool2.booleanValue();
            }
            if (bool == null) {
                booleanValue2 = false;
            } else {
                booleanValue2 = bool.booleanValue();
            }
            if (booleanValue != booleanValue2) {
                A0K(view);
                view.setTag(r3.A01, bool);
                A0L(view);
            }
        }
    }

    public static void A0O(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    public static void A0P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof AbstractC06780Ur) {
            ((AbstractC06780Ur) view).stopNestedScroll();
        }
    }

    public static void A0Q(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    public static void A0R(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                float translationY2 = view2.getTranslationY();
                view2.setTranslationY(1.0f + translationY2);
                view2.setTranslationY(translationY2);
            }
        }
    }

    public static void A0S(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                float translationY2 = view2.getTranslationY();
                view2.setTranslationY(1.0f + translationY2);
                view2.setTranslationY(translationY2);
            }
        }
    }

    public static void A0T(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect A09 = A09();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A09.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !A09.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            A0R(view, i);
            if (z && A09.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(A09);
            }
        } else {
            A0R(view, i);
        }
    }

    public static void A0U(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect A09 = A09();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A09.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !A09.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            A0S(view, i);
            if (z && A09.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(A09);
            }
        } else {
            A0S(view, i);
        }
    }

    public static void A0V(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    public static void A0W(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setImportantForAccessibility(i);
            return;
        }
        if (i == 4) {
            i = 2;
        }
        view.setImportantForAccessibility(i);
    }

    public static void A0X(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    public static void A0Y(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    public static void A0Z(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3.getBackgroundTintMode() != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0a(android.view.View r3, android.content.res.ColorStateList r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0032
            r3.setBackgroundTintList(r4)
            if (r1 != r0) goto L_0x0031
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = r3.getBackgroundTintList()
            if (r0 != 0) goto L_0x001c
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r2 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002e:
            r3.setBackground(r2)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r3 instanceof X.AbstractC05570Pf
            if (r0 == 0) goto L_0x0031
            X.0Pf r3 = (X.AbstractC05570Pf) r3
            r3.setSupportBackgroundTintList(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q7.A0a(android.view.View, android.content.res.ColorStateList):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r3.getBackgroundTintMode() != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0b(android.view.View r3, android.graphics.PorterDuff.Mode r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0032
            r3.setBackgroundTintMode(r4)
            if (r1 != r0) goto L_0x0031
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = r3.getBackgroundTintList()
            if (r0 != 0) goto L_0x001c
            android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
            r0 = 0
            if (r1 == 0) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r2 == 0) goto L_0x0031
            if (r0 == 0) goto L_0x0031
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002e
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002e:
            r3.setBackground(r2)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r3 instanceof X.AbstractC05570Pf
            if (r0 == 0) goto L_0x0031
            X.0Pf r3 = (X.AbstractC05570Pf) r3
            r3.setSupportBackgroundTintMode(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q7.A0b(android.view.View, android.graphics.PorterDuff$Mode):void");
    }

    public static void A0c(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void A0d(View view, AnonymousClass0Q0 r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null) {
            if (A0C(view) instanceof C06740Un) {
                r2 = new AnonymousClass0Q0();
            } else {
                accessibilityDelegate = null;
                view.setAccessibilityDelegate(accessibilityDelegate);
            }
        }
        accessibilityDelegate = r2.A00;
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0e(View view, AnonymousClass0TF r3) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (r3 == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC14950n9(r3));
        }
    }

    public static void A0f(View view, C06790Us r11, CharSequence charSequence, AbstractC06800Ut r13) {
        C06790Us r4 = new C06790Us(null, r11.A00, charSequence, r13, r11.A02);
        if (Build.VERSION.SDK_INT >= 21) {
            A0K(view);
            int A002 = r4.A00();
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
            if (arrayList == null) {
                arrayList = new ArrayList();
                view.setTag(R.id.tag_accessibility_actions, arrayList);
            }
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((C06790Us) arrayList.get(i)).A00() == A002) {
                    arrayList.remove(i);
                    break;
                } else {
                    i++;
                }
            }
            ArrayList arrayList2 = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                view.setTag(R.id.tag_accessibility_actions, arrayList2);
            }
            arrayList2.add(r4);
            A0L(view);
        }
    }

    public static void A0g(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        WeakHashMap weakHashMap = A04;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A04 = weakHashMap;
        }
        weakHashMap.put(view, str);
    }

    public static void A0h(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof AbstractC06780Ur) {
            ((AbstractC06780Ur) view).setNestedScrollingEnabled(z);
        }
    }

    public static boolean A0i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean A0j(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean A0k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractC06780Ur) {
            return ((AbstractC06780Ur) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean A0l(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean A0m(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C06810Uu r6 = (C06810Uu) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (r6 == null) {
            r6 = new C06810Uu();
            view.setTag(R.id.tag_unhandled_key_event_manager, r6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r6.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = C06810Uu.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (r6.A02 == null) {
                        r6.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            r6.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                r6.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = r6.A00(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (A002 == null) {
                return false;
            }
            if (!KeyEvent.isModifierKey(keyCode)) {
                SparseArray sparseArray = r6.A00;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    r6.A00 = sparseArray;
                }
                sparseArray.put(keyCode, new WeakReference(A002));
            }
        } else if (A002 != null) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r0 != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r1 = (android.view.View) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (A0i(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        r1 = (java.util.AbstractList) r1.getTag(com.google.android.search.verification.client.R.id.tag_unhandled_key_listeners);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        r0 = r1.size() - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r0 < 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r1.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0n(android.view.View r5, android.view.KeyEvent r6) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Q7.A0n(android.view.View, android.view.KeyEvent):boolean");
    }
}
