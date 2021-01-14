package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Xz  reason: invalid class name and case insensitive filesystem */
public class C73603Xz extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C61592tQ A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73603Xz(C61592tQ r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, boolean z, AnonymousClass0GT r7) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A02 = z;
        this.A00 = r7;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r1) {
        A02(r1);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        AbstractC61782tj A6O = this.A01.A08.A03().A6O();
        if (A6O != null) {
            A6O.AGZ(r2);
        }
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r15) {
        ArrayList arrayList;
        AnonymousClass0OS[] A0I;
        AnonymousClass0M5[] r0;
        int length;
        C61592tQ r5 = this.A01;
        C01970Ad r3 = r5.A08;
        AbstractC61782tj A6O = r3.A03().A6O();
        if (A6O != null) {
            A6O.AGZ(null);
        }
        C68503Dl r4 = new C68503Dl();
        C03300Fq r11 = r5.A09;
        if (r11 != null) {
            AnonymousClass0M5 A0D = r15.A0D("account");
            if (A0D == null || (r0 = A0D.A03) == null || (length = r0.length) <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    AnonymousClass0M5 A0C = A0D.A0C(i);
                    if (A0C != null) {
                        if ("transaction".equals(A0C.A00)) {
                            arrayList.add(r11.A04(A0C));
                        }
                    } else {
                        throw null;
                    }
                }
            }
            r4.A01 = arrayList;
            AnonymousClass2LZ r6 = new AnonymousClass2LZ();
            AnonymousClass0M5 A0D2 = r15.A0D("account");
            if (!(A0D2 == null || (A0I = A0D2.A0I()) == null)) {
                for (AnonymousClass0OS r02 : A0I) {
                    String str = r02.A02;
                    String str2 = r02.A03;
                    if ("after".equals(str)) {
                        r6.A00 = str2;
                    } else if ("last".equals(str)) {
                        r6.A01 = "1".equals(str2);
                    }
                }
            }
            r4.A00 = r6;
            if (this.A02) {
                C02010Ah r9 = r5.A05;
                long A05 = r9.A01.A05();
                r9.A01().edit().putLong("payments_all_transactions_last_sync_time", A05).apply();
                r9.A02.A07(null, AnonymousClass008.A0I("updateAllTransactionsLastSyncTimeMilli to: ", A05), null);
            }
            List list = r4.A01;
            if (list != null && list.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (AnonymousClass0MH r10 : r4.A01) {
                    C007303n r1 = new C007303n(r10.A08, r10.A0M, r10.A0H);
                    if (r10.A0L || r1.A00 == null || r1.A01 == null) {
                        arrayList3.add(r10);
                    } else {
                        arrayList2.add(new AnonymousClass02R(r1, r10));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    AnonymousClass1V4 A012 = r3.A01();
                    A012.A03.ANC(new C10640ex(A012, new RunnableEBaseShape8S0200000_I1_3(this, arrayList3, 38), r4.A01), new Void[0]);
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AnonymousClass02R r03 = (AnonymousClass02R) it.next();
                        r5.A03.A0I((C007303n) r03.A00, (AnonymousClass0MH) r03.A01);
                    }
                }
            }
            AnonymousClass0GT r04 = this.A00;
            if (r04 != null) {
                r04.AJV(r4);
                return;
            }
            return;
        }
        throw null;
    }
}
