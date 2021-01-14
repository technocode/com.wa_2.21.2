package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.List;

/* renamed from: X.3E1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3E1 implements AbstractC48012Ko {
    public final /* synthetic */ C43751yt A00;
    public final /* synthetic */ C74463ay A01;
    public final /* synthetic */ C74703bM A02;
    public final /* synthetic */ AbstractC62022u7 A03;

    public /* synthetic */ AnonymousClass3E1(C74703bM r1, C74463ay r2, C43751yt r3, AbstractC62022u7 r4) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        C74703bM r2 = this.A02;
        C74463ay r0 = this.A01;
        C43751yt r4 = this.A00;
        AbstractC62022u7 r3 = this.A03;
        if (r0 != null && !TextUtils.isEmpty(r0.A0D)) {
            C01980Ae r1 = r2.A00.A06;
            r1.A05(r1.A01("add_bank"));
        }
        AnonymousClass3EN r22 = r2.A00;
        AbstractC61472tE r12 = r22.A01;
        if (r12 != null && r4 != null) {
            ((IndiaUpiBankAccountPickerActivity) r12).A0f(r4, null);
            C74463ay r02 = (C74463ay) r4.A06;
            if (r02 != null && r02.A0G) {
                C01980Ae r13 = r22.A06;
                r13.A05(r13.A01("2fa"));
                r3.AC1();
            }
        }
    }
}
