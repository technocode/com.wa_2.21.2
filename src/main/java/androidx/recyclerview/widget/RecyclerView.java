package androidx.recyclerview.widget;

import X.AbstractC009505y;
import X.AbstractC07820Zr;
import X.AbstractC11900hC;
import X.AbstractC11910hD;
import X.AbstractC15200nf;
import X.AbstractC15930oy;
import X.AbstractC16160pM;
import X.AbstractC16300pa;
import X.AbstractC16330pd;
import X.AbstractC16350pf;
import X.AbstractC16370ph;
import X.AbstractC16380pi;
import X.AbstractC16420pm;
import X.AbstractC16430pn;
import X.AbstractC16440po;
import X.AbstractC16450pp;
import X.AbstractC16490pt;
import X.AbstractC16520pw;
import X.AbstractC16530px;
import X.AbstractC16660qA;
import X.AbstractC54572f8;
import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import X.AnonymousClass008;
import X.AnonymousClass05V;
import X.AnonymousClass05n;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0VR;
import X.AnonymousClass0VT;
import X.AnonymousClass240;
import X.AnonymousClass276;
import X.AnonymousClass3O0;
import X.AnonymousClass3QO;
import X.AnonymousClass3UP;
import X.AnonymousClass3UT;
import X.AnonymousClass3ZP;
import X.C002601j;
import X.C009205v;
import X.C07800Zo;
import X.C14910n5;
import X.C14960nA;
import X.C15890ou;
import X.C15910ow;
import X.C15920ox;
import X.C15940oz;
import X.C16190pP;
import X.C16340pe;
import X.C16360pg;
import X.C16410pl;
import X.C16460pq;
import X.C16470pr;
import X.C16480ps;
import X.C16650q9;
import X.C16670qB;
import X.C30391bH;
import X.C30421bK;
import X.C30441bM;
import X.C30451bN;
import X.C30471bP;
import X.C30501bS;
import X.C30511bT;
import X.C30521bU;
import X.C30551bX;
import X.C30561bY;
import X.C30571bZ;
import X.C30581ba;
import X.C30611bd;
import X.C30621be;
import X.C30671bj;
import X.C33661h9;
import X.C37651oZ;
import X.C37781om;
import X.C54492f0;
import X.C56022hw;
import X.C59552nt;
import X.RunnableC16120pI;
import X.RunnableC16540py;
import X.animation.InterpolatorC16290pZ;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import com.whatsapp.search.IteratingPlayer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends ViewGroup implements AbstractC07820Zr {
    public static final Interpolator A1C = new animation.InterpolatorC16290pZ();
    public static final boolean A1D;
    public static final boolean A1E;
    public static final boolean A1F;
    public static final int[] A1G = {16842987};
    public static final int[] A1H = {16843830};
    public static final Class[] A1I;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public VelocityTracker A0D;
    public EdgeEffect A0E;
    public EdgeEffect A0F;
    public EdgeEffect A0G;
    public EdgeEffect A0H;
    public C14910n5 A0I;
    public C30391bH A0J;
    public C15940oz A0K;
    public C30451bN A0L;
    public RunnableC16120pI A0M;
    public AbstractC16300pa A0N;
    public AbstractC16330pd A0O;
    public C16340pe A0P;
    public AbstractC16350pf A0Q;
    public AbstractC16370ph A0R;
    public AnonymousClass0VT A0S;
    public AbstractC16430pn A0T;
    public AbstractC16440po A0U;
    public AbstractC16450pp A0V;
    public AbstractC16490pt A0W;
    public C30621be A0X;
    public C07800Zo A0Y;
    public Runnable A0Z;
    public List A0a;
    public List A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public final int A0r;
    public final int A0s;
    public final Rect A0t;
    public final Rect A0u;
    public final RectF A0v;
    public final AccessibilityManager A0w;
    public final C16480ps A0x;
    public final C30611bd A0y;
    public final AnonymousClass0VR A0z;
    public final RunnableC16540py A10;
    public final AbstractC16660qA A11;
    public final C16670qB A12;
    public final Runnable A13;
    public final ArrayList A14;
    public final ArrayList A15;
    public final List A16;
    public final int[] A17;
    public final int[] A18;
    public final int[] A19;
    public final int[] A1A;
    public final int[] A1B;

    public void setViewCacheExtension(AbstractC16530px r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r2 == 20) goto L_0x0023;
     */
    static {
        /*
            r3 = 1
            int[] r1 = new int[r3]
            r0 = 16843830(0x1010436, float:2.369658E-38)
            r4 = 0
            r1[r4] = r0
            androidx.recyclerview.widget.RecyclerView.A1H = r1
            int[] r1 = new int[r3]
            r0 = 16842987(0x10100eb, float:2.3694217E-38)
            r1[r4] = r0
            androidx.recyclerview.widget.RecyclerView.A1G = r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r2 == r0) goto L_0x0023
            r0 = 19
            if (r2 == r0) goto L_0x0023
            r1 = 20
            r0 = 0
            if (r2 != r1) goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            androidx.recyclerview.widget.RecyclerView.A1F = r0
            r1 = 23
            r0 = 0
            if (r2 < r1) goto L_0x002c
            r0 = 1
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView.A1D = r0
            r1 = 21
            r0 = 0
            if (r2 < r1) goto L_0x0034
            r0 = 1
        L_0x0034:
            androidx.recyclerview.widget.RecyclerView.A1E = r0
            r0 = 4
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2[r4] = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            r2[r3] = r0
            r0 = 2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2[r0] = r1
            r0 = 3
            r2[r0] = r1
            androidx.recyclerview.widget.RecyclerView.A1I = r2
            X.0pZ r0 = new X.0pZ
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.A1C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C30451bN r0;
        float A002;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        Object[] objArr;
        this.A0y = new C30611bd(this);
        this.A0x = new C16480ps(this);
        this.A12 = new C16670qB();
        this.A13 = new RunnableEBaseShape0S0100000_I0_0(this, 20);
        this.A0t = new Rect();
        this.A0u = new Rect();
        this.A0v = new RectF();
        this.A14 = new ArrayList();
        this.A15 = new ArrayList();
        this.A06 = 0;
        this.A0e = false;
        this.A0f = false;
        this.A09 = 0;
        this.A02 = 0;
        this.A0P = new C16340pe();
        this.A0R = new AnonymousClass240();
        this.A0B = 0;
        this.A0A = -1;
        this.A00 = Float.MIN_VALUE;
        this.A01 = Float.MIN_VALUE;
        boolean z = true;
        this.A0q = true;
        this.A10 = new RunnableC16540py(this);
        if (A1E) {
            r0 = new C30451bN();
        } else {
            r0 = null;
        }
        this.A0L = r0;
        this.A0z = new AnonymousClass0VR();
        this.A0l = false;
        this.A0m = false;
        this.A0Q = new C30581ba(this);
        this.A0p = false;
        this.A17 = new int[2];
        this.A1A = new int[2];
        this.A19 = new int[2];
        this.A18 = new int[2];
        this.A1B = new int[2];
        this.A16 = new ArrayList();
        this.A0Z = new RunnableEBaseShape0S0100000_I0_0(this, 21);
        this.A11 = new C30551bX(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A1G, i, 0);
            this.A0d = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.A0d = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0C = viewConfiguration.getScaledTouchSlop();
        this.A00 = C14960nA.A01(viewConfiguration, context);
        if (Build.VERSION.SDK_INT >= 26) {
            A002 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            A002 = C14960nA.A00(viewConfiguration, context);
        }
        this.A01 = A002;
        this.A0s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A0r = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.A0R.A04 = this.A0Q;
        this.A0J = new C30391bH(new C30571bZ(this));
        this.A0K = new C15940oz(new C30561bY(this));
        if (AnonymousClass0Q7.A04(this) == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (getImportantForAccessibility() == 0) {
            AnonymousClass0Q7.A0W(this, 1);
        }
        this.A0w = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C07800Zo(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C15890ou.A07, i, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z2 = obtainStyledAttributes2.getBoolean(2, false);
            this.A0g = z2;
            if (z2) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException(AnonymousClass008.A0D(this, AnonymousClass008.A0S("Trying to set fast scroller without both required drawables.")));
                }
                Resources resources = getContext().getResources();
                new C30441bM(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(trim);
                        trim = sb.toString();
                    } else if (!trim.contains(".")) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(RecyclerView.class.getPackage().getName());
                        sb2.append('.');
                        sb2.append(trim);
                        trim = sb2.toString();
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(AnonymousClass0VT.class);
                        try {
                            constructor = asSubclass.getConstructor(A1I);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                        } catch (NoSuchMethodException e) {
                            try {
                                constructor = asSubclass.getConstructor(new Class[0]);
                                objArr = null;
                            } catch (NoSuchMethodException e2) {
                                e2.initCause(e);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(attributeSet.getPositionDescription());
                                sb3.append(": Error creating LayoutManager ");
                                sb3.append(trim);
                                throw new IllegalStateException(sb3.toString(), e2);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((AnonymousClass0VT) constructor.newInstance(objArr));
                    } catch (ClassNotFoundException e3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(attributeSet.getPositionDescription());
                        sb4.append(": Unable to find LayoutManager ");
                        sb4.append(trim);
                        throw new IllegalStateException(sb4.toString(), e3);
                    } catch (InvocationTargetException e4) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(attributeSet.getPositionDescription());
                        sb5.append(": Could not instantiate the LayoutManager: ");
                        sb5.append(trim);
                        throw new IllegalStateException(sb5.toString(), e4);
                    } catch (InstantiationException e5) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(attributeSet.getPositionDescription());
                        sb6.append(": Could not instantiate the LayoutManager: ");
                        sb6.append(trim);
                        throw new IllegalStateException(sb6.toString(), e5);
                    } catch (IllegalAccessException e6) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(attributeSet.getPositionDescription());
                        sb7.append(": Cannot access non-public constructor ");
                        sb7.append(trim);
                        throw new IllegalStateException(sb7.toString(), e6);
                    } catch (ClassCastException e7) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append(attributeSet.getPositionDescription());
                        sb8.append(": Class is not a LayoutManager ");
                        sb8.append(trim);
                        throw new IllegalStateException(sb8.toString(), e7);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, A1H, i, 0);
                z = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z);
    }

    public static int A00(View view) {
        AbstractC11910hD A012 = A01(view);
        if (A012 != null) {
            return A012.A00();
        }
        return -1;
    }

    public static AbstractC11910hD A01(View view) {
        if (view == null) {
            return null;
        }
        return ((C16410pl) view.getLayoutParams()).A00;
    }

    public static RecyclerView A02(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView A022 = A02(viewGroup.getChildAt(i));
            if (A022 != null) {
                return A022;
            }
        }
        return null;
    }

    public static void A03(View view, Rect rect) {
        C16410pl r6 = (C16410pl) view.getLayoutParams();
        Rect rect2 = r6.A03;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) r6).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) r6).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) r6).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) r6).bottomMargin);
    }

    public static void A04(AbstractC11910hD r3) {
        WeakReference weakReference = r3.A0D;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != r3.A0H) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            r3.A0D = null;
        }
    }

    public int A09(AbstractC11910hD r10) {
        int i = r10.A00;
        if ((524 & i) == 0 && (i & 1) != 0) {
            C30391bH r0 = this.A0J;
            int i2 = r10.A05;
            ArrayList arrayList = r0.A04;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C15910ow r8 = (C15910ow) arrayList.get(i3);
                int i4 = r8.A00;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = r8.A02;
                        if (i5 <= i2) {
                            int i6 = r8.A01;
                            i2 -= i6;
                            if (i5 + i6 > i2) {
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = r8.A02;
                        if (i7 == i2) {
                            i2 = r8.A01;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (r8.A01 <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (r8.A02 <= i2) {
                    i2 += r8.A01;
                }
            }
            return i2;
        }
        return -1;
    }

    public Rect A0A(View view) {
        C16410pl r8 = (C16410pl) view.getLayoutParams();
        if (!r8.A01) {
            return r8.A03;
        }
        AnonymousClass0VR r7 = this.A0z;
        if (r7.A09 && (r8.A00() || r8.A00.A08())) {
            return r8.A03;
        }
        Rect rect = r8.A03;
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.A0t;
            rect2.set(0, 0, 0, 0);
            ((AbstractC16380pi) arrayList.get(i)).A00(rect2, view, this, r7);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        r8.A01 = false;
        return rect;
    }

    public View A0B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public AbstractC11910hD A0C(int i) {
        AbstractC11910hD r1 = null;
        if (this.A0e) {
            return null;
        }
        int A012 = this.A0K.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            AbstractC11910hD A013 = A01(this.A0K.A04(i2));
            if (A013 != null && !A013.A09() && A09(A013) == i) {
                C15940oz r0 = this.A0K;
                if (!r0.A02.contains(A013.A0H)) {
                    return A013;
                }
                r1 = A013;
            }
        }
        return r1;
    }

    public AbstractC11910hD A0D(int i, boolean z) {
        int A012 = this.A0K.A01();
        AbstractC11910hD r1 = null;
        for (int i2 = 0; i2 < A012; i2++) {
            AbstractC11910hD A013 = A01(this.A0K.A04(i2));
            if (A013 != null && !A013.A09()) {
                if (z) {
                    if (A013.A05 != i) {
                        continue;
                    }
                } else if (A013.A01() != i) {
                    continue;
                }
                C15940oz r0 = this.A0K;
                if (!r0.A02.contains(A013.A0H)) {
                    return A013;
                }
                r1 = A013;
            }
        }
        return r1;
    }

    public AbstractC11910hD A0E(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return A01(view);
        }
        StringBuilder sb = new StringBuilder("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public String A0F() {
        StringBuilder A0S2 = AnonymousClass008.A0S(" ");
        A0S2.append(super.toString());
        A0S2.append(", adapter:");
        A0S2.append(this.A0N);
        A0S2.append(", layout:");
        A0S2.append(this.A0S);
        A0S2.append(", context:");
        A0S2.append(getContext());
        return A0S2.toString();
    }

    public void A0G() {
        int A012 = this.A0K.A01();
        for (int i = 0; i < A012; i++) {
            AbstractC11910hD A013 = A01(this.A0K.A04(i));
            if (!A013.A0B()) {
                A013.A03 = -1;
                A013.A06 = -1;
            }
        }
        C16480ps r6 = this.A0x;
        ArrayList arrayList = r6.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC11910hD r1 = (AbstractC11910hD) arrayList.get(i2);
            r1.A03 = -1;
            r1.A06 = -1;
        }
        ArrayList arrayList2 = r6.A04;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC11910hD r12 = (AbstractC11910hD) arrayList2.get(i3);
            r12.A03 = -1;
            r12.A06 = -1;
        }
        ArrayList arrayList3 = r6.A03;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC11910hD r13 = (AbstractC11910hD) arrayList3.get(i4);
                r13.A03 = -1;
                r13.A06 = -1;
            }
        }
    }

    public void A0H() {
        if (!this.A0h || this.A0e) {
            C002601j.A01("RV FullInvalidate");
            A0I();
            C002601j.A00();
            return;
        }
        C30391bH r2 = this.A0J;
        boolean z = false;
        if (r2.A04.size() > 0) {
            z = true;
        }
        if (z) {
            int i = r2.A00;
            if ((i & 4) == 0 || (i & 11) != 0) {
                boolean z2 = false;
                if (r2.A04.size() > 0) {
                    z2 = true;
                }
                if (z2) {
                    C002601j.A01("RV FullInvalidate");
                    A0I();
                    C002601j.A00();
                    return;
                }
                return;
            }
            C002601j.A01("RV PartialInvalidate");
            A0Q();
            this.A09++;
            this.A0J.A05();
            if (!this.A0o) {
                int A002 = this.A0K.A00();
                int i2 = 0;
                while (true) {
                    if (i2 < A002) {
                        AbstractC11910hD A012 = A01(this.A0K.A03(i2));
                        if (A012 != null && !A012.A0B() && (A012.A00 & 2) != 0) {
                            A0I();
                            break;
                        }
                        i2++;
                    } else {
                        this.A0J.A03();
                        break;
                    }
                }
            }
            A0u(true);
            A0s(true);
            C002601j.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:162:0x035b, code lost:
        if (r22.A0K.A02.contains(getFocusedChild()) == false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x039e, code lost:
        if (r7 != null) goto L_0x03a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03b0, code lost:
        if (r7.hasFocusable() != false) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03d9, code lost:
        if (r7 != null) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03db, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e2, code lost:
        if (((long) r3) == -1) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03e4, code lost:
        r1 = r7.findViewById(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x03e8, code lost:
        if (r1 == null) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03ee, code lost:
        if (r1.isFocusable() == false) goto L_0x03f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x03f0, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03f1, code lost:
        r7.requestFocus();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I() {
        /*
        // Method dump skipped, instructions count: 1077
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0I():void");
    }

    public void A0J() {
        if (this.A0E == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0E = edgeEffect;
            if (this.A0d) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void A0K() {
        if (this.A0F == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0F = edgeEffect;
            if (this.A0d) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void A0L() {
        if (this.A0G == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0G = edgeEffect;
            if (this.A0d) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void A0M() {
        if (this.A0H == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A0H = edgeEffect;
            if (this.A0d) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void A0N() {
        int A012 = this.A0K.A01();
        for (int i = 0; i < A012; i++) {
            ((C16410pl) this.A0K.A04(i).getLayoutParams()).A01 = true;
        }
        ArrayList arrayList = this.A0x.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C16410pl r0 = (C16410pl) ((AbstractC11910hD) arrayList.get(i2)).A0H.getLayoutParams();
            if (r0 != null) {
                r0.A01 = true;
            }
        }
    }

    public void A0O() {
        if (!this.A0p && this.A0k) {
            postOnAnimation(this.A0Z);
            this.A0p = true;
        }
    }

    public void A0P() {
        AbstractC16370ph r0 = this.A0R;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass0VT r02 = this.A0S;
        if (r02 != null) {
            C16480ps r1 = this.A0x;
            r02.A0X(r1);
            this.A0S.A0Y(r1);
        }
        C16480ps r12 = this.A0x;
        r12.A04.clear();
        r12.A02();
    }

    public void A0Q() {
        int i = this.A06 + 1;
        this.A06 = i;
        if (i == 1 && !this.A0n) {
            this.A0o = false;
        }
    }

    public void A0R() {
        AbstractC16520pw r0;
        setScrollState(0);
        RunnableC16540py r1 = this.A10;
        r1.A06.removeCallbacks(r1);
        r1.A03.abortAnimation();
        AnonymousClass0VT r02 = this.A0S;
        if (r02 != null && (r0 = r02.A06) != null) {
            r0.A01();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r12.A0m == false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S() {
        /*
        // Method dump skipped, instructions count: 469
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0S():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (r5.A0R == null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0T() {
        /*
            r5 = this;
            r5.A0Q()
            int r0 = r5.A09
            int r0 = r0 + 1
            r5.A09 = r0
            X.0VR r4 = r5.A0z
            r0 = 6
            r4.A01(r0)
            X.1bH r0 = r5.A0J
            r0.A04()
            X.0pa r0 = r5.A0N
            int r0 = r0.A05()
            r4.A03 = r0
            r3 = 0
            r4.A00 = r3
            r4.A09 = r3
            X.0VT r1 = r5.A0S
            X.0ps r0 = r5.A0x
            r1.A0p(r0, r4)
            r4.A0D = r3
            r0 = 0
            r5.A0X = r0
            boolean r0 = r4.A0C
            r2 = 1
            if (r0 == 0) goto L_0x0037
            X.0ph r1 = r5.A0R
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r4.A0C = r0
            r0 = 4
            r4.A04 = r0
            r5.A0s(r2)
            r5.A0u(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0T():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r5.A0m != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U() {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0U():void");
    }

    public final void A0V() {
        VelocityTracker velocityTracker = this.A0D;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        AQF(0);
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A0F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0H;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0G;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0W(int i) {
        AnonymousClass0VT r0 = this.A0S;
        if (r0 != null) {
            r0.A0M(i);
            awakenScrollBars();
        }
    }

    public void A0X(int i) {
        if (!this.A0n) {
            A0R();
            AnonymousClass0VT r0 = this.A0S;
            if (r0 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            r0.A0M(i);
            awakenScrollBars();
        }
    }

    public void A0Y(int i) {
        if (!this.A0n) {
            AnonymousClass0VT r2 = this.A0S;
            if (r2 == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else if (r2 instanceof StaggeredGridLayoutManager) {
                C30521bU r0 = new C30521bU(getContext());
                ((AbstractC16520pw) r0).A00 = i;
                r2.A0Z(r0);
            } else if (!(r2 instanceof LinearLayoutManager)) {
                Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
            } else {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r2;
                if (!(linearLayoutManager instanceof SmoothScrollLinearLayoutManager)) {
                    C30521bU r02 = new C30521bU(getContext());
                    ((AbstractC16520pw) r02).A00 = i;
                    linearLayoutManager.A0Z(r02);
                    return;
                }
                C59552nt r03 = new C59552nt(getContext());
                ((AbstractC16520pw) r03).A00 = i;
                linearLayoutManager.A0Z(r03);
            }
        }
    }

    public void A0Z(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A0F;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.A0F.onRelease();
            z = this.A0F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.A0G;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A0G.onRelease();
            z |= this.A0G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A0H;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A0H.onRelease();
            z |= this.A0H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A0E;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A0E.onRelease();
            z |= this.A0E.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public void A0a(int i, int i2) {
        setMeasuredDimension(AnonymousClass0VT.A00(i, getPaddingRight() + getPaddingLeft(), getMinimumWidth()), AnonymousClass0VT.A00(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void A0b(int i, int i2) {
        this.A02++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        AbstractC16450pp r0 = this.A0V;
        if (r0 != null) {
            r0.A01(this, i, i2);
        }
        List list = this.A0b;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC16450pp) this.A0b.get(size)).A01(this, i, i2);
            }
        }
        this.A02--;
    }

    public void A0c(int i, int i2) {
        AnonymousClass0VT r1 = this.A0S;
        if (r1 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0n) {
            if (!r1.A0d()) {
                i = 0;
            }
            if (!r1.A0e()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                RunnableC16540py r2 = this.A10;
                r2.A02(i, i2, r2.A00(i, i2), A1C);
            }
        }
    }

    public void A0d(int i, int i2, boolean z) {
        int i3 = i + i2;
        int A012 = this.A0K.A01();
        for (int i4 = 0; i4 < A012; i4++) {
            AbstractC11910hD A013 = A01(this.A0K.A04(i4));
            if (A013 != null && !A013.A0B()) {
                int i5 = A013.A05;
                if (i5 >= i3) {
                    A013.A06(-i2, z);
                    this.A0z.A0D = true;
                } else if (i5 >= i) {
                    A013.A04(8);
                    A013.A06(-i2, z);
                    A013.A05 = i - 1;
                    this.A0z.A0D = true;
                }
            }
        }
        C16480ps r4 = this.A0x;
        ArrayList arrayList = r4.A05;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC11910hD r1 = (AbstractC11910hD) arrayList.get(size);
                if (r1 != null) {
                    int i6 = r1.A05;
                    if (i6 >= i3) {
                        r1.A06(-i2, z);
                    } else if (i6 >= i) {
                        r1.A04(8);
                        r4.A04(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void A0e(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        AbstractC11910hD r0;
        A0Q();
        this.A09++;
        C002601j.A01("RV Scroll");
        AnonymousClass0VR r2 = this.A0z;
        A0n(r2);
        if (i != 0) {
            AnonymousClass0VT r5 = this.A0S;
            C16480ps r4 = this.A0x;
            if (r5 instanceof StaggeredGridLayoutManager) {
                i3 = ((StaggeredGridLayoutManager) r5).A0v(i, r4, r2);
            } else if (!(r5 instanceof LinearLayoutManager)) {
                i3 = 0;
            } else {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r5;
                if (linearLayoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager;
                    gridLayoutManager.A1M();
                    gridLayoutManager.A1L();
                    if (((LinearLayoutManager) gridLayoutManager).A01 == 1) {
                        i3 = 0;
                    } else {
                        i3 = gridLayoutManager.A0w(i, r4, r2);
                    }
                } else if (linearLayoutManager.A01 == 1) {
                    i3 = 0;
                } else {
                    i3 = linearLayoutManager.A0w(i, r4, r2);
                }
            }
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            AnonymousClass0VT r52 = this.A0S;
            C16480ps r42 = this.A0x;
            if (r52 instanceof StaggeredGridLayoutManager) {
                i4 = ((StaggeredGridLayoutManager) r52).A0v(i2, r42, r2);
            } else if (!(r52 instanceof LinearLayoutManager)) {
                i4 = 0;
            } else {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) r52;
                if (linearLayoutManager2 instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager2 = (GridLayoutManager) linearLayoutManager2;
                    gridLayoutManager2.A1M();
                    gridLayoutManager2.A1L();
                    if (((LinearLayoutManager) gridLayoutManager2).A01 == 0) {
                        i4 = 0;
                    } else {
                        i4 = gridLayoutManager2.A0w(i2, r42, r2);
                    }
                } else if (linearLayoutManager2.A01 == 0) {
                    i4 = 0;
                } else {
                    i4 = linearLayoutManager2.A0w(i2, r42, r2);
                }
            }
        } else {
            i4 = 0;
        }
        C002601j.A00();
        int A002 = this.A0K.A00();
        for (int i5 = 0; i5 < A002; i5++) {
            View A032 = this.A0K.A03(i5);
            AbstractC11910hD A0E2 = A0E(A032);
            if (!(A0E2 == null || (r0 = A0E2.A0B) == null)) {
                View view = r0.A0H;
                int left = A032.getLeft();
                int top = A032.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A0s(true);
        A0u(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void A0f(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0A) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0A = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A07 = x;
            this.A04 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A08 = y;
            this.A05 = y;
        }
    }

    public void A0g(View view) {
        AbstractC009505y r2;
        AbstractC11910hD A012 = A01(view);
        AbstractC16300pa r3 = this.A0N;
        if (!(r3 == null || A012 == null)) {
            if (r3 instanceof AbstractC54572f8) {
                AbstractC11900hC r1 = (AbstractC11900hC) A012;
                r1.A0D();
                ((AbstractC54572f8) r3).A00.remove(r1);
            } else if (r3 instanceof C54492f0) {
                ((AbstractC11900hC) A012).A0D();
            } else if (r3 instanceof AnonymousClass276) {
                AnonymousClass276 r32 = (AnonymousClass276) r3;
                AnonymousClass05n r12 = ((C37781om) ((C33661h9) A012).A00).A02.A01;
                if (!(r12 == null || !(r12 instanceof C37651oZ) || (r2 = ((C37651oZ) r12).A03) == null)) {
                    C009205v.A00();
                    Handler handler = r32.A05;
                    handler.sendMessage(handler.obtainMessage(0, r2));
                }
            }
        }
        List list = this.A0a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC16420pm) this.A0a.get(size)).AE5(view);
            }
        }
    }

    public final void A0h(View view, View view2) {
        View view3 = view;
        if (view2 != null) {
            view3 = view2;
        }
        Rect rect = this.A0t;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C16410pl) {
            C16410pl r1 = (C16410pl) layoutParams;
            if (!r1.A01) {
                Rect rect2 = r1.A03;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        AnonymousClass0VT r2 = this.A0S;
        boolean z = !this.A0h;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        r2.A0i(this, view, rect, z, z2);
    }

    public final void A0i(AbstractC16300pa r6, boolean z, boolean z2) {
        AnimatorSet animatorSet;
        AbstractC16300pa r0 = this.A0N;
        if (r0 != null) {
            r0.A01.unregisterObserver(this.A0y);
            AbstractC16300pa r2 = this.A0N;
            if (r2 instanceof AnonymousClass3UT) {
                AnonymousClass3UT r22 = (AnonymousClass3UT) r2;
                ((AbstractC16300pa) r22).A01.unregisterObserver(r22.A01);
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (childAt != null) {
                        AbstractC11910hD A0E2 = A0E(childAt);
                        if ((A0E2 instanceof AnonymousClass3UP) && (animatorSet = ((AnonymousClass3UP) A0E2).A00) != null) {
                            animatorSet.removeAllListeners();
                            animatorSet.cancel();
                        }
                    }
                }
            } else if (r2 instanceof AnonymousClass3QO) {
                AnonymousClass3QO r23 = (AnonymousClass3QO) r2;
                A0m(r23.A09);
                r23.A03 = null;
            } else if (r2 instanceof AbstractC54572f8) {
                AbstractC54572f8 r24 = (AbstractC54572f8) r2;
                if (!(r24 instanceof AnonymousClass3ZP)) {
                    A0m(r24.A02);
                } else {
                    AnonymousClass3ZP r25 = (AnonymousClass3ZP) r24;
                    A0m(((AbstractC54572f8) r25).A02);
                    IteratingPlayer iteratingPlayer = r25.A0a;
                    A0m(iteratingPlayer.A04);
                    iteratingPlayer.A01();
                    r25.A00 = null;
                }
            } else if (r2 instanceof AnonymousClass276) {
                ((AnonymousClass276) r2).A02 = null;
            }
        }
        if (!z || z2) {
            A0P();
        }
        C30391bH r1 = this.A0J;
        r1.A09(r1.A04);
        r1.A09(r1.A05);
        r1.A00 = 0;
        AbstractC16300pa r26 = this.A0N;
        this.A0N = r6;
        if (r6 != null) {
            r6.A01.registerObserver(this.A0y);
            if (r6 instanceof AnonymousClass3UT) {
                AnonymousClass3UT r62 = (AnonymousClass3UT) r6;
                ((AbstractC16300pa) r62).A01.registerObserver(r62.A01);
            } else if (r6 instanceof AnonymousClass3QO) {
                AnonymousClass3QO r63 = (AnonymousClass3QO) r6;
                r63.A03 = this;
                A0l(r63.A09);
            } else if (r6 instanceof AbstractC54572f8) {
                AbstractC54572f8 r64 = (AbstractC54572f8) r6;
                if (!(r64 instanceof AnonymousClass3ZP)) {
                    A0l(r64.A02);
                } else {
                    AnonymousClass3ZP r65 = (AnonymousClass3ZP) r64;
                    A0l(((AbstractC54572f8) r65).A02);
                    A0l(r65.A0a.A04);
                    r65.A00 = this;
                }
            } else if (r6 instanceof AnonymousClass276) {
                ((AnonymousClass276) r6).A02 = this;
            }
        }
        C16480ps r12 = this.A0x;
        AbstractC16300pa r4 = this.A0N;
        r12.A04.clear();
        r12.A02();
        C16470pr r3 = r12.A02;
        if (r3 == null) {
            r3 = new C16470pr();
            r12.A02 = r3;
        }
        if (r3 != null) {
            if (r26 != null) {
                r3.A00--;
            }
            if (!z && r3.A00 == 0) {
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray = r3.A01;
                    if (i2 >= sparseArray.size()) {
                        break;
                    }
                    ((C16460pq) sparseArray.valueAt(i2)).A03.clear();
                    i2++;
                }
            }
            if (r4 != null) {
                r3.A00++;
            }
            this.A0z.A0D = true;
            return;
        }
        throw null;
    }

    public void A0j(AbstractC16380pi r3) {
        AnonymousClass0VT r1 = this.A0S;
        if (r1 != null) {
            r1.A0c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A14;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(r3);
        A0N();
        requestLayout();
    }

    public void A0k(AbstractC16380pi r4) {
        AnonymousClass0VT r1 = this.A0S;
        if (r1 != null) {
            r1.A0c("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A14;
        arrayList.remove(r4);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0N();
        requestLayout();
    }

    public void A0l(AbstractC16450pp r2) {
        List list = this.A0b;
        if (list == null) {
            list = new ArrayList();
            this.A0b = list;
        }
        list.add(r2);
    }

    public void A0m(AbstractC16450pp r2) {
        List list = this.A0b;
        if (list != null) {
            list.remove(r2);
        }
    }

    public final void A0n(AnonymousClass0VR r4) {
        if (this.A0B == 2) {
            OverScroller overScroller = this.A10.A03;
            r4.A06 = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        r4.A06 = 0;
    }

    public final void A0o(AbstractC11910hD r8) {
        View view = r8.A0H;
        boolean z = false;
        if (view.getParent() == this) {
            z = true;
        }
        this.A0x.A09(A0E(view));
        if (r8.A0A()) {
            this.A0K.A08(view, -1, view.getLayoutParams(), true);
            return;
        }
        C15940oz r2 = this.A0K;
        if (!z) {
            r2.A09(view, -1, true);
            return;
        }
        int indexOfChild = ((C30561bY) r2.A01).A00.indexOfChild(view);
        if (indexOfChild >= 0) {
            r2.A00.A04(indexOfChild);
            r2.A06(view);
            return;
        }
        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0p(AbstractC11910hD r2, int i) {
        if (this.A09 > 0) {
            r2.A04 = i;
            this.A16.add(r2);
            return;
        }
        AnonymousClass0Q7.A0W(r2.A0H, i);
    }

    public void A0q(AbstractC11910hD r4, C16360pg r5) {
        long j;
        r4.A05(0, 8192);
        if (this.A0z.A0E && (r4.A00 & 2) != 0 && !r4.A09() && !r4.A0B()) {
            if (this.A0N.A00) {
                j = r4.A08;
            } else {
                j = (long) r4.A05;
            }
            this.A12.A01.A08(j, r4);
        }
        AnonymousClass05V r2 = this.A12.A00;
        C16650q9 r1 = (C16650q9) r2.getOrDefault(r4, null);
        if (r1 == null) {
            r1 = C16650q9.A00();
            r2.put(r4, r1);
        }
        r1.A02 = r5;
        r1.A00 |= 4;
    }

    public void A0r(String str) {
        if (this.A09 > 0) {
            if (str == null) {
                throw new IllegalStateException(AnonymousClass008.A0D(this, AnonymousClass008.A0S("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.A02 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AnonymousClass008.A0D(this, AnonymousClass008.A0S(""))));
        }
    }

    public void A0s(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A09 - 1;
        this.A09 = i2;
        if (i2 < 1) {
            this.A09 = 0;
            if (z) {
                int i3 = this.A03;
                this.A03 = 0;
                if (!(i3 == 0 || (accessibilityManager = this.A0w) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    if (Build.VERSION.SDK_INT >= 19) {
                        obtain.setContentChangeTypes(i3);
                    }
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A16;
                for (int size = list.size() - 1; size >= 0; size--) {
                    AbstractC11910hD r2 = (AbstractC11910hD) list.get(size);
                    if (r2.A0H.getParent() == this && !r2.A0B() && (i = r2.A04) != -1) {
                        AnonymousClass0Q7.A0W(r2.A0H, i);
                        r2.A04 = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public void A0t(boolean z) {
        this.A0f = z | this.A0f;
        this.A0e = true;
        int A012 = this.A0K.A01();
        for (int i = 0; i < A012; i++) {
            AbstractC11910hD A013 = A01(this.A0K.A04(i));
            if (A013 != null && !A013.A0B()) {
                A013.A04(6);
            }
        }
        A0N();
        C16480ps r4 = this.A0x;
        ArrayList arrayList = r4.A05;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC11910hD r1 = (AbstractC11910hD) arrayList.get(i2);
            if (r1 != null) {
                r1.A04(6);
                r1.A04(1024);
            }
        }
        AbstractC16300pa r0 = r4.A07.A0N;
        if (r0 == null || !r0.A00) {
            r4.A02();
        }
    }

    public void A0u(boolean z) {
        int i = this.A06;
        if (i < 1) {
            this.A06 = 1;
            i = 1;
        }
        if (!z && !this.A0n) {
            this.A0o = false;
        }
        if (i == 1) {
            if (z && this.A0o && !this.A0n && this.A0S != null && this.A0N != null) {
                A0I();
            }
            if (!this.A0n) {
                this.A0o = false;
            }
        }
        this.A06--;
    }

    public final void A0v(int[] iArr) {
        int A002 = this.A0K.A00();
        if (A002 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (int i3 = 0; i3 < A002; i3++) {
            AbstractC11910hD A012 = A01(this.A0K.A03(i3));
            if (!A012.A0B()) {
                int A013 = A012.A01();
                if (A013 < i) {
                    i = A013;
                }
                if (A013 > i2) {
                    i2 = A013;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean A0w() {
        return getScrollingChildHelper().A00(1) != null;
    }

    public boolean A0x(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().A03(i, i2, i3, i4, iArr, i5, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r4 == 0.0f) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0y(int r20, int r21, android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0y(int, int, android.view.MotionEvent):boolean");
    }

    public boolean A0z(int i, int i2, int[] iArr) {
        return getScrollingChildHelper().A04(i, i2, iArr, null, 1);
    }

    @Override // X.AbstractC07820Zr
    public void AQF(int i) {
        getScrollingChildHelper().A01(i);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (layoutParams instanceof C16410pl) {
            AnonymousClass0VT r1 = this.A0S;
            C16410pl r3 = (C16410pl) layoutParams;
            if (r1 instanceof StaggeredGridLayoutManager) {
                z = r3 instanceof C30671bj;
            } else if (!(r1 instanceof GridLayoutManager)) {
                z = false;
                if (r3 != null) {
                    z = true;
                }
            } else {
                z = r3 instanceof C30471bP;
            }
            return z;
        }
    }

    public int computeHorizontalScrollExtent() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0d()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0x(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A0y(r1);
    }

    public int computeHorizontalScrollOffset() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0d()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0y(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A0z(r1);
    }

    public int computeHorizontalScrollRange() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0d()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0z(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A10(r1);
    }

    public int computeVerticalScrollExtent() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0e()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0x(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A0y(r1);
    }

    public int computeVerticalScrollOffset() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0e()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0y(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A0z(r1);
    }

    public int computeVerticalScrollRange() {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null || !r2.A0e()) {
            return 0;
        }
        AnonymousClass0VR r1 = this.A0z;
        if (r2 instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) r2).A0z(r1);
        }
        if (!(r2 instanceof LinearLayoutManager)) {
            return 0;
        }
        return ((LinearLayoutManager) r2).A10(r1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParent;
        C14910n5 scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.A02 || (viewParent = scrollingChildHelper.A01) == null) {
            return false;
        }
        return AnonymousClass0N2.A1i(viewParent, scrollingChildHelper.A04, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        C14910n5 scrollingChildHelper = getScrollingChildHelper();
        if (!scrollingChildHelper.A02 || (viewParent = scrollingChildHelper.A01) == null) {
            return false;
        }
        return AnonymousClass0N2.A1h(viewParent, scrollingChildHelper.A04, f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A04(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A03(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x037c, code lost:
        if (r0.draw(r24) == false) goto L_0x037e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03aa, code lost:
        if (r1 == false) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e0, code lost:
        if (r1 == false) goto L_0x03e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r24) {
        /*
        // Method dump skipped, instructions count: 1111
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0156, code lost:
        if (r2 <= r1) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r14.findNextFocus(r19, r20, r0) == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (A0B(r20) != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        if (r14.findNextFocus(r19, r20, r0) == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
        A0Q();
        r19.A0S.A0l(r20, r21, r19.A0x, r19.A0z);
        A0u(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r4 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r19.A0n != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x012d, code lost:
        if (r18 > 0) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r20, int r21) {
        /*
        // Method dump skipped, instructions count: 381
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AnonymousClass0VT r0 = this.A0S;
        if (r0 != null) {
            return r0.A0J();
        }
        throw new IllegalStateException(AnonymousClass008.A0D(this, AnonymousClass008.A0S("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 != null) {
            Context context = getContext();
            if (r2 instanceof StaggeredGridLayoutManager) {
                return new C30671bj(context, attributeSet);
            }
            if (!(r2 instanceof GridLayoutManager)) {
                return new C16410pl(context, attributeSet);
            }
            return new C30471bP(context, attributeSet);
        }
        throw new IllegalStateException(AnonymousClass008.A0D(this, AnonymousClass008.A0S("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AnonymousClass0VT r1 = this.A0S;
        if (r1 == null) {
            throw new IllegalStateException(AnonymousClass008.A0D(this, AnonymousClass008.A0S("RecyclerView has no LayoutManager")));
        } else if (!(r1 instanceof StaggeredGridLayoutManager)) {
            if (!(r1 instanceof GridLayoutManager)) {
                if (layoutParams instanceof C16410pl) {
                    return new C16410pl((C16410pl) layoutParams);
                }
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    return new C16410pl((ViewGroup.MarginLayoutParams) layoutParams);
                }
                return new C16410pl(layoutParams);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new C30471bP((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                return new C30471bP(layoutParams);
            }
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C30671bj((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            return new C30671bj(layoutParams);
        }
    }

    public AbstractC16300pa getAdapter() {
        return this.A0N;
    }

    public int getBaseline() {
        if (this.A0S != null) {
            return -1;
        }
        return super.getBaseline();
    }

    public int getChildDrawingOrder(int i, int i2) {
        AbstractC16330pd r4 = this.A0O;
        if (r4 == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        C30501bS r42 = (C30501bS) r4;
        C30511bT r0 = r42.A00;
        View view = r0.A0G;
        if (view != null) {
            int i3 = r0.A0A;
            if (i3 == -1) {
                i3 = r0.A0M.indexOfChild(view);
                r42.A00.A0A = i3;
            }
            if (i2 == i - 1) {
                return i3;
            }
            if (i2 >= i3) {
                return i2 + 1;
            }
        }
        return i2;
    }

    public boolean getClipToPadding() {
        return this.A0d;
    }

    public C07800Zo getCompatAccessibilityDelegate() {
        return this.A0Y;
    }

    public C16340pe getEdgeEffectFactory() {
        return this.A0P;
    }

    public AbstractC16370ph getItemAnimator() {
        return this.A0R;
    }

    public int getItemDecorationCount() {
        return this.A14.size();
    }

    public AnonymousClass0VT getLayoutManager() {
        return this.A0S;
    }

    public int getMaxFlingVelocity() {
        return this.A0r;
    }

    public int getMinFlingVelocity() {
        return this.A0s;
    }

    public long getNanoTime() {
        if (A1E) {
            return System.nanoTime();
        }
        return 0;
    }

    public AbstractC16430pn getOnFlingListener() {
        return this.A0T;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0q;
    }

    public C16470pr getRecycledViewPool() {
        C16480ps r1 = this.A0x;
        C16470pr r0 = r1.A02;
        if (r0 != null) {
            return r0;
        }
        C16470pr r02 = new C16470pr();
        r1.A02 = r02;
        return r02;
    }

    public int getScrollState() {
        return this.A0B;
    }

    private C14910n5 getScrollingChildHelper() {
        C14910n5 r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        C14910n5 r02 = new C14910n5(this);
        this.A0I = r02;
        return r02;
    }

    public boolean hasNestedScrollingParent() {
        C14910n5 scrollingChildHelper = getScrollingChildHelper();
        ViewParent viewParent = null;
        if (0 == 0) {
            viewParent = scrollingChildHelper.A01;
        } else if (0 == 1) {
            viewParent = scrollingChildHelper.A00;
        }
        return viewParent != null;
    }

    public boolean isAttachedToWindow() {
        return this.A0k;
    }

    @Override // X.AbstractC06780Ur
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (isLayoutRequested() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r3 = 0
            r5.A09 = r3
            r2 = 1
            r5.A0k = r2
            boolean r0 = r5.A0h
            if (r0 == 0) goto L_0x0014
            boolean r1 = r5.isLayoutRequested()
            r0 = 1
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r5.A0h = r0
            X.0VT r0 = r5.A0S
            if (r0 == 0) goto L_0x001d
            r0.A0B = r2
        L_0x001d:
            r5.A0p = r3
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A1E
            if (r0 == 0) goto L_0x0062
            java.lang.ThreadLocal r4 = X.RunnableC16120pI.A05
            java.lang.Object r0 = r4.get()
            X.0pI r0 = (X.RunnableC16120pI) r0
            r5.A0M = r0
            if (r0 != 0) goto L_0x005b
            X.0pI r0 = new X.0pI
            r0.<init>()
            r5.A0M = r0
            android.view.Display r1 = X.AnonymousClass0Q7.A0B(r5)
            r3 = 1114636288(0x42700000, float:60.0)
            boolean r0 = r5.isInEditMode()
            if (r0 != 0) goto L_0x004f
            if (r1 == 0) goto L_0x004f
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004f
            r3 = r1
        L_0x004f:
            X.0pI r2 = r5.A0M
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r3
            long r0 = (long) r0
            r2.A00 = r0
            r4.set(r2)
        L_0x005b:
            X.0pI r0 = r5.A0M
            java.util.ArrayList r0 = r0.A02
            r0.add(r5)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        RunnableC16120pI r0;
        super.onDetachedFromWindow();
        AbstractC16370ph r02 = this.A0R;
        if (r02 != null) {
            r02.A02();
        }
        A0R();
        this.A0k = false;
        AnonymousClass0VT r1 = this.A0S;
        if (r1 != null) {
            C16480ps r03 = this.A0x;
            r1.A0B = false;
            r1.A0b(this, r03);
        }
        this.A16.clear();
        removeCallbacks(this.A0Z);
        if (this.A12 == null) {
            throw null;
        }
        do {
        } while (C16650q9.A03.A00() != null);
        if (A1E && (r0 = this.A0M) != null) {
            r0.A02.remove(this);
            this.A0M = null;
        }
    }

    public void onDraw(Canvas canvas) {
        int A012;
        int i;
        int dimensionPixelSize;
        Integer valueOf;
        int intValue;
        float f;
        float f2;
        int height;
        int i2;
        int width;
        int i3;
        super.onDraw(canvas);
        ArrayList arrayList = this.A14;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC16380pi r15 = (AbstractC16380pi) arrayList.get(i4);
            if (r15 instanceof AnonymousClass3O0) {
                AnonymousClass3O0 r152 = (AnonymousClass3O0) r15;
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || (A012 = r152.A01(A00(childAt))) == 0)) {
                        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
                        if (A012 == 1) {
                            i = r152.A01;
                        } else if (A012 != 2) {
                            i = 0;
                        } else {
                            i = r152.A03;
                        }
                        int i6 = i + bottom;
                        int A002 = A00(childAt);
                        int paddingLeft = getPaddingLeft();
                        int A013 = r152.A01(A002);
                        if (!(A013 == 2 || A013 == 0)) {
                            Resources resources = getContext().getResources();
                            AnonymousClass3ZP r1 = r152.A05;
                            if (r1 != null) {
                                if (A002 == -1 || (valueOf = Integer.valueOf(r1.A0c.A00(A002))) == null || !((intValue = valueOf.intValue()) == 3 || intValue == 2)) {
                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.search_item_horizontal_margin);
                                } else {
                                    dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.contact_selector_width);
                                }
                                paddingLeft += dimensionPixelSize;
                            } else {
                                throw null;
                            }
                        }
                        int width2 = getWidth() - getPaddingRight();
                        int i7 = r152.A02;
                        if (A012 == 1) {
                            i7 = r152.A00;
                        }
                        Paint paint = r152.A04;
                        paint.setColor(i7);
                        canvas.drawRect((float) paddingLeft, (float) bottom, (float) width2, (float) i6, paint);
                    }
                }
                continue;
            } else if (r15 instanceof C56022hw) {
                int paddingLeft2 = getPaddingLeft();
                AbstractView$OnCreateContextMenuListenerC56112i5 r6 = ((C56022hw) r15).A00;
                int i8 = paddingLeft2 + ((int) r6.A01);
                int width3 = (getWidth() - ((int) r6.A02)) - getPaddingRight();
                for (int i9 = 0; i9 < getChildCount(); i9++) {
                    View childAt2 = getChildAt(i9);
                    C16410pl r12 = (C16410pl) childAt2.getLayoutParams();
                    int bottom2 = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) r12).bottomMargin;
                    int intrinsicHeight = r6.A0I.getIntrinsicHeight() + bottom2;
                    if (r12.A00.A01() == 0 && r6.A0n == null) {
                        r6.A0I.setBounds(0, bottom2, getWidth(), intrinsicHeight);
                        r6.A0I.draw(canvas);
                    } else {
                        r6.A0I.setBounds(i8, bottom2, width3, intrinsicHeight);
                        r6.A0I.draw(canvas);
                    }
                }
            } else if (r15 instanceof C30511bT) {
                C30511bT r153 = (C30511bT) r15;
                r153.A0A = -1;
                if (r153.A0L != null) {
                    float[] fArr = r153.A0T;
                    r153.A09(fArr);
                    f = fArr[0];
                    f2 = fArr[1];
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                }
                AbstractC16160pM r0 = r153.A0I;
                AbstractC11910hD r4 = r153.A0L;
                List list = r153.A0O;
                if (r0 != null) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        C16190pP r13 = (C16190pP) list.get(i10);
                        float f3 = r13.A06;
                        float f4 = r13.A08;
                        if (f3 == f4) {
                            r13.A01 = r13.A0C.A0H.getTranslationX();
                        } else {
                            r13.A01 = ((f4 - f3) * r13.A00) + f3;
                        }
                        float f5 = r13.A07;
                        float f6 = r13.A09;
                        if (f5 == f6) {
                            r13.A02 = r13.A0C.A0H.getTranslationY();
                        } else {
                            r13.A02 = ((f6 - f5) * r13.A00) + f5;
                        }
                        int save = canvas.save();
                        AbstractC16160pM.A01(this, r13.A0C, r13.A01, r13.A02, false);
                        canvas.restoreToCount(save);
                    }
                    if (r4 != null) {
                        int save2 = canvas.save();
                        AbstractC16160pM.A01(this, r4, f, f2, true);
                        canvas.restoreToCount(save2);
                    }
                } else {
                    throw null;
                }
            } else if (r15 instanceof C30421bK) {
                C30421bK r154 = (C30421bK) r15;
                if (!(this.A0S == null || r154.A01 == null)) {
                    int i11 = 0;
                    if (r154.A00 == 1) {
                        canvas.save();
                        if (getClipToPadding()) {
                            i3 = getPaddingLeft();
                            width = getWidth() - getPaddingRight();
                            canvas.clipRect(i3, getPaddingTop(), width, getHeight() - getPaddingBottom());
                        } else {
                            width = getWidth();
                            i3 = 0;
                        }
                        int childCount2 = getChildCount();
                        while (i11 < childCount2) {
                            View childAt3 = getChildAt(i11);
                            Rect rect = r154.A02;
                            A03(childAt3, rect);
                            int round = Math.round(childAt3.getTranslationY()) + rect.bottom;
                            r154.A01.setBounds(i3, round - r154.A01.getIntrinsicHeight(), width, round);
                            r154.A01.draw(canvas);
                            i11++;
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (getClipToPadding()) {
                            i2 = getPaddingTop();
                            height = getHeight() - getPaddingBottom();
                            canvas.clipRect(getPaddingLeft(), i2, getWidth() - getPaddingRight(), height);
                        } else {
                            height = getHeight();
                            i2 = 0;
                        }
                        int childCount3 = getChildCount();
                        while (i11 < childCount3) {
                            View childAt4 = getChildAt(i11);
                            AnonymousClass0VT r14 = this.A0S;
                            Rect rect2 = r154.A02;
                            if (r14 != null) {
                                A03(childAt4, rect2);
                                int round2 = Math.round(childAt4.getTranslationX()) + rect2.right;
                                r154.A01.setBounds(round2 - r154.A01.getIntrinsicWidth(), i2, round2, height);
                                r154.A01.draw(canvas);
                                i11++;
                            } else {
                                throw null;
                            }
                        }
                        canvas.restore();
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3 == 0.0f) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r2 != 0.0f) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        A0y((int) (r2 * r6.A00), (int) (r3 * r6.A01), r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r4 != false) goto L_0x00e7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C002601j.A01("RV OnLayout");
        A0I();
        C002601j.A00();
        this.A0h = true;
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        AnonymousClass0VR r1;
        boolean z2;
        AnonymousClass0VT r4 = this.A0S;
        if (r4 == null) {
            A0a(i, i2);
            return;
        }
        if (!(r4 instanceof StaggeredGridLayoutManager)) {
            z = !(r4 instanceof LinearLayoutManager) ? r4.A0A : true;
        } else {
            z = false;
            if (((StaggeredGridLayoutManager) r4).A01 != 0) {
                z = true;
            }
        }
        if (z) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A0S.A07.A0a(i, i2);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.A0N != null) {
                AnonymousClass0VR r5 = this.A0z;
                if (r5.A04 == 1) {
                    A0S();
                }
                this.A0S.A0N(i, i2);
                r5.A0A = true;
                A0T();
                this.A0S.A0O(i, i2);
                AnonymousClass0VT r7 = this.A0S;
                if (!(r7 instanceof LinearLayoutManager)) {
                    z2 = false;
                } else {
                    z2 = true;
                    if (r7.A01 != 1073741824 && r7.A04 != 1073741824) {
                        int A0A2 = r7.A0A();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= A0A2) {
                                break;
                            }
                            ViewGroup.LayoutParams layoutParams = r7.A0I(i3).getLayoutParams();
                            if (layoutParams.width < 0 && layoutParams.height < 0) {
                                break;
                            }
                            i3++;
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    this.A0S.A0N(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    r5.A0A = true;
                    A0T();
                    this.A0S.A0O(i, i2);
                }
            }
        } else if (this.A0i) {
            r4.A07.A0a(i, i2);
        } else {
            if (this.A0c) {
                A0Q();
                this.A09++;
                A0U();
                A0s(true);
                r1 = this.A0z;
                if (r1.A0B) {
                    r1.A09 = true;
                } else {
                    this.A0J.A04();
                    r1.A09 = false;
                }
                this.A0c = false;
                A0u(false);
            } else {
                r1 = this.A0z;
                if (r1.A0B) {
                    setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                    return;
                }
            }
            AbstractC16300pa r0 = this.A0N;
            if (r0 != null) {
                r1.A03 = r0.A05();
            } else {
                r1.A03 = 0;
            }
            A0Q();
            this.A0S.A07.A0a(i, i2);
            A0u(false);
            r1.A09 = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A09 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C30621be)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C30621be r3 = (C30621be) parcelable;
        this.A0X = r3;
        super.onRestoreInstanceState(((AbstractC15200nf) r3).A00);
        AnonymousClass0VT r1 = this.A0S;
        if (r1 != null && (parcelable2 = this.A0X.A00) != null) {
            r1.A0P(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        C30621be r1 = new C30621be(super.onSaveInstanceState());
        C30621be r0 = this.A0X;
        if (r0 != null) {
            r1.A00 = r0.A00;
            return r1;
        }
        AnonymousClass0VT r02 = this.A0S;
        if (r02 != null) {
            r1.A00 = r02.A0G();
            return r1;
        }
        r1.A00 = null;
        return r1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01f7, code lost:
        if (r22 != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017b, code lost:
        if (r7 != false) goto L_0x0147;
     */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
        // Method dump skipped, instructions count: 1096
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeDetachedView(View view, boolean z) {
        AbstractC11910hD A012 = A01(view);
        if (A012 != null) {
            if (A012.A0A()) {
                A012.A00 &= -257;
            } else if (!A012.A0B()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A012);
                throw new IllegalArgumentException(AnonymousClass008.A0D(this, sb));
            }
        }
        view.clearAnimation();
        A0g(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        AbstractC16520pw r0 = this.A0S.A06;
        if ((r0 == null || !r0.A05) && this.A09 <= 0 && view2 != null) {
            A0h(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0S.A0i(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A15;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC16440po) arrayList.get(i)).AJO(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.A06 != 0 || this.A0n) {
            this.A0o = true;
        } else {
            super.requestLayout();
        }
    }

    public void scrollBy(int i, int i2) {
        AnonymousClass0VT r2 = this.A0S;
        if (r2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.A0n) {
            boolean A0d2 = r2.A0d();
            boolean A0e2 = r2.A0e();
            if (!A0d2) {
                if (A0e2) {
                    i = 0;
                } else {
                    return;
                }
            } else if (!A0e2) {
                i2 = 0;
            }
            A0y(i, i2, null);
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A09 > 0) {
            int i = 0;
            if (!(accessibilityEvent == null || Build.VERSION.SDK_INT < 19 || (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) == 0)) {
                i = contentChangeTypes;
            }
            this.A03 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C07800Zo r1) {
        this.A0Y = r1;
        AnonymousClass0Q7.A0d(this, r1);
    }

    public void setAdapter(AbstractC16300pa r3) {
        setLayoutFrozen(false);
        A0i(r3, false, true);
        A0t(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(AbstractC16330pd r2) {
        if (r2 != this.A0O) {
            this.A0O = r2;
            boolean z = false;
            if (r2 != null) {
                z = true;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.A0d) {
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
        }
        this.A0d = z;
        super.setClipToPadding(z);
        if (this.A0h) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C16340pe r2) {
        if (r2 != null) {
            this.A0P = r2;
            this.A0E = null;
            this.A0H = null;
            this.A0G = null;
            this.A0F = null;
            return;
        }
        throw null;
    }

    public void setHasFixedSize(boolean z) {
        this.A0i = z;
    }

    public void setItemAnimator(AbstractC16370ph r3) {
        AbstractC16370ph r0 = this.A0R;
        if (r0 != null) {
            r0.A02();
            this.A0R.A04 = null;
        }
        this.A0R = r3;
        if (r3 != null) {
            r3.A04 = this.A0Q;
        }
    }

    public void setItemViewCacheSize(int i) {
        C16480ps r0 = this.A0x;
        r0.A00 = i;
        r0.A03();
    }

    public void setLayoutFrozen(boolean z) {
        if (z != this.A0n) {
            A0r("Do not setLayoutFrozen in layout or scroll");
            if (!z) {
                this.A0n = false;
                if (!(!this.A0o || this.A0S == null || this.A0N == null)) {
                    requestLayout();
                }
                this.A0o = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0n = true;
            this.A0j = true;
            A0R();
        }
    }

    public void setLayoutManager(AnonymousClass0VT r10) {
        C16480ps r3;
        if (r10 != this.A0S) {
            A0R();
            if (this.A0S != null) {
                AbstractC16370ph r0 = this.A0R;
                if (r0 != null) {
                    r0.A02();
                }
                AnonymousClass0VT r02 = this.A0S;
                r3 = this.A0x;
                r02.A0X(r3);
                this.A0S.A0Y(r3);
                r3.A04.clear();
                r3.A02();
                if (this.A0k) {
                    AnonymousClass0VT r03 = this.A0S;
                    r03.A0B = false;
                    r03.A0b(this, r3);
                }
                AnonymousClass0VT r1 = this.A0S;
                r1.A07 = null;
                r1.A05 = null;
                r1.A03 = 0;
                r1.A00 = 0;
                r1.A04 = 1073741824;
                r1.A01 = 1073741824;
                this.A0S = null;
            } else {
                r3 = this.A0x;
                r3.A04.clear();
                r3.A02();
            }
            C15940oz r7 = this.A0K;
            C15920ox r2 = r7.A00;
            r2.A00 = 0;
            C15920ox r22 = r2.A01;
            if (r22 != null) {
                r22.A00 = 0;
                C15920ox r23 = r22.A01;
                if (r23 != null) {
                    r23.A00 = 0;
                    C15920ox r24 = r23.A01;
                    if (r24 != null) {
                        r24.A00 = 0;
                        C15920ox r04 = r24.A01;
                        if (r04 != null) {
                            r04.A01();
                        }
                    }
                }
            }
            int size = r7.A02.size();
            while (true) {
                size--;
                if (size >= 0) {
                    AbstractC15930oy r12 = r7.A01;
                    List list = r7.A02;
                    View view = (View) list.get(size);
                    C30561bY r13 = (C30561bY) r12;
                    if (r13 != null) {
                        AbstractC11910hD A012 = A01(view);
                        if (A012 != null) {
                            r13.A00.A0p(A012, A012.A07);
                            A012.A07 = 0;
                        }
                        list.remove(size);
                    } else {
                        throw null;
                    }
                } else {
                    RecyclerView recyclerView = ((C30561bY) r7.A01).A00;
                    int childCount = recyclerView.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = recyclerView.getChildAt(i);
                        recyclerView.A0g(childAt);
                        childAt.clearAnimation();
                    }
                    recyclerView.removeAllViews();
                    this.A0S = r10;
                    if (r10 != null) {
                        if (r10.A07 == null) {
                            r10.A07 = this;
                            r10.A05 = this.A0K;
                            r10.A03 = getWidth();
                            r10.A00 = getHeight();
                            r10.A04 = 1073741824;
                            r10.A01 = 1073741824;
                            if (this.A0k) {
                                this.A0S.A0B = true;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("LayoutManager ");
                            sb.append(r10);
                            sb.append(" is already attached to a RecyclerView:");
                            throw new IllegalArgumentException(AnonymousClass008.A0D(r10.A07, sb));
                        }
                    }
                    r3.A03();
                    requestLayout();
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC06780Ur
    public void setNestedScrollingEnabled(boolean z) {
        C14910n5 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.A02) {
            AnonymousClass0Q7.A0P(scrollingChildHelper.A04);
        }
        scrollingChildHelper.A02 = z;
    }

    public void setOnFlingListener(AbstractC16430pn r1) {
        this.A0T = r1;
    }

    public void setOnScrollListener(AbstractC16450pp r1) {
        this.A0V = r1;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0q = z;
    }

    public void setRecycledViewPool(C16470pr r4) {
        C16480ps r2 = this.A0x;
        C16470pr r1 = r2.A02;
        if (r1 != null) {
            r1.A00--;
        }
        r2.A02 = r4;
        if (r4 != null && r2.A07.A0N != null) {
            r4.A00++;
        }
    }

    public void setRecyclerListener(AbstractC16490pt r1) {
        this.A0W = r1;
    }

    public void setScrollState(int i) {
        AbstractC16520pw r0;
        if (i != this.A0B) {
            this.A0B = i;
            if (i != 2) {
                RunnableC16540py r1 = this.A10;
                r1.A06.removeCallbacks(r1);
                r1.A03.abortAnimation();
                AnonymousClass0VT r02 = this.A0S;
                if (!(r02 == null || (r0 = r02.A06) == null)) {
                    r0.A01();
                }
            }
            AnonymousClass0VT r12 = this.A0S;
            if (r12 != null && (r12 instanceof StaggeredGridLayoutManager)) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) r12;
                if (i == 0) {
                    staggeredGridLayoutManager.A1I();
                }
            }
            AbstractC16450pp r03 = this.A0V;
            if (r03 != null) {
                r03.A00(this, i);
            }
            List list = this.A0b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((AbstractC16450pp) this.A0b.get(size)).A00(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.A0C = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.A0C = viewConfiguration.getScaledTouchSlop();
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A02(i, 0);
    }

    @Override // X.AbstractC06780Ur
    public void stopNestedScroll() {
        getScrollingChildHelper().A01(0);
    }
}
