package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.ReTosFragment;

/* renamed from: X.3HL  reason: invalid class name */
public class AnonymousClass3HL implements AnonymousClass0GT {
    public final /* synthetic */ ReTosFragment A00;

    public AnonymousClass3HL(ReTosFragment reTosFragment) {
        this.A00 = reTosFragment;
    }

    public final void A00(C61072sS r7) {
        ReTosFragment reTosFragment = this.A00;
        reTosFragment.A0v(true);
        reTosFragment.A00.setVisibility(0);
        reTosFragment.A01.setVisibility(8);
        ActivityC004902h A0A = reTosFragment.A0A();
        if (A0A != null) {
            AnonymousClass01X r4 = reTosFragment.A02;
            C61162sb r3 = new C61162sb(r4);
            DialogInterface$OnDismissListenerC62922vZ r2 = new DialogInterface$OnDismissListenerC62922vZ(this);
            DialogInterface$OnDismissListenerC62932va r1 = DialogInterface$OnDismissListenerC62932va.A00;
            AnonymousClass0MD A002 = r3.A00(A0A, r7.code, r2, r1);
            if (A002 == null) {
                A002 = r3.A03(A0A, r4.A06(R.string.payments_generic_error), r1);
            }
            A002.show();
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r1) {
        A00(r1);
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r1) {
        A00(r1);
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r5) {
        ReTosFragment reTosFragment = this.A00;
        C018809u r2 = reTosFragment.A04;
        StringBuilder A0S = AnonymousClass008.A0S("accept-tos/result=");
        A0S.append(r5.A02);
        r2.A07(null, A0S.toString(), null);
        if (r5.A02) {
            reTosFragment.A0v(true);
            reTosFragment.A00.setVisibility(0);
            reTosFragment.A01.setVisibility(8);
            reTosFragment.A0w(false, false);
            return;
        }
        A00(new C61072sS(0));
    }
}
