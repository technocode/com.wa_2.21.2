package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.2nS  reason: invalid class name and case insensitive filesystem */
public class C59322nS extends AbstractC30331b9 {
    public Cursor A00;
    public C04080Iy A01;
    public final AnonymousClass0CG A02 = AnonymousClass0CG.A00();
    public final AnonymousClass02N A03;
    public final String A04;

    public C59322nS(Context context, String str, AnonymousClass02N r4) {
        super(context);
        this.A04 = str;
        this.A03 = r4;
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
