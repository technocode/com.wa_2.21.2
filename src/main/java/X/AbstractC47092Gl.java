package X;

import android.widget.BaseAdapter;

/* renamed from: X.2Gl  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC47092Gl extends BaseAdapter {
    public long getItemId(int i) {
        return ((long) i) * 1024;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        return getItem(i) instanceof AnonymousClass2YY ? 1 : 0;
    }
}
