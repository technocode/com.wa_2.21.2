package X;

import android.database.DataSetObserver;

/* renamed from: X.1LN  reason: invalid class name */
public class AnonymousClass1LN extends DataSetObserver {
    public final /* synthetic */ AbstractC39901sI A00;

    public AnonymousClass1LN(AbstractC39901sI r1) {
        this.A00 = r1;
    }

    public void onChanged() {
        super.onChanged();
        AbstractC39901sI r1 = this.A00;
        r1.A03 = true;
        ((AbstractC16300pa) r1).A01.A00();
    }

    public void onInvalidated() {
        super.onInvalidated();
        AbstractC39901sI r1 = this.A00;
        r1.A03 = false;
        ((AbstractC16300pa) r1).A01.A00();
    }
}
