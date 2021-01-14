package com.whatsapp.schedulers.work;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SchedulerExperimentWorker extends Worker {
    public SchedulerExperimentWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
