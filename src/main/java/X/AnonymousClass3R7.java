package X;

import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.3R7  reason: invalid class name */
public class AnonymousClass3R7 extends AbstractC16300pa {
    public ArrayList A00;
    public AnonymousClass3RI[] A01;
    public final /* synthetic */ AnonymousClass3R8 A02;

    public AnonymousClass3R7(AnonymousClass3R8 r2, AnonymousClass3RI[] r3, ArrayList arrayList) {
        this.A02 = r2;
        this.A00 = arrayList;
        this.A01 = r3;
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new AnonymousClass3R4(this.A02.A07, viewGroup);
        }
        AnonymousClass3R8 r0 = this.A02;
        return new AnonymousClass3R3(r0.A07, r0.A0B, viewGroup);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0223, code lost:
        if (r6 != 3) goto L_0x0225;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0257  */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r23, int r24) {
        /*
        // Method dump skipped, instructions count: 605
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R7.A07(X.0hD, int):void");
    }
}
