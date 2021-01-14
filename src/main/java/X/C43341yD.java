package X;

import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.1yD  reason: invalid class name and case insensitive filesystem */
public class C43341yD implements AnonymousClass1T0 {
    public final /* synthetic */ BloksDialogFragment A00;

    public C43341yD(BloksDialogFragment bloksDialogFragment) {
        this.A00 = bloksDialogFragment;
    }

    @Override // X.AnonymousClass1T0
    public void AEV(AnonymousClass05l r5) {
        BloksDialogFragment bloksDialogFragment = this.A00;
        boolean z = false;
        if (((AnonymousClass037) bloksDialogFragment).A04 >= 4) {
            z = true;
        }
        if (z) {
            C28051Sr.A1H();
            bloksDialogFragment.A02 = new C37441oE(new C37411oB(r5, Collections.emptyList()));
            bloksDialogFragment.A00.setVisibility(8);
            bloksDialogFragment.A01.setVisibility(0);
            bloksDialogFragment.A0x();
        }
    }

    @Override // X.AnonymousClass1T0
    public void AFc(String str) {
        Log.e(str);
    }
}
