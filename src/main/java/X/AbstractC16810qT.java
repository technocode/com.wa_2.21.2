package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0qT  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16810qT {
    public final AbstractC16780qQ A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public volatile AbstractC30751bt A02;

    public AbstractC16810qT(AbstractC16780qQ r3) {
        this.A00 = r3;
    }

    public AbstractC30751bt A00() {
        AbstractC16780qQ r3 = this.A00;
        r3.A00();
        if (this.A01.compareAndSet(false, true)) {
            if (this.A02 == null) {
                String A012 = A01();
                r3.A00();
                r3.A01();
                this.A02 = new AnonymousClass248(((C30761bu) r3.A00.A9w()).A00.compileStatement(A012));
            }
            return this.A02;
        }
        String A013 = A01();
        r3.A00();
        r3.A01();
        return new AnonymousClass248(((C30761bu) r3.A00.A9w()).A00.compileStatement(A013));
    }

    public String A01() {
        if (this instanceof C31471dH) {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
        if (this instanceof C31461dG) {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
        if (this instanceof C31451dF) {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
        if (this instanceof C31441dE) {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
        if (this instanceof C31431dD) {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
        if (this instanceof C31421dC) {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
        if (this instanceof C31411dB) {
            return "DELETE FROM workspec WHERE id=?";
        }
        if (this instanceof AnonymousClass1d8) {
            return "DELETE FROM WorkProgress";
        }
        if (this instanceof C31381d7) {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
        if (this instanceof C31351d4) {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
        if (this instanceof C453524j) {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
        if (this instanceof C453424i) {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        if (this instanceof C453324h) {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
        if (!(this instanceof C453224g)) {
            return !(this instanceof C453124f) ? "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)" : "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    public void A02(AbstractC30751bt r3) {
        if (r3 == this.A02) {
            this.A01.set(false);
        }
    }
}
