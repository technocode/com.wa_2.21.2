package androidx.appcompat.app;

import X.AnonymousClass0T3;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

public class AlertController$RecycleListView extends ListView {
    public final int A00;
    public final int A01;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0V);
        this.A00 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
