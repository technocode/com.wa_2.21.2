package java.lang;

import X.AbstractC011406u;
import X.AbstractC011806y;
import X.AbstractC011906z;
import X.AbstractC04610La;
import X.AbstractC11200fs;
import X.AbstractC11910hD;
import X.AbstractC16370ph;
import X.AbstractC16700qG;
import X.AbstractC17610rq;
import X.AbstractC17640rt;
import X.AbstractC17800sI;
import X.AbstractC17850sN;
import X.AbstractC233015f;
import X.AbstractC236717b;
import X.AbstractC24591Bo;
import X.AbstractC29771aA;
import X.AbstractC31571dR;
import X.AbstractC34701j2;
import X.AbstractDialogInterface$OnCancelListenerC35011ja;
import X.AnonymousClass05V;
import X.AnonymousClass070;
import X.AnonymousClass0LP;
import X.AnonymousClass0LS;
import X.AnonymousClass0MX;
import X.AnonymousClass0N2;
import X.AnonymousClass0NV;
import X.AnonymousClass0PW;
import X.AnonymousClass0T8;
import X.AnonymousClass0s6;
import X.AnonymousClass11w;
import X.AnonymousClass126;
import X.AnonymousClass12K;
import X.AnonymousClass169;
import X.AnonymousClass16M;
import X.AnonymousClass19x;
import X.AnonymousClass1A4;
import X.AnonymousClass1AA;
import X.AnonymousClass1EY;
import X.AnonymousClass1Ei;
import X.AnonymousClass1Em;
import X.AnonymousClass1Eu;
import X.AnonymousClass1ZO;
import X.AnonymousClass23R;
import X.AnonymousClass23Z;
import X.AnonymousClass240;
import X.AnonymousClass246;
import X.AnonymousClass256;
import X.AnonymousClass25N;
import X.AnonymousClass26L;
import X.AnonymousClass26M;
import X.AnonymousClass26P;
import X.AnonymousClass297;
import X.C011506v;
import X.C012207c;
import X.C13060jX;
import X.C13670kd;
import X.C13860l8;
import X.C14470mK;
import X.C14480mL;
import X.C14670mg;
import X.C15960p1;
import X.C15970p2;
import X.C15980p3;
import X.C15990p4;
import X.C16000p5;
import X.C16010p6;
import X.C16720qI;
import X.C16980qm;
import X.C17530rh;
import X.C17540ri;
import X.C17550rj;
import X.C18030sf;
import X.C18110so;
import X.C225512f;
import X.C227412z;
import X.C233115g;
import X.C237217g;
import X.C242619s;
import X.C242819u;
import X.C24601Bp;
import X.C25061Eh;
import X.C29531Zd;
import X.C29691a1;
import X.C30701bn;
import X.C30971cJ;
import X.C31021cO;
import X.C31081cW;
import X.C31101cY;
import X.C31221cl;
import X.C32421ev;
import X.C34661ix;
import X.C34741j9;
import X.C35021jb;
import X.C35211jy;
import X.C36171lh;
import X.C36181li;
import X.C36191lj;
import X.C36211ll;
import X.C36221lm;
import X.C36231ln;
import X.C36241lo;
import X.C37061nT;
import X.C453624k;
import X.C457125z;
import X.DialogInterface$OnClickListenerC13720ki;
import X.ExecutorC18130sq;
import X.RunnableC17740sA;
import X.ServiceConnectionC25021Ed;
import X.ThreadFactoryC20590wx;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.firebase.iid.FirebaseInstanceId;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

