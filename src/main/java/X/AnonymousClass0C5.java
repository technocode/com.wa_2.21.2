package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0C5  reason: invalid class name */
public class AnonymousClass0C5 {
    public static volatile AnonymousClass0C5 A03;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Map A01 = new HashMap();
    public final Set A02 = new HashSet();

    public static AnonymousClass0C5 A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0C5.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0C5();
                }
            }
        }
        return A03;
    }

    public final void A01() {
        this.A00.post(new RunnableEBaseShape4S0100000_I0_4(this, 18));
    }

    public void A02(Context context, Class cls) {
        StringBuilder sb = new StringBuilder("FgServiceManager/stopService ");
        sb.append(cls);
        Log.i(sb.toString());
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.add(cls);
            }
            A01();
            return;
        }
        context.stopService(new Intent(context, cls));
    }

    public void A03(Context context, Class cls, Intent intent) {
        StringBuilder sb = new StringBuilder("FgServiceManager/startService ");
        sb.append(cls);
        Log.i(sb.toString());
        intent.setClass(context, cls);
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (this) {
                this.A02.remove(cls);
            }
        }
        C004302a.A06(context, intent);
    }
}
