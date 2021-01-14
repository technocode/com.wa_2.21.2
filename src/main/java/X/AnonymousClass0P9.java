package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

/* renamed from: X.0P9  reason: invalid class name */
public class AnonymousClass0P9 {
    public static volatile AnonymousClass0P9 A04;
    public final AnonymousClass00G A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass00Y A02;
    public final AnonymousClass00T A03;

    public AnonymousClass0P9(AnonymousClass00G r1, AnonymousClass00T r2, AnonymousClass00Y r3, AnonymousClass00D r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public final void A00() {
        ActivityManager activityManager = (ActivityManager) this.A00.A00.getSystemService("activity");
        if (activityManager == null) {
            Log.e("Android11ExitReasonReporter Could not get activity manager");
            return;
        }
        ListIterator listIterator = activityManager.getHistoricalProcessExitReasons(null, 0, 100).listIterator();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        AnonymousClass00D r7 = this.A01;
        SharedPreferences sharedPreferences = r7.A00;
        long j = sharedPreferences.getLong("last_exit_reason_sync_timestamp", -1);
        while (listIterator.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) listIterator.next();
            if (applicationExitInfo.getTimestamp() <= j) {
                break;
            }
            arrayList.add(applicationExitInfo);
            Integer valueOf = Integer.valueOf(applicationExitInfo.getReason());
            if (hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, Integer.valueOf(((Number) hashMap.get(valueOf)).intValue() + 1));
            } else {
                hashMap.put(valueOf, 1);
            }
        }
        ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
        while (listIterator2.hasPrevious()) {
            ApplicationExitInfo applicationExitInfo2 = (ApplicationExitInfo) listIterator2.previous();
            C44331zs r2 = new C44331zs();
            r2.A00 = Boolean.valueOf(ActivityManager.isLowMemoryKillReportSupported());
            r2.A01 = Double.valueOf((double) applicationExitInfo2.getPss());
            r2.A04 = Long.valueOf((long) applicationExitInfo2.getReason());
            r2.A07 = applicationExitInfo2.getDescription();
            r2.A05 = Long.valueOf(applicationExitInfo2.getTimestamp());
            r2.A02 = Double.valueOf((double) applicationExitInfo2.getRss());
            r2.A06 = Long.valueOf((long) applicationExitInfo2.getStatus());
            r2.A03 = Long.valueOf((long) applicationExitInfo2.getImportance());
            try {
                InputStream traceInputStream = applicationExitInfo2.getTraceInputStream();
                if (traceInputStream != null) {
                    while (new BufferedReader(new InputStreamReader(traceInputStream)).readLine() != null) {
                    }
                }
            } catch (IOException e) {
                Log.e("Android11ExitReasonReporter/could not get exit info", e);
            }
            this.A02.A0B(r2, null, false);
            AnonymousClass008.A0l(r7, "last_exit_reason_sync_timestamp", applicationExitInfo2.getTimestamp());
        }
        C44341zt r22 = new C44341zt();
        r22.A01 = hashMap.toString();
        r22.A00 = Long.valueOf(sharedPreferences.getLong("last_exit_reason_sync_timestamp", -1));
        this.A02.A0B(r22, null, false);
    }
}
