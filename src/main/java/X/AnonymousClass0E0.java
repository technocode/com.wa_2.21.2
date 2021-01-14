package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0E0  reason: invalid class name */
public class AnonymousClass0E0 extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final Context A02;
    public final AnonymousClass04q A03;

    public AnonymousClass0E0(Context context, AnonymousClass04q r5) {
        super(context, "location.db", (SQLiteDatabase.CursorFactory) null, 2);
        setWriteAheadLoggingEnabled(true);
        this.A02 = context;
        this.A03 = r5;
    }

    public synchronized AnonymousClass0BK A00() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            try {
                AnonymousClass0BK A0D = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = A0D;
                return A0D;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is corrupt. Removing...", e);
                A02();
                AnonymousClass0BK A0D2 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                this.A00 = A0D2;
                return A0D2;
            } catch (SQLiteException e2) {
                String obj = e2.toString();
                if (obj.contains("file is encrypted")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is encrypted. Removing...", e2);
                    A02();
                    AnonymousClass0BK A0D3 = C001801b.A0D(super.getReadableDatabase(), this.A03);
                    this.A00 = A0D3;
                    return A0D3;
                } else if (obj.contains("upgrade read-only database")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Client actually opened database as read-only and can't upgrade. Switching to writable...", e2);
                    AnonymousClass0BK A012 = A01();
                    this.A00 = A012;
                    return A012;
                } else {
                    throw e2;
                }
            } catch (StackOverflowError e3) {
                Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/StackOverflowError during db init check");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("LocationSharingStore/DatabaseHelper/getReadableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                        A02();
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

    public synchronized AnonymousClass0BK A01() {
        AnonymousClass0BK r0 = this.A01;
        if (r0 == null || !r0.A00.isOpen()) {
            try {
                AnonymousClass0BK A0D = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = A0D;
                return A0D;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is corrupt. Removing...", e);
                A02();
                AnonymousClass0BK A0D2 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                this.A01 = A0D2;
                return A0D2;
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is encrypted. Removing...", e2);
                    A02();
                    AnonymousClass0BK A0D3 = C001801b.A0D(super.getWritableDatabase(), this.A03);
                    this.A01 = A0D3;
                    return A0D3;
                }
                throw e2;
            } catch (StackOverflowError e3) {
                Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/StackOverflowError during db init check");
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("LocationSharingStore/DatabaseHelper/getWritableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                        A02();
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

    public void A02() {
        synchronized (this) {
            close();
            Log.i("LocationSharingStore/DatabaseHelper/deleteDatabaseFiles");
            File databasePath = this.A02.getDatabasePath("location.db");
            boolean delete = databasePath.delete();
            StringBuilder sb = new StringBuilder();
            sb.append("LocationSharingStore/DatabaseHelper/deleteDatabaseFiles/deleted location database; databaseDeleted=");
            sb.append(delete);
            Log.i(sb.toString());
            C001801b.A1p(databasePath, "LocationSharingStore/DatabaseHelper");
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A00().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A01().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("LocationSharingStore/DatabaseHelper/onCreate; version=2");
        Log.i("LocationSharingStore/DatabaseHelper/createLocationSharerTable/creating location_sharer table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_sharer");
        sQLiteDatabase.execSQL("CREATE TABLE location_sharer (_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_jid TEXT NOT NULL, from_me BOOLEAN NOT NULL, remote_resource TEXT NOT NULL, expires INTEGER NOT NULL, message_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        Log.i("LocationSharingStore/DatabaseHelper/createLocationKeyDistributionTable/creating location_key_distribution table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_key_distribution");
        sQLiteDatabase.execSQL("CREATE TABLE location_key_distribution (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, sent_to_server BOOLEAN NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_key_distribution_index ON location_key_distribution(jid)");
        Log.i("LocationSharingStore/DatabaseHelper/createUserLocationsTable/creating location_cache table; version=2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_cache");
        sQLiteDatabase.execSQL("CREATE TABLE location_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, accuracy INTEGER NOT NULL, speed REAL NOT NULL, bearing INTEGER NOT NULL, location_ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_location_index ON location_cache(jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder("LocationSharingStore/DatabaseHelper/onDowngrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("LocationSharingStore/DatabaseHelper/onUpgrade; oldVersion=", i, "; newVersion=", i2);
        if (i2 != 2) {
            throw new SQLiteException(AnonymousClass008.A0H("LocationSharingStore/DatabaseHelper/Unknown upgrade destination version: ", i, " -> ", i2));
        } else if (i != 1) {
            Log.i("LocationSharingStore/DatabaseHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS location_sharer_index");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        }
    }
}
