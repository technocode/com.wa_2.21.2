package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.0rF  reason: invalid class name and case insensitive filesystem */
public class View$OnAttachStateChangeListenerC17260rF implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public AbstractC09350ck A01;

    public void onViewAttachedToWindow(View view) {
    }

    public View$OnAttachStateChangeListenerC17260rF(AbstractC09350ck r1, ViewGroup viewGroup) {
        this.A01 = r1;
        this.A00 = viewGroup;
    }

    /* JADX WARNING: Removed duplicated region for block: B:130:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreDraw() {
        /*
        // Method dump skipped, instructions count: 653
        */
        throw new UnsupportedOperationException("Method not decompiled: X.View$OnAttachStateChangeListenerC17260rF.onPreDraw():boolean");
    }

    public void onViewDetachedFromWindow(View view) {
        this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
        this.A00.removeOnAttachStateChangeListener(this);
        C09370cm.A02.remove(this.A00);
        AbstractCollection abstractCollection = (AbstractCollection) C09370cm.A00().get(this.A00);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AbstractC09350ck) it.next()).A0G(this.A00);
            }
        }
        this.A01.A0Q(true);
    }
}
