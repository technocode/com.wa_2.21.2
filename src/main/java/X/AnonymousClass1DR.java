package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;

/* renamed from: X.1DR  reason: invalid class name */
public class AnonymousClass1DR implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener A00;
    public final /* synthetic */ C36771mq A01;

    public AnonymousClass1DR(C36771mq r1) {
        this.A01 = r1;
    }

    public void onChildViewAdded(View view, View view2) {
        int hashCode;
        C36771mq r2 = this.A01;
        if (view == r2 && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                if (Build.VERSION.SDK_INT >= 17) {
                    hashCode = View.generateViewId();
                } else {
                    hashCode = view2.hashCode();
                }
                view2.setId(hashCode);
            }
            ((Chip) view2).setOnCheckedChangeListenerInternal(r2.A07);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public void onChildViewRemoved(View view, View view2) {
        if (view == this.A01 && (view2 instanceof Chip)) {
            ((Chip) view2).setOnCheckedChangeListenerInternal(null);
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.A00;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
