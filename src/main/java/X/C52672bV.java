package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.2bV  reason: invalid class name and case insensitive filesystem */
public class C52672bV extends SQLiteOpenHelper implements AnonymousClass08N {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass08J A02 = new AnonymousClass08J();
    public final AnonymousClass04q A03;

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public C52672bV(AnonymousClass00G r4, AnonymousClass04q r5, String str) {
        super(r4.A00, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.A03 = r5;
        setWriteAheadLoggingEnabled(true);
    }

    @Override // X.AnonymousClass08N
    public AnonymousClass08J A7k() {
        return this.A02;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A8g() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A00;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open readable commerce store", e);
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = r0;
            }
            return r0;
        }
        return this.A00;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A9x() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A01;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open writable commerce store", e);
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = r0;
            }
            return r0;
        }
        return this.A01;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_quantity INTEGER)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
    }
}
