package X;

import android.app.ActivityManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0J0  reason: invalid class name */
public class AnonymousClass0J0 {
    public static volatile AnonymousClass0J0 A0T;
    public final C03290Fp A00;
    public final AnonymousClass0CO A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass01I A03;
    public final C000300f A04;
    public final AnonymousClass09K A05;
    public final AnonymousClass1Pw A06;
    public final AnonymousClass0HQ A07;
    public final C003301q A08;
    public final AnonymousClass03R A09;
    public final AnonymousClass00C A0A;
    public final AnonymousClass04j A0B;
    public final AnonymousClass03P A0C;
    public final AnonymousClass00G A0D;
    public final AnonymousClass03S A0E;
    public final AnonymousClass00D A0F;
    public final C02290Bk A0G;
    public final AnonymousClass01P A0H;
    public final AnonymousClass0ET A0I;
    public final AnonymousClass0CW A0J;
    public final C02040Ak A0K;
    public final AnonymousClass0JI A0L;
    public final C03200Fe A0M;
    public final AnonymousClass0BB A0N;
    public final AbstractC658131q A0O;
    public final C03190Fd A0P;
    public final AnonymousClass0JC A0Q;
    public final C02400Bv A0R;
    public final AnonymousClass0C4 A0S;

    public AnonymousClass0J0(AnonymousClass00G r2, AnonymousClass009 r3, AnonymousClass01I r4, C02400Bv r5, AnonymousClass0C4 r6, AnonymousClass03R r7, C000300f r8, AnonymousClass0JC r9, C03190Fd r10, C03200Fe r11, AnonymousClass1Pw r12, AnonymousClass03P r13, AnonymousClass0CO r14, AnonymousClass0JI r15, AnonymousClass09K r16, AnonymousClass0BB r17, AnonymousClass0ET r18, AnonymousClass00C r19, C02290Bk r20, C03290Fp r21, AnonymousClass04j r22, AnonymousClass01P r23, AnonymousClass03S r24, AnonymousClass00D r25, C02040Ak r26, AnonymousClass0CW r27, C003301q r28, AbstractC658131q r29, AnonymousClass0HQ r30) {
        this.A0D = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A0R = r5;
        this.A0S = r6;
        this.A09 = r7;
        this.A04 = r8;
        this.A0Q = r9;
        this.A0P = r10;
        this.A0M = r11;
        this.A06 = r12;
        this.A0C = r13;
        this.A01 = r14;
        this.A0L = r15;
        this.A05 = r16;
        this.A0N = r17;
        this.A0I = r18;
        this.A0A = r19;
        this.A0G = r20;
        this.A00 = r21;
        this.A0B = r22;
        this.A0H = r23;
        this.A0E = r24;
        this.A0F = r25;
        this.A0K = r26;
        this.A0J = r27;
        this.A08 = r28;
        this.A0O = r29;
        this.A07 = r30;
    }

    public static String A00(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.e("findmissingpermissions/no-package-manager");
                return "";
            }
            PackageInfo packageInfo = packageManager.getPackageInfo("com.whatsapp", 4096);
            StringBuilder sb = new StringBuilder();
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                int i = 0;
                while (true) {
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    if (i >= iArr.length) {
                        break;
                    }
                    if ((iArr[i] & 2) == 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(strArr[i]);
                    }
                    i++;
                }
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(e);
            return "";
        }
    }

    public static void A01(String str, Object obj, Object obj2) {
        if (obj2 instanceof JSONObject) {
            try {
                ((JSONObject) obj2).put(str, obj);
            } catch (JSONException e) {
                Log.e("debug-builder/json/error ", e);
            }
        } else if (obj2 instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) obj2;
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    public static void A02(StringBuilder sb, String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append('.');
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A03(java.io.File r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0J0.A03(java.io.File, boolean):java.io.File");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0632, code lost:
        if (X.AnonymousClass0HU.A05(r3, r27, r2) == 5) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x08d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08d8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ab, code lost:
        if (r10.startsWith("smb:") == false) goto L_0x01ad;
     */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x063e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A04(android.content.Context r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, boolean r48, long r49, long r51, java.lang.String r53, boolean r54, java.util.List r55) {
        /*
        // Method dump skipped, instructions count: 2322
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0J0.A04(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, long, long, java.lang.String, boolean, java.util.List):java.lang.String");
    }

    public void A05() {
        PowerManager A0C2;
        if (this.A04.A0D(AbstractC000400g.A2X)) {
            C003701u.A0C();
        }
        StringBuilder A0Y = AnonymousClass008.A0Y("app-state", "/settings/notifications-enabled: ");
        A0Y.append(new AnonymousClass03D(this.A0D.A00).A02());
        Log.i(A0Y.toString());
        if (Build.VERSION.SDK_INT >= 21 && (A0C2 = this.A0C.A0C()) != null) {
            StringBuilder A0Y2 = AnonymousClass008.A0Y("app-state", "/power-save-mode:");
            A0Y2.append(A0C2.isPowerSaveMode());
            Log.i(A0Y2.toString());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder A0Y3 = AnonymousClass008.A0Y("app-state", "/bg-data-restricted:");
            A0Y3.append(this.A0B.A06());
            Log.i(A0Y3.toString());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AnonymousClass03P r3 = this.A0C;
            ActivityManager A012 = r3.A01();
            if (A012 != null) {
                StringBuilder A0Y4 = AnonymousClass008.A0Y("app-state", "/background-restricted:");
                A0Y4.append(A012.isBackgroundRestricted());
                Log.i(A0Y4.toString());
            }
            UsageStatsManager A042 = r3.A04();
            if (A042 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                UsageEvents queryEventsForSelf = A042.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12), currentTimeMillis);
                UsageEvents.Event event = new UsageEvents.Event();
                while (queryEventsForSelf.getNextEvent(event)) {
                    if (event.getEventType() == 11) {
                        StringBuilder A0Y5 = AnonymousClass008.A0Y("app-state", "/app-standby bucket:");
                        A0Y5.append(event.getAppStandbyBucket());
                        A0Y5.append(" time:");
                        A0Y5.append(event.getTimeStamp());
                        Log.i(A0Y5.toString());
                    }
                }
                StringBuilder A0Y6 = AnonymousClass008.A0Y("app-state", "/current app-standby bucket:");
                A0Y6.append(A042.getAppStandbyBucket());
                Log.i(A0Y6.toString());
                return;
            }
            Log.i("app-state/usage-stats-manager null");
        }
    }
}
