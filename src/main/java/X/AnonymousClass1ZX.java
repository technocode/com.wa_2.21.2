package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: X.1ZX  reason: invalid class name */
public abstract class AnonymousClass1ZX implements AnonymousClass0TO, AbstractC13080jZ, AdapterView.OnItemClickListener {
    public Rect A00;

    @Override // X.AnonymousClass0TO
    public boolean A2q(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public boolean A4B(AnonymousClass0T8 r2, AnonymousClass1ZT r3) {
        return false;
    }

    @Override // X.AnonymousClass0TO
    public void AAh(Context context, AnonymousClass0T8 r2) {
    }

    public static int A00(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public void A01(boolean z) {
        if (!(this instanceof AnonymousClass23P)) {
            ((AnonymousClass23N) this).A0A = z;
        } else {
            ((AnonymousClass23P) this).A0G.A02 = z;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C13020jT r0;
        boolean z;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            r0 = (C13020jT) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            r0 = (C13020jT) listAdapter;
        }
        AnonymousClass0T8 r3 = r0.A01;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof AnonymousClass23N)) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 4;
        if (z) {
            i2 = 0;
        }
        r3.A0J(menuItem, this, i2);
    }
}
