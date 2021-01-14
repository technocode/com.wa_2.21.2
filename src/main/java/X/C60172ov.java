package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.2ov  reason: invalid class name and case insensitive filesystem */
public class C60172ov extends AbstractC56622iv {
    public final C000300f A00;
    public final AnonymousClass01X A01;
    public final C002701k A02 = C002701k.A00();
    public final AbstractC49942Su A03;
    public final AnonymousClass0D1 A04;

    public C60172ov(AnonymousClass088 r8, C02590Cr r9, C000300f r10, AnonymousClass2T4 r11, AnonymousClass01X r12, AnonymousClass0D1 r13, String str, Context context, AbstractC49942Su r16) {
        super(r8, r9, r11, str, context);
        this.A01 = r12;
        this.A03 = r16;
        this.A00 = r10;
        this.A04 = r13;
    }

    public void run() {
        File A0K = C02230Bd.A0K(super.A01, super.A04);
        AnonymousClass2Mt r2 = null;
        if (A0K.exists()) {
            try {
                AnonymousClass2Mt r3 = new AnonymousClass2Mt();
                r3.A07(A0K, super.A00, super.A02, this.A00, this.A02, this.A01, this.A04);
                r2 = r3;
            } catch (IOException | JSONException e) {
                Log.e("MediaLoadDoodleJob/failed-to-load-doodle/", e);
            }
        }
        this.A03.AH9(r2);
    }
}
