package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.00a  reason: invalid class name and case insensitive filesystem */
public class C000000a {
    public static volatile C000000a A01;
    public final AnonymousClass00G A00;

    public C000000a(AnonymousClass00G r1) {
        this.A00 = r1;
    }

    public static C000000a A00() {
        if (A01 == null) {
            synchronized (C000000a.class) {
                if (A01 == null) {
                    A01 = new C000000a(AnonymousClass00G.A01);
                }
            }
        }
        return A01;
    }

    public List A01() {
        ArrayList arrayList = new ArrayList();
        if (!A04("breakpad")) {
            arrayList.add("breakpad");
        }
        if (!A04("anr_detector")) {
            arrayList.add("anr_detector");
        }
        if (!A04("abort_hook")) {
            arrayList.add("abort_hook");
        }
        return arrayList;
    }

    public void A02(String str) {
        boolean delete = new File(this.A00.A00.getCacheDir(), AnonymousClass008.A0K(str, ".health")).delete();
        StringBuilder sb = new StringBuilder();
        sb.append("Module ");
        sb.append(str);
        sb.append(" health file deleted: ");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public void A03(String str, Runnable runnable) {
        if (!A04(str)) {
            AnonymousClass008.A1C("Skipping module ", str, " since its unhealthy");
            return;
        }
        AnonymousClass008.A18("Loading module: ", str);
        try {
            new File(this.A00.A00.getCacheDir(), AnonymousClass008.A0K(str, ".health")).createNewFile();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating health file for ");
            sb.append(str);
            Log.e(sb.toString(), e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        A02(str);
        StringBuilder A0Z = AnonymousClass008.A0Z("Module loaded: ", str, " load time: ");
        A0Z.append(elapsedRealtime2 - elapsedRealtime);
        Log.i(A0Z.toString());
        return;
    }

    public boolean A04(String str) {
        return !new File(this.A00.A00.getCacheDir(), AnonymousClass008.A0K(str, ".health")).exists();
    }
}
