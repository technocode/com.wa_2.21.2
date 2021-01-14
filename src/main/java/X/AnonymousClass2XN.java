package X;

import com.whatsapp.companiondevice.LinkedDevicesActivity;
import com.whatsapp.companiondevice.PairedDevicesActivity;
import java.util.List;

/* renamed from: X.2XN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2XN implements AbstractC09120cK {
    public final /* synthetic */ AbstractActivityC60812rK A00;

    public /* synthetic */ AnonymousClass2XN(AbstractActivityC60812rK r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC09120cK
    public final void AII(List list, List list2, List list3) {
        AbstractActivityC60812rK r1 = this.A00;
        if (r1.isFinishing()) {
            return;
        }
        if (!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) {
            r1.A0W(list);
            r1.A0V(list2);
            if (!(r1 instanceof PairedDevicesActivity)) {
                C51022Xa r0 = ((LinkedDevicesActivity) r1).A02;
                r0.A01 = list3;
                r0.A08();
                ((AbstractC16300pa) r0).A01.A00();
                return;
            }
            return;
        }
        r1.A0T();
    }
}
