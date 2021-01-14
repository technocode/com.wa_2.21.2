package androidx.appcompat.widget;

import X.AbstractC13570kT;
import X.AnonymousClass0T3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public int A00;
    public int A01 = 0;
    public LayoutInflater A02;
    public AbstractC13570kT A03;
    public WeakReference A04;

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0f, 0, 0);
        this.A00 = obtainStyledAttributes.getResourceId(2, -1);
        this.A01 = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View A00() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.A01 != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.A02;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.A01, viewGroup, false);
            int i = this.A00;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.A04 = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public int getInflatedId() {
        return this.A00;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A02;
    }

    public int getLayoutResource() {
        return this.A01;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.A00 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A02 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A01 = i;
    }

    public void setOnInflateListener(AbstractC13570kT r1) {
        this.A03 = r1;
    }

    public void setVisibility(int i) {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            A00();
        }
    }
}
