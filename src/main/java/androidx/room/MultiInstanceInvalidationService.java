package androidx.room;

import X.AnonymousClass247;
import X.RemoteCallbackListC16740qL;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int A00 = 0;
    public final RemoteCallbackList A01 = new RemoteCallbackListC16740qL(this);
    public final AnonymousClass247 A02 = new AnonymousClass247(this);
    public final HashMap A03 = new HashMap();

    public IBinder onBind(Intent intent) {
        return this.A02;
    }
}
