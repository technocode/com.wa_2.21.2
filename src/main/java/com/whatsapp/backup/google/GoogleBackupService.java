package com.whatsapp.backup.google;

import X.AbstractC03860Ib;
import X.AbstractC09090cH;
import X.AbstractIntentServiceC29181Xk;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01G;
import X.AnonymousClass01I;
import X.AnonymousClass02J;
import X.AnonymousClass02M;
import X.AnonymousClass03A;
import X.AnonymousClass03P;
import X.AnonymousClass03R;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass089;
import X.AnonymousClass094;
import X.AnonymousClass09H;
import X.AnonymousClass09K;
import X.AnonymousClass0AY;
import X.AnonymousClass0CL;
import X.AnonymousClass0FU;
import X.AnonymousClass0HQ;
import X.AnonymousClass0IW;
import X.AnonymousClass0JJ;
import X.AnonymousClass1R0;
import X.AnonymousClass1R1;
import X.AnonymousClass1RF;
import X.BinderC27531Qj;
import X.C000300f;
import X.C002101e;
import X.C003301q;
import X.C014508d;
import X.C02290Bk;
import X.C02300Bl;
import X.C03200Fe;
import X.C09080cG;
import X.C41361uu;
import X.C41371uv;
import X.C41381uw;
import X.C41391ux;
import X.C41401uy;
import X.C44041zP;
import X.C446420x;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Environment;
import android.os.IBinder;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class GoogleBackupService extends AbstractIntentServiceC29181Xk {
    public int A00;
    public WifiManager.WifiLock A01;
    public Bundle A02;
    public AnonymousClass1RF A03;
    public C44041zP A04;
    public C446420x A05;
    public String A06;
    public Map A07;
    public final ConditionVariable A08 = new ConditionVariable(false);
    public final AnonymousClass009 A09 = AnonymousClass009.A00();
    public final AnonymousClass088 A0A = AnonymousClass088.A00();
    public final AnonymousClass02M A0B = AnonymousClass02M.A00();
    public final AnonymousClass01I A0C = AnonymousClass01I.A00();
    public final C000300f A0D = C000300f.A00();
    public final AnonymousClass0CL A0E = AnonymousClass0CL.A00();
    public final AnonymousClass09K A0F = AnonymousClass09K.A07;
    public final C02300Bl A0G = C02300Bl.A00();
    public final AnonymousClass0HQ A0H = AnonymousClass0HQ.A00();
    public final C41391ux A0I = new C41391ux(this);
    public final C41401uy A0J = new C41401uy();
    public final BinderC27531Qj A0K = new BinderC27531Qj(this);
    public final C09080cG A0L = C09080cG.A00();
    public final AnonymousClass0JJ A0M = AnonymousClass0JJ.A03();
    public final AnonymousClass1R0 A0N = AnonymousClass1R0.A00();
    public final AbstractC03860Ib A0O = new C41361uu(this);
    public final AbstractC03860Ib A0P = new C41371uv(this);
    public final AbstractC03860Ib A0Q = new C41381uw(this);
    public final AnonymousClass0IW A0R = AnonymousClass0IW.A00();
    public final C003301q A0S = C003301q.A02;
    public final AnonymousClass03R A0T = AnonymousClass03R.A00();
    public final AnonymousClass03P A0U = AnonymousClass03P.A00();
    public final AnonymousClass00G A0V = AnonymousClass00G.A01;
    public final AnonymousClass03S A0W = AnonymousClass03S.A00();
    public final AnonymousClass00D A0X = AnonymousClass00D.A00();
    public final C02290Bk A0Y = C02290Bk.A02();
    public final AnonymousClass094 A0Z = AnonymousClass094.A00();
    public final C014508d A0a = C014508d.A00();
    public final AnonymousClass00Y A0b = AnonymousClass00Y.A00();
    public final AnonymousClass09H A0c = AnonymousClass09H.A01();
    public final C03200Fe A0d = C03200Fe.A00();
    public final AnonymousClass0FU A0e = AnonymousClass0FU.A01();
    public final AnonymousClass02J A0f = AnonymousClass02J.A02();
    public final AnonymousClass03A A0g = AnonymousClass03A.A00();
    public final AnonymousClass00T A0h = C002101e.A00();
    public final Object A0i = new Object();
    public final ArrayList A0j = new ArrayList();
    public final AtomicBoolean A0k = new AtomicBoolean(false);
    public final AtomicLong A0l = new AtomicLong(0);
    public final AtomicLong A0m = new AtomicLong(0);
    public final AtomicLong A0n = new AtomicLong(0);
    public final AtomicLong A0o = new AtomicLong(0);
    public final AtomicLong A0p = new AtomicLong(0);

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
    }

    public final String A00() {
        AnonymousClass01I r0 = this.A0C;
        r0.A04();
        Me me = r0.A00;
        if (me == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = me.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.A01():void");
    }

    public final void A02() {
        WifiManager.WifiLock wifiLock = this.A01;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.A01.release();
        }
    }

    public void A03(int i) {
        String A052 = AnonymousClass0JJ.A05(i);
        if (i != 10) {
            TextUtils.join("\n", Thread.currentThread().getStackTrace());
            StringBuilder sb = new StringBuilder("gdrive-service/set-error/");
            sb.append(A052);
            Log.e(sb.toString());
        }
        AnonymousClass008.A0k(this.A0X, "gdrive_error_code", i);
        if (this.A06 != null) {
            if (!AnonymousClass0JJ.A0J(this.A0X) || "action_restore_media".equals(this.A06)) {
                boolean z = false;
                if (this.A0X.A06() == 3) {
                    z = true;
                }
                if (z && !"action_restore".equals(this.A06)) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-service/set-error/unexpected action(");
                    A0S2.append(this.A06);
                    A0S2.append(") during messages restore");
                    AnonymousClass00E.A08(false, A0S2.toString());
                    this.A09.A04("gdrive-service/set-error/unexpected-action", AnonymousClass008.A0O(new StringBuilder(), this.A06, " during messages restore"), true);
                } else if (AnonymousClass0JJ.A0I(this.A0X) && !"action_backup".equals(this.A06)) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("gdrive-service/set-error/unexpected action(");
                    A0S3.append(this.A06);
                    A0S3.append(") during backup");
                    AnonymousClass00E.A08(false, A0S3.toString());
                    this.A09.A04("gdrive-service/set-error/unexpected-action", AnonymousClass008.A0O(new StringBuilder(), this.A06, " during backup"), true);
                }
            } else {
                StringBuilder A0S4 = AnonymousClass008.A0S("gdrive-service/set-error/unexpected action(");
                A0S4.append(this.A06);
                A0S4.append(") during media restore");
                AnonymousClass00E.A08(false, A0S4.toString());
                this.A09.A04("gdrive-service/set-error/unexpected-action", AnonymousClass008.A0O(new StringBuilder(), this.A06, " during media restore"), true);
            }
        }
        if (AnonymousClass0JJ.A0J(this.A0X) || "action_restore_media".equals(this.A06)) {
            Bundle bundle = new Bundle();
            this.A02 = bundle;
            bundle.putLong("total_bytes_to_be_downloaded", this.A0n.get());
            this.A02.putLong("total_bytes_downloaded", this.A0m.get());
            this.A0J.A07(i, this.A02);
            C446420x r1 = this.A05;
            if (r1 != null) {
                r1.A09 = Integer.valueOf(AnonymousClass0JJ.A00(i));
                return;
            }
            return;
        }
        boolean z2 = false;
        if (this.A0X.A06() == 3) {
            z2 = true;
        }
        if (z2 || "action_restore".equals(this.A06)) {
            Bundle bundle2 = new Bundle();
            this.A02 = bundle2;
            C41401uy r0 = this.A0J;
            synchronized (((AnonymousClass01G) r0).A00) {
                Iterator it = ((AnonymousClass01G) r0).A00.iterator();
                while (true) {
                    AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                    if (r12.hasNext()) {
                        ((AbstractC09090cH) r12.next()).AFj(i, bundle2);
                    }
                }
            }
        } else if (AnonymousClass0JJ.A0I(this.A0X) || "action_backup".equals(this.A06)) {
            C44041zP r13 = this.A04;
            if (r13 != null) {
                r13.A09 = Integer.valueOf(AnonymousClass0JJ.A00(i));
            }
            Bundle bundle3 = new Bundle();
            this.A02 = bundle3;
            bundle3.putLong("total_bytes_to_be_uploaded", this.A0o.get());
            this.A0J.A06(i, this.A02);
        } else if (this.A06 != null) {
            if (i != 10) {
                AnonymousClass008.A1T(AnonymousClass008.A0S("gdrive-service/set-error/unexpected-service-start-action/"), this.A06);
            }
        } else if (i != 10) {
            Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
        } else {
            Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
            Bundle bundle4 = new Bundle();
            this.A02 = bundle4;
            bundle4.putLong("total_bytes_to_be_uploaded", this.A0o.get());
            this.A0J.A06(i, this.A02);
        }
    }

    public void A04(AbstractC09090cH r18) {
        C41401uy r4 = this.A0J;
        r4.A00(r18);
        AnonymousClass00D r6 = this.A0X;
        if (!AnonymousClass0JJ.A0I(r6)) {
            AnonymousClass0HQ r2 = this.A0H;
            if (!r2.A0Y.get()) {
                if (r2.A0Z.get() || AnonymousClass0JJ.A0J(r6)) {
                    if (!r2.A0B) {
                        if (r2.A02 == 0) {
                            r18.AHe(this.A0m.get(), this.A0n.get());
                        } else {
                            r18.AHa(this.A0m.get(), this.A0n.get());
                        }
                    } else if (!r2.A06) {
                        r18.AHb(this.A0m.get(), this.A0n.get());
                    } else if (r2.A0C) {
                        AtomicLong atomicLong = this.A0n;
                        if (atomicLong.get() > 0) {
                            r18.AHh(this.A0m.get(), this.A0l.get(), atomicLong.get());
                        } else {
                            r18.AHg();
                        }
                    } else if ("unmounted".equals(Environment.getExternalStorageState())) {
                        r18.AHd(this.A0m.get(), this.A0n.get());
                    } else {
                        r18.AHc(this.A0m.get(), this.A0n.get());
                    }
                    r4.A07(r6.A05(), this.A02);
                    return;
                }
                boolean z = false;
                if (r6.A06() == 3) {
                    z = true;
                }
                if (z) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-service/observer/registered/error/");
                    A0S2.append(AnonymousClass0JJ.A05(r6.A05()));
                    Log.i(A0S2.toString());
                    return;
                }
                r4.A06(r6.A05(), this.A02);
                return;
            }
        }
        AnonymousClass0HQ r22 = this.A0H;
        if (!r22.A09) {
            if (r22.A01 == 0) {
                r18.ADP(this.A0p.get(), this.A0o.get());
            } else {
                r18.ADL(this.A0p.get(), this.A0o.get());
            }
        } else if (!r22.A04) {
            r18.ADM(this.A0p.get(), this.A0o.get());
        } else if (r22.A0C) {
            AtomicLong atomicLong2 = this.A0o;
            if (atomicLong2.get() > 0) {
                r18.ADS(this.A0p.get(), atomicLong2.get());
            } else if (AnonymousClass0JJ.A0I(r6)) {
                r18.ADR();
            } else {
                r18.AJo();
            }
        } else if ("unmounted".equals(Environment.getExternalStorageState())) {
            r18.ADO(this.A0p.get(), this.A0o.get());
        } else {
            r18.ADN(this.A0p.get(), this.A0o.get());
        }
        r4.A06(r6.A05(), this.A02);
    }

    public final void A05(boolean z) {
        AnonymousClass1RF r1 = this.A03;
        if (r1 != null) {
            synchronized (r1) {
                if (r1.A01 != z) {
                    Log.i(z ? "gdrive-api-v2/enabled" : "gdrive-api-v2/disabled");
                    r1.A01 = z;
                }
            }
        }
        this.A0R.A01(2, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1.A0Y.get() == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06() {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.A06():boolean");
    }

    public IBinder onBind(Intent intent) {
        return this.A0K;
    }

    public void onCreate() {
        super.onCreate();
        ArrayList arrayList = this.A0j;
        AnonymousClass088 r5 = this.A0A;
        if (r5 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(r5.A04().A01);
            arrayList2.add(r5.A04().A00);
            arrayList2.add(r5.A04().A0L);
            arrayList2.add(r5.A04().A05);
            arrayList2.add(r5.A04().A0M);
            File file = r5.A04().A0N;
            boolean z = false;
            AnonymousClass089.A03(file, false);
            arrayList2.add(file);
            File file2 = r5.A04().A02;
            AnonymousClass089.A03(file2, false);
            arrayList2.add(file2);
            File file3 = r5.A04().A0K;
            AnonymousClass089.A03(file3, false);
            arrayList2.add(file3);
            File file4 = r5.A04().A04;
            AnonymousClass089.A03(file4, false);
            arrayList2.add(file4);
            arrayList.addAll(arrayList2);
            C09080cG r2 = this.A0L;
            if (r2 != null) {
                Log.i("gdrive-notification-manager/register");
                r2.A0K.set(10);
                r2.A0B = false;
                r2.A0A = false;
                r2.A09 = false;
                r2.A00 = 0;
                r2.A01 = 0;
                r2.A02 = 0;
                r2.A03 = 0;
                r2.A08 = null;
                if (r2.A0L == null) {
                    z = true;
                }
                AnonymousClass00E.A07(z);
                r2.A0D.A01(r2);
                A04(r2);
                AnonymousClass09K r22 = this.A0F;
                C41391ux r1 = this.A0I;
                synchronized (r22) {
                    if (r1 != null) {
                        if (!r22.A03) {
                            if (r22.A02) {
                                r1.A00();
                            } else {
                                r1.A01();
                            }
                        }
                        r22.A04.add(r1);
                        return;
                    }
                    return;
                }
            }
            throw null;
        }
        throw null;
    }

    public void onDestroy() {
        int intValue;
        super.onDestroy();
        AnonymousClass09K r2 = this.A0F;
        C41391ux r1 = this.A0I;
        synchronized (r2) {
            if (r1 != null) {
                r2.A04.remove(r1);
            }
        }
        C09080cG r3 = this.A0L;
        if (r3 != null) {
            Log.i("gdrive-notification-manager/unregister");
            BroadcastReceiver broadcastReceiver = r3.A04;
            if (broadcastReceiver != null) {
                try {
                    r3.A0F.A00.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
            }
            BroadcastReceiver broadcastReceiver2 = r3.A06;
            if (broadcastReceiver2 != null) {
                try {
                    r3.A0F.A00.unregisterReceiver(broadcastReceiver2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            BroadcastReceiver broadcastReceiver3 = r3.A05;
            if (broadcastReceiver3 != null) {
                try {
                    r3.A0F.A00.unregisterReceiver(broadcastReceiver3);
                } catch (IllegalArgumentException unused3) {
                }
            }
            BroadcastReceiver broadcastReceiver4 = r3.A07;
            if (broadcastReceiver4 != null) {
                try {
                    r3.A0F.A00.unregisterReceiver(broadcastReceiver4);
                } catch (IllegalArgumentException unused4) {
                }
            }
            r3.A0D.A00(r3);
            this.A0J.A01(r3);
            AtomicReference atomicReference = r3.A0K;
            Notification notification = r3.A0L;
            if (r3.A0B && notification != null && ((intValue = ((Number) atomicReference.get()).intValue()) == 15 || intValue == 27)) {
                Log.i("gdrive-notification-manager/destroy re-posting error notification for foreground service");
                r3.A0G.A03(null, 5, notification);
            }
            r3.A0L = null;
            A05(false);
            A02();
            this.A0H.A0b.set(false);
            AnonymousClass1R1.A02();
            return;
        }
        throw null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0fe0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0fe2, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0fe4, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0fee, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0ff0, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0ffa, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0ffc, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x1006, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x1007, code lost:
        r5 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x100a, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x1012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x1013, code lost:
        A03(12);
        com.whatsapp.util.Log.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x101c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x08cd  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x08d4  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x097a  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0aa5  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0ab2  */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x0d2a  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x1012 A[ExcHandler: 1v8 (r3v4 'e' X.1v8 A[CUSTOM_DECLARE]), Splitter:B:512:0x0f4c] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x1067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHandleIntent(android.content.Intent r47) {
        /*
        // Method dump skipped, instructions count: 4332
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onHandleIntent(android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r1 != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onStartCommand(android.content.Intent, int, int):int");
    }
}
