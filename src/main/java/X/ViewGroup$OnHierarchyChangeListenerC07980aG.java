package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.0aG  reason: invalid class name and case insensitive filesystem */
public class ViewGroup$OnHierarchyChangeListenerC07980aG extends LinearLayout implements ViewGroup.OnHierarchyChangeListener {
    public int[] A00 = new int[4];

    public void onChildViewRemoved(View view, View view2) {
    }

    public ViewGroup$OnHierarchyChangeListenerC07980aG(Context context) {
        super(context);
        setOnHierarchyChangeListener(this);
    }

    public void onChildViewAdded(View view, View view2) {
        int childCount = getChildCount();
        if (this.A00.length < childCount) {
            this.A00 = new int[childCount];
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        if (childCount > 1 && size > 0) {
            View childAt = getChildAt(0);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), i2);
            int size2 = View.MeasureSpec.getSize(i) - childAt.getMeasuredWidth();
            boolean z = false;
            int i3 = 0;
            for (int i4 = 1; i4 < childCount; i4++) {
                View childAt2 = getChildAt(i4);
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                this.A00[i4] = childAt2.getMeasuredWidth();
                i3 += this.A00[i4];
                if (((float) childAt2.getMeasuredWidth()) > ((float) size2) / ((float) (childCount - 1))) {
                    z = true;
                }
            }
            if (z) {
                for (int i5 = 1; i5 < childCount; i5++) {
                    getChildAt(i5).measure(View.MeasureSpec.makeMeasureSpec((this.A00[i5] * size2) / i3, 1073741824), i2);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
