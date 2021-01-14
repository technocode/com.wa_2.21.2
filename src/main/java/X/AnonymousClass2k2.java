package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.2k2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2k2 implements AbstractC02170Ax {
    public final /* synthetic */ AnonymousClass00T A00;

    public /* synthetic */ AnonymousClass2k2(AnonymousClass00T r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC02170Ax
    public final Object get() {
        ThreadPoolExecutor A3T = this.A00.A3T("MediaUploadQueue", 10, 10, 5, 1, new LinkedBlockingQueue());
        A3T.allowCoreThreadTimeOut(true);
        return A3T;
    }
}
