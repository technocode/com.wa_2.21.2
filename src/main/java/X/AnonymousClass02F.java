package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.02F  reason: invalid class name */
public class AnonymousClass02F {
    public final File A00;
    public final File A01;
    public final Object A02 = new Object();

    public AnonymousClass02F(File file) {
        this.A01 = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.A00 = new File(sb.toString());
    }

    public final void A00() {
        File file = this.A01;
        if (file.exists() && !file.delete()) {
            StringBuilder A0S = AnonymousClass008.A0S("DefaultSharedPreferencesStorage/Couldn't clean up partially-written file ");
            A0S.append(file);
            Log.e(A0S.toString());
        }
    }
}
