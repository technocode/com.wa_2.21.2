package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallLogActivity;
import java.util.List;

/* renamed from: X.3Tm  reason: invalid class name and case insensitive filesystem */
public class C72593Tm extends AbstractC16300pa {
    public int A00 = Integer.MAX_VALUE;
    public List A01;
    public final /* synthetic */ GroupCallLogActivity A02;

    public C72593Tm(GroupCallLogActivity groupCallLogActivity) {
        this.A02 = groupCallLogActivity;
    }

    public static void A00(C72593Tm r3, AnonymousClass02N r4) {
        int i = 0;
        for (AnonymousClass0QP r0 : r3.A01) {
            if (r0.A02.equals(r4)) {
                C72593Tm r1 = r3.A02.A03;
                if (i >= r3.A00) {
                    i++;
                }
                r1.A02(i);
                return;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r1 == 0) goto L_0x001d;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05() {
        /*
            r3 = this;
            java.util.List r0 = r3.A01
            int r2 = r0.size()
            com.whatsapp.voipcalling.GroupCallLogActivity r0 = r3.A02
            X.00f r1 = r0.A04
            X.03a r0 = X.AbstractC000400g.A3J
            int r1 = r1.A06(r0)
            r0 = 2
            if (r1 >= r0) goto L_0x001d
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x001d
            r0 = 1
            if (r1 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72593Tm.A05():int");
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new C72583Tl(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_call_participant_row_divider, viewGroup, false));
        }
        return new C72603Tn(this.A02, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.group_call_participant_row, viewGroup, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (r8 != false) goto L_0x00be;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r10, int r11) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72593Tm.A07(X.0hD, int):void");
    }
}
