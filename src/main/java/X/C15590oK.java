package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* renamed from: X.0oK  reason: invalid class name and case insensitive filesystem */
public class C15590oK extends View {
    public void draw(Canvas canvas) {
    }

    public C15590oK(Context context) {
        super(context, null, 0);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }
}
