package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Pe  reason: invalid class name and case insensitive filesystem */
public class RunnableC27311Pe extends RunnableEmptyBase implements Runnable {
    public final AppWidgetManager A00;
    public final Context A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass1Pw A03;
    public final AnonymousClass01X A04;
    public final C006903j A05;
    public final AnonymousClass01Q A06;
    public final AnonymousClass0AP A07;
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final int[] A09;

    public RunnableC27311Pe(Context context, AnonymousClass02M r3, C006903j r4, AnonymousClass1Pw r5, AnonymousClass01X r6, AppWidgetManager appWidgetManager, AnonymousClass0AP r8, AnonymousClass01Q r9, int[] iArr) {
        this.A01 = context;
        this.A02 = r3;
        this.A05 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A00 = appWidgetManager;
        this.A07 = r8;
        this.A06 = r9;
        this.A09 = iArr;
    }

    public void run() {
        AtomicBoolean atomicBoolean = this.A08;
        if (!atomicBoolean.get()) {
            ArrayList A072 = this.A06.A07();
            ArrayList arrayList = new ArrayList();
            Iterator it = A072.iterator();
            while (it.hasNext()) {
                AnonymousClass02N r3 = (AnonymousClass02N) it.next();
                if (!atomicBoolean.get()) {
                    int A012 = this.A05.A01(r3);
                    if (A012 > 0) {
                        arrayList.addAll(this.A07.A06(r3, Math.min(A012, 100)));
                    }
                } else {
                    return;
                }
            }
            Collections.sort(arrayList, C14380mB.A00);
            AnonymousClass02M r2 = this.A02;
            r2.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, arrayList, 16));
        }
    }
}
