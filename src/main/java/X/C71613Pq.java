package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Pq  reason: invalid class name and case insensitive filesystem */
public class C71613Pq extends AbstractC16300pa {
    public List A00 = new ArrayList();
    public final /* synthetic */ C659432e A01;

    public C71613Pq(C659432e r2) {
        this.A01 = r2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C71623Pr(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.status_details_row, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r9, int i) {
        C71623Pr r92 = (C71623Pr) r9;
        C659332d r6 = (C659332d) this.A00.get(i);
        UserJid userJid = r6.A01;
        r92.A00 = userJid;
        C659432e r7 = this.A01;
        C007003k A0A = r7.A04.A0A(userJid);
        AnonymousClass0YX r4 = r7.A08;
        r4.A04(A0A, r92.A01, false, new C12260ho(r4.A04.A01, A0A));
        r92.A03.A02(r7.A07.A05(A0A));
        r92.A02.setText(C002001d.A1F(r7.A0C, r7.A0A.A06(r6.A00)));
    }

    public void A08(AnonymousClass02N r3) {
        if (r3 == null) {
            super.A01.A00();
            return;
        }
        for (C659332d r0 : this.A00) {
            if (r3.equals(r0.A01)) {
                super.A01.A00();
                return;
            }
        }
    }
}
