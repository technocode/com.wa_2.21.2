package X;

import android.widget.AbsListView;
import com.whatsapp.Conversation;

/* renamed from: X.1Kz  reason: invalid class name */
public class AnonymousClass1Kz implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ Conversation A04;

    public AnonymousClass1Kz(Conversation conversation) {
        this.A04 = conversation;
    }

    public final void A00(int i, int i2) {
        AbstractC007503q A042;
        Conversation conversation = this.A04;
        int count = conversation.A0q.getCount();
        while (i <= i2) {
            int headerViewsCount = i - conversation.A0Y.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (A042 = conversation.A0q.getItem(headerViewsCount)) != null && A042.A0m == 13) {
                conversation.A3i(A042.A0n);
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0314, code lost:
        if (r32 != 0) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0216, code lost:
        if (r8.A0p < r0.A0p) goto L_0x0318;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r30, int r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 797
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Kz.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (r4.A2G.A0D(X.AbstractC000400g.A1k) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r6, int r7) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Kz.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
