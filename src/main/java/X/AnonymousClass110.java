package X;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.110  reason: invalid class name */
public class AnonymousClass110 {
    public static final AbstractC07100Vx A00 = new AnonymousClass25E(AnonymousClass11D.VIEW);

    public static RenderTreeNode A00(AnonymousClass0W0 r6, AbstractC07100Vx r7, Rect rect, RenderTreeNode renderTreeNode) {
        Rect rect2;
        int i;
        if (r6.A7s() == 0 && r6.A7u() == 0 && r6.A7t() == 0 && r6.A7r() == 0) {
            rect2 = null;
        } else {
            rect2 = new Rect(r6.A7s(), r6.A7u(), r6.A7t(), r6.A7r());
        }
        Object A73 = r6.A73();
        if (renderTreeNode != null) {
            List list = renderTreeNode.A00;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        return new RenderTreeNode(renderTreeNode, r7, A73, rect, rect2, i);
    }

    public static void A01(Context context, AnonymousClass0W0 r9, RenderTreeNode renderTreeNode, int i, int i2, ArrayList arrayList) {
        RenderTreeNode renderTreeNode2 = renderTreeNode;
        if (!(r9.getWidth() == 0 && r9.getHeight() == 0)) {
            Rect rect = new Rect(i, i2, r9.getWidth() + i, r9.getHeight() + i2);
            arrayList.size();
            AbstractC07100Vx A8i = r9.A8i();
            if (A8i != null) {
                int A5I = r9.A5I();
                RenderTreeNode A002 = A00(r9, A8i, rect, renderTreeNode);
                if (A5I > 0) {
                    arrayList.add(A002);
                    List list = renderTreeNode.A00;
                    if (list == null) {
                        list = new ArrayList(4);
                        renderTreeNode.A00 = list;
                    }
                    list.add(A002);
                } else {
                    arrayList.add(A002);
                    List list2 = renderTreeNode.A00;
                    if (list2 == null) {
                        list2 = new ArrayList(4);
                        renderTreeNode.A00 = list2;
                    }
                    list2.add(A002);
                    A002 = renderTreeNode;
                }
                renderTreeNode2 = A002;
                i = 0;
                i2 = 0;
            }
            for (int i3 = 0; i3 < r9.A5I(); i3++) {
                A01(context, r9.A5E(i3), renderTreeNode2, r9.A9y(i3) + i, r9.A9z(i3) + i2, arrayList);
            }
        }
    }
}
