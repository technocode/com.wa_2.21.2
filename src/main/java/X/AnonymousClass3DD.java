package X;

import android.app.Activity;
import com.whatsapp.util.Log;

/* renamed from: X.3DD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DD implements AnonymousClass1KX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C449222e A01;
    public final /* synthetic */ AbstractC60992sK A02;
    public final /* synthetic */ C03340Fu A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ AnonymousClass3DD(C449222e r1, C03340Fu r2, String str, boolean z, Activity activity, AbstractC60992sK r6) {
        this.A01 = r1;
        this.A03 = r2;
        this.A04 = str;
        this.A05 = z;
        this.A00 = activity;
        this.A02 = r6;
    }

    @Override // X.AnonymousClass1KX
    public final void A2J() {
        String str;
        C449222e r12 = this.A01;
        C03340Fu r11 = this.A03;
        String str2 = this.A04;
        boolean z = this.A05;
        Activity activity = this.A00;
        AbstractC60992sK r1 = this.A02;
        AnonymousClass3E8 r6 = new AnonymousClass3E8(r12.A05.A00, r12.A02, r12.A03, r12.A07, r11, r12, r12.A09);
        AnonymousClass3DX r13 = new AnonymousClass3DX(r12, activity, r1);
        StringBuilder A0S = AnonymousClass008.A0S("PAY: blockNonWaVpa called vpa: ");
        A0S.append(C28051Sr.A17(str2));
        A0S.append(" block: ");
        A0S.append(z);
        Log.i(A0S.toString());
        if (z) {
            str = "upi-block-vpa";
        } else {
            str = "upi-unblock-vpa";
        }
        AnonymousClass0M5 r14 = new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", str, null, (byte) 0), new AnonymousClass0OS("vpa", str2, null, (byte) 0)}, null, null);
        C61082sT r112 = ((C61432tA) r6).A00;
        if (r112 != null) {
            r112.A03(str);
        }
        ((C61432tA) r6).A01.A09(true, r14, new C74513b3(r6, r6.A00, r6.A01, r6.A02, r6.A04, r112, str, r13, z, str2), 0);
    }
}
