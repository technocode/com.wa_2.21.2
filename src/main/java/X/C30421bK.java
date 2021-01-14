package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bK  reason: invalid class name and case insensitive filesystem */
public class C30421bK extends AbstractC16380pi {
    public static final int[] A03 = {16843284};
    public int A00;
    public Drawable A01;
    public final Rect A02 = new Rect();

    public C30421bK(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(A03);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.A01 = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.A00 = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    @Override // X.AbstractC16380pi
    public void A00(Rect rect, View view, RecyclerView recyclerView, AnonymousClass0VR r8) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.A00 == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
