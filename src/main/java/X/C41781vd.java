package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1vd  reason: invalid class name and case insensitive filesystem */
public class C41781vd implements AnonymousClass09O {
    public AbstractC64262xt A00;
    public final AnonymousClass02M A01;
    public final C27691Ra A02;
    public final AnonymousClass09H A03;

    public C41781vd(AnonymousClass02M r1, AnonymousClass09H r2, C27691Ra r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A00.AFZ(new Pair(2, "delivery failed"));
        Log.i("RefreshCart/onDeliveryFailure");
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        if (this.A00 != null) {
            Pair A0j = C002001d.A0j(r6);
            AnonymousClass02M r2 = this.A01;
            r2.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, A0j, 31));
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r22) {
        if (this.A00 != null) {
            C27691Ra r6 = this.A02;
            AnonymousClass1RZ r11 = null;
            if (r6 != null) {
                AnonymousClass0M5 A0D = r22.A0D("cart");
                if (A0D != null) {
                    List<AnonymousClass0M5> A0H = A0D.A0H("product");
                    ArrayList arrayList = new ArrayList();
                    for (AnonymousClass0M5 r1 : A0H) {
                        C48052Ks A002 = AnonymousClass1SX.A00(r1);
                        if (A002 == null) {
                            AnonymousClass0M5 A0D2 = r1.A0D("id");
                            AnonymousClass0M5 A0D3 = r1.A0D("status");
                            String A003 = A0D2 == null ? null : AnonymousClass0M5.A00(A0D2.A01);
                            C48112Ky r0 = A0D3 == null ? null : new C48112Ky(3, false, null);
                            if (A003 != null) {
                                A002 = new C48052Ks(A003, "", null, null, null, null, null, new ArrayList(), r0, null, true);
                            }
                        }
                        arrayList.add(A002);
                    }
                    r6.A01.A01(A0D.A0D("price"));
                    r11 = new AnonymousClass1RZ(arrayList);
                }
                this.A01.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, r11, 30));
                return;
            }
            throw null;
        }
    }
}
