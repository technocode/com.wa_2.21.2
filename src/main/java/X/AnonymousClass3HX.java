package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3HX  reason: invalid class name */
public class AnonymousClass3HX implements AbstractC61182sd {
    public final /* synthetic */ C61952u0 A00;
    public final /* synthetic */ C61962u1 A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ AbstractC63192w0 A03;

    public AnonymousClass3HX(AbstractC63192w0 r1, C61952u0 r2, C61962u1 r3, PinBottomSheetDialogFragment pinBottomSheetDialogFragment) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = pinBottomSheetDialogFragment;
    }

    @Override // X.AbstractC61182sd
    public void AFb(C61072sS r2) {
        this.A02.A0z();
        AbstractC63192w0.A00(this.A03);
    }

    @Override // X.AbstractC61182sd
    public void AKj(String str) {
        this.A03.A04(this.A00.A00(C61962u1.A00("AUTH", Boolean.TRUE, str, this.A01.A00.A05() / 1000, null, null, new Object[0])), this.A02);
    }
}
