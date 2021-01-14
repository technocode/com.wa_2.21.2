package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1dI  reason: invalid class name and case insensitive filesystem */
public final class C31481dI implements AbstractC18040sg {
    public final AbstractC30681bk A00;
    public final AbstractC16780qQ A01;
    public final AbstractC16810qT A02;
    public final AbstractC16810qT A03;
    public final AbstractC16810qT A04;
    public final AbstractC16810qT A05;
    public final AbstractC16810qT A06;
    public final AbstractC16810qT A07;
    public final AbstractC16810qT A08;

    public C31481dI(AbstractC16780qQ r2) {
        this.A01 = r2;
        this.A00 = new C453424i(r2);
        this.A02 = new C31411dB(r2);
        this.A07 = new C31421dC(r2);
        this.A08 = new C31431dD(r2);
        this.A03 = new C31441dE(r2);
        this.A06 = new C31451dF(r2);
        this.A04 = new C31461dG(r2);
        this.A05 = new C31471dH(r2);
    }

    public static void A00(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public AnonymousClass0VU A01(String str) {
        C30721bp A002 = C30721bp.A00("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            A002.A03[1] = 1;
        } else {
            A002.A02(1, str);
        }
        AbstractC16780qQ r0 = this.A01;
        r0.A01();
        AnonymousClass0VU r2 = null;
        Cursor A003 = C16830qW.A00(r0, A002, false);
        try {
            if (A003.moveToFirst()) {
                r2 = AnonymousClass0N2.A0h(A003.getInt(0));
            }
            return r2;
        } finally {
            A003.close();
            A002.A01();
        }
    }

    public C18030sf A02(String str) {
        Throwable th;
        C18030sf r2;
        C30721bp A002 = C30721bp.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            A002.A03[1] = 1;
        } else {
            A002.A02(1, str);
        }
        AbstractC16780qQ r1 = this.A01;
        r1.A01();
        Cursor A003 = C16830qW.A00(r1, A002, false);
        try {
            int A082 = AnonymousClass0N2.A08(A003, "required_network_type");
            int A083 = AnonymousClass0N2.A08(A003, "requires_charging");
            int A084 = AnonymousClass0N2.A08(A003, "requires_device_idle");
            int A085 = AnonymousClass0N2.A08(A003, "requires_battery_not_low");
            int A086 = AnonymousClass0N2.A08(A003, "requires_storage_not_low");
            int A087 = AnonymousClass0N2.A08(A003, "trigger_content_update_delay");
            int A088 = AnonymousClass0N2.A08(A003, "trigger_max_content_delay");
            int A089 = AnonymousClass0N2.A08(A003, "content_uri_triggers");
            int A0810 = AnonymousClass0N2.A08(A003, "id");
            int A0811 = AnonymousClass0N2.A08(A003, "state");
            int A0812 = AnonymousClass0N2.A08(A003, "worker_class_name");
            int A0813 = AnonymousClass0N2.A08(A003, "input_merger_class_name");
            int A0814 = AnonymousClass0N2.A08(A003, "input");
            int A0815 = AnonymousClass0N2.A08(A003, "output");
            try {
                int A0816 = AnonymousClass0N2.A08(A003, "initial_delay");
                int A0817 = AnonymousClass0N2.A08(A003, "interval_duration");
                int A0818 = AnonymousClass0N2.A08(A003, "flex_duration");
                int A0819 = AnonymousClass0N2.A08(A003, "run_attempt_count");
                int A0820 = AnonymousClass0N2.A08(A003, "backoff_policy");
                int A0821 = AnonymousClass0N2.A08(A003, "backoff_delay_duration");
                int A0822 = AnonymousClass0N2.A08(A003, "period_start_time");
                int A0823 = AnonymousClass0N2.A08(A003, "minimum_retention_duration");
                int A0824 = AnonymousClass0N2.A08(A003, "schedule_requested_at");
                int A0825 = AnonymousClass0N2.A08(A003, "run_in_foreground");
                if (A003.moveToFirst()) {
                    String string = A003.getString(A0810);
                    String string2 = A003.getString(A0812);
                    C17530rh r5 = new C17530rh();
                    r5.A03 = AnonymousClass0N2.A0g(A003.getInt(A082));
                    boolean z = false;
                    if (A003.getInt(A083) != 0) {
                        z = true;
                    }
                    r5.A05 = z;
                    boolean z2 = false;
                    if (A003.getInt(A084) != 0) {
                        z2 = true;
                    }
                    r5.A06 = z2;
                    boolean z3 = false;
                    if (A003.getInt(A085) != 0) {
                        z3 = true;
                    }
                    r5.A04 = z3;
                    boolean z4 = false;
                    if (A003.getInt(A086) != 0) {
                        z4 = true;
                    }
                    r5.A07 = z4;
                    r5.A00 = A003.getLong(A087);
                    r5.A01 = A003.getLong(A088);
                    r5.A02 = AnonymousClass0N2.A0f(A003.getBlob(A089));
                    r2 = new C18030sf(string, string2);
                    r2.A0C = AnonymousClass0N2.A0h(A003.getInt(A0811));
                    r2.A0E = A003.getString(A0813);
                    r2.A0A = C17550rj.A00(A003.getBlob(A0814));
                    r2.A0B = C17550rj.A00(A003.getBlob(A0815));
                    r2.A03 = A003.getLong(A0816);
                    r2.A04 = A003.getLong(A0817);
                    r2.A02 = A003.getLong(A0818);
                    r2.A00 = A003.getInt(A0819);
                    r2.A08 = AnonymousClass0N2.A0e(A003.getInt(A0820));
                    r2.A01 = A003.getLong(A0821);
                    r2.A06 = A003.getLong(A0822);
                    r2.A05 = A003.getLong(A0823);
                    r2.A07 = A003.getLong(A0824);
                    boolean z5 = false;
                    if (A003.getInt(A0825) != 0) {
                        z5 = true;
                    }
                    r2.A0G = z5;
                    r2.A09 = r5;
                } else {
                    r2 = null;
                }
                A003.close();
                A002.A01();
                return r2;
            } catch (Throwable th2) {
                th = th2;
                A003.close();
                A002.A01();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A003.close();
            A002.A01();
            throw th;
        }
    }

    public List A03() {
        Throwable th;
        C30721bp A002 = C30721bp.A00("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        AbstractC16780qQ r1 = this.A01;
        r1.A01();
        Cursor A003 = C16830qW.A00(r1, A002, false);
        try {
            int A082 = AnonymousClass0N2.A08(A003, "required_network_type");
            int A083 = AnonymousClass0N2.A08(A003, "requires_charging");
            int A084 = AnonymousClass0N2.A08(A003, "requires_device_idle");
            int A085 = AnonymousClass0N2.A08(A003, "requires_battery_not_low");
            int A086 = AnonymousClass0N2.A08(A003, "requires_storage_not_low");
            int A087 = AnonymousClass0N2.A08(A003, "trigger_content_update_delay");
            int A088 = AnonymousClass0N2.A08(A003, "trigger_max_content_delay");
            int A089 = AnonymousClass0N2.A08(A003, "content_uri_triggers");
            int A0810 = AnonymousClass0N2.A08(A003, "id");
            int A0811 = AnonymousClass0N2.A08(A003, "state");
            int A0812 = AnonymousClass0N2.A08(A003, "worker_class_name");
            int A0813 = AnonymousClass0N2.A08(A003, "input_merger_class_name");
            int A0814 = AnonymousClass0N2.A08(A003, "input");
            int A0815 = AnonymousClass0N2.A08(A003, "output");
            try {
                int A0816 = AnonymousClass0N2.A08(A003, "initial_delay");
                int A0817 = AnonymousClass0N2.A08(A003, "interval_duration");
                int A0818 = AnonymousClass0N2.A08(A003, "flex_duration");
                int A0819 = AnonymousClass0N2.A08(A003, "run_attempt_count");
                int A0820 = AnonymousClass0N2.A08(A003, "backoff_policy");
                int A0821 = AnonymousClass0N2.A08(A003, "backoff_delay_duration");
                int A0822 = AnonymousClass0N2.A08(A003, "period_start_time");
                int A0823 = AnonymousClass0N2.A08(A003, "minimum_retention_duration");
                int A0824 = AnonymousClass0N2.A08(A003, "schedule_requested_at");
                int A0825 = AnonymousClass0N2.A08(A003, "run_in_foreground");
                ArrayList arrayList = new ArrayList(A003.getCount());
                while (A003.moveToNext()) {
                    String string = A003.getString(A0810);
                    String string2 = A003.getString(A0812);
                    C17530rh r3 = new C17530rh();
                    r3.A03 = AnonymousClass0N2.A0g(A003.getInt(A082));
                    boolean z = false;
                    if (A003.getInt(A083) != 0) {
                        z = true;
                    }
                    r3.A05 = z;
                    boolean z2 = false;
                    if (A003.getInt(A084) != 0) {
                        z2 = true;
                    }
                    r3.A06 = z2;
                    boolean z3 = false;
                    if (A003.getInt(A085) != 0) {
                        z3 = true;
                    }
                    r3.A04 = z3;
                    boolean z4 = false;
                    if (A003.getInt(A086) != 0) {
                        z4 = true;
                    }
                    r3.A07 = z4;
                    r3.A00 = A003.getLong(A087);
                    r3.A01 = A003.getLong(A088);
                    r3.A02 = AnonymousClass0N2.A0f(A003.getBlob(A089));
                    C18030sf r2 = new C18030sf(string, string2);
                    r2.A0C = AnonymousClass0N2.A0h(A003.getInt(A0811));
                    r2.A0E = A003.getString(A0813);
                    r2.A0A = C17550rj.A00(A003.getBlob(A0814));
                    r2.A0B = C17550rj.A00(A003.getBlob(A0815));
                    r2.A03 = A003.getLong(A0816);
                    r2.A04 = A003.getLong(A0817);
                    r2.A02 = A003.getLong(A0818);
                    r2.A00 = A003.getInt(A0819);
                    r2.A08 = AnonymousClass0N2.A0e(A003.getInt(A0820));
                    r2.A01 = A003.getLong(A0821);
                    r2.A06 = A003.getLong(A0822);
                    r2.A05 = A003.getLong(A0823);
                    r2.A07 = A003.getLong(A0824);
                    boolean z5 = false;
                    if (A003.getInt(A0825) != 0) {
                        z5 = true;
                    }
                    r2.A0G = z5;
                    r2.A09 = r3;
                    arrayList.add(r2);
                }
                A003.close();
                A002.A01();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                A003.close();
                A002.A01();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A003.close();
            A002.A01();
            throw th;
        }
    }

    public final void A04(AnonymousClass05V r9) {
        ArrayList arrayList;
        int i;
        C06050Rn r3 = (C06050Rn) r9.keySet();
        if (!r3.isEmpty()) {
            if (((AnonymousClass05W) r9).A00 > 999) {
                AnonymousClass05V r6 = new AnonymousClass05V(999);
                int i2 = ((AnonymousClass05W) r9).A00;
                int i3 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i3 < i2) {
                        Object[] objArr = r9.A02;
                        int i4 = i3 << 1;
                        r6.put(objArr[i4], objArr[i4 + 1]);
                        i3++;
                        i++;
                        if (i == 999) {
                            A04(r6);
                            r6 = new AnonymousClass05V(999);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    A04(r6);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = r3.size();
            A00(sb, size);
            sb.append(")");
            C30721bp A002 = C30721bp.A00(sb.toString(), size + 0);
            Iterator it = r3.iterator();
            int i5 = 1;
            while (true) {
                C06070Rp r1 = (C06070Rp) it;
                if (!r1.hasNext()) {
                    break;
                }
                String str = (String) r1.next();
                if (str == null) {
                    A002.A03[i5] = 1;
                } else {
                    A002.A02(i5, str);
                }
                i5++;
            }
            Cursor A003 = C16830qW.A00(this.A01, A002, false);
            try {
                int columnIndex = A003.getColumnIndex("work_spec_id");
                if (columnIndex < 0) {
                    StringBuilder sb2 = new StringBuilder("`");
                    sb2.append("work_spec_id");
                    sb2.append("`");
                    columnIndex = A003.getColumnIndex(sb2.toString());
                    if (columnIndex == -1) {
                        return;
                    }
                }
                while (A003.moveToNext()) {
                    if (!A003.isNull(columnIndex) && (arrayList = (ArrayList) r9.get(A003.getString(columnIndex))) != null) {
                        arrayList.add(C17550rj.A00(A003.getBlob(0)));
                    }
                }
                A003.close();
            } finally {
                A003.close();
            }
        }
    }

    public final void A05(AnonymousClass05V r9) {
        ArrayList arrayList;
        int i;
        C06050Rn r3 = (C06050Rn) r9.keySet();
        if (!r3.isEmpty()) {
            if (((AnonymousClass05W) r9).A00 > 999) {
                AnonymousClass05V r6 = new AnonymousClass05V(999);
                int i2 = ((AnonymousClass05W) r9).A00;
                int i3 = 0;
                loop0:
                while (true) {
                    i = 0;
                    while (i3 < i2) {
                        Object[] objArr = r9.A02;
                        int i4 = i3 << 1;
                        r6.put(objArr[i4], objArr[i4 + 1]);
                        i3++;
                        i++;
                        if (i == 999) {
                            A05(r6);
                            r6 = new AnonymousClass05V(999);
                        }
                    }
                    break loop0;
                }
                if (i > 0) {
                    A05(r6);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = r3.size();
            A00(sb, size);
            sb.append(")");
            C30721bp A002 = C30721bp.A00(sb.toString(), size + 0);
            Iterator it = r3.iterator();
            int i5 = 1;
            while (true) {
                C06070Rp r1 = (C06070Rp) it;
                if (!r1.hasNext()) {
                    break;
                }
                String str = (String) r1.next();
                if (str == null) {
                    A002.A03[i5] = 1;
                } else {
                    A002.A02(i5, str);
                }
                i5++;
            }
            Cursor A003 = C16830qW.A00(this.A01, A002, false);
            try {
                int columnIndex = A003.getColumnIndex("work_spec_id");
                if (columnIndex < 0) {
                    StringBuilder sb2 = new StringBuilder("`");
                    sb2.append("work_spec_id");
                    sb2.append("`");
                    columnIndex = A003.getColumnIndex(sb2.toString());
                    if (columnIndex == -1) {
                        return;
                    }
                }
                while (A003.moveToNext()) {
                    if (!A003.isNull(columnIndex) && (arrayList = (ArrayList) r9.get(A003.getString(columnIndex))) != null) {
                        arrayList.add(A003.getString(0));
                    }
                }
                A003.close();
            } finally {
                A003.close();
            }
        }
    }

    public void A06(AnonymousClass0VU r7, String... strArr) {
        AbstractC16780qQ r4 = this.A01;
        r4.A01();
        StringBuilder sb = new StringBuilder("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        A00(sb, length);
        sb.append(")");
        String obj = sb.toString();
        r4.A00();
        r4.A01();
        SQLiteStatement compileStatement = ((C30761bu) r4.A00.A9w()).A00.compileStatement(obj);
        compileStatement.bindLong(1, (long) AnonymousClass0N2.A0F(r7));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        r4.A02();
        try {
            compileStatement.executeUpdateDelete();
            r4.A04();
        } finally {
            r4.A03();
        }
    }

    public void A07(String str, long j) {
        AbstractC16780qQ r5 = this.A01;
        r5.A01();
        AbstractC16810qT r4 = this.A04;
        AbstractC30751bt A002 = r4.A00();
        SQLiteProgram sQLiteProgram = ((C30791bx) A002).A00;
        sQLiteProgram.bindLong(1, j);
        if (str == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, str);
        }
        r5.A02();
        try {
            ((AnonymousClass248) A002).A00.executeUpdateDelete();
            r5.A04();
        } finally {
            r5.A03();
            if (A002 == r4.A02) {
                r4.A01.set(false);
            }
        }
    }

    public void A08(String str, long j) {
        AbstractC16780qQ r5 = this.A01;
        r5.A01();
        AbstractC16810qT r4 = this.A08;
        AbstractC30751bt A002 = r4.A00();
        SQLiteProgram sQLiteProgram = ((C30791bx) A002).A00;
        sQLiteProgram.bindLong(1, j);
        if (str == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, str);
        }
        r5.A02();
        try {
            ((AnonymousClass248) A002).A00.executeUpdateDelete();
            r5.A04();
        } finally {
            r5.A03();
            if (A002 == r4.A02) {
                r4.A01.set(false);
            }
        }
    }

    public void A09(String str, C17550rj r9) {
        SQLiteProgram sQLiteProgram;
        AbstractC16780qQ r6 = this.A01;
        r6.A01();
        AbstractC16810qT r5 = this.A07;
        AbstractC30751bt A002 = r5.A00();
        byte[] A012 = C17550rj.A01(r9);
        if (A012 == null) {
            sQLiteProgram = ((C30791bx) A002).A00;
            sQLiteProgram.bindNull(1);
        } else {
            sQLiteProgram = ((C30791bx) A002).A00;
            sQLiteProgram.bindBlob(1, A012);
        }
        if (str == null) {
            sQLiteProgram.bindNull(2);
        } else {
            sQLiteProgram.bindString(2, str);
        }
        r6.A02();
        AnonymousClass248 r1 = (AnonymousClass248) A002;
        try {
            r1.A00.executeUpdateDelete();
            r6.A04();
            r6.A03();
            if (r1 == r5.A02) {
                r5.A01.set(false);
            }
        } catch (Throwable th) {
            r6.A03();
            r5.A02(A002);
            throw th;
        }
    }
}
