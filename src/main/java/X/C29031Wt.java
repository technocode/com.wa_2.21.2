package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Wt  reason: invalid class name and case insensitive filesystem */
public class C29031Wt {
    public static volatile C29031Wt A04;
    public AbstractC29021Ws A00;
    public final AbstractC29021Ws A01;
    public final AbstractC29021Ws A02 = new AnonymousClass22Z();
    public final AbstractC29021Ws[] A03;

    public C29031Wt(C002701k r5) {
        AnonymousClass22U r3 = new AnonymousClass22U();
        this.A01 = r3;
        this.A03 = new AbstractC29021Ws[]{new AnonymousClass22Y(), new C449022c(), new C448822a(), new AnonymousClass22V(), new AnonymousClass22W(), new AnonymousClass22X(), new C448922b(r5), r3};
    }

    public static C29031Wt A00() {
        if (A04 == null) {
            synchronized (C29031Wt.class) {
                if (A04 == null) {
                    A04 = new C29031Wt(C002701k.A00());
                }
            }
        }
        return A04;
    }

    public synchronized AbstractC29021Ws A01(Context context) {
        AbstractC29021Ws r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            this.A00 = new C449022c();
        } else {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
                if (queryIntentActivities != null) {
                    Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = it.next().activityInfo.packageName;
                        StringBuilder sb = new StringBuilder();
                        sb.append("badger/homepackage/");
                        sb.append(str);
                        Log.i(sb.toString());
                        AbstractC29021Ws[] r4 = this.A03;
                        int length = r4.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            AbstractC29021Ws r1 = r4[i];
                            if (r1.A00(context.getApplicationContext()).contains(str)) {
                                this.A00 = r1;
                                break;
                            }
                            i++;
                        }
                        if (this.A00 != null) {
                            break;
                        }
                    }
                } else {
                    Log.e("badger/nohome");
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("badger/getbadger ");
                sb2.append(e.getMessage());
                Log.e(sb2.toString(), e);
            }
            if (this.A00 == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    Log.i("badger/getbadger/notfound/default");
                    this.A00 = this.A01;
                } else {
                    Log.i("badger/getbadger/notfound/disable");
                    this.A00 = this.A02;
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("badger/getbadger ");
        sb3.append(Arrays.asList(this.A03).indexOf(this.A00));
        Log.i(sb3.toString());
        return this.A00;
    }
}
