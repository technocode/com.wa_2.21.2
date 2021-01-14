package X;

import com.whatsapp.MuteDialogFragment;
import java.util.List;

/* renamed from: X.1If  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25761If extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ MuteDialogFragment A01;
    public final /* synthetic */ AnonymousClass02N A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ RunnableC25761If(MuteDialogFragment muteDialogFragment, boolean z, List list, long j, boolean z2, AnonymousClass02N r7) {
        this.A01 = muteDialogFragment;
        this.A04 = z;
        this.A03 = list;
        this.A00 = j;
        this.A05 = z2;
        this.A02 = r7;
    }

    public final void run() {
        MuteDialogFragment muteDialogFragment = this.A01;
        boolean z = this.A04;
        List<AnonymousClass02N> list = this.A03;
        long j = this.A00;
        boolean z2 = this.A05;
        AnonymousClass02N r5 = this.A02;
        if (!z) {
            if (r5 != null && !AnonymousClass1VY.A0T(r5) && !AnonymousClass1VY.A0d(r5)) {
                muteDialogFragment.A02.A0F(r5, j, z2, true);
            }
            AnonymousClass02M r2 = muteDialogFragment.A00;
            r2.A02.post(new RunnableEBaseShape1S0200000_I0_0(muteDialogFragment, r5, 21));
        } else if (list != null) {
            for (AnonymousClass02N r52 : list) {
                if (r52 != null && !AnonymousClass1VY.A0T(r52) && !AnonymousClass1VY.A0d(r52)) {
                    muteDialogFragment.A02.A0F(r52, j, z2, true);
                }
            }
            AnonymousClass02M r22 = muteDialogFragment.A00;
            r22.A02.post(new RunnableEBaseShape1S0100000_I0_1(muteDialogFragment, 26));
        }
    }
}
