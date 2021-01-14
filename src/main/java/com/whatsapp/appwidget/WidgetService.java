package com.whatsapp.appwidget;

import X.AnonymousClass00S;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass0BS;
import X.AnonymousClass1Pw;
import X.C014308b;
import X.C27361Pl;
import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService extends RemoteViewsService {
    public final AnonymousClass1Pw A00 = AnonymousClass1Pw.A00();
    public final AnonymousClass01A A01 = AnonymousClass01A.A00();
    public final C014308b A02 = C014308b.A00();
    public final AnonymousClass00S A03 = AnonymousClass00S.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass0BS A05 = AnonymousClass0BS.A01();

    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new C27361Pl(getApplicationContext(), this.A03, this.A00, this.A01, this.A02, this.A04, this.A05);
    }
}
