package X;

import com.whatsapp.stickers.WebpUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2cD  reason: invalid class name and case insensitive filesystem */
public class C52982cD extends C03410Gc {
    public static volatile C52982cD A07;
    public Set A00;
    public final AnonymousClass0B3 A01;
    public final C000300f A02;
    public final C53002cF A03;
    public final C03570Gt A04;
    public final AnonymousClass00T A05;
    public final Object A06 = new Object();

    public C52982cD(AnonymousClass00T r2, C000300f r3, C03570Gt r4, C53002cF r5, AnonymousClass0B3 r6) {
        super(r5, 30);
        this.A05 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    public static C52982cD A00() {
        if (A07 == null) {
            synchronized (C52982cD.class) {
                if (A07 == null) {
                    AnonymousClass00T A002 = C002101e.A00();
                    C000300f A003 = C000300f.A00();
                    C03570Gt A004 = C03570Gt.A00();
                    if (C53002cF.A08 == null) {
                        synchronized (C53002cF.class) {
                            if (C53002cF.A08 == null) {
                                C53002cF.A08 = new C53002cF(AnonymousClass00G.A01, WebpUtils.A00(), C02590Cr.A00(), C000300f.A00(), AnonymousClass0D1.A00(), AnonymousClass0B3.A00());
                            }
                        }
                    }
                    A07 = new C52982cD(A002, A003, A004, C53002cF.A08, AnonymousClass0B3.A00());
                }
            }
        }
        return A07;
    }

    @Override // X.C03410Gc
    public List A06(int i) {
        ArrayList<Object> arrayList;
        if (!this.A02.A0D(AbstractC000400g.A2J)) {
            synchronized (this.A06) {
                arrayList = new ArrayList(this.A00);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Object obj : arrayList) {
                A05(obj);
            }
        }
        return super.A06(i);
    }

    @Override // X.C03410Gc
    public void A07() {
        super.A07();
        synchronized (this.A06) {
            if (this.A00 == null) {
                HashSet hashSet = new HashSet();
                this.A00 = hashSet;
                hashSet.addAll(this.A03.A07.values());
            }
        }
    }

    @Override // X.C03410Gc
    public void A08(int i) {
        Object A012 = A01(i);
        if (A012 instanceof AnonymousClass2cX) {
            this.A05.ANF(new RunnableEBaseShape7S0200000_I1_2(this, A012, 44));
            synchronized (this.A06) {
                this.A00.remove(A012);
            }
        }
        super.A08(i);
    }

    @Override // X.C03410Gc
    public void A09(AnonymousClass2QD r5) {
        C52992cE r52 = (C52992cE) r5;
        super.A09(r52);
        AbstractC48432Mf r3 = r52.A01;
        if (r3 instanceof AnonymousClass2cX) {
            this.A05.ANF(new RunnableEBaseShape7S0200000_I1_2(this, r3, 43));
            synchronized (this.A06) {
                this.A00.add(r3);
            }
        }
    }

    /* renamed from: A0B */
    public boolean A0A(AbstractC48432Mf r4) {
        C000300f r2 = this.A02;
        if (r4.A2S(r2.A0D(AbstractC000400g.A2J), r2.A0D(AbstractC000400g.A2I))) {
            return super.A0A(r4);
        }
        return false;
    }
}
