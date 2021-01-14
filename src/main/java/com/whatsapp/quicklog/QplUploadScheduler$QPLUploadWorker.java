package com.whatsapp.quicklog;

import X.AnonymousClass00S;
import X.AnonymousClass03A;
import X.AnonymousClass03U;
import X.AnonymousClass3MN;
import X.C64892yy;
import X.C64932z2;
import X.C64962z5;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class QplUploadScheduler$QPLUploadWorker extends Worker {
    public final C64962z5 A00;

    public QplUploadScheduler$QPLUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        if (C64962z5.A07 == null) {
            synchronized (C64962z5.class) {
                if (C64962z5.A07 == null) {
                    C64962z5.A07 = new C64962z5(AnonymousClass00S.A00(), AnonymousClass03A.A00(), C64932z2.A00(), C64892yy.A00(), AnonymousClass03U.A00(), AnonymousClass3MN.A00());
                }
            }
        }
        this.A00 = C64962z5.A07;
    }
}
