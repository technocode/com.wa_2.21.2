package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.3TL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TL implements AbstractC676339k {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public /* synthetic */ AnonymousClass3TL(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    @Override // X.AbstractC676339k
    public final void AE8(float f) {
        BottomSheetBehavior bottomSheetBehavior = this.A00.A09;
        if (bottomSheetBehavior != null) {
            int i = 3;
            if (f > 0.0f) {
                i = 4;
            }
            bottomSheetBehavior.A0D(i);
            return;
        }
        throw null;
    }
}
