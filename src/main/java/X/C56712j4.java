package X;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2j4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56712j4 implements AbstractC02170Ax {
    public final /* synthetic */ AnonymousClass00T A00;

    public /* synthetic */ C56712j4(AnonymousClass00T r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        ThreadPoolExecutor A3T = this.A00.A3T("MediaDownload", 1, 1, 60, 10, new PriorityBlockingQueue());
        A3T.allowCoreThreadTimeOut(true);
        return A3T;
    }
}
