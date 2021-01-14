package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3HT  reason: invalid class name */
public class AnonymousClass3HT implements AbstractC61562tN {
    public final /* synthetic */ AnonymousClass3HU A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3HT(AnonymousClass3HU r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    @Override // X.AbstractC61562tN
    public void AFb(C61072sS r3) {
        AnonymousClass3HU r1 = this.A00;
        r1.A00.A0r();
        AbstractC63192w0.A00(r1.A01);
    }

    @Override // X.AbstractC61562tN
    public void AJa(C68653Ea r8) {
        AnonymousClass3HU r0 = this.A00;
        AbstractC63192w0 r6 = r0.A01;
        C61952u0 r5 = new C61952u0(r8);
        String str = this.A01;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = r0.A00;
        r6.A0D.A01(r5, str, new AnonymousClass3HX(r6, r5, new C61962u1(r6.A06, r6.A0C), pinBottomSheetDialogFragment));
    }
}
