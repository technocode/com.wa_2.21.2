package X;

import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import java.util.Comparator;

/* renamed from: X.38T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38T implements Comparator {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public /* synthetic */ AnonymousClass38T(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A00;
        AnonymousClass0QY r9 = (AnonymousClass0QY) obj;
        AnonymousClass0QY r10 = (AnonymousClass0QY) obj2;
        int i = r9.A01;
        boolean z = false;
        if (i == 1 && r10.A01 == 1) {
            return 0;
        }
        if (i == 1) {
            return -1;
        }
        if (r10.A01 == 1) {
            return 1;
        }
        AnonymousClass01A r2 = voipCallControlBottomSheet.A0M;
        C007003k A0A = r2.A0A(r9.A06);
        C007003k A0A2 = r2.A0A(r10.A06);
        AnonymousClass0QW r3 = A0A.A08;
        boolean z2 = false;
        if (r3 != null) {
            z2 = true;
        }
        if (A0A2.A08 != null) {
            z = true;
        }
        if (z2 == z) {
            C014308b r22 = voipCallControlBottomSheet.A0N;
            return r22.A08(A0A, false).compareTo(r22.A08(A0A2, false));
        } else if (r3 != null) {
            return -1;
        } else {
            return 1;
        }
    }
}
