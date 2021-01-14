package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.search.verification.client.R;
import java.lang.reflect.Field;

/* renamed from: X.0jy  reason: invalid class name and case insensitive filesystem */
public class C13290jy extends ListView {
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public C29621Zs A05;
    public C30151aq A06;
    public RunnableEBaseShape5S0100000_I1_0 A07;
    public Field A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Rect A0C = new Rect();

    public C13290jy(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.A0A = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.A08 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public int A00(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            if (i6 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r9 != 3) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(android.view.MotionEvent r15, int r16) {
        /*
        // Method dump skipped, instructions count: 346
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13290jy.A01(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0C;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.A07 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A09 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public boolean hasFocus() {
        return this.A0A || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.A0A || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.A0A || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.A0A && this.A0B) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.A07 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A07 == null) {
            RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0 = new RunnableEBaseShape5S0100000_I1_0(this, 3);
            this.A07 = runnableEBaseShape5S0100000_I1_0;
            ((ListView) runnableEBaseShape5S0100000_I1_0.A00).post(runnableEBaseShape5S0100000_I1_0);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.A09 && isPressed()) {
                    selector.setState(getDrawableState());
                    return onHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableEBaseShape5S0100000_I1_0 runnableEBaseShape5S0100000_I1_0 = this.A07;
        if (runnableEBaseShape5S0100000_I1_0 != null) {
            C13290jy r1 = (C13290jy) runnableEBaseShape5S0100000_I1_0.A00;
            r1.A07 = null;
            r1.removeCallbacks(runnableEBaseShape5S0100000_I1_0);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.A0B = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C29621Zs r0;
        if (drawable != null) {
            r0 = new C29621Zs(drawable);
        } else {
            r0 = null;
        }
        this.A05 = r0;
        super.setSelector(r0);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.A02 = rect.left;
        this.A04 = rect.top;
        this.A03 = rect.right;
        this.A01 = rect.bottom;
    }

    private void setSelectorEnabled(boolean z) {
        C29621Zs r0 = this.A05;
        if (r0 != null) {
            r0.A00 = z;
        }
    }
}
