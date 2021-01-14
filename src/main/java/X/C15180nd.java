package X;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: X.0nd  reason: invalid class name and case insensitive filesystem */
public class C15180nd extends Filter {
    public AbstractC15170nc A00;

    public C15180nd(AbstractC15170nc r1) {
        this.A00 = r1;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.A00.A36((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor ANK = this.A00.ANK(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (ANK != null) {
            filterResults.count = ANK.getCount();
            filterResults.values = ANK;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC15170nc r2 = this.A00;
        Cursor cursor = ((AbstractC30161ar) r2).A02;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            r2.A2a((Cursor) obj);
        }
    }
}
