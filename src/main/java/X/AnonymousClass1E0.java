package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.1E0  reason: invalid class name */
public class AnonymousClass1E0 extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public AnonymousClass1E0(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public void onChanged() {
        this.A00.A05();
    }

    public void onInvalidated() {
        this.A00.A05();
    }
}
