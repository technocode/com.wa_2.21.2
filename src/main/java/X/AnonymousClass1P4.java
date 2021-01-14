package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.IBinder;

/* renamed from: X.1P4  reason: invalid class name */
public class AnonymousClass1P4 implements ServiceConnection {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C03480Gk A01;
    public final /* synthetic */ AbstractC09090cH A02;

    public AnonymousClass1P4(C03480Gk r1, ConditionVariable conditionVariable, AbstractC09090cH r3) {
        this.A01 = r1;
        this.A00 = conditionVariable;
        this.A02 = r3;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C03480Gk r2 = this.A01;
        r2.A00 = ((BinderC27531Qj) iBinder).A00;
        this.A00.open();
        r2.A00.A04(this.A02);
        r2.A00.A01();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.A00.close();
        this.A01.A00 = null;
    }
}
