package com.whatsapp.usernotice;

import X.AnonymousClass09H;
import X.AnonymousClass0HE;
import X.AnonymousClass0HG;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

public class UserNoticeStageUpdateWorker extends ListenableWorker {
    public final AnonymousClass09H A00 = AnonymousClass09H.A01();
    public final AnonymousClass0HG A01 = AnonymousClass0HG.A00();
    public final AnonymousClass0HE A02 = AnonymousClass0HE.A00();

    public UserNoticeStageUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
