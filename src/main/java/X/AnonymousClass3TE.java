package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.3TE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TE implements AbstractC676639q {
    public final /* synthetic */ VoipActivityV2 A00;

    public /* synthetic */ AnonymousClass3TE(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    @Override // X.AbstractC676639q
    public final void ADU(UserJid userJid) {
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A00.A11;
        if (voipCallControlBottomSheet != null) {
            BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A09;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0D(3);
                voipCallControlBottomSheet.A0H = true;
            }
            voipCallControlBottomSheet.A0T.A08(userJid);
        }
    }
}
