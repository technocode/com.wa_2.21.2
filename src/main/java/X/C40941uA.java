package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import java.util.List;

/* renamed from: X.1uA  reason: invalid class name and case insensitive filesystem */
public class C40941uA extends AbstractC16300pa {
    public final List A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;

    public C40941uA(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A01 = viewSharedContactArrayActivity;
        this.A00 = list;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C40971uD(from.inflate(R.layout.review_individual_contact, (ViewGroup) null, true));
        }
        if (i == 1) {
            return new C40951uB(from.inflate(R.layout.contact_info_data, (ViewGroup) null, true));
        }
        if (i == 2) {
            return new C40961uC(from.inflate(R.layout.contact_card_divider, (ViewGroup) null, true));
        }
        if (i == 3) {
            return new C40981uE(from.inflate(R.layout.contact_info_sent_by, (ViewGroup) null, true));
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0261, code lost:
        if (r21.A01.A06 == false) goto L_0x0263;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r22, int r23) {
        /*
        // Method dump skipped, instructions count: 998
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40941uA.A07(X.0hD, int):void");
    }
}
