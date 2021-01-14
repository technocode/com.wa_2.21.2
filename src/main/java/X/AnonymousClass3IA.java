package X;

import com.google.android.search.verification.client.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3IA  reason: invalid class name */
public abstract class AnonymousClass3IA extends AnonymousClass0SD {
    public C02270Bi A00 = new C02270Bi(new ArrayList());
    public C43771yv A01;
    public C018809u A02 = C018809u.A00("MerchantDetailsViewModel", "merchant-settings", "COMMON");
    public C08580bN A03 = new C08580bN();
    public List A04;
    public List A05 = new ArrayList();
    public final AbstractC005102k A06;
    public final AnonymousClass02M A07;
    public final C018609s A08;
    public final C018709t A09;
    public final C01970Ad A0A;
    public final AnonymousClass00T A0B;

    public AnonymousClass3IA(AbstractC005102k r4, AnonymousClass02M r5, AnonymousClass00T r6, C018709t r7, C01970Ad r8, C018609s r9) {
        this.A06 = r4;
        this.A07 = r5;
        this.A0B = r6;
        this.A09 = r7;
        this.A0A = r8;
        this.A08 = r9;
    }

    public void A02(C63342wG r19) {
        C63352wH r1;
        int i = r19.A00;
        if (i != 0) {
            if (i == 1) {
                C01970Ad r0 = this.A0A;
                r0.A04();
                List A092 = r0.A06.A09();
                C018809u r4 = this.A02;
                StringBuilder A0S = AnonymousClass008.A0S("Remove merchant account. #methods=");
                AbstractCollection abstractCollection = (AbstractCollection) A092;
                A0S.append(abstractCollection.size());
                r4.A07(null, A0S.toString(), null);
                if (abstractCollection.size() <= 1) {
                    r1 = new C63352wH(0);
                } else {
                    r1 = new C63352wH(1);
                }
                this.A03.A07(r1);
                return;
            } else if (i == 2) {
                boolean z = r19.A01;
                C73743Yn r02 = (C73743Yn) this;
                C63262w8 r42 = new C63262w8(5);
                r42.A08 = true;
                r42.A02 = R.string.register_wait_message;
                r02.A00.A07(r42);
                AnonymousClass3I4 r12 = new AnonymousClass3I4(r02);
                if (z) {
                    new C61482tF(r02.A05.A00, r02.A01, r02.A0G, r02.A0F, r02.A0E, r02.A07, r02.A0B, r02.A03, r02.A0C, r02.A0D, r02.A09).A00(r12);
                    return;
                }
                C61312sy r7 = new C61312sy(r02.A04, r02.A05.A00, r02.A01, r02.A02, r02.A0G, r02.A0E, r02.A03, r02.A0C, r02.A09, r02.A0A);
                ArrayList arrayList = new ArrayList();
                AnonymousClass008.A1F("action", "br-remove-merchant-account", arrayList);
                byte[] A0x = AnonymousClass0FI.A0x(r7.A04, r7.A02, false);
                if (A0x != null) {
                    arrayList.add(new AnonymousClass0OS("nonce", C007603r.A03(A0x), null, (byte) 0));
                    r7.A07.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C73423Xg(r7, r7.A00, r7.A01, r7.A03, r7.A05, r12), 0);
                    return;
                }
                throw null;
            } else if (i != 3) {
                return;
            }
        }
        this.A0B.ANF(new RunnableEBaseShape11S0100000_I1_6(this, 42));
    }
}
