package com.whatsapp.appwidget;

import X.AnonymousClass008;
import X.AnonymousClass01Q;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0AP;
import X.AnonymousClass1Pw;
import X.C006903j;
import X.C27331Pi;
import X.RunnableC27311Pe;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public class WidgetProvider extends AppWidgetProvider {
    public static ArrayList A08;
    public AnonymousClass02M A00;
    public RunnableC27311Pe A01;
    public C27331Pi A02;
    public AnonymousClass1Pw A03;
    public AnonymousClass01X A04;
    public C006903j A05;
    public AnonymousClass01Q A06;
    public AnonymousClass0AP A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r15 <= 100) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.widget.RemoteViews A00(android.content.Context r10, X.AnonymousClass1Pw r11, X.AnonymousClass01X r12, int r13, int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.A00(android.content.Context, X.1Pw, X.01X, int, int, int):android.widget.RemoteViews");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r5 != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAppWidgetOptionsChanged(android.content.Context r7, android.appwidget.AppWidgetManager r8, int r9, android.os.Bundle r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x001b
            java.lang.String r0 = "appWidgetMinWidth"
            int r4 = r10.getInt(r0)
            java.lang.String r0 = "appWidgetMinHeight"
            int r5 = r10.getInt(r0)
            java.lang.String r1 = "widgetprovider/onappwidgetoptionschanged "
            java.lang.String r0 = "x"
            X.AnonymousClass008.A0y(r1, r4, r0, r5)
            if (r4 == 0) goto L_0x001b
            if (r5 != 0) goto L_0x0021
        L_0x001b:
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0021:
            X.1Pw r1 = r6.A03
            X.01X r2 = r6.A04
            r0 = r7
            r3 = r9
            android.widget.RemoteViews r0 = A00(r0, r1, r2, r3, r4, r5)
            r8.updateAppWidget(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.appwidget.WidgetProvider.onAppWidgetOptionsChanged(android.content.Context, android.appwidget.AppWidgetManager, int, android.os.Bundle):void");
    }

    public void onReceive(Context context, Intent intent) {
        this.A02 = C27331Pi.A00();
        this.A03 = AnonymousClass1Pw.A00();
        this.A04 = AnonymousClass01X.A00();
        this.A00 = AnonymousClass02M.A00();
        this.A05 = C006903j.A00();
        this.A07 = AnonymousClass0AP.A00();
        this.A06 = AnonymousClass01Q.A00();
        super.onReceive(context, intent);
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        AnonymousClass008.A1L(AnonymousClass008.A0S("widgetprovider/update "), iArr.length);
        RunnableC27311Pe r0 = this.A01;
        if (r0 != null) {
            r0.A08.set(true);
            this.A02.A01().removeCallbacks(this.A01);
        }
        this.A01 = new RunnableC27311Pe(context, this.A00, this.A05, this.A03, this.A04, appWidgetManager, this.A07, this.A06, iArr);
        this.A02.A01().post(this.A01);
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
