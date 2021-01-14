package X;

import android.view.MenuItem;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2ZK  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZK implements AbstractC13370k8 {
    public final /* synthetic */ AbstractC007503q A00;
    public final /* synthetic */ ViewOnClickCListenerShape4S0200000_I1 A01;
    public final /* synthetic */ ArrayList A02;

    public /* synthetic */ AnonymousClass2ZK(ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1, AbstractC007503q r2, ArrayList arrayList) {
        this.A01 = viewOnClickCListenerShape4S0200000_I1;
        this.A00 = r2;
        this.A02 = arrayList;
    }

    @Override // X.AbstractC13370k8
    public final boolean onMenuItemClick(MenuItem menuItem) {
        ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1 = this.A01;
        AbstractC007503q r4 = this.A00;
        ArrayList arrayList = this.A02;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            AbstractC51572Zg.A03((AbstractC51572Zg) viewOnClickCListenerShape4S0200000_I1.A00, r4);
        } else if (itemId == 2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC51572Zg.A03((AbstractC51572Zg) viewOnClickCListenerShape4S0200000_I1.A00, (AbstractC007503q) it.next());
            }
        }
        return true;
    }
}
