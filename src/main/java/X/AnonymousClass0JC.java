package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0JC  reason: invalid class name */
public class AnonymousClass0JC {
    public static final String[] A04 = {"biz.stachibana.TaskKiller", "cn.com.android.opda.taskman", "com.arron.taskManager", "com.arron.taskManagerFree", "com.bright.taskcleaner.activity", "com.cool.taskkiller", "com.elnware.ActiveAppsAds", "com.estrongs.android.taskmanager", "com.gau.go.launcherex.gowidget.taskmanagerex", "com.ijinshan.kbatterydoctor", "com.ijinshan.kbatterydoctor_en", "com.iobit.mobilecare", "com.james.SmartTaskManager", "com.james.SmartTaskManagerLite", "com.james.SmartTaskManagerPro", "com.latedroid.juicedefender", "com.latedroid.juicedefender.beta", "com.latedroid.juicedefender.plus", "com.latedroid.ultimatejuice", "com.latedroid.ultimatejuice.root", "com.lookout.zapper", "com.mobo.task.killer", "com.netqin.aotkiller", "com.netqin.mobileguard", "com.rechild.advancedtaskkiller", "com.rechild.advancedtaskkillerfroyo", "com.rechild.advancedtaskkillerpro", "com.rechild.cleaner", "com.rhythm.hexise.task", "com.sand.taskmanager", "com.sta_beers.auto_task", "com.symantec.monitor", "com.task.killer", "com.tni.TasKiller", "com.zdworks.android.toolbox", "com.zomut.watchdog", "com.zomut.watchdoglite", "gpc.myweb.hinet.net.TaskManager", "imoblife.memorybooster.lite", "jp.co.aplio.simpletaskkiller", "jp.co.aplio.simpletaskkillerfree", "jp.smapho.quicktaskkiller", "mobi.infolife.taskmanager", "mobi.infolife.taskmanagerpro", "net.lepeng.batterydoctor", "net.lepeng.superboxss"};
    public static final String[] A05 = {"com.agilesoftresource", "com.antivirus", "com.cleanmaster.mguard", "com.electricsheep.asi", "com.estrongs.android.pop", "com.estrongs.android.pop.cupcake", "com.metago.astro", "com.smartwho.SmartFileManager", "com.smartwho.SmartFileManagerPro", "nextapp.systempanel", "nextapp.systempanel.r1"};
    public static volatile AnonymousClass0JC A06;
    public final AnonymousClass0KO A00;
    public final AnonymousClass00T A01;
    public final CountDownLatch A02 = new CountDownLatch(1);
    public final AtomicReference A03 = new AtomicReference(new AnonymousClass0JD(null, null));

    public AnonymousClass0JC(AnonymousClass00G r3, AnonymousClass00T r4) {
        this.A01 = r4;
        this.A00 = new AnonymousClass0KO(this, r3);
    }

    public static AnonymousClass0JC A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0JC.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0JC(AnonymousClass00G.A01, C002101e.A00());
                }
            }
        }
        return A06;
    }

    public static Set A01(Context context, String[] strArr, String str) {
        CharSequence charSequence;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            HashSet hashSet = new HashSet();
            for (String str2 : strArr) {
                try {
                    try {
                        charSequence = packageManager.getApplicationInfo(str2, 0).loadLabel(packageManager);
                    } catch (Exception e) {
                        Log.e("exception during task-killer name lookup: ", e);
                        charSequence = str2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(' ');
                    sb.append(str2);
                    Log.w(sb.toString());
                    hashSet.add(new AnonymousClass36D(charSequence, str2));
                } catch (PackageManager.NameNotFoundException unused) {
                } catch (RuntimeException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(' ');
                    sb2.append(e2.getMessage());
                    Log.e(sb2.toString());
                }
            }
            if (hashSet.isEmpty()) {
                return null;
            }
            return hashSet;
        }
        return null;
    }

    public AnonymousClass0JD A02(int i, TimeUnit timeUnit) {
        Object obj;
        AnonymousClass008.A0t("taskkillers/scan timeout=", i);
        AnonymousClass0JC r1 = this.A00.A01;
        if (r1.A02.await((long) i, timeUnit)) {
            AnonymousClass0JD r3 = (AnonymousClass0JD) r1.A03.get();
            StringBuilder A0S = AnonymousClass008.A0S("taskkillers/scan results=");
            Set set = r3.A00;
            Object obj2 = "null";
            if (set != null) {
                obj = Integer.valueOf(set.size());
            } else {
                obj = obj2;
            }
            A0S.append(obj);
            A0S.append(" ");
            Set set2 = r3.A01;
            if (set2 != null) {
                obj2 = Integer.valueOf(set2.size());
            }
            A0S.append(obj2);
            Log.d(A0S.toString());
            return r3;
        }
        throw new TimeoutException();
    }
}
