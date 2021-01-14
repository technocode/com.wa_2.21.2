package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.2mw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC59032mw extends AbstractC51572Zg {
    public abstract void A0j(ArrayList arrayList, boolean z);

    public abstract int getMaxAlbumSize();

    @Override // X.AbstractC51572Zg
    public abstract int getMessageCount();

    public abstract int getMinAlbumSize();

    public AbstractC59032mw(Context context, AnonymousClass0M3 r2) {
        super(context, r2);
    }

    public static int A04(AbstractC007503q r3) {
        byte b = r3.A0m;
        if (b == 1 || b == 3) {
            if (TextUtils.isEmpty(((AnonymousClass0M3) r3).A0v())) {
                return 1;
            }
            return -1;
        } else if (b == 20) {
            return 2;
        } else {
            return -1;
        }
    }
}
