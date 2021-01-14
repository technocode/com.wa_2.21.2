package X;

import android.app.Activity;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3O2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3O2 implements AbstractC47602Ip {
    public final /* synthetic */ AnonymousClass3OI A00;

    public /* synthetic */ AnonymousClass3O2(AnonymousClass3OI r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47602Ip
    public final void AK7(boolean z) {
        View findViewById;
        Activity activity = (Activity) C002001d.A0O(this.A00.getContext());
        if (activity != null && (findViewById = activity.findViewById(R.id.proximity_overlay)) != null) {
            int i = 4;
            if (z) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
