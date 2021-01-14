package X;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1ck  reason: invalid class name and case insensitive filesystem */
public class C31211ck extends AbstractC16790qR {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public C31211ck(WorkDatabase_Impl workDatabase_Impl) {
        this.A00 = workDatabase_Impl;
    }

    @Override // X.AbstractC16790qR
    public C16800qS A00(AbstractC16990qn r35) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C16840qX("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap.put("prerequisite_id", new C16840qX("prerequisite_id", "TEXT", true, 2, null, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C16870qa("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new C16870qa("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        C16880qb r8 = new C16880qb("Dependency", hashMap, hashSet, hashSet2);
        C16880qb A002 = C16880qb.A00(r35, "Dependency");
        if (!r8.equals(A002)) {
            StringBuilder sb = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            sb.append(r8);
            sb.append("\n Found:\n");
            sb.append(A002);
            return new C16800qS(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(24);
        hashMap2.put("id", new C16840qX("id", "TEXT", true, 1, null, 1));
        hashMap2.put("state", new C16840qX("state", "INTEGER", true, 0, null, 1));
        hashMap2.put("worker_class_name", new C16840qX("worker_class_name", "TEXT", true, 0, null, 1));
        hashMap2.put("input_merger_class_name", new C16840qX("input_merger_class_name", "TEXT", false, 0, null, 1));
        hashMap2.put("input", new C16840qX("input", "BLOB", true, 0, null, 1));
        hashMap2.put("output", new C16840qX("output", "BLOB", true, 0, null, 1));
        hashMap2.put("initial_delay", new C16840qX("initial_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("interval_duration", new C16840qX("interval_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("flex_duration", new C16840qX("flex_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_attempt_count", new C16840qX("run_attempt_count", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_policy", new C16840qX("backoff_policy", "INTEGER", true, 0, null, 1));
        hashMap2.put("backoff_delay_duration", new C16840qX("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("period_start_time", new C16840qX("period_start_time", "INTEGER", true, 0, null, 1));
        hashMap2.put("minimum_retention_duration", new C16840qX("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        hashMap2.put("schedule_requested_at", new C16840qX("schedule_requested_at", "INTEGER", true, 0, null, 1));
        hashMap2.put("run_in_foreground", new C16840qX("run_in_foreground", "INTEGER", true, 0, null, 1));
        hashMap2.put("required_network_type", new C16840qX("required_network_type", "INTEGER", false, 0, null, 1));
        hashMap2.put("requires_charging", new C16840qX("requires_charging", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_device_idle", new C16840qX("requires_device_idle", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_battery_not_low", new C16840qX("requires_battery_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("requires_storage_not_low", new C16840qX("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_content_update_delay", new C16840qX("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("trigger_max_content_delay", new C16840qX("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        hashMap2.put("content_uri_triggers", new C16840qX("content_uri_triggers", "BLOB", false, 0, null, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C16870qa("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new C16870qa("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        C16880qb r6 = new C16880qb("WorkSpec", hashMap2, hashSet3, hashSet4);
        C16880qb A003 = C16880qb.A00(r35, "WorkSpec");
        if (!r6.equals(A003)) {
            StringBuilder sb2 = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            sb2.append(r6);
            sb2.append("\n Found:\n");
            sb2.append(A003);
            return new C16800qS(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new C16840qX("tag", "TEXT", true, 1, null, 1));
        hashMap3.put("work_spec_id", new C16840qX("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C16870qa("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        C16880qb r62 = new C16880qb("WorkTag", hashMap3, hashSet5, hashSet6);
        C16880qb A004 = C16880qb.A00(r35, "WorkTag");
        if (!r62.equals(A004)) {
            StringBuilder sb3 = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            sb3.append(r62);
            sb3.append("\n Found:\n");
            sb3.append(A004);
            return new C16800qS(false, sb3.toString());
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new C16840qX("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap4.put("system_id", new C16840qX("system_id", "INTEGER", true, 0, null, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C16880qb r63 = new C16880qb("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        C16880qb A005 = C16880qb.A00(r35, "SystemIdInfo");
        if (!r63.equals(A005)) {
            StringBuilder sb4 = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            sb4.append(r63);
            sb4.append("\n Found:\n");
            sb4.append(A005);
            return new C16800qS(false, sb4.toString());
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C16840qX("name", "TEXT", true, 1, null, 1));
        hashMap5.put("work_spec_id", new C16840qX("work_spec_id", "TEXT", true, 2, null, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C16870qa("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        C16880qb r64 = new C16880qb("WorkName", hashMap5, hashSet8, hashSet9);
        C16880qb A006 = C16880qb.A00(r35, "WorkName");
        if (!r64.equals(A006)) {
            StringBuilder sb5 = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            sb5.append(r64);
            sb5.append("\n Found:\n");
            sb5.append(A006);
            return new C16800qS(false, sb5.toString());
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C16840qX("work_spec_id", "TEXT", true, 1, null, 1));
        hashMap6.put("progress", new C16840qX("progress", "BLOB", true, 0, null, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C16850qY("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        C16880qb r82 = new C16880qb("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        C16880qb A007 = C16880qb.A00(r35, "WorkProgress");
        if (!r82.equals(A007)) {
            StringBuilder sb6 = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            sb6.append(r82);
            sb6.append("\n Found:\n");
            sb6.append(A007);
            return new C16800qS(false, sb6.toString());
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new C16840qX("key", "TEXT", true, 1, null, 1));
        hashMap7.put("long_value", new C16840qX("long_value", "INTEGER", false, 0, null, 1));
        C16880qb r5 = new C16880qb("Preference", hashMap7, new HashSet(0), new HashSet(0));
        C16880qb A008 = C16880qb.A00(r35, "Preference");
        if (r5.equals(A008)) {
            return new C16800qS(true, null);
        }
        StringBuilder sb7 = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
        sb7.append(r5);
        sb7.append("\n Found:\n");
        sb7.append(A008);
        return new C16800qS(false, sb7.toString());
    }
}
