package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2ou  reason: invalid class name and case insensitive filesystem */
public class C60162ou extends AbstractC56622iv {
    public C60162ou(AnonymousClass088 r1, C02590Cr r2, AnonymousClass2T4 r3, String str, Context context) {
        super(r1, r2, r3, str, context);
    }

    public void run() {
        File A0K = C02230Bd.A0K(this.A01, this.A04);
        if (A0K.exists() && !A0K.delete()) {
            Log.w("MediaDeleteDoodleJob/failed-delete-doodle-file");
        }
    }
}
