package X;

import android.database.DataSetObserver;

/* renamed from: X.0nb  reason: invalid class name and case insensitive filesystem */
public class C15160nb extends DataSetObserver {
    public final /* synthetic */ AbstractC30161ar A00;

    public C15160nb(AbstractC30161ar r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        AbstractC30161ar r1 = this.A00;
        r1.A07 = true;
        r1.notifyDataSetChanged();
    }

    public void onInvalidated() {
        AbstractC30161ar r1 = this.A00;
        r1.A07 = false;
        r1.notifyDataSetInvalidated();
    }
}
