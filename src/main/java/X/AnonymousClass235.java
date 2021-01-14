package X;

import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.235  reason: invalid class name */
public class AnonymousClass235 implements AnonymousClass0J2 {
    public final /* synthetic */ AnonymousClass1LM A00;

    public AnonymousClass235(AnonymousClass1LM r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        AnonymousClass008.A0z("app/CrashLogs/uploadServerOkay/sent ", j);
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("app/CrashLogs/uploadServerOkay/error received: ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        try {
            if ("only_exception".equals(new JSONObject(str).optString("upload", ""))) {
                this.A00.A00 = "exception_only";
            } else {
                this.A00.A00 = "exception_and_logs";
            }
        } catch (JSONException e) {
            this.A00.A00 = "exception_and_logs";
            StringBuilder sb = new StringBuilder("app/CrashLogs/uploadServerOkay/response json parsing error: ");
            sb.append(e);
            Log.d(sb.toString());
        }
    }
}
