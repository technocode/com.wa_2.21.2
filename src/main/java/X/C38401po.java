package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;

/* renamed from: X.1po  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38401po implements AnonymousClass1KW {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0GG A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C38401po(AnonymousClass0GG r1, Activity activity, boolean z) {
        this.A01 = r1;
        this.A00 = activity;
        this.A02 = z;
    }

    @Override // X.AnonymousClass1KW
    public final void AJg(boolean z) {
        AnonymousClass0GG r5 = this.A01;
        Activity activity = this.A00;
        boolean z2 = this.A02;
        if (!z) {
            AnonymousClass008.A0j(r5.A0F, "block_list_receive_time");
            if (activity != null && !activity.isFinishing()) {
                AnonymousClass02M r3 = r5.A06;
                AnonymousClass01X r1 = r5.A0G;
                int i = R.string.unblock_timeout;
                if (z2) {
                    i = R.string.block_timeout;
                }
                r3.A0B(null, r1.A06(i));
            }
        }
    }
}