public class RunnableEBaseShape5S0200000_I1_0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public static boolean A09(Object obj) {
        return (obj instanceof RunnableEBaseShape5S0200000_I1_0) && ((RunnableEBaseShape5S0200000_I1_0) obj).A02 == 20;
    }

    public RunnableEBaseShape5S0200000_I1_0(AnonymousClass1EY r2, AnonymousClass23Z r3) {
        this.A02 = 12;
        this.A00 = r2;
        this.A01 = r3;
    }

    public RunnableEBaseShape5S0200000_I1_0(C31101cY r2) {
        this.A02 = 18;
        this.A01 = r2;
        this.A00 = new C31081cW();
    }

    public RunnableEBaseShape5S0200000_I1_0(C32421ev r2, Exception exc) {
        this.A02 = 25;
        this.A01 = r2;
        this.A00 = exc;
    }

    public RunnableEBaseShape5S0200000_I1_0(AnonymousClass23Z r2, Runnable runnable) {
        this.A02 = 15;
        this.A00 = r2;
        this.A01 = runnable;
    }

    public RunnableEBaseShape5S0200000_I1_0(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public RunnableEBaseShape5S0200000_I1_0(Runnable runnable, PowerManager.WakeLock wakeLock) {
        this.A02 = 22;
        this.A00 = runnable;
        this.A01 = wakeLock;
    }

    public static void A00(C18030sf r4) {
        C17530rh r1 = r4.A09;
        if (r1.A04 || r1.A07) {
            String str = r4.A0F;
            C17540ri r2 = new C17540ri();
            r2.A00(r4.A0A.A00);
            r2.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            r4.A0F = ConstraintTrackingWorker.class.getName();
            C17550rj r0 = new C17550rj(r2.A00);
            C17550rj.A01(r0);
            r4.A0A = r0;
        }
    }

    public static void A01(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        AbstractC11200fs r1;
        C16720qI r0 = ((AnonymousClass246) runnableEBaseShape5S0200000_I1_0.A00).A00.A04;
        synchronized (r0.A04) {
            Iterator it = r0.A04.iterator();
            do {
                r1 = (AbstractC11200fs) it;
                if (r1.hasNext()) {
                }
            } while (((C30701bn) ((AbstractC16700qG) ((Map.Entry) r1.next()).getKey())) != null);
            throw null;
        }
    }

    public static void A02(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        ((C32421ev) runnableEBaseShape5S0200000_I1_0.A01).A00((Exception) runnableEBaseShape5S0200000_I1_0.A00);
    }

    public static void A03(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        try {
            ShortcutInfoCompatSaverImpl.A00((File) runnableEBaseShape5S0200000_I1_0.A01);
            ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) runnableEBaseShape5S0200000_I1_0.A00;
            ShortcutInfoCompatSaverImpl.A00(shortcutInfoCompatSaverImpl.A01);
            Map map = shortcutInfoCompatSaverImpl.A04;
            File file = shortcutInfoCompatSaverImpl.A02;
            Context context = shortcutInfoCompatSaverImpl.A00;
            AnonymousClass05V r3 = new AnonymousClass05V();
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(fileInputStream, "UTF_8");
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        } else if (next == 2 && newPullParser.getName().equals("target")) {
                            ComponentName componentName = null;
                            if (newPullParser.getName().equals("target")) {
                                String A0r = AnonymousClass0N2.A0r(newPullParser, "id");
                                String A0r2 = AnonymousClass0N2.A0r(newPullParser, "short_label");
                                if (!TextUtils.isEmpty(A0r) && !TextUtils.isEmpty(A0r2)) {
                                    int parseInt = Integer.parseInt(AnonymousClass0N2.A0r(newPullParser, "rank"));
                                    String A0r3 = AnonymousClass0N2.A0r(newPullParser, "long_label");
                                    String A0r4 = AnonymousClass0N2.A0r(newPullParser, "disabled_message");
                                    String A0r5 = AnonymousClass0N2.A0r(newPullParser, "component");
                                    if (!TextUtils.isEmpty(A0r5)) {
                                        componentName = ComponentName.unflattenFromString(A0r5);
                                    }
                                    String A0r6 = AnonymousClass0N2.A0r(newPullParser, "icon_resource_name");
                                    String A0r7 = AnonymousClass0N2.A0r(newPullParser, "icon_bitmap_path");
                                    ArrayList arrayList = new ArrayList();
                                    HashSet hashSet = new HashSet();
                                    while (true) {
                                        int next2 = newPullParser.next();
                                        if (next2 != 1) {
                                            if (next2 != 2) {
                                                if (next2 == 3 && newPullParser.getName().equals("target")) {
                                                    break;
                                                }
                                            } else {
                                                String name = newPullParser.getName();
                                                int hashCode = name.hashCode();
                                                if (hashCode != -1183762788) {
                                                    if (hashCode == 1296516636 && name.equals("categories")) {
                                                        String A0r8 = AnonymousClass0N2.A0r(newPullParser, "name");
                                                        if (!TextUtils.isEmpty(A0r8)) {
                                                            hashSet.add(A0r8);
                                                        }
                                                    }
                                                } else if (name.equals("intent")) {
                                                    String A0r9 = AnonymousClass0N2.A0r(newPullParser, "action");
                                                    String A0r10 = AnonymousClass0N2.A0r(newPullParser, "targetPackage");
                                                    String A0r11 = AnonymousClass0N2.A0r(newPullParser, "targetClass");
                                                    if (A0r9 != null) {
                                                        Intent intent = new Intent(A0r9);
                                                        if (!TextUtils.isEmpty(A0r10) && !TextUtils.isEmpty(A0r11)) {
                                                            intent.setClassName(A0r10, A0r11);
                                                        }
                                                        arrayList.add(intent);
                                                    }
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    C14670mg r2 = new C14670mg();
                                    r2.A02 = context;
                                    r2.A07 = A0r;
                                    r2.A05 = A0r2;
                                    r2.A00 = parseInt;
                                    if (!TextUtils.isEmpty(A0r3)) {
                                        r2.A06 = A0r3;
                                    }
                                    if (!TextUtils.isEmpty(A0r4)) {
                                        r2.A04 = A0r4;
                                    }
                                    if (componentName != null) {
                                        r2.A01 = componentName;
                                    }
                                    if (!arrayList.isEmpty()) {
                                        r2.A0B = (Intent[]) arrayList.toArray(new Intent[0]);
                                    }
                                    if (!hashSet.isEmpty()) {
                                        r2.A08 = hashSet;
                                    }
                                    if (!TextUtils.isEmpty(r2.A05)) {
                                        Intent[] intentArr = r2.A0B;
                                        if (intentArr != null && intentArr.length != 0) {
                                            C16980qm r1 = new C16980qm(r2, A0r6, A0r7);
                                            C14670mg r0 = r1.A00;
                                            if (r0 != null) {
                                                r3.put(r0.A07, r1);
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
            } catch (Exception e) {
                file.delete();
                StringBuilder sb = new StringBuilder("Failed to load saved values from file ");
                sb.append(file.getAbsolutePath());
                sb.append(". Old state removed, new added");
                Log.e("ShortcutInfoCompatSaver", sb.toString(), e);
            }
            map.putAll(r3);
            shortcutInfoCompatSaverImpl.A06(new ArrayList(map.values()));
        } catch (Exception e2) {
            Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:17|18|(18:21|(1:23)|24|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|(3:38|(2:40|78)(1:79)|41)|77|42|(4:45|(2:47|83)(1:82)|80|43)|81|48|19)|76|49|50|51|52|53|54) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0186, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0187, code lost:
        android.util.Log.w("AtomicFile", "finishWrite: Got exception:", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x018c, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x017d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x01d4 */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01cd A[SYNTHETIC, Splitter:B:68:0x01cd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(java.lang.RunnableEBaseShape5S0200000_I1_0 r16) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape5S0200000_I1_0.A04(java.lang.RunnableEBaseShape5S0200000_I1_0):void");
    }

    public static void A05(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        try {
            ((AnonymousClass1EY) runnableEBaseShape5S0200000_I1_0.A00).get();
            ((AnonymousClass23Z) runnableEBaseShape5S0200000_I1_0.A01).A06(null);
        } catch (Exception e) {
            ((AbstractC29771aA) runnableEBaseShape5S0200000_I1_0.A01).A05(e);
        }
    }

    public static void A06(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) runnableEBaseShape5S0200000_I1_0.A00;
        shortcutInfoCompatSaverImpl.A04.clear();
        Map map = shortcutInfoCompatSaverImpl.A03;
        for (Future future : map.values()) {
            future.cancel(false);
        }
        map.clear();
        shortcutInfoCompatSaverImpl.A05((AnonymousClass23Z) runnableEBaseShape5S0200000_I1_0.A01);
    }

    public static void A07(RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0) {
        AbstractC29771aA r1 = (AbstractC29771aA) runnableEBaseShape5S0200000_I1_0.A00;
        if (!(r1.value instanceof C13860l8)) {
            try {
                ((Runnable) runnableEBaseShape5S0200000_I1_0.A01).run();
                r1.A06(null);
            } catch (Exception e) {
                r1.A05(e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0182, code lost:
        if (r8.getInt(0) == 0) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(X.C31101cY r25) {
        /*
        // Method dump skipped, instructions count: 943
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape5S0200000_I1_0.A08(X.1cY):boolean");
    }

    public void run() {
        AnonymousClass0MX r0;
        Exception exc;
        IAccountAccessor iAccountAccessor;
        switch (this.A02) {
            case 0:
                AnonymousClass23R r2 = (AnonymousClass23R) this.A01;
                AnonymousClass0T8 r1 = ((AnonymousClass1ZO) r2).A05;
                if (!(r1 == null || (r0 = r1.A03) == null)) {
                    r0.AHk(r1);
                }
                View view = (View) ((AnonymousClass1ZO) r2).A07;
                if (!(view == null || view.getWindowToken() == null || !((C13060jX) this.A00).A04())) {
                    r2.A09 = (C29531Zd) this.A00;
                }
                r2.A0A = null;
                return;
            case 1:
                ((DialogInterface$OnClickListenerC13720ki) this.A00).A00.onCancel((DialogInterface) this.A01);
                return;
            case 2:
                ((C29691a1) this.A00).A00.A03.A01((C13670kd) this.A01);
                return;
            case 3:
                ((C14470mK) this.A00).A01 = this.A01;
                return;
            case 4:
                ((Application) this.A00).unregisterActivityLifecycleCallbacks((C14470mK) this.A01);
                return;
            case 5:
                try {
                    Method method = C14480mL.A05;
                    if (method != null) {
                        method.invoke(this.A00, this.A01, Boolean.FALSE, "AppCompat recreation");
                        return;
                    } else {
                        C14480mL.A04.invoke(this.A00, this.A01, Boolean.FALSE);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                ((AnonymousClass0NV) ((RunnableEBaseShape0S0300000_I0_0) this.A00).A02).AJL(this.A01);
                return;
            case 7:
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    C16010p6 r3 = (C16010p6) it.next();
                    AnonymousClass240 r6 = (AnonymousClass240) this.A00;
                    AbstractC11910hD r7 = r3.A04;
                    int i = r3.A00;
                    int i2 = r3.A01;
                    int i3 = r3.A02;
                    int i4 = r3.A03;
                    if (r6 != null) {
                        View view2 = r7.A0H;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view2.animate();
                        r6.A04.add(r7);
                        animate.setDuration(((AbstractC16370ph) r6).A02).setListener(new C15970p2(r6, r7, i5, view2, i6, animate)).start();
                    } else {
                        throw null;
                    }
                }
                abstractCollection.clear();
                ((AnonymousClass240) this.A00).A05.remove(abstractCollection);
                return;
            case 8:
                AbstractCollection abstractCollection2 = (AbstractCollection) this.A01;
                Iterator it2 = abstractCollection2.iterator();
                while (it2.hasNext()) {
                    C16000p5 r62 = (C16000p5) it2.next();
                    AnonymousClass240 r5 = (AnonymousClass240) this.A00;
                    View view3 = null;
                    if (r5 != null) {
                        AbstractC11910hD r02 = r62.A05;
                        View view4 = r02 == null ? null : r02.A0H;
                        AbstractC11910hD r03 = r62.A04;
                        if (r03 != null) {
                            view3 = r03.A0H;
                        }
                        if (view4 != null) {
                            ViewPropertyAnimator duration = view4.animate().setDuration(((AbstractC16370ph) r5).A01);
                            r5.A02.add(r62.A05);
                            duration.translationX((float) (r62.A02 - r62.A00));
                            duration.translationY((float) (r62.A03 - r62.A01));
                            duration.alpha(0.0f).setListener(new C15980p3(r5, r62, duration, view4)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            r5.A02.add(r62.A04);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(((AbstractC16370ph) r5).A01).alpha(1.0f).setListener(new C15990p4(r5, r62, animate2, view3)).start();
                        }
                    } else {
                        throw null;
                    }
                }
                abstractCollection2.clear();
                ((AnonymousClass240) this.A00).A03.remove(abstractCollection2);
                return;
            case 9:
                AbstractCollection abstractCollection3 = (AbstractCollection) this.A01;
                Iterator it3 = abstractCollection3.iterator();
                while (it3.hasNext()) {
                    AbstractC11910hD r63 = (AbstractC11910hD) it3.next();
                    AnonymousClass240 r52 = (AnonymousClass240) this.A00;
                    if (r52 != null) {
                        View view5 = r63.A0H;
                        ViewPropertyAnimator animate3 = view5.animate();
                        r52.A00.add(r63);
                        animate3.alpha(1.0f).setDuration(((AbstractC16370ph) r52).A00).setListener(new C15960p1(r52, r63, view5, animate3)).start();
                    } else {
                        throw null;
                    }
                }
                abstractCollection3.clear();
                ((AnonymousClass240) this.A00).A01.remove(abstractCollection3);
                return;
            case 10:
                A01(this);
                return;
            case 11:
                A04(this);
                return;
            case 12:
                A05(this);
                return;
            case 13:
                A03(this);
                return;
            case 14:
                A06(this);
                return;
            case 15:
                A07(this);
                return;
            case GlVideoRenderer.CAP_RENDER_I420:
                try {
                    AbstractC17610rq A002 = AbstractC17610rq.A00();
                    String str = RunnableC17740sA.A0J;
                    RunnableC17740sA r22 = (RunnableC17740sA) this.A00;
                    A002.A02(str, String.format("Starting work for %s", r22.A08.A0F), new Throwable[0]);
                    AnonymousClass1EY A003 = r22.A03.A00();
                    r22.A0D = A003;
                    ((C453624k) this.A01).A07(A003);
                    return;
                } catch (Throwable th2) {
                    ((C453624k) this.A01).A09(th2);
                    return;
                }
            case 17:
                for (AbstractC17800sI r12 : (List) this.A01) {
                    r12.AEb(((AbstractC17850sN) this.A00).A00);
                }
                return;
            case 18:
                try {
                    C31101cY r4 = (C31101cY) this.A01;
                    if (r4 == null) {
                        throw null;
                    } else if (!C31101cY.A01(r4, new HashSet())) {
                        C31221cl r23 = r4.A03;
                        WorkDatabase workDatabase = r23.A04;
                        workDatabase.A02();
                        try {
                            boolean A08 = A08(r4);
                            workDatabase.A04();
                            if (A08) {
                                C18110so.A00(r23.A01, RescheduleReceiver.class, true);
                                AnonymousClass0s6.A01(r23.A04, r23.A07);
                            }
                            ((C31081cW) this.A00).A00(AbstractC17640rt.A01);
                            return;
                        } finally {
                            workDatabase.A03();
                        }
                    } else {
                        throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", r4));
                    }
                } catch (Throwable th3) {
                    ((C31081cW) this.A00).A00(new C31021cO(th3));
                    return;
                }
            case 19:
                try {
                    ((Runnable) this.A00).run();
                    return;
                } finally {
                    ((ExecutorC18130sq) this.A01).A00();
                }
            case AnonymousClass0PW.A01:
                AbstractC31571dR r24 = (AbstractC31571dR) this.A01;
                if (r24.value != this) {
                    return;
                }
                if (AbstractC31571dR.A00.A02(r24, this, AbstractC31571dR.A00((AnonymousClass1EY) this.A00))) {
                    AbstractC31571dR.A03(r24);
                    return;
                }
                return;
            case 21:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.A00;
                synchronized (constraintTrackingWorker.A03) {
                    if (constraintTrackingWorker.A04) {
                        constraintTrackingWorker.A02.A08(new C30971cJ());
                    } else {
                        constraintTrackingWorker.A02.A07((AnonymousClass1EY) this.A01);
                    }
                }
                return;
            case 22:
                try {
                    ((Runnable) this.A00).run();
                    return;
                } finally {
                    ((PowerManager.WakeLock) this.A01).release();
                }
            case 23:
                try {
                    Process.setThreadPriority(((ThreadFactoryC20590wx) this.A00).A00);
                } catch (Throwable unused) {
                }
                ((Runnable) this.A01).run();
                return;
            case 24:
                ((AnonymousClass256) this.A00).A00.A00((Exception) this.A01);
                return;
            case 25:
                A02(this);
                return;
            case 26:
                try {
                    AnonymousClass25N.A00((AnonymousClass12K) this.A01);
                    return;
                } catch (AnonymousClass11w e2) {
                    Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            case 27:
                ((C225512f) this.A00).A01.AD4((AnonymousClass126) this.A01);
                return;
            case 28:
                ((C225512f) this.A00).A01.AD3((C227412z) this.A01);
                return;
            case 29:
                C225512f r04 = (C225512f) this.A00;
                C227412z r13 = (C227412z) this.A01;
                synchronized (r13) {
                }
                r04.A01.AD2(r13);
                return;
            case 30:
                C233115g r25 = (C233115g) this.A00;
                AbstractC233015f r14 = (AbstractC233015f) this.A01;
                if (!r25.A00) {
                    r14.ANo(r25.A02);
                    return;
                }
                return;
            case 31:
                ((AnonymousClass169) this.A00).A01.ALi((AnonymousClass126) this.A01);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH:
                ((AnonymousClass169) this.A00).A01.AJJ((Surface) this.A01);
                return;
            case 33:
                ((AnonymousClass169) this.A00).A01.ALh((C227412z) this.A01);
                return;
            case 34:
                AnonymousClass169 r05 = (AnonymousClass169) this.A00;
                C227412z r15 = (C227412z) this.A01;
                synchronized (r15) {
                }
                r05.A01.ALg(r15);
                return;
            case 35:
                ((C457125z) this.A00).AEY((C34661ix) this.A01);
                return;
            case 36:
                C34661ix r32 = (C34661ix) this.A00;
                if (r32.A02()) {
                    C34741j9 r33 = (C34741j9) this.A01;
                    r33.A02 = true;
                    AbstractC34701j2 r26 = r33.A03;
                    if (!r26.AMw()) {
                        try {
                            r26.A8h(null, Collections.emptySet());
                            return;
                        } catch (SecurityException unused2) {
                            ((C457125z) r33.A05.A08.get(r33.A04)).AEY(new C34661ix(10));
                            return;
                        }
                    } else if (1 != 0 && (iAccountAccessor = r33.A00) != null) {
                        r26.A8h(iAccountAccessor, r33.A01);
                        return;
                    } else {
                        return;
                    }
                } else {
                    C34741j9 r27 = (C34741j9) this.A01;
                    ((C457125z) r27.A05.A08.get(r27.A04)).AEY(r32);
                    return;
                }
            case 37:
                AnonymousClass297 r42 = (AnonymousClass297) this.A01;
                C36171lh r28 = (C36171lh) this.A00;
                if (r42 != null) {
                    C34661ix r16 = r28.A01;
                    if (r16.A02()) {
                        C35211jy r17 = r28.A02;
                        C34661ix r34 = r17.A01;
                        if (!r34.A02()) {
                            String valueOf = String.valueOf(r34);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                            sb.append("Sign-in succeeded with resolve account failure: ");
                            sb.append(valueOf);
                            Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                            ((C34741j9) r42.A00).A00(r34);
                            r42.A02.A3k();
                            return;
                        }
                        AbstractC236717b r35 = r42.A00;
                        IAccountAccessor A004 = r17.A00();
                        Set set = r42.A03;
                        C34741j9 r36 = (C34741j9) r35;
                        if (r36 == null) {
                            throw null;
                        } else if (A004 == null || set == null) {
                            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                            r36.A00(new C34661ix(4));
                        } else {
                            r36.A00 = A004;
                            r36.A01 = set;
                            if (r36.A02) {
                                r36.A03.A8h(A004, set);
                            }
                        }
                    } else {
                        ((C34741j9) r42.A00).A00(r16);
                    }
                    r42.A02.A3k();
                    return;
                }
                throw null;
            case 38:
                AbstractDialogInterface$OnCancelListenerC35011ja r72 = (AbstractDialogInterface$OnCancelListenerC35011ja) this.A01;
                if (r72.A03) {
                    C237217g r8 = (C237217g) this.A00;
                    C34661ix r43 = r8.A01;
                    if (r43.A01()) {
                        AbstractC04610La r64 = ((LifecycleCallback) r72).A00;
                        Activity A76 = r64.A76();
                        PendingIntent pendingIntent = r43.A02;
                        int i7 = r8.A00;
                        Intent intent = new Intent(A76, GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i7);
                        intent.putExtra("notify_manager", false);
                        r64.startActivityForResult(intent, 1);
                        return;
                    }
                    AnonymousClass0LP r37 = r72.A01;
                    int i8 = r43.A01;
                    if (r37 != null) {
                        boolean z = true;
                        if (!(i8 == 1 || i8 == 2 || i8 == 3 || i8 == 9)) {
                            z = false;
                        }
                        if (z) {
                            AbstractC04610La r18 = ((LifecycleCallback) r72).A00;
                            r37.A04(r18.A76(), r18, i8, r72);
                            return;
                        } else if (i8 == 18) {
                            AbstractC04610La r53 = ((LifecycleCallback) r72).A00;
                            Activity A762 = r53.A76();
                            ProgressBar progressBar = new ProgressBar(A762, null, 16842874);
                            progressBar.setIndeterminate(true);
                            progressBar.setVisibility(0);
                            AlertDialog.Builder builder = new AlertDialog.Builder(A762);
                            builder.setView(progressBar);
                            builder.setMessage(AnonymousClass0LS.A02(A762, 18));
                            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                            AlertDialog create = builder.create();
                            AnonymousClass0LP.A02(A762, create, "GooglePlayServicesUpdatingDialog", r72);
                            AnonymousClass0LP.A01(r53.A76().getApplicationContext(), new C35021jb(this, create));
                            return;
                        } else {
                            r72.A06(r43, r8.A00);
                            return;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    return;
                }
            case 39:
                ((AnonymousClass26L) this.A00).A00.A0J((AnonymousClass1A4) this.A01);
                return;
            case 40:
                AnonymousClass26M r19 = ((AnonymousClass19x) this.A01).A02;
                if (!r19.A0F()) {
                    r19.A02(3, "Connected to service after a timeout", null, null, null);
                    AnonymousClass16M.A00();
                    r19.A00 = (AnonymousClass1AA) this.A00;
                    r19.A0E();
                    AnonymousClass26L r06 = ((C242619s) r19).A00.A04;
                    C242819u.A01(r06);
                    if (r06 != null) {
                        AnonymousClass16M.A00();
                        r06.A00.A0E();
                        return;
                    }
                    throw null;
                }
                return;
            case 41:
                AnonymousClass26M r38 = ((AnonymousClass19x) this.A01).A02;
                Object obj = this.A00;
                if (r38 != null) {
                    AnonymousClass16M.A00();
                    if (r38.A00 != null) {
                        r38.A00 = null;
                        r38.A06("Disconnected from device AnalyticsService", obj);
                        AnonymousClass26L r07 = ((C242619s) r38).A00.A04;
                        C242819u.A01(r07);
                        r07.A0C();
                        AnonymousClass16M.A00();
                        AnonymousClass26P r110 = r07.A00;
                        AnonymousClass16M.A00();
                        r110.A0C();
                        r110.A03("Service disconnected");
                        return;
                    }
                    return;
                }
                throw null;
            case 42:
                AbstractC011406u r111 = (AbstractC011406u) this.A00;
                if (((C011506v) r111).A05) {
                    ((C36181li) this.A01).A01.A05();
                    return;
                }
                try {
                    C36181li r29 = (C36181li) this.A01;
                    r29.A01.A08(r29.A00.AQY(r111));
                    return;
                } catch (C24601Bp e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((C36181li) this.A01).A01.A07((Exception) e3.getCause());
                        return;
                    } else {
                        ((C36181li) this.A01).A01.A07(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((C36181li) this.A01).A01.A07(e4);
                    return;
                }
            case 43:
                try {
                    C36191lj r210 = (C36191lj) this.A01;
                    AbstractC011406u r112 = (AbstractC011406u) r210.A00.AQY((AbstractC011406u) this.A00);
                    if (r112 == null) {
                        r210.A01.A07(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    Executor executor = AnonymousClass070.A01;
                    r112.A02(executor, r210);
                    r112.A01(executor, r210);
                    r112.A00(executor, r210);
                    return;
                } catch (C24601Bp e5) {
                    if (e5.getCause() instanceof Exception) {
                        ((C36191lj) this.A01).A01.A07((Exception) e5.getCause());
                        return;
                    } else {
                        ((C36191lj) this.A01).A01.A07(e5);
                        return;
                    }
                } catch (Exception e6) {
                    ((C36191lj) this.A01).A01.A07(e6);
                    return;
                }
            case 44:
                C36211ll r08 = (C36211ll) this.A01;
                synchronized (r08.A01) {
                    AbstractC24591Bo r113 = r08.A00;
                    if (r113 != null) {
                        r113.AEQ((AbstractC011406u) this.A00);
                    }
                }
                return;
            case 45:
                C36221lm r09 = (C36221lm) this.A01;
                synchronized (r09.A01) {
                    AbstractC011806y r211 = r09.A00;
                    if (r211 != null) {
                        C011506v r010 = (C011506v) ((AbstractC011406u) this.A00);
                        synchronized (r010.A04) {
                            exc = r010.A00;
                        }
                        r211.AFt(exc);
                    }
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                C36231ln r011 = (C36231ln) this.A01;
                synchronized (r011.A01) {
                    AbstractC011906z r114 = r011.A00;
                    if (r114 != null) {
                        r114.AKi(((AbstractC011406u) this.A00).A03());
                    }
                }
                return;
            case 47:
                try {
                    C36241lo r39 = (C36241lo) this.A01;
                    AnonymousClass1Eu r115 = r39.A01;
                    Object A03 = ((AbstractC011406u) this.A00).A03();
                    FirebaseInstanceId firebaseInstanceId = r115.A00;
                    String str2 = r115.A01;
                    String str3 = r115.A02;
                    String str4 = (String) A03;
                    C012207c r44 = FirebaseInstanceId.A08;
                    String A04 = firebaseInstanceId.A04.A04();
                    synchronized (r44) {
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("token", str4);
                            jSONObject.put("appVersion", A04);
                            jSONObject.put("timestamp", currentTimeMillis);
                            String obj2 = jSONObject.toString();
                            if (obj2 != null) {
                                SharedPreferences.Editor edit = r44.A01.edit();
                                edit.putString(C012207c.A01(str2, str3), obj2);
                                edit.commit();
                            }
                        } catch (JSONException e7) {
                            String valueOf2 = String.valueOf(e7);
                            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
                            sb2.append("Failed to encode token: ");
                            sb2.append(valueOf2);
                            Log.w("FirebaseInstanceId", sb2.toString());
                        }
                    }
                    C37061nT r012 = new C37061nT(str4);
                    C011506v r116 = new C011506v();
                    r116.A08(r012);
                    Executor executor2 = AnonymousClass070.A01;
                    r116.A02(executor2, r39);
                    r116.A01(executor2, r39);
                    r116.A00(executor2, r39);
                    return;
                } catch (C24601Bp e8) {
                    if (e8.getCause() instanceof Exception) {
                        ((C36241lo) this.A01).A00.A07((Exception) e8.getCause());
                        return;
                    } else {
                        ((C36241lo) this.A01).A00.A07(e8);
                        return;
                    }
                } catch (CancellationException unused3) {
                    ((C36241lo) this.A01).A00.A05();
                    return;
                } catch (Exception e9) {
                    ((C36241lo) this.A01).A00.A07(e9);
                    return;
                }
            case 48:
                ServiceConnectionC25021Ed r65 = (ServiceConnectionC25021Ed) this.A00;
                int i9 = ((AnonymousClass1Ei) this.A01).A01;
                synchronized (r65) {
                    SparseArray sparseArray = r65.A03;
                    AnonymousClass1Ei r310 = (AnonymousClass1Ei) sparseArray.get(i9);
                    if (r310 != null) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Timing out request: ");
                        sb3.append(i9);
                        Log.w("MessengerIpcClient", sb3.toString());
                        sparseArray.remove(i9);
                        r310.A00(new C25061Eh(3, "Timed out waiting for response"));
                        r65.A00();
                    }
                }
                return;
            case 49:
                String action = ((Intent) this.A01).getAction();
                StringBuilder sb4 = new StringBuilder(String.valueOf(action).length() + 61);
                sb4.append("Service took too long to process intent: ");
                sb4.append(action);
                sb4.append(" App may get closed.");
                Log.w("EnhancedIntentService", sb4.toString());
                ((AnonymousClass1Em) this.A00).A00();
                return;
            default:
                return;
        }
    }
}
