package com.whatsapp;

import X.AbstractC002201f;
import X.AbstractC003201p;
import X.AbstractC28721Vm;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00A;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass018;
import X.AnonymousClass01A;
import X.AnonymousClass01B;
import X.AnonymousClass01D;
import X.AnonymousClass01H;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01K;
import X.AnonymousClass01L;
import X.AnonymousClass01M;
import X.AnonymousClass01N;
import X.AnonymousClass01O;
import X.AnonymousClass01P;
import X.AnonymousClass01Q;
import X.AnonymousClass01R;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass01U;
import X.AnonymousClass01W;
import X.AnonymousClass01X;
import X.AnonymousClass01Y;
import X.AnonymousClass01Z;
import X.AnonymousClass0XS;
import X.AnonymousClass1MJ;
import X.AnonymousClass1VY;
import X.AnonymousClass280;
import X.C000300f;
import X.C001000o;
import X.C001801b;
import X.C001901c;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C002401h;
import X.C002601j;
import X.C003001n;
import X.C003101o;
import X.C446921c;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.util.Log;
import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

public class AbstractAppShell extends Application implements AnonymousClass003 {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spk.zst";
    public static final AnonymousClass004 appStartStat = AnonymousClass004.A02;
    public static boolean created;
    public C002401h genderUtils;
    public AnonymousClass01W waResourcesWrapper;
    public AnonymousClass01X whatsAppLocale;

    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r9 = r10.A02;
        r5 = new X.AnonymousClass00A("native libraries are missing");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0375, code lost:
        if (((X.AnonymousClass00L) r9) != null) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0377, code lost:
        com.whatsapp.util.Log.e("UNCAUGHT EXCEPTION", r5);
        X.AnonymousClass008.A18("whatsapplibloader/load-startup-libs: install source ", getPackageManager().getInstallerPackageName(getPackageName()));
        r11 = new java.lang.StringBuilder();
        r11.append("whatsapplibloader/load-startup-libs: available internal storage: ");
        r11.append(r10.A03.A03());
        com.whatsapp.util.Log.i(r11.toString());
        r12 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b4, code lost:
        if (r12.A0n(86400000, "corrupt_installation_reported_timestamp") != false) goto L_0x03b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03b6, code lost:
        r9.A06(false, true, false, false, false, new java.util.HashSet(java.util.Collections.singletonList("log_files_upload")), null, null);
        r12.A0B("corrupt_installation_reported_timestamp");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03d9, code lost:
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.RunnableEBaseShape4S0100000_I0_4(r37, 35));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ed, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0603, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013c, code lost:
        if (r12 == 3) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023e, code lost:
        if (r11 != null) goto L_0x0240;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0276, code lost:
        if (r8.contains("libvlc.so") != false) goto L_0x0278;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0369 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ba A[SYNTHETIC, Splitter:B:111:0x02ba] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachBaseContext(android.content.Context r38) {
        /*
        // Method dump skipped, instructions count: 1572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShell.attachBaseContext(android.content.Context):void");
    }

    private void configureProduct() {
        AnonymousClass018.A00 = new AnonymousClass280();
        AbstractC28721Vm.A00 = new C446921c();
    }

    public void configureProductDependencies() {
        AnonymousClass01A A00 = AnonymousClass01A.A00();
        AnonymousClass01B r0 = A00.A04;
        r0.A02.A00(new AnonymousClass01D(A00));
        if (AnonymousClass01H.A0G == null) {
            synchronized (AnonymousClass01H.class) {
                if (AnonymousClass01H.A0G == null) {
                    AnonymousClass01H.A0G = new AnonymousClass01H(AnonymousClass00S.A00(), AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass01J.A00(), AnonymousClass01K.A00(), AnonymousClass01L.A00(), AnonymousClass01M.A00(), C001000o.A00(), AnonymousClass01N.A00(), AnonymousClass01O.A00(), AnonymousClass01P.A00(), AnonymousClass00D.A00(), AnonymousClass01Q.A00(), AnonymousClass01R.A01(), AnonymousClass01S.A00(), AnonymousClass01T.A00());
                }
            }
        }
        AnonymousClass01H r2 = AnonymousClass01H.A0G;
        r2.A00.A00(new AnonymousClass01U(r2));
        if (AnonymousClass1MJ.A00 == null) {
            synchronized (AnonymousClass1MJ.class) {
                if (AnonymousClass1MJ.A00 == null) {
                    AnonymousClass1MJ.A00 = new AnonymousClass1MJ();
                }
            }
        }
        if (AnonymousClass1MJ.A00 == null) {
            throw null;
        }
    }

    public Resources getResources() {
        if (AnonymousClass00E.A00.booleanValue()) {
            return super.getResources();
        }
        AnonymousClass01W r2 = this.waResourcesWrapper;
        if (r2 == null) {
            Resources resources = super.getResources();
            AnonymousClass01X A00 = AnonymousClass01X.A00();
            if (resources == null || A00 == null) {
                throw new NullPointerException("Resources and/or WhatsAppLocale can't be null");
            }
            if (resources instanceof AnonymousClass01W) {
                r2 = (AnonymousClass01W) resources;
            } else {
                r2 = new AnonymousClass01W(resources, A00);
            }
            this.waResourcesWrapper = r2;
        }
        return r2;
    }

    @Override // X.AnonymousClass003
    public AnonymousClass01Z getWorkManagerConfiguration() {
        Log.i("work-manager/configuration/created");
        AnonymousClass01Y r2 = new AnonymousClass01Y();
        r2.A03 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        r2.A01 = Integer.MAX_VALUE;
        r2.A00 = 2;
        return new AnonymousClass01Z(r2);
    }

    public void lambda$attachBaseContext$0$AbstractAppShell() {
        synchronized (BreakpadManager.class) {
            boolean z = false;
            if (BreakpadManager.A00 == null) {
                z = true;
            }
            AnonymousClass00E.A08(z, "breakpad/initialized more than once");
            File A0K = C001801b.A0K(this);
            BreakpadManager.setUpBreakpad(A0K.getAbsolutePath(), getPackageCodePath(), new File(getFilesDir(), "decompressed/libs.spk.zst").getAbsolutePath(), C001901c.A08, 1536000);
            BreakpadManager.A00 = A0K;
        }
    }

    public static void lambda$attachBaseContext$2() {
        if (AnonymousClass006.A02 == null) {
            synchronized (AnonymousClass006.class) {
                if (AnonymousClass006.A02 == null) {
                    AnonymousClass006.A02 = new AnonymousClass006();
                }
            }
        }
        AnonymousClass006 r4 = AnonymousClass006.A02;
        synchronized (r4) {
            if (r4.A00 == null) {
                SigquitBasedANRDetector A00 = SigquitBasedANRDetector.A00();
                r4.A00 = A00;
                synchronized (A00.A08) {
                    if (!A00.A0B) {
                        HandlerThread handlerThread = new HandlerThread("SigquitBasedANRDetectorThread");
                        A00.A00 = handlerThread;
                        handlerThread.start();
                        A00.A09 = new Handler(A00.A00.getLooper());
                        SigquitBasedANRDetector.startDetector();
                        A00.A0B = true;
                    }
                }
            }
        }
    }

    public /* synthetic */ void lambda$null$3$AbstractAppShell() {
        C002001d.A2P(this);
    }

    public boolean lambda$onCreate$4$AbstractAppShell() {
        Log.i("app-init main thread idle");
        C002101e.A00().ANF(new RunnableEBaseShape0S0100000_I0_0(this, 29));
        return false;
    }

    private void logDebugInfo() {
        StringBuilder A0S = AnonymousClass008.A0S("appshell/debug_info: pkg=");
        A0S.append(getPackageName());
        A0S.append("; v=");
        A0S.append("2.21.2.4-play-beta");
        A0S.append("; vc=");
        A0S.append(210204500);
        A0S.append("; p=");
        A0S.append("consumer");
        A0S.append("; e=");
        A0S.append(45L);
        A0S.append("; g=");
        A0S.append("v2.21.2.2-52-g59eae4dc51f-dirty");
        A0S.append("; t=");
        A0S.append(1610555627000L);
        A0S.append("; d=");
        A0S.append(Build.MANUFACTURER);
        A0S.append(" ");
        A0S.append(Build.MODEL);
        A0S.append("; os=Android ");
        A0S.append(Build.VERSION.RELEASE);
        A0S.append("; abis=");
        AnonymousClass008.A1U(A0S, TextUtils.join(",", Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2}));
    }

    private void maybeReportDecompressionFailure(Exception exc) {
        AnonymousClass009.A00();
        Log.e("UNCAUGHT EXCEPTION", new AnonymousClass00A("superpack decompression failed"));
        StringBuilder sb = new StringBuilder("appshell/decompression-failure: available internal storage: ");
        sb.append(AnonymousClass00C.A00().A03());
        Log.i(sb.toString());
        AnonymousClass00D A00 = AnonymousClass00D.A00();
        if (A00.A0n(86400000, "decompression_failure_reported_timestamp")) {
            AnonymousClass009.A00().A06(false, true, false, false, false, new HashSet(Collections.singletonList("log_files_upload")), null, null);
            A00.A0B("decompression_failure_reported_timestamp");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass01X r4 = this.whatsAppLocale;
        if (r4 != null) {
            Locale A0I = AnonymousClass1VY.A0I(configuration);
            if (!r4.A05.equals(A0I)) {
                StringBuilder A0S = AnonymousClass008.A0S("whatsapplocale/savedefaultlanguage/phone language changed to: ");
                A0S.append(AbstractC002201f.A05(A0I));
                Log.i(A0S.toString());
                r4.A05 = A0I;
                if (!r4.A06) {
                    r4.A04 = A0I;
                    r4.A0K();
                    for (AnonymousClass0XS r0 : r4.A0A) {
                        r0.AHK();
                    }
                }
            }
            this.whatsAppLocale.A0J();
            C002301g.A02();
            C002401h r1 = this.genderUtils;
            synchronized (r1) {
                r1.A00 = null;
            }
            return;
        }
        throw null;
    }

    /* JADX INFO: finally extract failed */
    public void onCreate() {
        super.onCreate();
        if (created) {
            Log.w("Application onCreate called after application already started");
            AnonymousClass00E.A00 = Boolean.FALSE;
            return;
        }
        created = true;
        C002601j.A01("AppShell/onCreate");
        try {
            this.genderUtils = C002401h.A00();
            AnonymousClass01X.A0D = true;
            this.whatsAppLocale = AnonymousClass01X.A00();
            AnonymousClass00D A00 = AnonymousClass00D.A00();
            configureProductDependencies();
            C003001n.A00(this);
            AnonymousClass00E.A00 = Boolean.FALSE;
            Looper.myQueue().addIdleHandler(new C003101o(this));
            C002601j.A00();
            AbstractC003201p.A01(A00.A07());
        } catch (Throwable th) {
            C002601j.A00();
            throw th;
        }
    }
}
