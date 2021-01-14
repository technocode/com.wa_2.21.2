package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.0J1  reason: invalid class name */
public class AnonymousClass0J1 implements AnonymousClass0J2 {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ StringBuffer A01;

    public AnonymousClass0J1(StringBuffer stringBuffer, ConditionVariable conditionVariable) {
        this.A01 = stringBuffer;
        this.A00 = conditionVariable;
    }

    @Override // X.AnonymousClass0J2
    public void AEq(long j) {
        AnonymousClass008.A0z("sent ", j);
    }

    @Override // X.AnonymousClass0J2
    public void AFf(Map map, String str) {
        AnonymousClass008.A17("Error received: ", str);
    }

    @Override // X.AnonymousClass0J2
    public void AJT(Map map, String str) {
        StringBuilder sb = new StringBuilder("Response received: ");
        sb.append(str);
        Log.d(sb.toString());
        for (Object obj : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder("Header: ");
            sb2.append(obj);
            Log.d(sb2.toString());
        }
        List list = (List) map.get("X-Uploaded-File-Id");
        if (list != null && !list.isEmpty()) {
            this.A01.append((String) list.get(0));
        }
        this.A00.open();
    }
}
