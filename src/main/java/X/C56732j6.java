package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2j6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56732j6 implements AbstractC02170Ax {
    public final /* synthetic */ AnonymousClass00T A00;

    public /* synthetic */ C56732j6(AnonymousClass00T r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        ThreadPoolExecutor A3T = this.A00.A3T("ThumbnailDownloadQueue", 1, 4, 5, 1, new LinkedBlockingQueue());
        A3T.allowCoreThreadTimeOut(true);
        return A3T;
    }
}
