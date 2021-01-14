package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.1gn  reason: invalid class name and case insensitive filesystem */
public class C33451gn extends AnonymousClass0WM {
    public Drawable A00;
    public SparseArray A01;
    public AbstractC222810u A02;
    public Object A03;
    public boolean A04 = true;
    public boolean A05;
    public boolean A06;
    public int[] A07 = new int[0];
    public C223010x[] A08;
    public C223010x[] A09;
    public final C222710t A0A = new C222710t(this);

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    public C33451gn(Context context) {
        super(context);
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        this.A08 = new C223010x[8];
    }

    public static void A00(C33451gn r7) {
        int childCount = r7.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = r7.getChildAt(i);
            if (childAt.isLayoutRequested()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getHeight(), 1073741824));
                childAt.layout(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
            }
            if (childAt instanceof C33451gn) {
                A00((C33451gn) childAt);
            }
        }
    }

    @Override // X.AnonymousClass0WM
    public void A01(int i, C223010x r7) {
        boolean z = true;
        if (r7.A01.A07.A04 == AnonymousClass11D.DRAWABLE) {
            Drawable drawable = (Drawable) r7.A02;
            if (getVisibility() != 0) {
                z = false;
            }
            drawable.setVisible(z, false);
            drawable.setCallback(this);
            if (drawable.isStateful()) {
                drawable.setState(getDrawableState());
            }
        } else {
            View view = (View) r7.A02;
            this.A06 = true;
            if (!(view instanceof C33451gn) || view.getParent() != this) {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A05) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            } else {
                AnonymousClass0Q7.A0I(view);
                view.setVisibility(0);
            }
        }
        C223010x[] r3 = this.A08;
        int length = r3.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 <<= 1;
            } while (i >= i2);
            C223010x[] r1 = new C223010x[i2];
            System.arraycopy(r3, 0, r1, 0, length);
            this.A08 = r1;
            r3 = r1;
        }
        r3[i] = r7;
    }

    @Override // X.AnonymousClass0WM
    public void A02(int i, C223010x r8) {
        AnonymousClass11D r5 = r8.A01.A07.A04;
        AnonymousClass11D r0 = AnonymousClass11D.DRAWABLE;
        Object obj = r8.A02;
        if (r5 == r0) {
            Drawable drawable = (Drawable) obj;
            drawable.setCallback(null);
            invalidate(drawable.getBounds());
        } else {
            View view = (View) obj;
            this.A06 = true;
            if (view.isPressed()) {
                view.setPressed(false);
            }
            if (this.A05) {
                super.removeViewInLayout(view);
            } else {
                super.removeView(view);
            }
            this.A06 = true;
        }
        C223010x[] r1 = this.A08;
        C223010x[] r2 = this.A09;
        if (r2 == null || r2[i] == null) {
            r1[i] = null;
        } else {
            r2[i] = null;
        }
        if (r2 != null) {
            for (C223010x r02 : r2) {
                if (r02 != null) {
                    return;
                }
            }
            this.A09 = null;
        }
    }

    public void dispatchDraw(Canvas canvas) {
        int mountItemCount;
        C222710t r2 = this.A0A;
        r2.A02 = canvas;
        r2.A00 = 0;
        C33451gn r1 = r2.A03;
        if (r1.A08 == null) {
            mountItemCount = 0;
        } else {
            mountItemCount = r1.getMountItemCount();
        }
        r2.A01 = mountItemCount;
        super.dispatchDraw(canvas);
        if (r2.A02 != null && r2.A00 < r2.A01) {
            C222710t.A00(r2);
        }
        r2.A02 = null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C223010x[] r0 = this.A08;
        if (r0 != null) {
            int length = r0.length;
            for (int i = 0; i < length; i++) {
                C223010x r2 = this.A08[i];
                if (r2 != null && r2.A01.A07.A04 == AnonymousClass11D.DRAWABLE) {
                    Drawable drawable = (Drawable) r2.A02;
                    if (drawable.isStateful()) {
                        drawable.setState(getDrawableState());
                    }
                }
            }
        }
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A06) {
            int childCount = getChildCount();
            if (this.A07.length < childCount) {
                this.A07 = new int[(childCount + 5)];
            }
            C223010x[] r0 = this.A08;
            if (r0 != null) {
                int length = r0.length;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    C223010x r2 = this.A08[i4];
                    if (r2 != null && r2.A01.A07.A04 == AnonymousClass11D.VIEW) {
                        this.A07[i3] = indexOfChild((View) r2.A02);
                        i3++;
                    }
                }
            }
            this.A06 = false;
        }
        C222710t r22 = this.A0A;
        if (r22.A02 != null && r22.A00 < r22.A01) {
            C222710t.A00(r22);
        }
        return this.A07[i2];
    }

    public boolean getClipChildren() {
        if (Build.VERSION.SDK_INT < 18) {
            return this.A04;
        }
        return super.getClipChildren();
    }

    @Override // X.AnonymousClass0WM
    public int getMountItemCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C223010x[] r1 = this.A08;
            if (i >= r1.length) {
                return i2;
            }
            if (r1[i] != null) {
                i2++;
            }
            i++;
        }
    }

    public Object getTag() {
        Object obj = this.A03;
        if (obj != null) {
            return obj;
        }
        return super.getTag();
    }

    public Object getTag(int i) {
        Object obj;
        SparseArray sparseArray = this.A01;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        C223010x[] r0 = this.A08;
        if (r0 != null) {
            int length = r0.length;
            for (int i = 0; i < length; i++) {
                C223010x r2 = this.A08[i];
                if (r2 != null && r2.A01.A07.A04 == AnonymousClass11D.DRAWABLE) {
                    ((Drawable) r2.A02).jumpToCurrentState();
                }
            }
        }
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass118 r3;
        this.A05 = true;
        if (this instanceof AnonymousClass25G) {
            AnonymousClass25G r5 = (AnonymousClass25G) this;
            C33491gr r4 = r5.A00;
            if (r4.A02 && (r3 = r4.A00) != null) {
                r3.A01(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824), null);
                r4.A02 = false;
            }
            AnonymousClass119 r1 = r4.A01;
            if (r1 != null) {
                r4.A04.A02(r1);
            }
            A00(r5);
        } else if (this instanceof AnonymousClass25F) {
            AnonymousClass25F r52 = (AnonymousClass25F) this;
            AnonymousClass119 r12 = r52.A00;
            if (r12 != null) {
                r52.A01.A02(r12);
            }
            A00(r52);
        }
        this.A05 = false;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C223010x[] r2;
        if (isEnabled() && (r2 = this.A08) != null) {
            for (int length = r2.length - 1; length >= 0; length--) {
                C223010x r0 = r2[length];
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        for (ViewParent viewParent = this; viewParent instanceof C33451gn; viewParent = viewParent.getParent()) {
            if (!(!((C33451gn) viewParent).A05)) {
                return;
            }
        }
        super.requestLayout();
    }

    public void setClipChildren(boolean z) {
        if (Build.VERSION.SDK_INT < 18) {
            this.A04 = z;
        }
        super.setClipChildren(z);
    }

    public void setForegroundCompat(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            setForeground(drawable);
        } else {
            setForegroundLollipop(drawable);
        }
    }

    private void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.A00);
            }
            this.A00 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            invalidate();
        }
    }

    public void setInterceptTouchEventHandler(AbstractC222810u r1) {
        this.A02 = r1;
    }

    public void setViewTag(Object obj) {
        this.A03 = obj;
    }

    public void setViewTags(SparseArray sparseArray) {
        this.A01 = sparseArray;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        C223010x[] r0 = this.A08;
        if (r0 != null) {
            int length = r0.length;
            for (int i2 = 0; i2 < length; i2++) {
                C223010x r2 = this.A08[i2];
                if (r2 != null && r2.A01.A07.A04 == AnonymousClass11D.DRAWABLE) {
                    Drawable drawable = (Drawable) r2.A02;
                    boolean z = false;
                    if (i == 0) {
                        z = true;
                    }
                    drawable.setVisible(z, false);
                }
            }
        }
    }
}
