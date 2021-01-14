package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.search.verification.client.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.05T  reason: invalid class name */
public class AnonymousClass05T {
    public static final Object A09 = new Object();
    public static final List A0A = Arrays.asList("com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId");
    public static final List A0B = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    public static final List A0C = Arrays.asList("com.google.android.gms.measurement.AppMeasurement");
    public static final List A0D = Arrays.asList(new String[0]);
    public static final Map A0E = new AnonymousClass05V();
    public static final Set A0F = Collections.emptySet();
    public static final Executor A0G = new AnonymousClass05U();
    public final Context A00;
    public final SharedPreferences A01;
    public final AnonymousClass05X A02;
    public final AnonymousClass07E A03;
    public final String A04;
    public final List A05 = new CopyOnWriteArrayList();
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final AtomicBoolean A07;
    public final AtomicBoolean A08 = new AtomicBoolean();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x00b5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass05T(android.content.Context r14, X.AnonymousClass05X r15) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05T.<init>(android.content.Context, X.05X):void");
    }

    public static AnonymousClass05T A00() {
        AnonymousClass05T r0;
        synchronized (A09) {
            r0 = (AnonymousClass05T) A0E.get("[DEFAULT]");
            if (r0 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C240218n.A00());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return r0;
    }

    public static AnonymousClass05T A01(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (A09) {
            Map map = A0E;
            if (map.containsKey("[DEFAULT]")) {
                return A00();
            }
            C001801b.A1Q(context);
            Resources resources = context.getResources();
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
            String str7 = null;
            if (identifier == 0) {
                str = null;
            } else {
                str = resources.getString(identifier);
            }
            if (TextUtils.isEmpty(str)) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
            if (identifier2 == 0) {
                str2 = null;
            } else {
                str2 = resources.getString(identifier2);
            }
            int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
            if (identifier3 == 0) {
                str3 = null;
            } else {
                str3 = resources.getString(identifier3);
            }
            int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
            if (identifier4 == 0) {
                str4 = null;
            } else {
                str4 = resources.getString(identifier4);
            }
            int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
            if (identifier5 == 0) {
                str5 = null;
            } else {
                str5 = resources.getString(identifier5);
            }
            int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
            if (identifier6 == 0) {
                str6 = null;
            } else {
                str6 = resources.getString(identifier6);
            }
            int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
            if (identifier7 != 0) {
                str7 = resources.getString(identifier7);
            }
            AnonymousClass05X r7 = new AnonymousClass05X(str, str2, str3, str4, str5, str6, str7);
            if (context.getApplicationContext() instanceof Application) {
                Application application = (Application) context.getApplicationContext();
                if (AnonymousClass05Y.A00.get() == null) {
                    AnonymousClass05Y r4 = new AnonymousClass05Y();
                    if (AnonymousClass05Y.A00.compareAndSet(null, r4)) {
                        ComponentCallbacks2C008405a.A00(application);
                        ComponentCallbacks2C008405a r1 = ComponentCallbacks2C008405a.A04;
                        synchronized (r1) {
                            r1.A01.add(r4);
                        }
                    }
                }
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            boolean z = false;
            if (!map.containsKey("[DEFAULT]")) {
                z = true;
            }
            C001801b.A1b(z, "FirebaseApp name [DEFAULT] already exists!");
            C001801b.A1R(context, "Application context cannot be null.");
            AnonymousClass05T r0 = new AnonymousClass05T(context, r7);
            map.put("[DEFAULT]", r0);
            r0.A04();
            return r0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A02(Class cls, Object obj, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                try {
                    if (!A0D.contains(str)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!A0F.contains(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" is not linked. Skipping initialization.");
                        Log.d("FirebaseApp", sb.toString());
                    } else {
                        throw new IllegalStateException(AnonymousClass008.A0K(str, " is missing, but is required. Check if it has been removed by Proguard."));
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(AnonymousClass008.A0K(str, "#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    StringBuilder sb2 = new StringBuilder("Failed to initialize ");
                    sb2.append(str);
                    Log.wtf("FirebaseApp", sb2.toString(), e2);
                }
            }
            Method method = Class.forName(str).getMethod("getInstance", cls);
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke(null, obj);
            }
        }
    }

    public final void A03() {
        C001801b.A1b(!this.A08.get(), "FirebaseApp was deleted");
    }

    public final void A04() {
        Queue queue;
        Set<Map.Entry> emptySet;
        Context context = this.A00;
        boolean A072 = C004302a.A07(context);
        if (!A072) {
            AnonymousClass07E r4 = this.A03;
            A03();
            boolean equals = "[DEFAULT]".equals(this.A04);
            for (Map.Entry entry : r4.A01.entrySet()) {
                AnonymousClass07U r2 = (AnonymousClass07U) entry.getValue();
                int i = ((C008505d) entry.getKey()).A00;
                if (i == 1 || (i == 2 && equals)) {
                    r2.get();
                }
            }
            AnonymousClass07M r5 = r4.A00;
            synchronized (r5) {
                Queue queue2 = r5.A00;
                queue = null;
                if (queue2 != null) {
                    queue = queue2;
                    r5.A00 = null;
                }
            }
            if (queue != null) {
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    it.next();
                    C001801b.A1Q(null);
                    synchronized (r5) {
                        Queue queue3 = r5.A00;
                        if (queue3 != null) {
                            queue3.add(null);
                        } else {
                            synchronized (r5) {
                                Map map = (Map) r5.A01.get(null);
                                emptySet = map == null ? Collections.emptySet() : map.entrySet();
                            }
                            for (Map.Entry entry2 : emptySet) {
                                ((Executor) entry2.getValue()).execute(new RunnableEBaseShape1S0200000_I0_0(entry2, (Object) null, 5));
                            }
                        }
                    }
                }
            }
        } else if (AnonymousClass1EZ.A01.get() == null) {
            AnonymousClass1EZ r22 = new AnonymousClass1EZ(context);
            if (AnonymousClass1EZ.A01.compareAndSet(null, r22)) {
                context.registerReceiver(r22, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
        A02(AnonymousClass05T.class, this, A0A, A072);
        A03();
        if ("[DEFAULT]".equals(this.A04)) {
            A02(AnonymousClass05T.class, this, A0B, A072);
            A02(Context.class, context, A0C, A072);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass05T)) {
            return false;
        }
        String str = this.A04;
        AnonymousClass05T r3 = (AnonymousClass05T) obj;
        r3.A03();
        return str.equals(r3.A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        AnonymousClass185 r2 = new AnonymousClass185(this);
        r2.A00("name", this.A04);
        r2.A00("options", this.A02);
        return r2.toString();
    }
}
