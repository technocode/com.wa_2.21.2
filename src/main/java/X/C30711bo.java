package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1bo  reason: invalid class name and case insensitive filesystem */
public class C30711bo extends AbstractC17000qo {
    public C16680qC A00;
    public final AbstractC16790qR A01;
    public final String A02 = "cf029002fffdcadf079e8d0a1c9a70ac";
    public final String A03 = "8aff2efc47fafe870c738f727dfcfc6e";

    public C30711bo(C16680qC r4, AbstractC16790qR r5) {
        super(r5.A00);
        this.A00 = r4;
        this.A01 = r5;
    }

    public final void A02(AbstractC16990qn r5) {
        SQLiteDatabase sQLiteDatabase = ((C30761bu) r5).A00;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        sQLiteDatabase.execSQL(AnonymousClass008.A0L("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.A02, "')"));
    }
}
