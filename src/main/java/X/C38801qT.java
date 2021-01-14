package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.1qT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38801qT implements AnonymousClass1MU {
    public final /* synthetic */ View A00;

    public /* synthetic */ C38801qT(View view) {
        this.A00 = view;
    }

    @Override // X.AnonymousClass1MU
    public final void ADw(boolean z) {
        View view = this.A00;
        int i = R.drawable.ib_new_expanded;
        if (z) {
            i = R.drawable.ib_new_expanded_bottom;
        }
        view.setBackgroundResource(i);
    }
}
