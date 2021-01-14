package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0wI  reason: invalid class name and case insensitive filesystem */
public class C20190wI {
    public static C20190wI A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C20190wI(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
