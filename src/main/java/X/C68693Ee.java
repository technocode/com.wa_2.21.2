package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3Ee  reason: invalid class name and case insensitive filesystem */
public class C68693Ee implements AnonymousClass1X1 {
    public final String A00;
    public final List A01 = new ArrayList();

    public C68693Ee(String str) {
        AnonymousClass00E.A03(str);
        this.A00 = str;
    }

    @Override // X.AnonymousClass1X1
    public boolean A48(String str) {
        return this.A00.equalsIgnoreCase(str);
    }

    @Override // X.AnonymousClass1X1
    public void A4F(C61642tV r7) {
        for (AbstractC68703Ef r4 : this.A01) {
            for (Map.Entry entry : r4.A00.entrySet()) {
                if (!((AbstractC07650Yy) r4.A00.get(entry.getKey())).ABh(r7)) {
                    r4.A00.remove(entry);
                }
            }
        }
    }

    @Override // X.AnonymousClass1X1
    public AbstractC07650Yy A8I(String str) {
        AbstractC07650Yy r0;
        if (str == null || str.equals(C05880Qw.A02.A5e())) {
            for (AbstractC68703Ef r02 : this.A01) {
                Iterator it = new ArrayList(r02.A00.values()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        AbstractC07650Yy r1 = (AbstractC07650Yy) it.next();
                        if (r1.AAx()) {
                            return r1;
                        }
                    }
                }
            }
            return null;
        }
        for (AbstractC68703Ef r2 : this.A01) {
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase(Locale.US);
                if (r2.A00.containsKey(upperCase) && (r0 = (AbstractC07650Yy) r2.A00.get(upperCase)) != null) {
                    return r0;
                }
            }
        }
        return null;
    }
}
