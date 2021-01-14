package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.0qU  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16820qU {
    public final int A00;
    public final int A01;

    public AbstractC16820qU(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public void A00(AbstractC16990qn r15) {
        if (this instanceof C31201cj) {
            SQLiteDatabase sQLiteDatabase = ((C30761bu) r15).A00;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            Context context = ((C31201cj) this).A00;
            SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                    sQLiteDatabase.endTransaction();
                }
            }
        } else if (this instanceof C31191ci) {
            C31191ci r2 = (C31191ci) this;
            if (((AbstractC16820qU) r2).A00 >= 10) {
                ((C30761bu) r15).A00.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            r2.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        } else if (this instanceof C31181ch) {
            ((C30761bu) r15).A00.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        } else if (this instanceof C31171cg) {
            ((C30761bu) r15).A00.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        } else if (this instanceof C31161cf) {
            ((C30761bu) r15).A00.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        } else if (!(this instanceof C31151ce)) {
            SQLiteDatabase sQLiteDatabase2 = ((C30761bu) r15).A00;
            sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            sQLiteDatabase2.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS alarmInfo");
            sQLiteDatabase2.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        } else {
            SQLiteDatabase sQLiteDatabase3 = ((C30761bu) r15).A00;
            sQLiteDatabase3.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            sQLiteDatabase3.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }
}
