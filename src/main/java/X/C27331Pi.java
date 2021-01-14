package X;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;

/* renamed from: X.1Pi  reason: invalid class name and case insensitive filesystem */
public class C27331Pi {
    public static volatile C27331Pi A0A;
    public Handler A00;
    public Runnable A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass00G A03;
    public final C006903j A04;
    public final AnonymousClass01Q A05;
    public final AnonymousClass0AP A06;
    public final C29031Wt A07;
    public final AnonymousClass0BB A08;
    public final AbstractC02190Az A09;

    public C27331Pi(AnonymousClass00G r1, AnonymousClass01I r2, C006903j r3, C29031Wt r4, AnonymousClass0AP r5, AnonymousClass0BB r6, AnonymousClass01Q r7, AbstractC02190Az r8) {
        this.A03 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A07 = r4;
        this.A06 = r5;
        this.A08 = r6;
        this.A05 = r7;
        this.A09 = r8;
    }

    public static C27331Pi A00() {
        if (A0A == null) {
            synchronized (C27331Pi.class) {
                if (A0A == null) {
                    A0A = new C27331Pi(AnonymousClass00G.A01, AnonymousClass01I.A00(), C006903j.A00(), C29031Wt.A00(), AnonymousClass0AP.A00(), AnonymousClass0BB.A00(), AnonymousClass01Q.A00(), new C02180Ay(C41161ua.A00, null));
                }
            }
        }
        return A0A;
    }

    public synchronized Handler A01() {
        Handler handler;
        handler = this.A00;
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("update_widget", 10);
            handlerThread.start();
            handler = new Handler(handlerThread.getLooper());
            this.A00 = handler;
        }
        return handler;
    }

    public synchronized void A02() {
        AnonymousClass00G r5 = this.A03;
        Application application = r5.A00;
        try {
            int[] appWidgetIds = AppWidgetManager.getInstance(application).getAppWidgetIds(new ComponentName(application, WidgetProvider.class));
            if (appWidgetIds != null && appWidgetIds.length > 0) {
                Intent intent = new Intent(application, WidgetProvider.class);
                intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
                intent.putExtra("appWidgetIds", appWidgetIds);
                application.sendBroadcast(intent);
            }
        } catch (RuntimeException e) {
            Log.e("widgetprovider/getAppWidgetIds failed", e);
        }
        C29031Wt r0 = this.A07;
        AbstractC29021Ws A012 = r0.A01(application);
        if (!(A012 == null || A012 == r0.A02)) {
            if (this.A01 == null) {
                this.A01 = new RunnableC27321Ph(r5, this.A02, this.A04, A012, this.A06, this.A08, this.A05, this.A09);
            }
            A01().removeCallbacks(this.A01);
            A01().post(this.A01);
        }
    }
}
