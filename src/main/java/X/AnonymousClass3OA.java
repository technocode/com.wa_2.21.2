package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3OA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3OA implements AbstractC47602Ip {
    public final /* synthetic */ AnonymousClass3OK A00;

    public /* synthetic */ AnonymousClass3OA(AnonymousClass3OK r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC47602Ip
    public final void AK7(boolean z) {
        View findViewById = C02780Dk.A00(this.A00.getContext()).findViewById(R.id.proximity_overlay);
        if (findViewById != null) {
            int i = 4;
            if (z) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }
}
