package X;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0oD  reason: invalid class name and case insensitive filesystem */
public final class RunnableC15520oD extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass05V A02;
    public final /* synthetic */ AnonymousClass037 A03;
    public final /* synthetic */ AnonymousClass037 A04;
    public final /* synthetic */ C09440ct A05;
    public final /* synthetic */ AbstractC09340cj A06;
    public final /* synthetic */ Object A07;
    public final /* synthetic */ Object A08;
    public final /* synthetic */ ArrayList A09;
    public final /* synthetic */ ArrayList A0A;
    public final /* synthetic */ boolean A0B;

    public RunnableC15520oD(AbstractC09340cj r1, AnonymousClass05V r2, Object obj, C09440ct r4, ArrayList arrayList, View view, AnonymousClass037 r7, AnonymousClass037 r8, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.A06 = r1;
        this.A02 = r2;
        this.A08 = obj;
        this.A05 = r4;
        this.A09 = arrayList;
        this.A01 = view;
        this.A03 = r7;
        this.A04 = r8;
        this.A0B = z;
        this.A0A = arrayList2;
        this.A07 = obj2;
        this.A00 = rect;
    }

    public void run() {
        AbstractC09340cj r7 = this.A06;
        AnonymousClass05V r0 = this.A02;
        Object obj = this.A08;
        C09440ct r5 = this.A05;
        AnonymousClass05V A012 = C09330ch.A01(r7, r0, obj, r5);
        if (A012 != null) {
            ArrayList arrayList = this.A09;
            arrayList.addAll(A012.values());
            arrayList.add(this.A01);
        }
        AnonymousClass037 r3 = this.A03;
        AnonymousClass037 r1 = this.A04;
        boolean z = this.A0B;
        C09330ch.A09(r3, r1, z, A012, false);
        if (obj != null) {
            r7.A0I(obj, this.A0A, this.A09);
            View A002 = C09330ch.A00(A012, r5, this.A07, z);
            if (A002 != null) {
                AbstractC09340cj.A00(A002, this.A00);
            }
        }
    }
}
