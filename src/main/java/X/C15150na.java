package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.0na  reason: invalid class name and case insensitive filesystem */
public class C15150na extends ContentObserver {
    public final /* synthetic */ AbstractC30161ar A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15150na(AbstractC30161ar r2) {
        super(new Handler());
        this.A00 = r2;
    }

    public void onChange(boolean z) {
        Cursor cursor;
        AbstractC30161ar r1 = this.A00;
        if (r1.A06 && (cursor = r1.A02) != null && !cursor.isClosed()) {
            r1.A07 = r1.A02.requery();
        }
    }
}
