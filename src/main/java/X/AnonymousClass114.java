package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.114  reason: invalid class name */
public class AnonymousClass114 implements Callable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass115 A01;
    public final /* synthetic */ Object A02;

    public AnonymousClass114(AnonymousClass115 r1, Context context, Object obj) {
        this.A01 = r1;
        this.A00 = context;
        this.A02 = obj;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        AbstractC008905s r2;
        Object obj;
        Pair AN3;
        C222910v r1;
        AnonymousClass113 r8;
        C222910v r0;
        AnonymousClass119 r12;
        Context context = this.A00;
        AnonymousClass115 r02 = this.A01;
        AnonymousClass116 r3 = r02.A04;
        Object obj2 = this.A02;
        AnonymousClass113 r9 = r02.A03;
        int i = r02.A01;
        int i2 = r02.A02;
        int i3 = r02.A00;
        if (r9 != null) {
            r2 = r9.A03;
            obj = r9.A04;
        } else {
            r2 = null;
            obj = null;
        }
        C33471gp.A00("RC Create Tree", null);
        if (r9 == null || r3 != r9.A01) {
            AN3 = r3.AN3();
        } else {
            AN3 = new Pair(r2, obj);
        }
        Object obj3 = AN3.first;
        if (!(r9 == null || (r12 = r9.A02) == null || obj3 != r9.A03)) {
            int i4 = r12.A01;
            Rect rect = r12.A02.A04;
            if (AnonymousClass0N2.A1c(i4, i2, rect.width()) && AnonymousClass0N2.A1c(r12.A00, i3, rect.height())) {
                r8 = new AnonymousClass113(r12, r3, (AbstractC008905s) AN3.first, r9.A00, AN3.second);
                AnonymousClass112.A00();
                return r8;
            }
        }
        C33471gp.A00("RC Layout", null);
        if (r9 == null || (r0 = r9.A00) == null) {
            r1 = new C222910v(null);
        } else {
            r1 = new C222910v(r0.A01);
        }
        C07080Vv r03 = new C07080Vv(context, obj2, i, r1);
        AnonymousClass0W0 A002 = ((AbstractC008905s) AN3.first).A00(r03, i2, i3);
        AnonymousClass112.A00();
        C33471gp.A00("RC Reduce", null);
        Object obj4 = AN3.second;
        Context context2 = r03.A02;
        ArrayList arrayList = new ArrayList();
        RenderTreeNode A003 = AnonymousClass110.A00(A002, AnonymousClass110.A00, new Rect(0, 0, A002.getWidth(), A002.getHeight()), null);
        arrayList.add(A003);
        AnonymousClass110.A01(context2, A002, A003, 0, 0, arrayList);
        r8 = new AnonymousClass113(new AnonymousClass119(A003, (RenderTreeNode[]) arrayList.toArray(new RenderTreeNode[arrayList.size()]), i2, i3), r3, (AbstractC008905s) AN3.first, r03.A00(), obj4);
        AnonymousClass112.A00();
        r03.A00 = null;
        AnonymousClass112.A00();
        return r8;
    }
}
