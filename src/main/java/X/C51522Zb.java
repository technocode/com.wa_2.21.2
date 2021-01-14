package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Zb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51522Zb implements AbstractC47602Ip {
    public final /* synthetic */ C60332pG A00;

    public /* synthetic */ C51522Zb(C60332pG r1) {
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
