package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.19y  reason: invalid class name and case insensitive filesystem */
public final class C243019y extends SQLiteOpenHelper {
    public final /* synthetic */ AnonymousClass26N A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C243019y(AnonymousClass26N r4, Context context) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A00 = r4;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static Set A00(SQLiteDatabase sQLiteDatabase, String str) {
        String[] columnNames;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(str.length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            for (String str2 : rawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    public final boolean A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
            boolean moveToFirst = cursor.moveToFirst();
            cursor.close();
            return moveToFirst;
        } catch (SQLiteException e) {
            this.A00.A0A("Error querying for table", str, e);
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        AnonymousClass26N r4 = this.A00;
        AnonymousClass1AI r3 = r4.A02;
        if (r3.A01(3600000)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                r3.A00();
                r4.A05("Opening the database failed, dropping the table and recreating it");
                ((C242619s) r4).A00.A00.getDatabasePath("google_analytics_v4.db").delete();
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    r3.A00 = 0;
                    return writableDatabase;
                } catch (SQLiteException e) {
                    r4.A09("Failed to open freshly created database", e);
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("Database open failed");
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) >= 9) {
                File file = new File(path);
                file.setReadable(false, false);
                file.setWritable(false, false);
                file.setReadable(true, true);
                file.setWritable(true, true);
            }
        } catch (NumberFormatException unused) {
            String str = "Invalid version number";
            String str2 = Build.VERSION.SDK;
            AnonymousClass26U r0 = AnonymousClass26U.A00;
            if (r0 != null) {
                r0.A09(str, str2);
                return;
            }
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 23);
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
            Log.e((String) AnonymousClass1A5.A0C.A00, str);
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        AbstractCollection abstractCollection;
        AbstractCollection abstractCollection2;
        int i = 0;
        if (!A01(sQLiteDatabase, "hits2")) {
            sQLiteDatabase.execSQL(AnonymousClass26N.A03);
        } else {
            Set A002 = A00(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            int i2 = 0;
            do {
                String str = strArr[i2];
                abstractCollection = (AbstractCollection) A002;
                if (!abstractCollection.remove(str)) {
                    String valueOf = String.valueOf(str);
                    throw new SQLiteException(valueOf.length() != 0 ? "Database hits2 is missing required column: ".concat(valueOf) : new String("Database hits2 is missing required column: "));
                }
                i2++;
            } while (i2 < 4);
            boolean z = !abstractCollection.remove("hit_app_id");
            if (!abstractCollection.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            } else if (z) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        }
        if (!A01(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set A003 = A00(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
        do {
            String str2 = strArr2[i];
            abstractCollection2 = (AbstractCollection) A003;
            if (!abstractCollection2.remove(str2)) {
                String valueOf2 = String.valueOf(str2);
                throw new SQLiteException(valueOf2.length() != 0 ? "Database properties is missing required column: ".concat(valueOf2) : new String("Database properties is missing required column: "));
            }
            i++;
        } while (i < 6);
        if (!abstractCollection2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }
}
