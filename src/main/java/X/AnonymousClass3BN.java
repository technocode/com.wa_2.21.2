package X;

import java.util.TimerTask;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.3BN  reason: invalid class name */
public class AnonymousClass3BN extends TimerTask {
    public final /* synthetic */ NPCIFragment A00;

    public AnonymousClass3BN(NPCIFragment nPCIFragment) {
        this.A00 = nPCIFragment;
    }

    public void run() {
        NPCIFragment nPCIFragment = this.A00;
        if (!nPCIFragment.A08.optString("resendOTPFeature", "false").equals("false") && !nPCIFragment.A0A) {
            nPCIFragment.A0A().runOnUiThread(new RunnableEBaseShape13S0100000_I1_8(nPCIFragment, 47));
        }
    }
}
