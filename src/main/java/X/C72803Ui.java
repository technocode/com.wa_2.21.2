package X;

import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import java.util.Collections;

/* renamed from: X.3Ui  reason: invalid class name and case insensitive filesystem */
public class C72803Ui implements AnonymousClass1T0 {
    public final /* synthetic */ BkFragment A00;

    public C72803Ui(BkFragment bkFragment) {
        this.A00 = bkFragment;
    }

    @Override // X.AnonymousClass1T0
    public void AEV(AnonymousClass05l r8) {
        BkFragment bkFragment = this.A00;
        boolean z = false;
        if (((AnonymousClass037) bkFragment).A04 >= 4) {
            z = true;
        }
        if (z) {
            C28051Sr.A1H();
            bkFragment.A01 = new C37441oE(new C37411oB(r8, Collections.emptyList()));
            FrameLayout frameLayout = bkFragment.A00;
            AnonymousClass00E.A04(frameLayout, "bloksView is null -- setBloksView() not called.");
            frameLayout.setVisibility(0);
            if (bkFragment.A01 != null) {
                ActivityC004702f r4 = (ActivityC004702f) bkFragment.A0A();
                if (r4 != null) {
                    r4.onConfigurationChanged(r4.getResources().getConfiguration());
                }
                C009205v A002 = C009205v.A00();
                C010706m r2 = new C010706m(bkFragment.A0H, r4, (C06170Sb) bkFragment.A05.get());
                C37441oE r1 = bkFragment.A01;
                FrameLayout frameLayout2 = bkFragment.A00;
                AnonymousClass00E.A04(frameLayout2, "bloksView is null -- setBloksView() not called.");
                A002.A02(r2, r1, frameLayout2);
            }
        }
    }

    @Override // X.AnonymousClass1T0
    public void AFc(String str) {
        Log.e(str);
    }
}
