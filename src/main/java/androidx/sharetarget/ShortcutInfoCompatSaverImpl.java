package androidx.sharetarget;

import X.AbstractC14680mh;
import X.AnonymousClass05V;
import X.AnonymousClass23Z;
import X.C14610mZ;
import X.C14670mg;
import X.C16980qm;
import X.CallableC16950qj;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class ShortcutInfoCompatSaverImpl extends AbstractC14680mh {
    public static final Object A07 = new Object();
    public static volatile ShortcutInfoCompatSaverImpl A08;
    public final Context A00;
    public final File A01;
    public final File A02;
    public final Map A03 = new AnonymousClass05V();
    public final Map A04 = new AnonymousClass05V();
    public final ExecutorService A05;
    public final ExecutorService A06;

    public ShortcutInfoCompatSaverImpl(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.A00 = context.getApplicationContext();
        this.A05 = executorService;
        this.A06 = executorService2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.A01 = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.A02 = new File(file, "targets.xml");
        this.A05.submit(new RunnableEBaseShape5S0200000_I1_0(this, file, 13));
    }

    public static void A00(File file) {
        if ((!file.exists() || file.isDirectory() || file.delete()) && !file.exists()) {
            file.mkdirs();
        }
    }

    @Override // X.AbstractC14680mh
    public Object A01() {
        AnonymousClass23Z r3 = new AnonymousClass23Z();
        this.A05.submit(new RunnableEBaseShape5S0200000_I1_0(this, r3, 14));
        return r3;
    }

    @Override // X.AbstractC14680mh
    public Object A02(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14670mg r3 = (C14670mg) it.next();
            C14670mg r2 = new C14670mg();
            r2.A02 = r3.A02;
            r2.A07 = r3.A07;
            Intent[] intentArr = r3.A0B;
            r2.A0B = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            r2.A01 = r3.A01;
            r2.A05 = r3.A05;
            r2.A06 = r3.A06;
            r2.A04 = r3.A04;
            r2.A03 = r3.A03;
            r2.A09 = r3.A09;
            r2.A0A = r3.A0A;
            r2.A00 = r3.A00;
            C14610mZ[] r1 = r3.A0C;
            if (r1 != null) {
                r2.A0C = (C14610mZ[]) Arrays.copyOf(r1, r1.length);
            }
            Set set = r3.A08;
            if (set != null) {
                r2.A08 = new HashSet(set);
            }
            if (!TextUtils.isEmpty(r2.A05)) {
                Intent[] intentArr2 = r2.A0B;
                if (intentArr2 == null || intentArr2.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                arrayList.add(r2);
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        AnonymousClass23Z r32 = new AnonymousClass23Z();
        this.A05.submit(new RunnableEBaseShape2S0300000_I1(this, arrayList, r32, 1));
        return r32;
    }

    @Override // X.AbstractC14680mh
    public Object A03(List list) {
        ArrayList arrayList = new ArrayList(list);
        AnonymousClass23Z r3 = new AnonymousClass23Z();
        this.A05.submit(new RunnableEBaseShape2S0300000_I1(this, arrayList, r3, 0));
        return r3;
    }

    @Override // X.AbstractC14680mh
    public List A04() {
        return (List) this.A05.submit(new CallableC16950qj(this)).get();
    }

    public void A05(AnonymousClass23Z r5) {
        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = new RunnableEBaseShape5S0200000_I1_0(this, new ArrayList(this.A04.values()), 11);
        AnonymousClass23Z r2 = new AnonymousClass23Z();
        this.A06.submit(new RunnableEBaseShape5S0200000_I1_0(r2, runnableEBaseShape5S0200000_I1_0));
        r2.A1o(new RunnableEBaseShape5S0200000_I1_0(r2, r5), this.A05);
    }

    public void A06(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C16980qm) it.next()).A01;
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        File[] listFiles = this.A01.listFiles();
        for (File file : listFiles) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }
}
