package X;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;

/* renamed from: X.27H  reason: invalid class name */
public class AnonymousClass27H extends AbstractC30331b9 {
    public static final String[] A04 = {"_id", "artist", "title", "_data", "_display_name", "duration", "_size"};
    public Cursor A00;
    public CancellationSignal A01;
    public final ContentResolver A02;
    public final ArrayList A03;

    public AnonymousClass27H(Context context, ArrayList arrayList, ContentResolver contentResolver) {
        super(context);
        this.A02 = contentResolver;
        if (arrayList == null) {
            this.A03 = new ArrayList();
        } else {
            this.A03 = arrayList;
        }
    }

    /* renamed from: A09 */
    public void A03(Cursor cursor) {
        if (!this.A05) {
            Cursor cursor2 = this.A00;
            this.A00 = cursor;
            if (this.A06) {
                super.A03(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }
}
