package X;

import android.content.Intent;
import android.os.ConditionVariable;
import android.os.Environment;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0HQ  reason: invalid class name */
public class AnonymousClass0HQ {
    public static volatile AnonymousClass0HQ A0d;
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03 = false;
    public boolean A04 = false;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = true;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public final ConditionVariable A0D = new ConditionVariable(false);
    public final ConditionVariable A0E = new ConditionVariable(false);
    public final ConditionVariable A0F = new ConditionVariable(false);
    public final ConditionVariable A0G = new ConditionVariable(false);
    public final ConditionVariable A0H = new ConditionVariable(false);
    public final ConditionVariable A0I = new ConditionVariable(false);
    public final ConditionVariable A0J = new ConditionVariable(false);
    public final AnonymousClass0AV A0K;
    public final AnonymousClass03B A0L;
    public final C000300f A0M;
    public final AbstractC03860Ib A0N = new C03850Ia(this);
    public final AnonymousClass04j A0O;
    public final AnonymousClass03P A0P;
    public final AnonymousClass00G A0Q;
    public final AnonymousClass00D A0R;
    public final C014508d A0S;
    public final AnonymousClass022 A0T;
    public final C03200Fe A0U;
    public final C014708f A0V;
    public final AnonymousClass0IZ A0W;
    public final AnonymousClass00T A0X;
    public final AtomicBoolean A0Y = new AtomicBoolean(false);
    public final AtomicBoolean A0Z = new AtomicBoolean(false);
    public final AtomicBoolean A0a = new AtomicBoolean(false);
    public final AtomicBoolean A0b = new AtomicBoolean(false);
    public final AtomicBoolean A0c = new AtomicBoolean(false);

