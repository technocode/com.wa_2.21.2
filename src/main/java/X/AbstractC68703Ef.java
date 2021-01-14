package X;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3Ef  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC68703Ef {
    public Map A00 = new HashMap();

    public void A00(AbstractC07650Yy r5, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                this.A00.put(str.toUpperCase(Locale.US), r5);
            }
        }
    }
}
