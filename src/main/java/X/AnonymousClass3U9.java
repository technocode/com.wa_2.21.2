package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3U9  reason: invalid class name */
public class AnonymousClass3U9 implements AbstractC676839t {
    public final /* synthetic */ VoipActivityV2 A00;
    public final /* synthetic */ boolean A01 = true;

    @Override // X.AbstractC676839t
    public void AM5(DialogInterface dialogInterface) {
    }

    public AnonymousClass3U9(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    @Override // X.AbstractC676839t
    public void ACH(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (this.A01) {
            this.A00.finish();
        }
    }
}
