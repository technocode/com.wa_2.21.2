package X;

import android.app.Application;
import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.05v  reason: invalid class name and case insensitive filesystem */
public class C009205v {
    public static C009205v A05;
    public final Context A00;
    public final AnonymousClass1GM A01;
    public final AnonymousClass06P A02;
    public final AbstractC011006p A03;
    public final Map A04;

    public C009205v(Context context, AbstractC011006p r5, AnonymousClass06P r6, AnonymousClass1GM r7, Map map) {
        this.A00 = context;
        this.A03 = r5;
        this.A02 = r6;
        this.A01 = r7;
        this.A04 = map;
        Class cls = new Class[]{AnonymousClass05n.class}[0];
        if (!r6.A00.containsKey(cls)) {
            StringBuilder sb = new StringBuilder("Missing parser support for type ");
            sb.append(cls);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static C009205v A00() {
        C009205v r0 = A05;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Can't find bloks instance. Is it initialized?");
    }

    public static void A01(FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 0) {
            if (frameLayout.getChildCount() != 1) {
                throw new IllegalStateException("found more than one root view");
            } else if (frameLayout.getTag(R.id.bloks_tag_component_tree) != null) {
                ((AnonymousClass25G) frameLayout.getChildAt(0)).setRenderState(null);
                frameLayout.setTag(R.id.bloks_tag_component_tree, null);
            } else {
                throw new IllegalStateException("Host view has a child but no tree to unbind");
            }
        }
        frameLayout.removeAllViews();
    }

    public final void A02(C010706m r9, C37441oE r10, FrameLayout frameLayout) {
        C37601oU r5;
        if (frameLayout.getChildCount() == 0) {
            Context context = frameLayout.getContext();
            if (context != null) {
                AnonymousClass05q r6 = new AnonymousClass05q(r9, r10, context);
                C010206h r4 = r6.A01;
                AnonymousClass25G r3 = new AnonymousClass25G(context);
                r3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                AnonymousClass118 r7 = new AnonymousClass118(context, r6, new C37421oC(r4));
                r3.setRenderState(r7);
                C010606l r2 = new C010606l(new C010506k());
                if (r9.A03 != null) {
                    C010806n r1 = C010806n.A00;
                    C010506k r0 = r2.A00;
                    if (r0 == null) {
                        r5 = new C37601oU(null, r1);
                    } else if (r0 != null) {
                        r5 = new C37601oU(r0, r1);
                    } else {
                        throw new IllegalStateException("MinScript is not enabled");
                    }
                    r7.A02(new C37561oQ((AbstractC008905s) r4.A01, r5));
                    C37611oV r22 = new C37611oV(r7, r4, r5);
                    r4.A04 = new WeakReference(r6);
                    r4.A02 = new C37451oF((Application) ((AnonymousClass05r) r6).A00.getApplicationContext());
                    r4.A03 = r22;
                    Map map = Collections.EMPTY_MAP;
                    Pair A002 = r4.A00(map, map, Collections.singletonList(r4.A05));
                    Map map2 = (Map) A002.first;
                    r4.A08 = map2;
                    r4.A07 = (Map) A002.second;
                    new Pair(r4.A01, map2);
                    frameLayout.addView(r3);
                    frameLayout.setTag(R.id.bloks_tag_component_tree, r10);
                    return;
                }
                throw null;
            }
            throw new IllegalArgumentException("Host view must have a context");
        } else if (frameLayout.getChildCount() == 1) {
            Object tag = frameLayout.getTag(R.id.bloks_tag_component_tree);
            if (tag == null) {
                throw new IllegalStateException("Host view has a child but no bound tree");
            } else if (r10 != tag) {
                throw new IllegalStateException("binding to new component before unbinding");
            }
        } else {
            throw new IllegalStateException("found more than one root view");
        }
    }
}
