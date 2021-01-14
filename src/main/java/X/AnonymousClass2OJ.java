package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.2OJ  reason: invalid class name */
public class AnonymousClass2OJ {
    public final List A00;

    public AnonymousClass2OJ() {
        try {
            this.A00 = Collections.unmodifiableList(Arrays.asList(new AnonymousClass2OO("offline_aa", Arrays.asList(new AnonymousClass2ON[0]), new C53562dT("platform", "android")), new AnonymousClass2OO("connect_with_friends_permission_universe", Arrays.asList(new AnonymousClass2ON[0]), new C53572dU(0, new C53572dU(1, new C53562dT("platform", "smba"), new C53562dT("platform", "android")), new C53562dT("release_channel", "beta")))));
        } catch (JSONException e) {
            StringBuilder A0S = AnonymousClass008.A0S("ABConfig/invalid json format for ab property from code gen:");
            A0S.append(e.toString());
            Log.w(A0S.toString());
            StringBuilder A0S2 = AnonymousClass008.A0S("ABConfig/invalid json format for ab property from code gen:");
            A0S2.append(e.toString());
            throw new RuntimeException(A0S2.toString());
        }
    }
}
