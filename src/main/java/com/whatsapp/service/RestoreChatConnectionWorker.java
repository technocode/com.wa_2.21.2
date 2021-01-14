package com.whatsapp.service;

import X.AnonymousClass02M;
import X.AnonymousClass04j;
import X.AnonymousClass0EU;
import X.C03160Fa;
import X.C453624k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public class RestoreChatConnectionWorker extends ListenableWorker {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C453624k A01 = new C453624k();
    public final AnonymousClass02M A02 = AnonymousClass02M.A00();
    public final AnonymousClass04j A03 = AnonymousClass04j.A00();
    public final AnonymousClass0EU A04 = AnonymousClass0EU.A03;
    public final C03160Fa A05 = C03160Fa.A00();

    public RestoreChatConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
