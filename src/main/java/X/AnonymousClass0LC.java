package X;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.ContactsContract;
import com.whatsapp.util.Log;

/* renamed from: X.0LC  reason: invalid class name */
public class AnonymousClass0LC {
    public static volatile AnonymousClass0LC A03;
    public final ContentObserver A00;
    public final AnonymousClass03S A01;
    public volatile boolean A02;

    public AnonymousClass0LC(AnonymousClass01I r2, AnonymousClass0HN r3, AnonymousClass03S r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass0LD(r2, r3);
    }

    public static AnonymousClass0LC A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0LC.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0LC(AnonymousClass01I.A00(), AnonymousClass0HN.A00(), AnonymousClass03S.A00());
                }
            }
        }
        return A03;
    }

    public void A01(Context context) {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02 && this.A01.A03()) {
                    Log.i("androidcontactscontentobserver/registered");
                    this.A02 = true;
                    context.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, this.A00);
                }
            }
        }
    }
}
