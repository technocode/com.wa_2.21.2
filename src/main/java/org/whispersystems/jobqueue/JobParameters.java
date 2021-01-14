package org.whispersystems.jobqueue;

import java.io.Serializable;
import java.util.List;

public class JobParameters implements Serializable {
    public final String groupId;
    public final boolean isPersistent;
    public final List requirements;
    public final int retryCount = 100;
    public final boolean wakeLock = false;
    public final long wakeLockTimeout = 0;

    public JobParameters(List list, boolean z, String str) {
        this.requirements = list;
        this.isPersistent = z;
        this.groupId = str;
    }
}
