package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public class C33461go {
    public AnonymousClass119 A00;
    public boolean A01;
    public boolean A02;
    public long[] A03;
    public final Context A04;
    public final C015008i A05 = new C015008i();
    public final AnonymousClass0WM A06;

    public C33461go(AnonymousClass0WM r2) {
        this.A04 = r2.getContext();
        this.A06 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        if (((android.view.View) r1).isLayoutRequested() == false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r20, com.facebook.rendercore.RenderTreeNode r21, X.C223010x r22) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33461go.A00(android.content.Context, com.facebook.rendercore.RenderTreeNode, X.10x):void");
    }

    public void A01() {
        int i;
        if (this.A03 != null) {
            RenderTreeNode renderTreeNode = this.A00.A02;
            int i2 = 0;
            while (true) {
                List list = renderTreeNode.A00;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i2 >= i) {
                    break;
                }
                A03((RenderTreeNode) renderTreeNode.A00.get(i2));
                i2++;
            }
            C015008i r9 = this.A05;
            C223010x r7 = (C223010x) r9.A03(0, null);
            if (r7 != null) {
                if (r7.A03) {
                    Context context = this.A04;
                    RenderTreeNode renderTreeNode2 = r7.A01;
                    AbstractC07100Vx r0 = renderTreeNode2.A07;
                    AbstractC07100Vx.A01(r0.A00, context, r7.A02, renderTreeNode2.A08);
                    r7.A03 = false;
                }
                r9.A06(0);
                Context context2 = this.A04;
                AbstractC07100Vx r02 = renderTreeNode.A07;
                AbstractC07100Vx.A01(r02.A01, context2, r7.A02, renderTreeNode.A08);
            }
            this.A03 = null;
            this.A02 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r14 <= -1) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass119 r22) {
        /*
        // Method dump skipped, instructions count: 587
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33461go.A02(X.119):void");
    }

    public final void A03(RenderTreeNode renderTreeNode) {
        int i;
        Class<?> cls;
        int i2;
        AbstractC07100Vx r6 = renderTreeNode.A07;
        C015008i r3 = this.A05;
        long A042 = r6.A04();
        C223010x r5 = (C223010x) r3.A03(A042, null);
        if (r5 != null) {
            Object obj = r5.A02;
            if (A042 != 0) {
                r3.A06(A042);
                List list = renderTreeNode.A00;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    AnonymousClass0WM r2 = (AnonymousClass0WM) obj;
                    int i3 = 0;
                    while (true) {
                        List list2 = renderTreeNode.A00;
                        if (list2 != null) {
                            i2 = list2.size();
                        } else {
                            i2 = 0;
                        }
                        if (i3 >= i2) {
                            break;
                        }
                        A03((RenderTreeNode) renderTreeNode.A00.get(i3));
                        i3++;
                    }
                    if (r2.getMountItemCount() > 0) {
                        throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                    }
                }
                AnonymousClass0WM r8 = r5.A00;
                if (r5.A03) {
                    Context context = this.A04;
                    RenderTreeNode renderTreeNode2 = r5.A01;
                    AbstractC07100Vx r0 = renderTreeNode2.A07;
                    AbstractC07100Vx.A01(r0.A00, context, r5.A02, renderTreeNode2.A08);
                    r5.A03 = false;
                }
                r8.A02(renderTreeNode.A03, r5);
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                Context context2 = this.A04;
                AbstractC07100Vx.A01(r6.A01, context2, obj, renderTreeNode.A08);
                AbstractC07100Vx r22 = r5.A01.A07;
                Object obj2 = r5.A02;
                if (!(r22 instanceof AnonymousClass278)) {
                    cls = r22.getClass();
                } else {
                    cls = ((AnonymousClass278) r22).A02.getClass();
                }
                C14840my A002 = C223210z.A00(context2, cls);
                if (A002 != null) {
                    A002.A01(obj2);
                }
            }
        }
    }
}
