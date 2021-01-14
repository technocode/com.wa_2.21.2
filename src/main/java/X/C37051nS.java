package X;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: X.1nS  reason: invalid class name and case insensitive filesystem */
public final class C37051nS implements AbstractC24581Bn {
    public final /* synthetic */ C012407e A00;

    public C37051nS(C012407e r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC24581Bn
    public final Object AQY(AbstractC011406u r5) {
        Object obj;
        C011506v r52 = (C011506v) r5;
        synchronized (r52.A04) {
            C001801b.A1b(r52.A02, "Task is not yet complete");
            if (r52.A05) {
                throw new CancellationException("Task is already canceled.");
            } else if (!IOException.class.isInstance(r52.A00)) {
                Exception exc = r52.A00;
                if (exc == null) {
                    obj = r52.A01;
                } else {
                    throw new C24601Bp(exc);
                }
            } else {
                throw ((Throwable) IOException.class.cast(r52.A00));
            }
        }
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(valueOf.length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
