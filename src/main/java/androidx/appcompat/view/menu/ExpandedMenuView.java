package androidx.appcompat.view.menu;

import X.AnonymousClass05p;
import X.AnonymousClass0T8;
import X.AnonymousClass0TT;
import X.AnonymousClass0TU;
import X.AnonymousClass1ZT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements AnonymousClass0TT, AnonymousClass0TU, AdapterView.OnItemClickListener {
    public static final int[] A01 = {16842964, 16843049};
    public AnonymousClass0T8 A00;

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A01, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            } else {
                drawable2 = AnonymousClass05p.A01(context, resourceId2);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) {
                drawable = obtainStyledAttributes.getDrawable(1);
            } else {
                drawable = AnonymousClass05p.A01(context, resourceId);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // X.AnonymousClass0TU
    public void AAm(AnonymousClass0T8 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0TT
    public boolean AAs(AnonymousClass1ZT r4) {
        return this.A00.A0J(r4, null, 0);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AAs((AnonymousClass1ZT) getAdapter().getItem(i));
    }
}
