package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0oC  reason: invalid class name and case insensitive filesystem */
public final class RunnableC15510oC extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass05V A02;
    public final /* synthetic */ AnonymousClass037 A03;
    public final /* synthetic */ AnonymousClass037 A04;
    public final /* synthetic */ AbstractC09340cj A05;
    public final /* synthetic */ boolean A06;

    public RunnableC15510oC(AnonymousClass037 r1, AnonymousClass037 r2, boolean z, AnonymousClass05V r4, View view, AbstractC09340cj r6, Rect rect) {
        this.A03 = r1;
        this.A04 = r2;
        this.A06 = z;
        this.A02 = r4;
        this.A01 = view;
        this.A05 = r6;
        this.A00 = rect;
    }

    public void run() {
        C09330ch.A09(this.A03, this.A04, this.A06, this.A02, false);
        View view = this.A01;
        if (view != null) {
            AbstractC09340cj.A00(view, this.A00);
        }
    }
}
