package X;

import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.util.Collections;

/* renamed from: X.3Uk  reason: invalid class name and case insensitive filesystem */
public class C72823Uk implements AnonymousClass1T0 {
    public final /* synthetic */ BkScreenFragment A00;

    public C72823Uk(BkScreenFragment bkScreenFragment) {
        this.A00 = bkScreenFragment;
    }

    @Override // X.AnonymousClass1T0
    public void AEV(AnonymousClass05l r5) {
        BkScreenFragment bkScreenFragment = this.A00;
        boolean z = false;
        if (((AnonymousClass037) bkScreenFragment).A04 >= 4) {
            z = true;
        }
        if (z) {
            C28051Sr.A1H();
            bkScreenFragment.A04 = new C37441oE(new C37411oB(r5, Collections.emptyList()));
            bkScreenFragment.A01.setVisibility(8);
            bkScreenFragment.A02.setVisibility(0);
            bkScreenFragment.A0x();
        }
    }

    @Override // X.AnonymousClass1T0
    public void AFc(String str) {
        Log.e(str);
    }
}
