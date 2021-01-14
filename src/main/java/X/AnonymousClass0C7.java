package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0C7  reason: invalid class name */
public class AnonymousClass0C7 extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final Context A02;
    public final AnonymousClass04q A03;

    public AnonymousClass0C7(Context context, AnonymousClass04q r5) {
        super(context, "web_sessions.db", (SQLiteDatabase.CursorFactory) null, 7);
        this.A02 = context;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C7.A00(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void");
    }

    public synchronized AnonymousClass0BK A01() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            try {
                AnonymousClass0BK A0D = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = A0D;
                return A0D;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("websessionstore/corrupt/removing", e);
                A03();
                AnonymousClass0BK A0D2 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = A0D2;
                return A0D2;
            } catch (SQLiteException e2) {
                String obj = e2.toString();
                if (obj.contains("file is encrypted")) {
                    Log.w("websessionstore/encrypted/removing");
                    A03();
                    AnonymousClass0BK A0D3 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                    this.A00 = A0D3;
                    return A0D3;
                } else if (obj.contains("upgrade read-only database")) {
                    Log.w("websessionstore/switching-to-writable");
                    AnonymousClass0BK A022 = A02();
                    this.A00 = A022;
                    return A022;
                } else {
                    throw e2;
                }
            } catch (StackOverflowError e3) {
                Log.w("websessionstore/stackoverflowerror");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("websessionstore/stackoverflowerror/corrupt/removing");
                        A03();
                        AnonymousClass0BK A0D4 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                        this.A00 = A0D4;
                        return A0D4;
                    }
                }
                throw e3;
            }
        } else {
            return this.A00;
        }
    }

    public synchronized AnonymousClass0BK A02() {
        AnonymousClass0BK r0 = this.A01;
        if (r0 == null || !r0.A00.isOpen()) {
            try {
                AnonymousClass0BK A0D = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = A0D;
                return A0D;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("websessionstore/corrupt/removing", e);
                A03();
                AnonymousClass0BK A0D2 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = A0D2;
                return A0D2;
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("websessionstore/encrypted/removing", e2);
                    A03();
                    AnonymousClass0BK A0D3 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                    this.A01 = A0D3;
                    return A0D3;
                }
                throw e2;
            } catch (StackOverflowError e3) {
                Log.w("websessionstore/stackoverflowerror");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("websessionstore/stackoverflowerror/corrupt/removing");
                        A03();
                        AnonymousClass0BK A0D4 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                        this.A01 = A0D4;
                        return A0D4;
                    }
                }
                throw e3;
            }
        } else {
            return this.A01;
        }
    }

    public synchronized void A03() {
        close();
        Log.i("websessionstore/delete-database");
        File databasePath = this.A02.getDatabasePath("web_sessions.db");
        boolean delete = databasePath.delete();
        C001801b.A1p(databasePath, "websessionstore");
        StringBuilder sb = new StringBuilder();
        sb.append("websessionstore/delete-database/result=");
        sb.append(delete);
        Log.i(sb.toString());
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A01().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A02().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sessions");
        sQLiteDatabase.execSQL("CREATE TABLE sessions (_id INTEGER PRIMARY KEY AUTOINCREMENT,browser_id TEXT,secret TEXT,token TEXT,os TEXT,browser_type TEXT,login_time INTEGER,lat REAL,lon REAL,accuracy REAL,place_name TEXT,last_active INTEGER,timeout BOOLEAN,expiration INTEGER,last_push_sent INTEGER,syncd_release INTEGER);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS browser_id_index ON sessions(browser_id);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("websessionstore/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            int r1 = r4.getVersion()
            r0 = 3
            if (r1 != r0) goto L_0x0054
            r1 = 0
            java.lang.String r0 = "select sql from sqlite_master where type='table' and name='sessions'"
            android.database.Cursor r2 = r4.rawQuery(r0, r1)
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0051
            r0 = 0
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "fserviceBOOLEAN"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0051
            r4.beginTransaction()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "DROP INDEX IF EXISTS browser_id_index"
            r4.execSQL(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "ALTER TABLE sessions RENAME TO sessions_old"
            r4.execSQL(r0)     // Catch:{ all -> 0x0043 }
            r3.onCreate(r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "INSERT INTO sessions (_id, browser_id, secret, token, os, browser_type, lat, lon, accuracy, place_name, last_active, timeout, expiration) SELECT _id, browser_id, secret, token, os, browser_type, lat, lon, accuracy, place_name, last_active, timeout, expiration FROM sessions_old"
            r4.execSQL(r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "DROP TABLE IF EXISTS sessions_old"
            r4.execSQL(r0)     // Catch:{ all -> 0x0043 }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x0043 }
            r4.endTransaction()
            goto L_0x0051
        L_0x0043:
            r0 = move-exception
            r4.endTransaction()
            throw r0
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0050
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        L_0x0051:
            r2.close()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C7.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("websessionstore/upgrade from ", i, " to ", i2);
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD timeout BOOLEAN");
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD expiration INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD fservice BOOLEAN");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE sessions ADD last_push_sent INTEGER");
            case 4:
            case 5:
                A00(sQLiteDatabase, "login_time", "INTEGER");
                break;
            case 6:
                break;
            default:
                Log.e("websessionstore/upgrade unknown old version");
                onCreate(sQLiteDatabase);
                return;
        }
        A00(sQLiteDatabase, "syncd_release", "INTEGER DEFAULT 0");
    }
}
