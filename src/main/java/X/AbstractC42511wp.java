package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1wp  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC42511wp extends AbstractC16300pa {
    public int A00;
    public long A01;
    public AnonymousClass1S0 A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass0HL A04;
    public final AnonymousClass1S3 A05;
    public final AnonymousClass2DB A06;
    public final AnonymousClass01X A07;
    public final UserJid A08;
    public final List A09 = new ArrayList();
    public final Map A0A = new HashMap();

    public AbstractC42511wp(AnonymousClass01I r2, AnonymousClass1S3 r3, AnonymousClass01X r4, AnonymousClass0HL r5, UserJid userJid, AnonymousClass1S0 r7, AnonymousClass2DB r8) {
        this.A03 = r2;
        this.A05 = r3;
        this.A07 = r4;
        this.A04 = r5;
        this.A08 = userJid;
        this.A02 = r7;
        this.A06 = r8;
        A0A(userJid);
        this.A00 = 0;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return A08() + Math.max(this.A09.size() + 0, 0) + 1;
    }

    @Override // X.AbstractC16300pa
    public /* bridge */ /* synthetic */ AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        AnonymousClass27o r4 = (AnonymousClass27o) this;
        if (i == 1) {
            return new AnonymousClass27m(((AbstractC42511wp) r4).A03, r4.A00, r4.A03, (CatalogHeader) LayoutInflater.from(r4.A06).inflate(R.layout.business_product_catalog_list_header, viewGroup, false));
        }
        LayoutInflater from = LayoutInflater.from(r4.A06);
        if (i == 2) {
            return new C463729v(r4.A01, ((AbstractC42511wp) r4).A03, r4.A00, r4.A03, r4.A04, r4.A07, ((AbstractC42511wp) r4).A04, r4.A05, from.inflate(R.layout.business_product_catalog_list_footer, viewGroup, false));
        }
        return new C463829w(r4.A01, ((AbstractC42511wp) r4).A03, r4.A00, r4.A03, ((AbstractC42511wp) r4).A04, r4.A02, from.inflate(R.layout.business_product_catalog_list_product, viewGroup, false), ((AbstractC42511wp) r4).A02, r4);
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r3, int i) {
        AbstractC42331wX r32 = (AbstractC42331wX) r3;
        int A002 = A00(i);
        if (A002 == 1 || A002 == 4 || A002 == 5) {
            r32.A0C(this.A08, i);
        } else if (A002 == 0) {
            r32.A0C(this.A08, i - A08());
        } else if (A002 == 3) {
            r32.A0C(this.A08, i - A08());
        } else if (A002 == 2) {
            C463729v r33 = (C463729v) r32;
            r33.A00 = this.A00;
            r33.A0C(this.A08, (i - A08()) - this.A09.size());
        }
    }

    public int A08() {
        return this.A06.getResources().getConfiguration().orientation == 1 ? 1 : 0;
    }

    public void A09() {
        if (this.A05.A00) {
            this.A00 = 0;
        } else if (!this.A04.A06(this.A08)) {
            this.A00 = 3;
        } else {
            this.A00 = 1;
        }
    }

    public void A0A(UserJid userJid) {
        List list = this.A09;
        list.clear();
        List<C48052Ks> A042 = this.A04.A04(userJid);
        if (A042 != null) {
            for (C48052Ks r1 : A042) {
                if (AnonymousClass1S6.A03(r1)) {
                    list.add(r1);
                }
            }
        }
    }

    public void A0B(String str) {
        C48052Ks A022 = this.A04.A02(str);
        if (A022 != null && AnonymousClass1S6.A03(A022)) {
            int i = 0;
            while (true) {
                List list = this.A09;
                if (i >= list.size()) {
                    list.add(0, A022);
                    break;
                } else if (((C48052Ks) list.get(i)).A06.equals(A022.A06)) {
                    list.set(i, A022);
                    break;
                } else {
                    i++;
                }
            }
            super.A01.A00();
        }
    }
}