    public AnonymousClass0HQ(AnonymousClass00G r3, AnonymousClass00T r4, AnonymousClass03B r5, C000300f r6, C03200Fe r7, AnonymousClass0IZ r8, AnonymousClass03P r9, C014508d r10, AnonymousClass04j r11, AnonymousClass00D r12, AnonymousClass0AV r13, C014708f r14, AnonymousClass022 r15, C003301q r16) {
        this.A0Q = r3;
        if (r4 != null) {
            this.A0X = r4;
            if (r5 != null) {
                this.A0L = r5;
                if (r6 != null) {
                    this.A0M = r6;
                    if (r7 != null) {
                        this.A0U = r7;
                        if (r8 != null) {
                            this.A0W = r8;
                            if (r9 != null) {
                                this.A0P = r9;
                                if (r10 != null) {
                                    this.A0S = r10;
                                    if (r11 != null) {
                                        this.A0O = r11;
                                        if (r12 != null) {
                                            this.A0R = r12;
                                            if (r13 != null) {
                                                this.A0K = r13;
                                                if (r14 != null) {
                                                    this.A0V = r14;
                                                    if (r15 != null) {
                                                        this.A0T = r15;
                                                        r16.A01(new C03870Ic(this));
                                                        r13.A01(new C03880Id(this));
                                                        r4.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 3));
                                                        return;
                                                    }
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass0HQ A00() {
        if (A0d == null) {
            synchronized (AnonymousClass0HQ.class) {
                if (A0d == null) {
                    A0d = new AnonymousClass0HQ(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass03B.A00(), C000300f.A00(), C03200Fe.A00(), AnonymousClass0IZ.A01(), AnonymousClass03P.A00(), C014508d.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00(), AnonymousClass0AV.A00(), C014708f.A00(), AnonymousClass022.A00(), C003301q.A02);
                }
            }
        }
        return A0d;
    }

    public void A01() {
        AnonymousClass00E.A00();
        AnonymousClass00D r4 = this.A0R;
        if (AnonymousClass0JJ.A0J(r4)) {
            AtomicBoolean atomicBoolean = this.A0Z;
            if (!atomicBoolean.get()) {
                A05(Environment.getExternalStorageState());
                A02();
                A03();
                if (!this.A0B || !this.A06 || !this.A0C) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-conditions-manager/trigger-nothing media-restore-pending: ");
                    A0S2.append(AnonymousClass0JJ.A0J(r4));
                    A0S2.append(" media-restore-running: ");
                    A0S2.append(atomicBoolean.get());
                    A0S2.append(" network_available_for_media_restore: ");
                    A0S2.append(this.A0B);
                    A0S2.append(" battery_available_for_media_restore: ");
                    A0S2.append(this.A06);
                    A0S2.append(" sdcard_available: ");
                    AnonymousClass008.A1a(A0S2, this.A0C);
                    return;
                }
                AnonymousClass0JJ.A0G(this.A0Q.A00, new Intent("action_restore_media"));
                Log.i("gdrive-conditions-manager/trigger-pending-media-restore");
                return;
            }
        }
        if (AnonymousClass0JJ.A0I(r4)) {
            AtomicBoolean atomicBoolean2 = this.A0Y;
            if (!atomicBoolean2.get()) {
                A05(Environment.getExternalStorageState());
                A02();
                A03();
                if (!this.A09 || !this.A04 || !this.A0C) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("gdrive-conditions-manager/trigger-nothing is-backup-pending: ");
                    A0S3.append(AnonymousClass0JJ.A0I(r4));
                    A0S3.append(" is-backup-running: ");
                    A0S3.append(atomicBoolean2.get());
                    A0S3.append(" network_available_for_backup: ");
                    A0S3.append(this.A09);
                    A0S3.append(" battery_available_for_backup: ");
                    A0S3.append(this.A04);
                    A0S3.append(" sdcard_available: ");
                    AnonymousClass008.A1a(A0S3, this.A0C);
                    return;
                }
                Intent intent = new Intent("action_backup");
                intent.putExtra("only_if_pending", true);
                AnonymousClass0JJ.A0G(this.A0Q.A00, intent);
                Log.i("gdrive-conditions-manager/trigger-pending-backup");
                return;
            }
        }
        if (this.A0b.get() || this.A0c.get()) {
            Log.i("gdrive-conditions-manager/service-running/recalculate-network-and-sdcard");
            A05(Environment.getExternalStorageState());
            A02();
            A03();
            return;
        }
        Log.i("gdrive-conditions-manager/trigger-nothing/nothing-pending");
    }

    public void A02() {
        String str;
        int parseInt;
        try {
            AnonymousClass00D r1 = this.A0R;
            this.A01 = r1.A04();
            if (r1 != null) {
                try {
                    parseInt = Integer.parseInt(r1.A00.getString("gdrive_media_restore_network_setting", String.valueOf(0)));
                } catch (NumberFormatException e) {
                    Log.e("wa-shared-preferences/get-media-restore-network-setting", e);
                }
                this.A02 = parseInt;
                int i = this.A01;
                String str2 = "unknown";
                if (i != 0) {
                    str = "Wi-Fi or cellular";
                    if (i != 1) {
                        str = str2;
                    }
                } else {
                    str = "Wi-Fi only";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-conditions-manager/init-network network setting for backup is ");
                sb.append(i);
                sb.append(" (");
                sb.append(str);
                sb.append(")");
                Log.d(sb.toString());
                int i2 = this.A02;
                if (i2 == 0) {
                    str2 = "Wi-Fi only";
                } else if (i2 == 1) {
                    str2 = "Wi-Fi or cellular";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("gdrive-conditions-manager/init-network network setting for media restore is ");
                sb2.append(this.A01);
                sb2.append(" (");
                sb2.append(str2);
                sb2.append(")");
                Log.d(sb2.toString());
                return;
            }
            throw null;
        } catch (NumberFormatException e2) {
            Log.e(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r5.A09 != false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0162  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A03() {
        /*
        // Method dump skipped, instructions count: 425
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0HQ.A03():void");
    }

    public final void A04(AnonymousClass0AW r7) {
        int i;
        double A002 = r7.A00();
        boolean z = false;
        if (!Double.isNaN(A002)) {
            i = (int) A002;
        } else {
            i = 0;
        }
        this.A0E.open();
        boolean z2 = true;
        this.A05 = true;
        if (this.A08 || r7.A02()) {
            this.A0D.open();
            this.A0F.open();
            if (!this.A04 || !this.A06) {
                z = true;
            }
            this.A04 = true;
            this.A06 = true;
            z2 = z;
        } else {
            this.A0D.close();
            this.A0F.close();
            if (!this.A04 && !this.A06) {
                z2 = false;
            }
            this.A04 = false;
            this.A06 = false;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("gdrive-conditions-manager/can-use-battery/battery-level/");
            sb.append(i);
            Log.i(sb.toString());
            StringBuilder sb2 = new StringBuilder("gdrive-conditions-manager/can-use-battery-for-backup/");
            sb2.append(this.A04);
            Log.i(sb2.toString());
            StringBuilder sb3 = new StringBuilder("gdrive-conditions-manager/can-use-battery-for-media-restore/");
            sb3.append(this.A06);
            Log.i(sb3.toString());
            AnonymousClass008.A1a(new StringBuilder("gdrive-conditions-manager/ignore-battery-status/"), this.A08);
        }
    }

    public void A05(String str) {
        AnonymousClass00E.A00();
        if ("mounted".equals(str)) {
            this.A0J.open();
            if (!this.A0C) {
                this.A0C = true;
                if (A06()) {
                    A01();
                    return;
                }
                return;
            }
            return;
        }
        this.A0J.close();
        Log.d("gdrive-conditions-manager/can-use-sdcard/not-mounted");
        this.A0C = false;
    }

    public boolean A06() {
        if (!this.A0M.A0D(AbstractC000400g.A13)) {
            Log.i("gdrive-conditions-manager/is-access-possible gdrive disabled");
            return false;
        }
        AnonymousClass00G r1 = this.A0Q;
        int A002 = AnonymousClass0IZ.A00(r1.A00);
        if (A002 == 0) {
            return true;
        }
        try {
            r1.A00.getPackageManager().getPackageInfo("com.android.vending", 0);
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-conditions-manager/is-access-possible Google Play services are missing and can be installed,  status code: ");
            sb.append(AnonymousClass0JJ.A04(A002));
            Log.i(sb.toString());
            return true;
        } catch (Exception e) {
            StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-conditions-manager/is-access-possible Google Play services are missing and cannot be installed, status code: ");
            A0S2.append(AnonymousClass0JJ.A04(A002));
            Log.i(A0S2.toString());
            Log.i("gdrive-conditions-manager/is-access-possible", e);
            return false;
        }
    }

    public boolean A07() {
        if (!A06()) {
            Log.i("gdrive-conditions-manager/should-start/false/gdrive-access-not-allowed");
            return false;
        } else if (!this.A0V.A02()) {
            Log.i("gdrive-conditions-manager/should-start/false/reg-not-verified");
            return false;
        } else if (this.A0U.A00) {
            Log.i("gdrive-conditions-manager/should-start/false/login-failed");
            return false;
        } else {
            AnonymousClass03B r1 = this.A0L;
            if (r1.A04()) {
                Log.i("gdrive-conditions-manager/should-start/false/clock-wrong");
                return false;
            } else if (r1.A03()) {
                Log.i("gdrive-conditions-manager/should-start/false/software-expired");
                return false;
            } else if (this.A0S.A01() <= 1) {
                Log.i("gdrive-conditions-manager/should-start/false/message-count-low");
                return false;
            } else {
                AnonymousClass00D r2 = this.A0R;
                int A032 = r2.A03();
                if (A032 != 0) {
                    if (A032 != 1 && A032 != 2 && A032 != 3 && A032 != 4) {
                        AnonymousClass008.A0u("gdrive-conditions-manager/should-start/unexpected-backup-freq/", A032);
                    } else if (r2.A0D() != null) {
                        return false;
                    }
                }
                try {
                    long j = r2.A00.getLong("gdrive_next_prompt_for_setup_timestamp", -1);
                    long currentTimeMillis = System.currentTimeMillis();
                    long j2 = currentTimeMillis - j;
                    String.format(Locale.ENGLISH, "saved time: %d, current time: %d, difference: %d", Long.valueOf(j), Long.valueOf(currentTimeMillis), Long.valueOf(j2));
                    if (j >= 0) {
                        if (j2 <= 0) {
                            return false;
                        }
                        Log.i("gdrive-conditions-manager/sufficient-time-passed-since-last-user-prompt/true");
                    }
                } catch (NumberFormatException e) {
                    Log.e("gdrive-conditions-manager/sufficient-time-passed-since-last-user-prompt/", e);
                }
                return true;
            }
        }
    }

    public boolean A08() {
        if (this.A0Y.get()) {
            if (this.A0G.block(1800000)) {
                return true;
            }
            Log.e("gdrive-conditions-manager/network-wait/backup 1800000 milliseconds, giving up now.");
            return false;
        } else if (this.A0Z.get()) {
            if (this.A0I.block(1800000)) {
                return true;
            }
            Log.e("gdrive-conditions-manager/network-wait/media-restore 1800000 milliseconds, giving up now.");
            return true;
        } else if (this.A0H.block(1800000)) {
            return true;
        } else {
            Log.e("gdrive-conditions-manager/network-wait/message-restore 1800000 milliseconds, giving up now.");
            return false;
        }
    }

    public boolean A09(int i) {
        AnonymousClass00E.A00();
        if (i == 0 || i == 1) {
            this.A01 = i;
            A03();
            this.A0R.A00.edit().putString("interface_gdrive_backup_network_setting", String.valueOf(i)).apply();
            return true;
        }
        AnonymousClass008.A0u("gdrive-conditions-manager/set-backup-network-setting/incorrect-value/", i);
        return false;
    }
}
