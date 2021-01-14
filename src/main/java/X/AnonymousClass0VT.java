package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.whatsapp.voipcalling.CallPictureGrid;
import com.whatsapp.voipcalling.PeerAvatarLayout;
import java.util.ArrayList;

/* renamed from: X.0VT  reason: invalid class name */
public abstract class AnonymousClass0VT {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C15940oz A05;
    public AbstractC16520pw A06;
    public RecyclerView A07;
    public C16640q8 A08;
    public C16640q8 A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = true;
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F = false;
    public final AbstractC16630q7 A0G;
    public final AbstractC16630q7 A0H;

    public View A0l(View view, int i, C16480ps r4, AnonymousClass0VR r5) {
        return null;
    }

    public AnonymousClass0VT() {
        C30591bb r2 = new C30591bb(this);
        this.A0G = r2;
        C30601bc r1 = new C30601bc(this);
        this.A0H = r1;
        this.A08 = new C16640q8(r2);
        this.A09 = new C16640q8(r1);
    }

    public static int A00(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r5 == 1073741824) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r5 == 1073741824) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            r3 = -2
            r2 = -1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L_0x001f
            if (r7 >= 0) goto L_0x002f
            if (r7 != r2) goto L_0x0018
            if (r5 == r0) goto L_0x002d
            if (r5 == 0) goto L_0x0018
            if (r5 == r1) goto L_0x002d
        L_0x0018:
            r5 = 0
            r7 = 0
        L_0x001a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r0
        L_0x001f:
            if (r7 >= 0) goto L_0x002f
            if (r7 == r2) goto L_0x002d
            if (r7 != r3) goto L_0x0018
            if (r5 == r0) goto L_0x002b
            r0 = r5
            r5 = 0
            if (r0 != r1) goto L_0x002d
        L_0x002b:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x002d:
            r7 = r4
            goto L_0x001a
        L_0x002f:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.A01(int, int, int, int, boolean):int");
    }

    public static int A02(View view) {
        return view.getBottom() + ((C16410pl) view.getLayoutParams()).A03.bottom;
    }

    public static int A03(View view) {
        return view.getLeft() - ((C16410pl) view.getLayoutParams()).A03.left;
    }

    public static int A04(View view) {
        return view.getRight() + ((C16410pl) view.getLayoutParams()).A03.right;
    }

    public static int A05(View view) {
        return view.getTop() - ((C16410pl) view.getLayoutParams()).A03.top;
    }

    public static int A06(View view) {
        return ((C16410pl) view.getLayoutParams()).A00.A01();
    }

    public static C16400pk A07(Context context, AttributeSet attributeSet, int i, int i2) {
        C16400pk r3 = new C16400pk();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15890ou.A07, i, i2);
        r3.A00 = obtainStyledAttributes.getInt(0, 1);
        r3.A01 = obtainStyledAttributes.getInt(9, 1);
        r3.A02 = obtainStyledAttributes.getBoolean(8, false);
        r3.A03 = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return r3;
    }

    public static void A08(View view, int i, int i2, int i3, int i4) {
        C16410pl r2 = (C16410pl) view.getLayoutParams();
        Rect rect = r2.A03;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) r2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) r2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) r2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) r2).bottomMargin);
    }

    public static boolean A09(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public int A0A() {
        C15940oz r0 = this.A05;
        if (r0 != null) {
            return r0.A00();
        }
        return 0;
    }

    public int A0B() {
        AbstractC16300pa r0;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r0 = recyclerView.A0N) == null) {
            return 0;
        }
        return r0.A05();
    }

    public int A0C() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public int A0D() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public int A0E() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public int A0F() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public Parcelable A0G() {
        int A0r;
        View A12;
        int A032;
        int A042;
        int[] iArr;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            C16600q4 r0 = staggeredGridLayoutManager.A0A;
            if (r0 != null) {
                return new C16600q4(r0);
            }
            C16600q4 r4 = new C16600q4();
            r4.A07 = staggeredGridLayoutManager.A0F;
            r4.A05 = staggeredGridLayoutManager.A0D;
            r4.A06 = staggeredGridLayoutManager.A0E;
            C16580q2 r1 = staggeredGridLayoutManager.A09;
            if (r1 == null || (iArr = r1.A01) == null) {
                r4.A01 = 0;
            } else {
                r4.A08 = iArr;
                r4.A01 = iArr.length;
                r4.A04 = r1.A00;
            }
            int i = -1;
            if (staggeredGridLayoutManager.A0A() > 0) {
                if (staggeredGridLayoutManager.A0D) {
                    A0r = staggeredGridLayoutManager.A0s();
                } else {
                    A0r = staggeredGridLayoutManager.A0r();
                }
                r4.A00 = A0r;
                if (staggeredGridLayoutManager.A0G) {
                    A12 = staggeredGridLayoutManager.A11(true);
                } else {
                    A12 = staggeredGridLayoutManager.A12(true);
                }
                if (A12 != null) {
                    i = A06(A12);
                }
                r4.A03 = i;
                int i2 = staggeredGridLayoutManager.A06;
                r4.A02 = i2;
                r4.A09 = new int[i2];
                for (int i3 = 0; i3 < staggeredGridLayoutManager.A06; i3++) {
                    if (staggeredGridLayoutManager.A0D) {
                        A032 = staggeredGridLayoutManager.A0J[i3].A02(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = staggeredGridLayoutManager.A07.A02();
                        } else {
                            r4.A09[i3] = A032;
                        }
                    } else {
                        A032 = staggeredGridLayoutManager.A0J[i3].A03(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
                        if (A032 != Integer.MIN_VALUE) {
                            A042 = staggeredGridLayoutManager.A07.A04();
                        } else {
                            r4.A09[i3] = A032;
                        }
                    }
                    A032 -= A042;
                    r4.A09[i3] = A032;
                }
                return r4;
            }
            r4.A00 = -1;
            r4.A03 = -1;
            r4.A02 = 0;
            return r4;
        } else if (!(this instanceof LinearLayoutManager)) {
            return null;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            C16250pV r02 = linearLayoutManager.A05;
            if (r02 != null) {
                return new C16250pV(r02);
            }
            C16250pV r3 = new C16250pV();
            if (linearLayoutManager.A0A() > 0) {
                linearLayoutManager.A18();
                boolean z = linearLayoutManager.A07 ^ linearLayoutManager.A09;
                r3.A02 = z;
                if (z) {
                    View A11 = linearLayoutManager.A11();
                    r3.A00 = linearLayoutManager.A06.A02() - linearLayoutManager.A06.A06(A11);
                    r3.A01 = A06(A11);
                    return r3;
                }
                View A122 = linearLayoutManager.A12();
                r3.A01 = A06(A122);
                r3.A00 = linearLayoutManager.A06.A09(A122) - linearLayoutManager.A06.A04();
                return r3;
            }
            r3.A01 = -1;
            return r3;
        }
    }

    public View A0H(int i) {
        int A0A2 = A0A();
        for (int i2 = 0; i2 < A0A2; i2++) {
            View A0I = A0I(i2);
            AbstractC11910hD A012 = RecyclerView.A01(A0I);
            if (A012 != null && A012.A01() == i && !A012.A0B() && (this.A07.A0z.A09 || !A012.A09())) {
                return A0I;
            }
        }
        return null;
    }

    public View A0I(int i) {
        C15940oz r0 = this.A05;
        if (r0 == null) {
            return null;
        }
        return ((C30561bY) r0.A01).A00.getChildAt(r0.A02(i));
    }

    public C16410pl A0J() {
        if (!(this instanceof StaggeredGridLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (!(linearLayoutManager instanceof GridLayoutManager)) {
                return new C16410pl(-2, -2);
            }
            if (linearLayoutManager.A01 == 0) {
                return new C30471bP(-2, -1);
            }
            return new C30471bP(-1, -2);
        } else if (((StaggeredGridLayoutManager) this).A02 == 0) {
            return new C30671bj(-2, -1);
        } else {
            return new C30671bj(-1, -2);
        }
    }

    public void A0K() {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void A0L(int i) {
        if (A0I(i) != null) {
            C15940oz r4 = this.A05;
            int A022 = r4.A02(i);
            C30561bY r2 = (C30561bY) r4.A01;
            View childAt = r2.A00.getChildAt(A022);
            if (childAt != null) {
                if (r4.A00.A07(A022)) {
                    r4.A07(childAt);
                }
                r2.A00(A022);
            }
        }
    }

    public void A0M(int i) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            C16600q4 r1 = staggeredGridLayoutManager.A0A;
            if (!(r1 == null || r1.A00 == i)) {
                r1.A09 = null;
                r1.A02 = 0;
                r1.A00 = -1;
                r1.A03 = -1;
            }
            staggeredGridLayoutManager.A03 = i;
            staggeredGridLayoutManager.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            staggeredGridLayoutManager.A0K();
        } else if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            linearLayoutManager.A02 = i;
            linearLayoutManager.A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            C16250pV r12 = linearLayoutManager.A05;
            if (r12 != null) {
                r12.A01 = -1;
            }
            linearLayoutManager.A0K();
        }
    }

    public void A0N(int i, int i2) {
        this.A03 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.A04 = mode;
        if (mode == 0 && !RecyclerView.A1D) {
            this.A03 = 0;
        }
        this.A00 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.A01 = mode2;
        if (mode2 == 0 && !RecyclerView.A1D) {
            this.A00 = 0;
        }
    }

    public void A0O(int i, int i2) {
        int A0A2 = A0A();
        if (A0A2 == 0) {
            this.A07.A0a(i, i2);
            return;
        }
        int i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int i4 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < A0A2; i7++) {
            View A0I = A0I(i7);
            Rect rect = this.A07.A0t;
            RecyclerView.A03(A0I, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.A07.A0t.set(i5, i6, i3, i4);
        A0o(this.A07.A0t, i, i2);
    }

    public void A0P(Parcelable parcelable) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (parcelable instanceof C16600q4) {
                staggeredGridLayoutManager.A0A = (C16600q4) parcelable;
                staggeredGridLayoutManager.A0K();
            }
        } else if (this instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (parcelable instanceof C16250pV) {
                linearLayoutManager.A05 = (C16250pV) parcelable;
                linearLayoutManager.A0K();
            }
        }
    }

    public final void A0Q(View view, int i, boolean z) {
        int i2;
        AbstractC11910hD A012 = RecyclerView.A01(view);
        if (z || A012.A09()) {
            AnonymousClass05V r2 = this.A07.A12.A00;
            C16650q9 r1 = (C16650q9) r2.getOrDefault(A012, null);
            if (r1 == null) {
                r1 = C16650q9.A00();
                r2.put(A012, r1);
            }
            r1.A00 |= 1;
        } else {
            this.A07.A12.A01(A012);
        }
        C16410pl r5 = (C16410pl) view.getLayoutParams();
        int i3 = A012.A00;
        boolean z2 = false;
        if ((i3 & 32) != 0) {
            z2 = true;
        }
        if (z2 || A012.A09 != null) {
            C16480ps r0 = A012.A09;
            if (r0 != null) {
                r0.A09(A012);
            } else {
                A012.A00 = i3 & -33;
            }
            this.A05.A08(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.A07) {
            C15940oz r12 = this.A05;
            int indexOfChild = ((C30561bY) r12.A01).A00.indexOfChild(view);
            int i4 = -1;
            if (indexOfChild != -1) {
                C15920ox r13 = r12.A00;
                if (!r13.A06(indexOfChild)) {
                    i4 = indexOfChild - r13.A00(indexOfChild);
                }
            }
            if (i == -1) {
                i = this.A05.A00();
            }
            if (i4 == -1) {
                StringBuilder A0S = AnonymousClass008.A0S("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                A0S.append(this.A07.indexOfChild(view));
                throw new IllegalStateException(AnonymousClass008.A0D(this.A07, A0S));
            } else if (i4 != i) {
                AnonymousClass0VT r7 = this.A07.A0S;
                View A0I = r7.A0I(i4);
                if (A0I != null) {
                    r7.A0I(i4);
                    r7.A05.A05(i4);
                    ViewGroup.LayoutParams layoutParams = A0I.getLayoutParams();
                    AbstractC11910hD A013 = RecyclerView.A01(A0I);
                    if (A013.A09()) {
                        AnonymousClass05V r9 = r7.A07.A12.A00;
                        C16650q9 r14 = (C16650q9) r9.getOrDefault(A013, null);
                        if (r14 == null) {
                            r14 = C16650q9.A00();
                            r9.put(A013, r14);
                        }
                        r14.A00 |= 1;
                    } else {
                        r7.A07.A12.A01(A013);
                    }
                    r7.A05.A08(A0I, i, layoutParams, A013.A09());
                } else {
                    StringBuilder sb = new StringBuilder("Cannot move a child from non-existing index:");
                    sb.append(i4);
                    sb.append(r7.A07.toString());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        } else {
            this.A05.A09(view, i, false);
            r5.A01 = true;
            AbstractC16520pw r22 = this.A06;
            if (r22 != null && r22.A05) {
                if (r22.A03 != null) {
                    AbstractC11910hD A014 = RecyclerView.A01(view);
                    if (A014 != null) {
                        i2 = A014.A01();
                    } else {
                        i2 = -1;
                    }
                    if (i2 == r22.A00) {
                        r22.A01 = view;
                    }
                } else {
                    throw null;
                }
            }
        }
        if (r5.A02) {
            A012.A0H.invalidate();
            r5.A02 = false;
        }
    }

    public void A0R(View view, Rect rect) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.A0A(view));
        }
    }

    public void A0S(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((C16410pl) view.getLayoutParams()).A03;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (!(this.A07 == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
            RectF rectF = this.A07.A0v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void A0T(View view, C07890a3 r4) {
        AbstractC11910hD A012 = RecyclerView.A01(view);
        if (A012 != null && !A012.A09()) {
            C15940oz r0 = this.A05;
            if (!r0.A02.contains(A012.A0H)) {
                RecyclerView recyclerView = this.A07;
                A0q(recyclerView.A0x, recyclerView.A0z, view, r4);
            }
        }
    }

    public void A0U(View view, C16480ps r5) {
        C15940oz r2 = this.A05;
        int indexOfChild = ((C30561bY) r2.A01).A00.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (r2.A00.A07(indexOfChild)) {
                r2.A07(view);
            }
            ((C30561bY) r2.A01).A00(indexOfChild);
        }
        r5.A05(view);
    }

    public void A0V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.A07.canScrollVertically(-1) && !this.A07.canScrollHorizontally(-1) && !this.A07.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC16300pa r0 = this.A07.A0N;
            if (r0 != null) {
                accessibilityEvent.setItemCount(r0.A05());
            }
        }
    }

    public void A0W(C16480ps r5) {
        int A0A2 = A0A();
        while (true) {
            A0A2--;
            if (A0A2 >= 0) {
                View A0I = A0I(A0A2);
                AbstractC11910hD A012 = RecyclerView.A01(A0I);
                if (!A012.A0B()) {
                    if (!A012.A08() || A012.A09() || this.A07.A0N.A00) {
                        A0I(A0A2);
                        this.A05.A05(A0A2);
                        r5.A06(A0I);
                        this.A07.A12.A01(A012);
                    } else {
                        A0L(A0A2);
                        r5.A08(A012);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A0X(C16480ps r3) {
        for (int A0A2 = A0A() - 1; A0A2 >= 0; A0A2--) {
            if (!RecyclerView.A01(A0I(A0A2)).A0B()) {
                View A0I = A0I(A0A2);
                A0L(A0A2);
                r3.A05(A0I);
            }
        }
    }

    public void A0Y(C16480ps r8) {
        ArrayList arrayList = r8.A04;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((AbstractC11910hD) arrayList.get(i)).A0H;
            AbstractC11910hD A012 = RecyclerView.A01(view);
            if (!A012.A0B()) {
                A012.A07(false);
                if (A012.A0A()) {
                    this.A07.removeDetachedView(view, false);
                }
                AbstractC16370ph r0 = this.A07.A0R;
                if (r0 != null) {
                    r0.A04(A012);
                }
                A012.A07(true);
                AbstractC11910hD A013 = RecyclerView.A01(view);
                A013.A09 = null;
                A013.A0G = false;
                A013.A00 &= -33;
                r8.A08(A013);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = r8.A03;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.A07.invalidate();
        }
    }

    public void A0Z(AbstractC16520pw r5) {
        AbstractC16520pw r1 = this.A06;
        if (!(r1 == null || r5 == r1 || !r1.A05)) {
            r1.A01();
        }
        this.A06 = r5;
        RecyclerView recyclerView = this.A07;
        if (r5.A06) {
            StringBuilder A0S = AnonymousClass008.A0S("An instance of ");
            String simpleName = r5.getClass().getSimpleName();
            A0S.append(simpleName);
            A0S.append(" was started ");
            A0S.append("more than once. Each instance of");
            A0S.append(simpleName);
            A0S.append(" ");
            A0S.append("is intended to only be used once. You should create a new instance for ");
            A0S.append("each use.");
            Log.w("RecyclerView", A0S.toString());
        }
        r5.A03 = recyclerView;
        r5.A02 = this;
        int i = r5.A00;
        if (i != -1) {
            recyclerView.A0z.A07 = i;
            r5.A05 = true;
            r5.A04 = true;
            r5.A01 = recyclerView.A0S.A0H(i);
            r5.A03.A10.A01();
            r5.A06 = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public void A0a(RecyclerView recyclerView) {
        A0N(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public void A0b(RecyclerView recyclerView, C16480ps r5) {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            Runnable runnable = staggeredGridLayoutManager.A0N;
            RecyclerView recyclerView2 = ((AnonymousClass0VT) staggeredGridLayoutManager).A07;
            if (recyclerView2 != null) {
                recyclerView2.removeCallbacks(runnable);
            }
            for (int i = 0; i < staggeredGridLayoutManager.A06; i++) {
                staggeredGridLayoutManager.A0J[i].A08();
            }
            recyclerView.requestLayout();
        }
    }

    public void A0c(String str) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            if (staggeredGridLayoutManager.A0A == null && (recyclerView = ((AnonymousClass0VT) staggeredGridLayoutManager).A07) != null) {
                recyclerView.A0r(str);
            }
        } else if (!(this instanceof LinearLayoutManager)) {
            RecyclerView recyclerView3 = this.A07;
            if (recyclerView3 != null) {
                recyclerView3.A0r(str);
            }
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            if (linearLayoutManager.A05 == null && (recyclerView2 = ((AnonymousClass0VT) linearLayoutManager).A07) != null) {
                recyclerView2.A0r(str);
            }
        }
    }

    public boolean A0d() {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            return !(staggeredGridLayoutManager instanceof CallPictureGrid.NonScrollingGridLayoutManager) && staggeredGridLayoutManager.A02 == 0;
        } else if (!(this instanceof LinearLayoutManager)) {
            return false;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            return !(linearLayoutManager instanceof PeerAvatarLayout.NonScrollingLinearLayoutManager) && linearLayoutManager.A01 == 0;
        }
    }

    public boolean A0e() {
        if (this instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this;
            return !(staggeredGridLayoutManager instanceof CallPictureGrid.NonScrollingGridLayoutManager) && staggeredGridLayoutManager.A02 == 1;
        } else if (!(this instanceof LinearLayoutManager)) {
            return false;
        } else {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
            return !(linearLayoutManager instanceof PeerAvatarLayout.NonScrollingLinearLayoutManager) && linearLayoutManager.A01 == 1;
        }
    }

    public boolean A0f() {
        RecyclerView recyclerView = this.A07;
        return recyclerView != null && recyclerView.A0d;
    }

    public boolean A0g() {
        if (this instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) this).A0A == null;
        }
        if (!(this instanceof LinearLayoutManager)) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this;
        if (!(linearLayoutManager instanceof GridLayoutManager)) {
            return linearLayoutManager.A05 == null && linearLayoutManager.A07 == linearLayoutManager.A0B;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) linearLayoutManager;
        return ((LinearLayoutManager) gridLayoutManager).A05 == null && !gridLayoutManager.A02;
    }

    public boolean A0h(View view, int i, int i2, C16410pl r6) {
        return view.isLayoutRequested() || !A09(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) r6).width) || !A09(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) r6).height);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        if ((r1.bottom - r5) > r7) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0i(androidx.recyclerview.widget.RecyclerView r12, android.view.View r13, android.graphics.Rect r14, boolean r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0VT.A0i(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public int A0j(C16480ps r4, AnonymousClass0VR r5) {
        AbstractC16300pa r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A0d()) {
            return 1;
        }
        return r1.A05();
    }

    public int A0k(C16480ps r4, AnonymousClass0VR r5) {
        AbstractC16300pa r1;
        RecyclerView recyclerView = this.A07;
        if (recyclerView == null || (r1 = recyclerView.A0N) == null || !A0e()) {
            return 1;
        }
        return r1.A05();
    }

    public void A0m(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A002 = recyclerView.A0K.A00();
            for (int i2 = 0; i2 < A002; i2++) {
                recyclerView.A0K.A03(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void A0n(int i) {
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            int A002 = recyclerView.A0K.A00();
            for (int i2 = 0; i2 < A002; i2++) {
                recyclerView.A0K.A03(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void A0o(Rect rect, int i, int i2) {
        int width = rect.width();
        int A0E2 = A0E() + A0D() + width;
        int A0C2 = A0C() + A0F() + rect.height();
        this.A07.setMeasuredDimension(A00(i, A0E2, this.A07.getMinimumWidth()), A00(i2, A0C2, this.A07.getMinimumHeight()));
    }

    public void A0p(C16480ps r3, AnonymousClass0VR r4) {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void A0q(C16480ps r5, AnonymousClass0VR r6, View view, C07890a3 r8) {
        int i;
        int i2;
        if (A0e()) {
            i = A06(view);
        } else {
            i = 0;
        }
        if (A0d()) {
            i2 = A06(view);
        } else {
            i2 = 0;
        }
        r8.A08(C15050nJ.A00(i, 1, i2, 1, false));
    }
}
