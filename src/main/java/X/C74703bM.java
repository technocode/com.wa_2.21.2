package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3bM  reason: invalid class name and case insensitive filesystem */
public class C74703bM extends C73483Xm {
    public final /* synthetic */ AnonymousClass3EN A00;
    public final /* synthetic */ AbstractC62022u7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74703bM(AnonymousClass3EN r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13, AbstractC62022u7 r14) {
        super(context, r10, r11, r12, r13, "upi-register-vpa");
        this.A00 = r8;
        this.A01 = r14;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        AbstractC61472tE r1 = this.A00.A01;
        if (r1 != null) {
            ((IndiaUpiBankAccountPickerActivity) r1).A0f(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        AbstractC61472tE r1 = this.A00.A01;
        if (r1 != null) {
            ((IndiaUpiBankAccountPickerActivity) r1).A0f(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r27) {
        super.A03(r27);
        AnonymousClass3EN r7 = this.A00;
        C01970Ad r11 = r7.A08;
        AbstractC61142sZ A7y = r11.A03().A7y();
        if (A7y != null) {
            ArrayList ALu = A7y.ALu(r27);
            ArrayList arrayList = new ArrayList();
            Iterator it = ALu.iterator();
            C74463ay r5 = null;
            C43751yt r10 = null;
            while (it.hasNext()) {
                C74463ay r4 = (C74463ay) ((AnonymousClass0RL) it.next());
                C05870Qv r14 = C05870Qv.A0E;
                String str = ((AnonymousClass27v) r4).A04;
                boolean z = ((AnonymousClass27v) r4).A08;
                int i = 0;
                if (z) {
                    i = 2;
                }
                boolean z2 = ((AnonymousClass27v) r4).A07;
                int i2 = 0;
                if (z2) {
                    i2 = 2;
                }
                String str2 = ((AnonymousClass27v) r4).A06;
                C43751yt r13 = new C43751yt(r14, str, -1, -1, i, i2, str2, ((AnonymousClass27v) r4).A05, ((AnonymousClass27v) r4).A09, r4);
                arrayList.add(r13);
                if ((str2 != null && str2.equals(((AnonymousClass27v) r7.A00).A06)) || (r5 == null && (z2 || z))) {
                    r5 = r4;
                    r10 = r13;
                }
            }
            AnonymousClass1V4 A012 = r11.A01();
            AnonymousClass3E1 r42 = new AnonymousClass3E1(this, r5, r10, this.A01);
            AnonymousClass00T r3 = A012.A03;
            r3.ANC(new C10670f0(r3, A012.A01, A012.A02, arrayList, r42), new Void[0]);
            return;
        }
        throw null;
    }
}
