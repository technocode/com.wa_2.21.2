package X;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: X.2Oa  reason: invalid class name and case insensitive filesystem */
public class C48852Oa extends ContentObserver {
    public final /* synthetic */ C59562nv A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48852Oa(C59562nv r1, Handler handler) {
        super(handler);
        this.A00 = r1;
    }

    public void onChange(boolean z) {
        int count;
        AnonymousClass008.A1H("documentsgalleryfragment/onchange ", z);
        C59562nv r1 = this.A00;
        Cursor cursor = ((AbstractC39901sI) r1).A01;
        if (cursor == null) {
            count = 0;
        } else {
            count = cursor.getCount();
        }
        r1.A00 = count;
        ((AbstractC16300pa) r1).A01.A00();
    }
}
