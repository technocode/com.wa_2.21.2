package X;

import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.236  reason: invalid class name */
public class AnonymousClass236 implements AnonymousClass0J2 {
    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        AnonymousClass008.A0z("app/CrashLogs/uploadCrashData/sent ", j);
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("app/CrashLogs/uploadCrashData/error received: ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("app/CrashLogs/uploadCrashData/Response received: ");
        sb2.append(str);
        Log.d(sb2.toString());
        for (Object obj : map.entrySet()) {
            StringBuilder sb3 = new StringBuilder("app/CrashLogs/uploadCrashData/Header: ");
            sb3.append(obj);
            Log.d(sb3.toString());
        }
        List list = (List) map.get("X-Uploaded-File-Id");
        if (list != null && !list.isEmpty()) {
            sb.append((String) list.get(0));
        }
        StringBuilder A0S = AnonymousClass008.A0S("app/CrashLogs/uploadCrashData/Ref id: ");
        A0S.append(sb.toString());
        A0S.append(", Link: https://logs.whatsapp.net/lookup?sender=");
        A0S.append(sb.toString());
        Log.d(A0S.toString());
    }
}
