package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.0qj  reason: invalid class name and case insensitive filesystem */
public class CallableC16950qj implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;

    public CallableC16950qj(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl) {
        this.A00 = shortcutInfoCompatSaverImpl;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        ArrayList arrayList = new ArrayList();
        for (C16980qm r0 : this.A00.A04.values()) {
            C14670mg r4 = r0.A00;
            C14670mg r2 = new C14670mg();
            r2.A02 = r4.A02;
            r2.A07 = r4.A07;
            Intent[] intentArr = r4.A0B;
            r2.A0B = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            r2.A01 = r4.A01;
            r2.A05 = r4.A05;
            r2.A06 = r4.A06;
            r2.A04 = r4.A04;
            r2.A03 = r4.A03;
            r2.A09 = r4.A09;
            r2.A0A = r4.A0A;
            r2.A00 = r4.A00;
            C14610mZ[] r1 = r4.A0C;
            if (r1 != null) {
                r2.A0C = (C14610mZ[]) Arrays.copyOf(r1, r1.length);
            }
            Set set = r4.A08;
            if (set != null) {
                r2.A08 = new HashSet(set);
            }
            if (!TextUtils.isEmpty(r2.A05)) {
                Intent[] intentArr2 = r2.A0B;
                if (intentArr2 == null || intentArr2.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                arrayList.add(r2);
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        return arrayList;
    }
}
