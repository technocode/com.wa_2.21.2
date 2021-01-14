package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0cm  reason: invalid class name and case insensitive filesystem */
public class C09370cm {
    public static AbstractC09350ck A00 = new AnonymousClass249();
    public static ThreadLocal A01 = new ThreadLocal();
    public static ArrayList A02 = new ArrayList();

    public static AnonymousClass05V A00() {
        AnonymousClass05V r0;
        Reference reference = (Reference) A01.get();
        if (reference != null && (r0 = (AnonymousClass05V) reference.get()) != null) {
            return r0;
        }
        AnonymousClass05V r2 = new AnonymousClass05V();
        A01.set(new WeakReference(r2));
        return r2;
    }

    public static void A01(ViewGroup viewGroup, AbstractC09350ck r5) {
        if (!A02.contains(viewGroup) && AnonymousClass0Q7.A0j(viewGroup)) {
            A02.add(viewGroup);
            if (r5 == null) {
                r5 = A00;
            }
            AbstractC09350ck A022 = r5.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().getOrDefault(viewGroup, null);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((AbstractC09350ck) it.next()).A0F(viewGroup);
                }
            }
            if (A022 != null) {
                A022.A0J(viewGroup, true);
            }
            viewGroup.getTag(R.id.transition_current_scene);
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (A022 != null) {
                View$OnAttachStateChangeListenerC17260rF r1 = new View$OnAttachStateChangeListenerC17260rF(A022, viewGroup);
                viewGroup.addOnAttachStateChangeListener(r1);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r1);
            }
        }
    }
}
