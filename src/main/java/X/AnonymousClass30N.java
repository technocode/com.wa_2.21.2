package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.30N  reason: invalid class name */
public class AnonymousClass30N implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ AnonymousClass0HM A01;

    public AnonymousClass30N(AnonymousClass0HM r1, ConditionVariable conditionVariable) {
        this.A01 = r1;
        this.A00 = conditionVariable;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.A01.A00 = ((BinderC27531Qj) iBinder).A00;
        this.A00.open();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
        this.A01.A00 = null;
    }
}
