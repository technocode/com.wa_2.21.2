package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.08w  reason: invalid class name and case insensitive filesystem */
public class C016408w extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public final Context A01;
    public final AnonymousClass04q A02;

    public C016408w(Context context, AnonymousClass04q r5) {
        super(context, "companion_devices.db", (SQLiteDatabase.CursorFactory) null, 9);
        this.A01 = context;
        this.A02 = r5;
    }

    public synchronized AnonymousClass0BK A00() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            this.A00 = C001801b.A0D(super.getWritableDatabase(), this.A02);
        }
        return this.A00;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A00().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A00().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AnonymousClass008.A0c(sQLiteDatabase, "DROP TABLE IF EXISTS devices", "CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER,adv_key_index INTEGER,full_sync_required INTEGER,place_name TEXT);", "CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);", "DROP TABLE IF EXISTS devices_history");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("CompanionDeviceDbHelper/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("CompanionDeviceDbHelper/upgrade from ", i, " to ", i2);
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD platform_type INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD login_time INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD place_name TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
                break;
            case 7:
            case 8:
                break;
            default:
                Log.e("CompanionDeviceDbHelper/upgrade unknown old version");
                onCreate(sQLiteDatabase);
                return;
        }
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS devices_history");
    }
}
