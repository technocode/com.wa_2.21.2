package com.whatsapp.instrumentation.api;

import X.AbstractC02190Az;
import X.AnonymousClass01I;
import X.AnonymousClass2RL;
import X.AnonymousClass2RO;
import X.BinderC55232gD;
import X.C014708f;
import X.C02180Ay;
import X.C28631Vd;
import X.C28841Vy;
import X.C55222gC;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class InstrumentationService extends Service {
    public final BinderC55232gD A00;
    public final AnonymousClass2RL A01;
    public final C28841Vy A02;
    public final AbstractC02190Az A03;

    public InstrumentationService() {
        if (AnonymousClass2RL.A04 == null) {
            synchronized (AnonymousClass2RL.class) {
                if (AnonymousClass2RL.A04 == null) {
                    AnonymousClass2RL.A04 = new AnonymousClass2RL(AnonymousClass01I.A00(), C28631Vd.A00(), C014708f.A00(), AnonymousClass2RO.A00());
                }
            }
        }
        this.A01 = AnonymousClass2RL.A04;
        this.A03 = new C02180Ay(C55222gC.A00, null);
        this.A02 = C28841Vy.A00();
        this.A00 = new BinderC55232gD(this);
    }

    public IBinder onBind(Intent intent) {
        return this.A00;
    }
}
