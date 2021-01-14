package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.google.android.search.verification.client.R;
import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Pl  reason: invalid class name and case insensitive filesystem */
public class C27361Pl implements RemoteViewsService.RemoteViewsFactory {
    public final Context A00;
    public final AnonymousClass1Pw A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass0BS A06;
    public final ArrayList A07 = new ArrayList();

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C27361Pl(Context context, AnonymousClass00S r3, AnonymousClass1Pw r4, AnonymousClass01A r5, C014308b r6, AnonymousClass01X r7, AnonymousClass0BS r8) {
        this.A00 = context;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A06 = r8;
    }

    public int getCount() {
        return this.A07.size();
    }

    public RemoteViews getViewAt(int i) {
        ArrayList arrayList = this.A07;
        if (i >= arrayList.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.A00.getPackageName(), (int) R.layout.widget_row);
        C27351Pk r5 = (C27351Pk) arrayList.get(i);
        remoteViews.setTextViewText(R.id.heading, r5.A02);
        remoteViews.setTextViewText(R.id.content, r5.A01);
        remoteViews.setTextViewText(R.id.date, r5.A04);
        remoteViews.setContentDescription(R.id.date, r5.A03);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("jid", AnonymousClass1VY.A0D(r5.A00));
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(R.id.widget_row, intent);
        return remoteViews;
    }

    public void onCreate() {
        Log.i("widgetviewsfactory/oncreate");
        onDataSetChanged();
    }

    public void onDataSetChanged() {
        Log.i("widgetviewsfactory/ondatasetchanged");
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = WidgetProvider.A08;
            ArrayList arrayList2 = this.A07;
            arrayList2.clear();
            if (arrayList != null && this.A01.A07()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC007503q r7 = (AbstractC007503q) it.next();
                    C27351Pk r4 = new C27351Pk(null);
                    AnonymousClass01A r1 = this.A02;
                    AnonymousClass02N r0 = r7.A0n.A00;
                    C007003k A0A = r1.A0A(r0);
                    r4.A00 = r0;
                    r4.A02 = C002001d.A1m(this.A03.A08(A0A, false));
                    r4.A01 = this.A06.A0D(r7, A0A, false, false);
                    AnonymousClass01X r3 = this.A05;
                    AnonymousClass00S r2 = this.A04;
                    r4.A04 = C002001d.A1e(r3, r2.A06(r7.A0E), false);
                    r4.A03 = C002001d.A1e(r3, r2.A06(r7.A0E), true);
                    arrayList2.add(r4);
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public void onDestroy() {
        Log.i("widgetviewsfactory/ondestroy");
    }
}
