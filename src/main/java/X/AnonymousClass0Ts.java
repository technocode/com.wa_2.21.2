package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0Ts  reason: invalid class name */
public final class AnonymousClass0Ts extends FrameLayout {
    public ArrayList A00;
    public ArrayList A01;
    public boolean A02 = true;

    public AnonymousClass0Ts(Context context, AttributeSet attributeSet, AnonymousClass0LW r8) {
        super(context, attributeSet);
        AnonymousClass0SZ r1;
        String str;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15330nu.A04);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AnonymousClass037 A06 = r8.A06(id);
        if (classAttribute != null && A06 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = AnonymousClass008.A0K(" with tag ", string);
                } else {
                    str = "";
                }
                throw new IllegalStateException(AnonymousClass008.A0L("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
            }
            AnonymousClass037 r0 = r8.A02;
            if (r0 != null) {
                r1 = r0.A0H.A07();
            } else {
                r1 = r8.A06;
            }
            AnonymousClass037 A002 = r1.A00(context.getClassLoader(), classAttribute);
            A002.A0H();
            AnonymousClass0QB r12 = new AnonymousClass0QB(r8);
            r12.A0F = true;
            A002.A0B = this;
            r12.A0A(getId(), A002, string, 1);
            r12.A04();
        }
    }

    public final void A00(View view) {
        ArrayList arrayList;
        if (view.getAnimation() != null || ((arrayList = this.A01) != null && arrayList.contains(view))) {
            ArrayList arrayList2 = this.A00;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.A00 = arrayList2;
            }
            arrayList2.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof AnonymousClass037) || tag == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i, layoutParams);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AnonymousClass037) && tag != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A02 && this.A00 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A00;
                if (i >= arrayList.size()) {
                    break;
                }
                super.drawChild(canvas, (View) arrayList.get(i), getDrawingTime());
                i++;
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.A02 || (arrayList = this.A00) == null || arrayList.size() <= 0 || !arrayList.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList arrayList = this.A01;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.A00;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.A02 = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            A00(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            A00(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        A00(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        A00(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        A00(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A00(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            A00(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.A02 = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            ArrayList arrayList = this.A01;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.A01 = arrayList;
            }
            arrayList.add(view);
        }
        super.startViewTransition(view);
    }
}
