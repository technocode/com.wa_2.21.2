package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.PersistableBundle;
import java.util.Arrays;

/* renamed from: X.0mf  reason: invalid class name and case insensitive filesystem */
public class C14660mf {
    public final C14670mg A00;

    public C14660mf(Context context, ShortcutInfo shortcutInfo) {
        C14610mZ[] r5;
        C14670mg r1 = new C14670mg();
        this.A00 = r1;
        r1.A02 = context;
        r1.A07 = shortcutInfo.getId();
        Intent[] intents = shortcutInfo.getIntents();
        this.A00.A0B = (Intent[]) Arrays.copyOf(intents, intents.length);
        this.A00.A01 = shortcutInfo.getActivity();
        this.A00.A05 = shortcutInfo.getShortLabel();
        this.A00.A06 = shortcutInfo.getLongLabel();
        this.A00.A04 = shortcutInfo.getDisabledMessage();
        this.A00.A08 = shortcutInfo.getCategories();
        C14670mg r7 = this.A00;
        PersistableBundle extras = shortcutInfo.getExtras();
        if (extras == null || !extras.containsKey("extraPersonCount")) {
            r5 = null;
        } else {
            int i = extras.getInt("extraPersonCount");
            r5 = new C14610mZ[i];
            int i2 = 0;
            while (i2 < i) {
                StringBuilder A0S = AnonymousClass008.A0S("extraPerson_");
                int i3 = i2 + 1;
                A0S.append(i3);
                PersistableBundle persistableBundle = extras.getPersistableBundle(A0S.toString());
                C14600mY r12 = new C14600mY();
                r12.A01 = persistableBundle.getString("name");
                r12.A03 = persistableBundle.getString("uri");
                r12.A02 = persistableBundle.getString("key");
                r12.A04 = persistableBundle.getBoolean("isBot");
                r12.A05 = persistableBundle.getBoolean("isImportant");
                r5[i2] = new C14610mZ(r12);
                i2 = i3;
            }
        }
        r7.A0C = r5;
        this.A00.A00 = shortcutInfo.getRank();
    }
}
