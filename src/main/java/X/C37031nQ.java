package X;

import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.1nQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C37031nQ implements AbstractC24581Bn {
    public final FirebaseInstanceId A00;
    public final String A01;
    public final String A02;

    public C37031nQ(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.A00 = firebaseInstanceId;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC24581Bn
    public final Object AQY(AbstractC011406u r13) {
        FirebaseInstanceId firebaseInstanceId = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        String A012 = FirebaseInstanceId.A01();
        AnonymousClass07o A002 = FirebaseInstanceId.A00(str, str2);
        if (!firebaseInstanceId.A0B(A002)) {
            C37061nT r0 = new C37061nT(A002.A01);
            C011506v r5 = new C011506v();
            r5.A08(r0);
            return r5;
        }
        C013207n r6 = firebaseInstanceId.A05;
        synchronized (r6) {
            Pair pair = new Pair(str, str2);
            Map map = r6.A00;
            AbstractC011406u r52 = (AbstractC011406u) map.get(pair);
            if (r52 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                    sb.append("Joining ongoing request for: ");
                    sb.append(valueOf);
                    Log.d("FirebaseInstanceId", sb.toString());
                }
                return r52;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf2 = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
                sb2.append("Making new request for: ");
                sb2.append(valueOf2);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            C012407e r1 = firebaseInstanceId.A00;
            AbstractC011406u A013 = r1.A01(r1.A02(A012, str, str2, new Bundle()));
            Executor executor = firebaseInstanceId.A07;
            AnonymousClass1Eu r2 = new AnonymousClass1Eu(firebaseInstanceId, str, str2, A012);
            C011506v r53 = (C011506v) A013;
            if (r53 != null) {
                C011506v r4 = new C011506v();
                r53.A03.A01(new C36241lo(executor, r2, r4));
                r53.A06();
                Executor executor2 = r6.A01;
                C37021nP r22 = new C37021nP(r6, pair);
                C011506v r54 = new C011506v();
                r4.A03.A01(new C36191lj(executor2, r22, r54));
                r4.A06();
                map.put(pair, r54);
                return r54;
            }
            throw null;
        }
    }
}
