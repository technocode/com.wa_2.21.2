package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: X.0rK  reason: invalid class name and case insensitive filesystem */
public class C17310rK extends ViewGroup {
    public View A00;
    public ViewGroup A01;
    public C30881c6 A02;
    public ArrayList A03 = null;

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    static {
        try {
            Class cls = Integer.TYPE;
            ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public C17310rK(Context context, ViewGroup viewGroup, View view, C30881c6 r5) {
        super(context);
        this.A01 = viewGroup;
        this.A00 = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.A02 = r5;
    }

    public void A00(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (!(viewGroup == this.A01 || viewGroup.getParent() == null || !AnonymousClass0Q7.A0i(viewGroup))) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                this.A01.getLocationOnScreen(iArr2);
                AnonymousClass0Q7.A0T(view, iArr[0] - iArr2[0]);
                AnonymousClass0Q7.A0U(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        super.addView(view, getChildCount() - 1);
    }

    public void A01(View view) {
        super.removeView(view);
        if (getChildCount() == 0) {
            ArrayList arrayList = this.A03;
            if (arrayList == null || arrayList.size() == 0) {
                this.A01.removeView(this);
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.A01.getLocationOnScreen(iArr);
        this.A00.getLocationOnScreen(iArr2);
        canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        canvas.clipRect(new Rect(0, 0, this.A00.getWidth(), this.A00.getHeight()));
        super.dispatchDraw(canvas);
        ArrayList arrayList = this.A03;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Drawable) this.A03.get(i)).draw(canvas);
            }
        }
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.A01 == null) {
            return null;
        }
        rect.offset(iArr[0], iArr[1]);
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            this.A00.getLocationOnScreen(iArr3);
            int i = iArr3[1] - iArr2[1];
            rect.offset(new int[]{iArr3[0] - iArr2[0], i}[0], i);
            return super.invalidateChildInParent(iArr, rect);
        }
        invalidate(rect);
        return null;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        ArrayList arrayList = this.A03;
        return arrayList != null && arrayList.contains(drawable);
    }
}
