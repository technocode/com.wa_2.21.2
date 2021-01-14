package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.276  reason: invalid class name */
public class AnonymousClass276 extends AbstractC16300pa {
    public int A00;
    public int A01;
    public RecyclerView A02;
    public AnonymousClass2AX A03;
    public List A04;
    public final Handler A05;
    public final AnonymousClass05q A06;
    public final C37681oc A07;

    public AnonymousClass276(AnonymousClass05q r4, AnonymousClass2AX r5, int i) {
        C37681oc r1 = new C37681oc(i);
        if (r4 == null || ((AnonymousClass05r) r4).A01 != null) {
            this.A04 = new ArrayList();
            this.A07 = r1;
            A04(true);
            this.A06 = r4;
            this.A03 = r5;
            this.A05 = new AnonymousClass1GW(this, Looper.getMainLooper());
            return;
        }
        throw null;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A04.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C33661h9(new AnonymousClass25F(viewGroup.getContext()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r3 != null) goto L_0x0063;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r10, int r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass276.A07(X.0hD, int):void");
    }
}
