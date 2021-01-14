package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.38U  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38U implements DialogInterface.OnKeyListener {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public /* synthetic */ AnonymousClass38U(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        ActivityC004902h A0A;
        BottomSheetBehavior bottomSheetBehavior;
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A00;
        if (i == 4 && keyEvent.getAction() == 1) {
            CallInfo A0x = voipCallControlBottomSheet.A0x();
            if (A0x != null && A0x.callState == Voip.CallState.REJOINING) {
                voipCallControlBottomSheet.A18(1);
                return true;
            } else if ((voipCallControlBottomSheet.A0I || !((bottomSheetBehavior = voipCallControlBottomSheet.A09) == null || bottomSheetBehavior.A0B == 3)) && (A0A = voipCallControlBottomSheet.A0A()) != null) {
                A0A.onBackPressed();
                return true;
            } else {
                voipCallControlBottomSheet.A16();
                return true;
            }
        } else {
            ActivityC004902h A0A2 = voipCallControlBottomSheet.A0A();
            if (A0A2 == null || !(A0A2 instanceof ActivityC004802g)) {
                return false;
            }
            return ((ActivityC004802g) A0A2).dispatchKeyEvent(keyEvent);
        }
    }
}
