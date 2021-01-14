package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.0Uu  reason: invalid class name and case insensitive filesystem */
public class C06810Uu {
    public static final ArrayList A03 = new ArrayList();
    public SparseArray A00 = null;
    public WeakReference A01 = null;
    public WeakHashMap A02 = null;

    public final View A00(View view, KeyEvent keyEvent) {
        int size;
        WeakHashMap weakHashMap = this.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View A002 = A00(viewGroup.getChildAt(childCount), keyEvent);
                    if (A002 != null) {
                        return A002;
                    }
                }
            }
            AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (abstractList != null && (size = abstractList.size() - 1) >= 0) {
                abstractList.get(size);
                throw null;
            }
        }
        return null;
    }
}
